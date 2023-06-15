// Type aliases provide an alternate name for the existing types.

typealias LoginDetails = Pair <String, String>
typealias str = String
//typealias Xinner = X.InnerClass
//typealias Yinner = Y.InnerClass

fun main()
{
    val pairString1 = LoginDetails("User1", "Pass1")
    val pairString2 = LoginDetails("User2", "Pass2")

    println(pairString2)
    println(pairString1)

    val name: str = "Jhon"
    println(name)


//    X().InnerClass().prnt()
//    Y().InnerClass().prnt()
}

class X {
    inner class InnerClass {
        fun prnt()
        {
            println("In class X inner class")
        }
    }
}

class Y {
    inner class InnerClass {
        fun prnt()
        {
            println("In class Y inner class")
        }
    }
}