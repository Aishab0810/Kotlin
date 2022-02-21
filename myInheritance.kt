package one

//base class
open class Employee( name: String,age: Int,salary : Int) {
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}
//derived class
class webDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun website() {
        println("I am website developer")
        println()
    }
}
//derived class
class androidDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun android() {
        println("I am android app developer")
        println()
    }
}
//derived class
class iosDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun iosapp() {
        println("I am iOS app developer")
        println()
    }
}
//main method
fun main(args: Array<String>) {
    val wd = webDeveloper("Ketaki", 22, 10000)
    wd.website()
    val ad = androidDeveloper("Aisha", 23,22000)
    ad.android()
    val iosd = iosDeveloper("Nikita", 24,25000)
    iosd.iosapp()
}
