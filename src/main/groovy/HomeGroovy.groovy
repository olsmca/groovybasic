

final class HomeGroovy {

    static String Hello(String str) {

        def result = "Hello ${str} Groovy"
        println result

        // llamado de funcion de un script
/*        GroovyShell shell = new GroovyShell()
        def tools = shell.parse(new File('src/main/groovy/basico.groovy'))
        tools.saludar()*/

        return result
    }
}