// Smart cast is a feature in which Kotlin compiler tracks conditions inside if expression.
// If compiler founds a variable is not null of type nullable then the compiler will allow to access the variable.
fun nameFunction(name: String?): String?
{
    if(name!=null) // Smart Cast
        return "Singh"
    return ""
}
fun main()
{
    println(nameFunction("Riya"))
    println(nameFunction(null))
}