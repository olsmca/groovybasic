import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(Parameterized)
class JunitParametersTest{

    @Parameters
    static Collection<Object[]> data() {
        def cases = new Object[4][2]
        //str , expected
        cases[0] = [ "World", "Hello World Groovy"]
        cases[1] = [ "Casa", "Hello Casa Groovy"]
        cases[2] = [ "Mundo", "Hello Mundo Groovy"]
        //cases[3] = [ "Planeta", "Hello Planeta Groovy"]
        cases[3] = [ "Planeta", "Hello Planeta Groovy1"]
        Arrays.asList(cases)
    }

    String str
    String expected

    JunitParametersTest (String str, String expected){
        this.expected = expected
        this.str = str
    }

    @Test
    void validateReturnHelloWorld() {
        try{
            String responsed = HomeGroovy.Hello(this.str)
            Assert.assertNotNull(responsed)
            Assert.assertTrue(this.expected == responsed)
        }catch(e){
            println e
        }

    }
}