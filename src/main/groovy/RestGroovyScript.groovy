import groovy.json.JsonParserType
import groovy.json.JsonSlurper


class Post{
    def userId
    def id
    def title
    def completed

    @Override
    String toString() {
        return new StringBuilder().append( "UserID: ").append(this.userId)
                                  .append(" Id: ").append(this.id)
                                  .append(" Title: ").append(this.title)
                                  .append(" completed: ").append(this.completed)
    }

    boolean equals(Post obj) {
        return this.userId == obj.userId
    }
}

class Posts{
    def postId
    def id
    def name
    def email
    def body

    @Override
    String toString() {
        return new StringBuilder().append( "\npostId: ").append(this.postId)
                .append("\nId: ").append(this.id)
                .append("\nname: ").append(this.name)
                .append("\nemail: ").append(this.email)
                .append("\nbody: ").append(this.body)
                .append("\n")
    }
}

def getSimpleRestPost(){
    new JsonSlurper().parseText(new URL( "https://jsonplaceholder.typicode.com/todos/1")
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

//rest 1
println getSimpleRestPosts().get(0)
println getSimpleRestPost()

// forma 2
def parser = new JsonSlurper().setType(JsonParserType.LAX)
def jsonResp = parser.parseText(getPost()) as Post

println( jsonResp.title)
println( jsonResp)


// Recuperar varios datos
def arr = []

new JsonSlurper().parseText(get100Posts()).each { post -> arr.add(post as Posts)  }

new JsonSlurper().parseText(get100Posts()).each { post ->
    arr.add(new PostJava(post.userId, post.id, post.title, post.completed))
}

// forma 2
def json = new JsonSlurper().parseText(get100Posts()).collect {p -> p as Posts}

/*println("")
println json[0].toString()
println(arr.size())
println(arr[0])*/







