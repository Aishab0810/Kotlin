package one

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User("ash", 23)
    println("name = ${jack.name}")
    println("age = ${jack.age}")
}