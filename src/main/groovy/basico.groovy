import java.util.stream.Stream

/** Hola mundo */
/*
println "Hola Mundo"
*/


/** llamados de metodos con parentesis opcionales */

/*void impresion(String s1, String s2){
    println s1 + s2
}*/



/** el return es opcional */
def cuadrado (int numero) {
    println numero*numero
}


/** la declaracion de tipo es opcional */
/*def x = "String"
print x.class
x = 12
println(x)
print x.class*/


/** Referencia Segura ? */
/*class MiInteger{
    int valor =0
    int altura=0

    MiInteger(int valor, int altura){
        this.valor = valor
        this.altura = altura
    }
    MiInteger(){

    }
}


MiInteger mi

println(mi?.getProperty("valor"))
//println mi.valor*/


// Datos primarios por defecto

/*println(1.class)
println 0.91.class
def map = [:]
println( map.getClass())
def arr = []
def ar2r = new ArrayList()
println(arr.class)*/


/** GString */
/*def saldo = 12.18
println "Saldo igual a ${saldo}"*/


/** Heredoc */
/*def strMultilinea = """         Texto multiLinea
         fecha ${new Date() }"""

def multinea = """
        modle
        de
        de
        ${new Date()}
"""

println(multinea)
println strMultilinea*/

/** Closure */
/*
def saludar = { println"Hola ${it} "}

saludar "Smith"

//Closure explicito
def saludar = { nombre -> println "Hola ${nombre}"}
saludar "Smith"

//closure bi
def saludar = {nombre, apellido, segundo -> println "Hola ${nombre} ${apellido} ${segundo} " }

saludar "Oliver", "Smith", "Cadena"
*/


/** llamado de funcion de un script*/
/*def saludar (){
    print "Hello"
}*/


/** Curry, precargar parametros de closure*/
/*def multiplicar = { valor1, valor2 ->
    valor1 * valor2
}
def x =  multiplicar.curry(2)

println x(7)*/


//closure como parametro
/*def repetirClosure(int numRepeticiones, Closure closure) {
    for(int i = 0; i < numRepeticiones; i++) {
        closure.call(i)
    }
}*/
//repetirClosure(5, { it -> println it })
//repetirClosure(5) { println it }

// otras formas de hacer el ejercicio
/*1.upto(4, {println it})
1.step(5,1, {println it})
4.times {println it+1}*/


/** Rangos*/
/*
def rango = 1..5
def rangoNm = 1..7

println "de "+rango.from
println( "hasta "+rango.to)
println("Tamaño "+rangoNm.size())
println("Obtener "+rangoNm.get(3))
println( rangoNm.reverse())

//rango.step(1,{println it})
//rango.each {nm -> println nm}
//rangoNm.reverse().each {print(it)}

def hoy = new Date()
println hoy.next()
hoy.upto(hoy+7,{dia -> println( dia)})

('a'..'z').reverse().each {letra -> print( letra.toUpperCase())}

def sueldo = 1700;

switch(sueldo) {
    case 600..<1200:
        println 'nivel 1'
        break
    case 1200..<1800:
        println 'nivel 2'
        break
    case 1800..<2400:
        println 'nivel 3'
        break
}

*/


//def env = 'feature/API'

//println( env ==~ /feature.*/)

//switch(env){

   // case {it ==~ /feature.*/ || 'develop'}:
       /* println( "feature o develop " + env)
        break
    case 'Master':
        println( "Master")
}
*/



/**Collecciones*/
/*
def list = []
def paises = ['Brasil','Peru']
def numeros = [1,2,3]
println list.class

paises.add('Argentina')
numeros.add(4)
paises << "Colombia"

println(paises)
println( paises.get(0))
println( paises[0])
println(paises.getAt(0..2))

paises[3] = "Catar"
paises[7] = "Venezuela"



paises.remove(null)
2.times {paises.remove(null)}
println(paises)
*/


/*paises.remove(null)
println(paises)

2.times {
    paises.remove(null)
}
println(paises)

paises.eachWithIndex{ pais, indice -> println( "${pais} en la posicion ${indice}") }

def paisesMayusculas = paises.collect { pais ->
    pais.toUpperCase()
}*/
/*
def paisesVe = paises.findAll {pais -> pais.contains("a")}

println(paisesVe)
*/


/**Tipos de Colecciones nativas*/

/*
def paises = ['Brasil','Peru']
def setPaises = paises as Set
def colaPaises = paises as Queue
def arrayPaises = paises as String[]
Set lhs = new LinkedHashSet();

println setPaises.class
println colaPaises.class
println arrayPaises.class
*/


/** Mapas*/
/*def capitales = ['España':'Madrid', 'Mexico':'Mexico D.F.']
def map = [:]
capitales.put('Argentina', 'Buenos Aires')
capitales.Colombia = 'Bogota'
capitales['Venezuela'] = 'Caracas'

println(capitales)

capitales.each {k,v -> println  k +" y "+ v}
capitales.each {
    println it.key +" - " +it.value
}*/


