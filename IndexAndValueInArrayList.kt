fun main()
{
    val names = listOf("Tom", "Jerry")

    for ((index, value) in names.withIndex())
        println("$index $value")
}