/*
Access modifiers are used to control the visibility of a class, its members and its constructors.
The following are the visibility modifiers available in Kotlin:

private: The private modifier restricts the visibility of a member to the containing class only.
A private member cannot be accessed from outside the class.

internal: The internal modifier restricts the visibility of a member to the same module.
A module is a set of Kotlin files compiled together.

protected: The protected modifier restricts the visibility of a member to the containing class and its subclasses.

public: The public modifier makes a member visible to any code.
This is the default visibility for members in Kotlin.
*/


fun main()
{
    var p = Person()
//    println(p.a)
//    println(p.b)
    println(p.c)
    println(p.d)
}

open class Person
{
    protected var a = 1
    private var b = 2
    var c = 3
    internal var d = 4
}

class Indian: Person()
{
    fun test()
    {
        println(a)
//        println(b)
        println(c)
        println(d)
    }
}