import org.junit.Test

class JunitTest {

    @Test
    void validateReturnHelloWorld() {

        String expect = "Hello World Groovy"
        String response = HomeGroovy.Hello("World")
        assert expect == response
    }
}