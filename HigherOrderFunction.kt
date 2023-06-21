/*
HOF are functions that either accepts functions as argument or return functions or both.
*/

fun main()
{
    println(calculator(5,4, ::sum))
}

fun sum(a: Int, b: Int): Int {
    return a+b
}

fun calculator(a: Int, b: Int, funcAsArgument: (Int, Int) -> Int): Int
{
    return funcAsArgument(a,b)
}