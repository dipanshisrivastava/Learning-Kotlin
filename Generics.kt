/*
Generics are the powerful features that allow us to define classes, methods and properties
which are accessible using different data types while keeping a check on the compile-time type safety.
*/

//class IntContainer(var data: Int)
//{
//    fun setValue(value: Int)
//    {
//        data = value
//    }
//    fun getValue(): Int
//    {
//        return data
//    }
//}
class Container<T>(var data: T)
{
    fun setValue(value: T)
    {
        data = value
    }
    fun getValue(): T
    {
        return data
    }
}

fun main()
{
    val sobj = Container<String>("Hello")
    val iobj = Container<Int>(5)
    println(sobj.getValue())
    println(iobj.getValue())



}