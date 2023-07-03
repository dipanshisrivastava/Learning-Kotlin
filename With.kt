/*
with is a normal extension function that takes a Template class object and a higher-order function as parameters,
applies the operations to the passed Template class object and return the lambda expression or results.
The return type can also be void.
More than functional, with can be used as grammatical where we can read as "with this object, do the following.".

apply : You want to configure or initialize an object.
with : You want to operate on a non-null object.
let : You want to execute a lambda function on a nullable object and avoid NullPointException.
run : You want to operate on a nullable object, execute a lambda expression, and avoid NullPointerException.
*/
fun main()
{
    val emp = Employee1()
    emp.age = 20
    emp.name = "Jhon"

    with(emp)
    {
        age = 30
        name = "Riya"
    }
    println(emp)
}

data class Employee1(var name: String = "", var age: Int = 18)