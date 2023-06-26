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