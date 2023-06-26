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

    emp_null?.let {
        it.age = 10
        it.name = "Riya"
    }

    println(emp_null)

}

data class Employee(var name: String = "", var age: Int = 18)