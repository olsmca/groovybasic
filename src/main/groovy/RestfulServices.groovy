import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane
import groovy.json.JsonSlurper
import groovy.swing.SwingBuilder

import javax.imageio.ImageIO
import javax.swing.Icon
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.WindowConstants
import java.awt.BorderLayout
import java.awt.GridLayout
import java.awt.Label
import java.awt.image.BufferedImage


String key = '194e22d07f04be1c77c5fd6980b61156'
        String endPoint = 'https://api.flickr.com/services/rest?'

        def params = [method: 'flickr.photos.search', api_key: key,
                      format: 'json', tags: 'cat', nojsoncallback: 1,
                      media : 'photos', per_page: 6]

        def qs = params.collect { k, v -> "$k=$v" }.join('&')

        def json = new JsonSlurper().parseText(new URL( "$endPoint$qs").text)

        println(json)

        def urls = json.photos.photo.collect {p ->
            "http://farm${p.farm}.staticflickr.com/${p.server}/${p.id}_${p.secret}.jpg"}

    new SwingBuilder().build {
    frame(title:'Cat pictures', visible: true, pack: true,
            defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE,
            layout:new GridLayout(0, 2)
            ,size: [800, 800], locationRelativeTo: null) {

        panel(constraints: BorderLayout.CENTER,
                border: compoundBorder([emptyBorder(10), titledBorder('Imagenes flickr')])) {

            urls[0..5].each { String url ->
                println(new ImageIcon(url.toURL()))
            }
        }
    }.pack()
}


