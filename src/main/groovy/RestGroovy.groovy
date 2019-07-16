import groovy.json.JsonSlurper

class RestGroovy {

    Post getSimpleRestPost(def idPost){
        new JsonSlurper().parseText(new URL( "https://jsonplaceholder.typicode.com/todos/${idPost}")
                .text) as Post
    }

    def getSimpleRestPosts(){
        new JsonSlurper().parseText(new URL( "https://jsonplaceholder.typicode.com/comments")
                .text).collect {p -> p as Posts}
    }

    def getPost () {

        def connection = new URL("https://jsonplaceholder.typicode.com/todos/1")
                .openConnection() as HttpURLConnection

        connection.setRequestProperty('Accept', 'application/json')

        return   (connection.responseCode == 200 || connection.responseCode == 201)
                ? connection.inputStream.getText()
                : connection.responseCode
    }

    def get100Posts () {

        def connection = new URL("https://jsonplaceholder.typicode.com/posts")
                .openConnection() as HttpURLConnection

        connection.setRequestProperty('Accept', 'application/json')

        return   (connection.responseCode == 200 || connection.responseCode == 201)
                ? connection.inputStream.getText()
                : connection.responseCode
    }
}
