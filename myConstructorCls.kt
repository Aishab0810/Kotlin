package one

class Actor(var name: String, var movie: String, var year: Int)

fun main() {
    val c1 = Actor("Shahid", "Jab we met", 2007)
    val c2 = Actor("Akshay", "Bhool Bhulaiyaa", 2007)
    val c3 = Actor("Amir", "Three Idiots", 2009)

    println(c1.name)
    println(c2.movie)
    println(c3.year)
}