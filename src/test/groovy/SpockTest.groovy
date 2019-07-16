
import spock.lang.Specification

class SpockTest extends Specification {

    // Ejemplo Basico
    void "Comprobar concatenacion de Palabra en Groovy" () {

        given:"Dada una palabra"
            String str = "World"
        and:"una cadena especifica"
            String expect = "Hello World Groovy"
        when: "Se concatenan "
            String r = HomeGroovy.Hello(str)
        then:"se imprime el valor esperado"
            !r.isEmpty()
            r == expect
    }

    // Formas de Asercion
    def "Comprobar la eliminacion de un elemento de una lista"() {
        given:"Dada una lista que contiene datos"
            def list = [1, 2, 3, 4]

        and:""
            def sizeLs = list.size()

        when: "Elimino un dato de la lista"
            list.remove(0)

        then:"Los elementos de la lista coinciden"
            list == [2, 3, 4]

        and: "El tamaño de la lista coincide con el tamaño inicial menos 1"
            list.size() == sizeLs -1
    }

    // Controlar Excepciones
    def "Comprobar excepcion por eliminacion de elemento fuera de indice en una lista"() {
        given:"Dada la lista de 4 elementos"
            def list = [1, 2, 3, 4];

        when:"Elimino el elemento 20 que se encuentra fuera de indice de la lista"
            list.remove(20)

        then:"Lanza excepcion fuera de rango"
            thrown(IndexOutOfBoundsException)

        and:"la lista continua con su tamaño inicial de 4 elementos"
            list.size() == 4
    }
}
