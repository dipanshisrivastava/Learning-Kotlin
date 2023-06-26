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