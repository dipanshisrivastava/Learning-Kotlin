fun main()
{
    val num = listOf<Int>(1,2,3,4,5,6,7)
    println(middleItem(num))

    val names = listOf<String>("Riya", "Raj", "Jhon", "William", "Rocky")
    println(middleItem(names))
}

fun <T> middleItem(list: List<T>): T = list[list.size / 2]