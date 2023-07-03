/*
Apply scope function is used to configure the object once initialized and returns the object itself.
The context object is available inside the apply function as this.


apply : You want to configure or initialize an object.
with : You want to operate on a non-null object.
let : You want to execute a lambda function on a nullable object and avoid NullPointException.
run : You want to operate on a nullable object, execute a lambda expression, and avoid NullPointerException.
*/
fun main()
{
    val emp = Employees()
    emp.age = 20
    emp.name = "Raj"

    emp.apply {
        age = 30
        name = "Riya"
    }
    println(emp)

}

data class Employees(var name: String = "", var age: Int = 18)