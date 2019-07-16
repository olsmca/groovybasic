import spock.lang.Specification

class SpockParametersTest extends Specification {

    def "numero elevado a la n potencia"(int a, int b, int c) {
        expect: "Obtengo el numero esperado cuando aplico la funcion matematica pow"
            Math.pow(a, b) == c

        where: "Donde los parametro de entrada son: "
            a | b | c
            1 | 2 | 1
            2 | 2 | 4
            3 | 2 | 9
            //1 | 2 | 2
    }

    def "Comprobar concatenacion de Palabra en Groovy"(String a, String b) {
        expect:
        HomeGroovy.Hello(a)==b

        where:"Donde los parametro de entrada son: "
        a | b
        "World" | "Hello World Groovy"
        "Casa"| "Hello Casa Groovy"
        "Mundo"| "Hello Mundo Groovy"
        "Planeta"|"Hello Planeta Groovy"
    }

}

