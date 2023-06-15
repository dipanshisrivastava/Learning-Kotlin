fun main()
{
    for (num in 1..5)
        print("$num, ")

    println()

    for (ch in 'a'..'e')
        print("$ch, ")

    println()

    val seekHelp: ClosedRange<String> = "hell".."help"
    println(seekHelp.contains("helm"))
    println(seekHelp.contains("helq"))

    for (i in 5 downTo 1)
        print("$i, ")

    println()
    for (i in 1 until 5)
        print("$i, ")

    println()
    for (i in 1 until 10 step 3)
        print("$i, ")

    println()
    for (i in 10 downTo 0 step 3)
        print("$i, ")

    println()
    for (i in (1..9).filter { it % 3 == 0 || it % 5 == 0 })
        print("$i, ")

}