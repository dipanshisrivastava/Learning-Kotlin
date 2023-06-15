// listOf() is immutable
// mutableListOf() is mutable

fun main()
{

    // Immutable List:

    val fruits: List<String> = listOf("Apple", "Banana", "Mango", "Grapes")
    //1.
    print(fruits)
    println()

    //2.
    for(l in fruits)
        print("$l ")
    println()

    // 3.
    for(index in fruits.indices)
        print("${fruits[index]} ")
    println()

    // Check whether the fruit is present in the list or not.

    println(fruits.contains("Apple"))
    println("Apple" in fruits)

    // Mutable List:

    val games: MutableList<String> = mutableListOf("Ludo", "Cricket", "Football", "Basketball")

    print(games)
    println()

    games.add("Badminton")

    print(games)
    println()

    for(idx in games.indices)
        print("${games[idx]} ")
}