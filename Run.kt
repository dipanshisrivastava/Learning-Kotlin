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