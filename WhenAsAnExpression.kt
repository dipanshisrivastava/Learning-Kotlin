fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int): Boolean
{
    if (numberOfLiveNeighbors < 2) { return false }
    if (numberOfLiveNeighbors > 3) { return false }
    if (numberOfLiveNeighbors == 3) { return true }
    return alive && numberOfLiveNeighbors == 2
}

// Using when as an expression

fun isAliveWhen(alive: Boolean, numberOfLiveNeighbors: Int) = when {
    numberOfLiveNeighbors < 2 -> false
    numberOfLiveNeighbors > 3 -> false
    numberOfLiveNeighbors == 3 -> true
    else -> alive && numberOfLiveNeighbors == 2
}

fun main()
{
    println(isAlive(true, 2))

    println(isAliveWhen(true, 2))
}