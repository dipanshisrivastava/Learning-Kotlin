/*
A set is unordered collection of elements and it does not contain duplicate elements.
Kotlin supports two types of sets mutable and immutable.
setOf() is immutable and mutableSetOf() is mutable.
*/

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