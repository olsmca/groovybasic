import spock.lang.Specification

class spockRestTest extends Specification{

    def "Consultar un post especifico de un Blog mediante un servicio"(){
        given: "Dado el post 1"
            def idPost = "1"
        and:"genero post para comparar"
            Post postExpect = new Post(userId: 1, id: 1, title: "delectus aut autem", completed: false)
        and: "se instancia el rest"
            RestGroovy restGroovy = new RestGroovy()
        when:
            def post = restGroovy.getSimpleRestPost(idPost)
        then:
            post.equals(postExpect)
    }

    def "prueba mo"(){
        given: "Dado el post con valores"
            Post postExpect = new Post(userId: 1, id: 1, title: "delectus aut autem", completed: false)
        and:"el servicio retorna cualquier post"
            RestGroovy restGroovy = Stub(RestGroovy.class)
        when: "Cuando el consumo"
            def post = restGroovy.getSimpleRestPost()
        then:"entonces"
            postExpect.class == post.class
    }

}
