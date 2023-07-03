/*
String templates are String literals that contain embedded expressions.

For example, this code in Java:
String message = "n = " + n;

In Kotlin is just:
val message = "n = $n"
*/
fun main()
{
    var factor = 2

    fun doubleIt(n: Int) = n * factor

    var message = "The factor is $factor"

    factor = 0

    println(doubleIt(2))
    println(message)

    val price = 12.25
    val taxRate = 0.08
    val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
    val disclaimer = "The amount is in US$, that's right in \$only"

    println(output)
    println(disclaimer)
}