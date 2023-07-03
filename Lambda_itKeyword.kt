// First go through Lambda Expression file
// If there is single input parameter in lambda expression then it can be referred using it.
fun main()
{
    val singleparameter = {x: Int -> x*x}
    val it_keyword: (Int) -> (Int) = {it * it}

    println(singleparameter(4))
    println(it_keyword(5))
}