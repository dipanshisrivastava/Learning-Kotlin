/*
let scope function is used to apply operations on an object and finally return the lambda expression from
that scope function. The return type can also be void.


apply : You want to configure or initialize an object.
with : You want to operate on a non-null object.
let : You want to execute a lambda function on a nullable object and avoid NullPointException.
run : You want to operate on a nullable object, execute a lambda expression, and avoid NullPointerException.
*/
fun main()
{
    val emp = Employee()
    emp.age = 20
    emp.name = "Raj"

    emp.let {
        println(it.name)
        println(it.age)
    }

    val emp_null : Employee? = null

    emp_null?.age = 20
    emp_null?.name = "Jhon"

    println(emp_null)

    emp_null?.let {
        it.age = 10
        it.name = "Riya"
    }

    println(emp_null)

}
// A data class is a class that only contains state and does not perform any operation.
data class Employee(var name: String = "", var age: Int = 18)