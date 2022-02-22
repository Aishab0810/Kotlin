package one

class myTypeChckng {
}
fun main(args: Array<String>) {
    var name = "Aisha"
    var age = 23
    var salary = 20500.07
    val employeeDetails: List<Any> = listOf(name,age,salary)

    for(attribute in employeeDetails) {
        if (attribute is String) {
            println("Name: $attribute")
        } else if (attribute is Int) {
            println("Age: $attribute")
        } else if (attribute is Double) {
            println("Salary: $attribute")
        } else {
            println("Not an attribute")
        }
    }
}
