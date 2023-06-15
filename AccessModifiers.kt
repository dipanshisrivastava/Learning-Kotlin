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