/*
Pair is a predefined class in Kotlin that is used to store and return two variables at a time.
Those two variables can be of the same type or of a different type.

Triple is another predefined class in Kotlin. With the help of Triple class in Kotlin,
you can store and return 3 variables of same or different type from one function.
*/

fun main()
{
    println(Pair("Tom", "Jerry")) //(Tom, Jerry)
    println(Pair("Tom", 5.6)) //(Tom, 5.6)
    println(mapOf("Tom" to "Cat", "Jerry" to "Mouse"))

    println(Triple("Tom", "Jerry", "Dog"))
}