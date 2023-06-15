// Nullable reference ----------->  ?
fun title(name: String?) : String?
{

    if(name == "William")
        return "Bill"

    // Elvis operator ---------->  ?:      If you want to return some value instead of returning null, use elvis operator.
    return name?.reversed() ?: "Joker";
}

fun surname(name: String?) = when(name)
{
        "William" -> "Bill"
        null -> "Joker"
        else -> name.reversed()
}

fun main()
{
    println(title("William"))
    println(title(null))

    println()

    println(surname("William"))
    println(surname("Riya"))
    println(surname(null))
    println(surname("null"))
    println(surname(""))
}