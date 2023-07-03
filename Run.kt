/*
run has two variants:

One is an extension function to Template class which takes a lambda (higher-order function) as a parameter, apply contract on it and ultimately return the execution of the lambda we passed as a parameter to it.

Second is not an extension function to Template class but a normal extension function that takes a HOF as
parameters, applies the operations and return the lambda expression or results. The return type can also be void.

apply : You want to configure or initialize an object.
with : You want to operate on a non-null object.
let : You want to execute a lambda function on a nullable object and avoid NullPointException.
run : You want to operate on a nullable object, execute a lambda expression, and avoid NullPointerException.

*/
fun main()
{
    val emp = Employee2()
    emp.age = 20
    emp.name = "Jhon"

    emp.run {
        age = 50
        name = "PQR"
    }
    println(emp)
}

data class Employee2(var name: String = "", var age: Int = 18)