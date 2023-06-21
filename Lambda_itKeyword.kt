// First go through Lambda Expression file

fun main()
{
    val singleparameter = {x: Int -> x*x}
    val it_keyword: (Int) -> (Int) = {it * it}

    println(singleparameter(4))
    println(it_keyword(5))
}