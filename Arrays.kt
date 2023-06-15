fun main()
{
    val friends = arrayOf("Riya", "Raj", "Jhon", "Tintin")

    for((idx) in friends.withIndex())
        print("${friends[idx]} ")

    println()

    val marks = intArrayOf(1,2,3,4,5)
    for((idx) in marks.withIndex())
        print("${marks[idx]} ")

    println()

    println("Marks Size: ${marks.size}")
    println("Marks Average: ${marks.average()}")
}