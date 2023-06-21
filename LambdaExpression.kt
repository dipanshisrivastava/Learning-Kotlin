fun main()
{
    val lambda1 = {x: Int, y: Int -> x+y}
    println(lambda1(2,3))

    val multiLineLambda = {
        println("Hello World")
        val a = 2+3
        "Lambda multiline expression always returns the last line."
//        a
    }
    println(multiLineLambda())

    val singleParameterLambda = {x: Int -> x*x}
    val singleParameterLambda2: (Int) -> (Int) = {x -> x*x}

    println(singleParameterLambda(2))
    println(singleParameterLambda2(4))

    val sayHi = {msg: String -> println("Hello $msg")}
    val sayHi2: (String) -> (Unit) = {msg -> println("Hello $msg")}

    sayHi("Raj")
    sayHi2("Jhon")

}


/*
fun sum(a: Int, b: Int): Int
{
    return a+b
}

"sum" function can written in terms of Lambda expression as follows:

val sum = {a: Int, b: Int -> a+b}
*/