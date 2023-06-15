fun main()
{
    val fruits: Set<String> = setOf("Mango", "Apple", "Banana", "Apple")
    print(fruits)
    println()

    val games: MutableSet<String> = mutableSetOf("Ludo", "Cricket", "Football", "Ludo")
    print(games)
    println()

    games.add("Basketball")
    print(games)
}