/*
Kotlin gives the programmer the ability to add more functionality to the existing classes, without inheriting them.
This is achieved through a feature known as extensions.
When a function is added to an existing class it is known as Extension Function.
*/

fun main()
{
    println("Hello World".formattedString())
}

fun String.formattedString(): String {
    return "--------------------\n$this\n--------------------"
}