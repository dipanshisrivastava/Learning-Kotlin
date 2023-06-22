fun main()
{
    // Passing lambda expression as an argument
    // println(calculate(5,4, {a, b -> a+b}))
    // Above line can also be written as:
    println(calculate(5,8){a, b -> a+b})
}

// lambda expression for sum function
// val sum = {a: Int, b: Int -> a+b}

fun calculate(a: Int, b: Int, funcAsArgument: (Int, Int) -> Int): Int
{
    return funcAsArgument(a,b)
}