/*
capitales.each {
    println it.key +" - " +it.value
}

capitales.each {pais, capital ->
    println pais +" y " +capital
}

println capitales.containsKey('España')
println capitales.containsValue('Roma')

*/
/*
*//** POGO's*//*
class Libro {
    String titulo
    String autor
    int numPaginas

    //sobre escribir getter
    String getTitulo() {
        return titulo.toUpperCase()
    }

    //constructor con parametros por defecto
    Libro(int numPaginas, String titulo='Sin título', String autor='Sin autor') {
        this.titulo = titulo
        this.autor = autor
        this.numPaginas = numPaginas;
    }

    @Override
    String toString() {
        return new StringBuilder().append(" Titulo : ").append(titulo)
    }
}

*//*def libro = new Libro()
libro.titulo = "Effective Java 2nd Edition"
libro.autor = "Joshua Bloch"
libro.numPaginas = 346*//*

def libro = new Libro(1)


libro.each {println it.properties}
println(libro.autor)

*//*libro.setProperty('titulo', 'Introducción a Groovy')
println libro.getProperty('titulo')*//*


*//** constructor con parametros por defecto *//*
def libro2 = new Libro( numPaginas:346)
*//*def mapa = [titulo:'Effective Java 2nd Edition', autor:'Joshua Bloch2', numPaginas:347]
libro2 = new Libro(mapa)*//*

print(libro2)*/

/*

def libro2 = new Libro(15, "moder")*//*
def Libro3 = new Libro(10)


println(libro2.titulo)
println(Libro3.autor)*/


/** Reflexion */
/*

String.interfaces.each { println it }
String.constructors.each { println it }
String.methods.each { println it }

String.properties.each {propiedad -> println(propiedad)}*/




/** Expando objetos en blanco*/
/*
def posicion = new Expando()
posicion.latitud = 15.47
posicion.longitud = -3.11
posicion.diferencia = { nuevaLatitud, nuevaLongitud, area, pso ->
    """
    Existe una diferencia de:
        LATITUD: ${posicion.latitud - nuevaLatitud}
        LONGITUD: ${posicion.longitud - nuevaLongitud}
    
    con respecto al la posición anterior: ${posicion.latitud} ${posicion.longitud} Area: ${area} POS ${pso}
    """
}

println(posicion.diferencia(10,15, 8, 15))

*/

/** Propiedades Dinamicas*/
/*
class Articulo {
    String descripcion
    double precio
    def propiedades = [:]

    void setProperty(String nombre, Object valor) {
        propiedades[nombre] = valor
    }

    Object getProperty(String nombre) {
        propiedades[nombre]
    }
}

def articulo = new Articulo()
articulo.codigoEAN = 84123445593
println(articulo.descripcion)
println articulo.codigoEAN
*/



/** Iterceptar metodos no existentes */
/*
class Articulo {
    String descripcion
    double precio

    Object invokeMethod(String nombre, Object args) {
        println "Invocado método ${nombre}() con los argumentos ${args}"
    }
}

def articulo = new Articulo()
articulo.operacionInexistente('abc', 123, true)
*/

/** Aspect */
/*
class SimpleLogger {
    def logInicio(String metodo, args) {
        println "Iniciado el método ${metodo}() con los argumentos ${args}"
    }

    def logFin(String metodo, resultado) {
        println "Finalizando el método ${metodo}() con el resultado ${resultado}"
    }
}

class Articulo implements GroovyInterceptable {
    String descripcion
    double precio
    SimpleLogger logger

    void añadirDescuento(double porcentajeDescuento){
        precio = (precio * (100 - porcentajeDescuento) / 100)
    }

    def invokeMethod(String nombre, args) {
        logger.logInicio(nombre, args)
        //interceptando metodos propios de la clase
        def metaMetodo = Articulo.metaClass.getMetaMethod(nombre, args)
        def resultado = metaMetodo.invoke(this, args)
        logger.logFin(nombre, resultado)
    }
}

def logger = new SimpleLogger()
def articulo = new Articulo(descripcion:'Libreta', precio:1.40)
articulo.logger = logger

articulo.añadirDescuento(15)
println articulo.precio

*/

/*
enum HostCloudEnum{
    Desarrollo("AWSGCEDLLO"),
    Laboratorio("AWSGCELAB"),
    Produccion("AWSGCEPDN")

    HostCloudEnum(String host) {
        this.host = host
    }
    private final String host
}

for (HostCloudEnum enm : HostCloudEnum.values()) {
 println enm.host
}*/

/** Comparacion usar Stream java vs metodos nativos groovy */
/*def arr = ['Groovy', 'Gradle', 'Grails', 'Spock']

println arr.stream().filter{   x -> x.contains('G')}.map{x -> x.toUpperCase()}.collect()

println arr.findAll{x -> x.contains('G')}.collect {x -> x.toUpperCase()}*/

/** Script ejecucion comando sh */
/*def out = new StringBuilder(); def err = new StringBuilder()
def sh = 'ls/bad'.execute()
sh.consumeProcessOutput(out, err)
sh.waitForOrKill(1000)
println( "out> $out err> $err")*/

