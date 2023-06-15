fun main()
{
    val array = arrayOf(1, 2, 3)
    for (e in array)
        print("$e, ")
    println()

    val list = listOf(1, 2, 3, 4, 5)
    for (e in list)
        print("$e, ")
    println("\n")

    val names = listOf("Tom", "Jerry", "Spike")
    for (index in names.indices)
        println("Position of ${names.get(index)} is $index")
    println()

    for ((index, name) in names.withIndex())
        println("Position of $name is $index")

}