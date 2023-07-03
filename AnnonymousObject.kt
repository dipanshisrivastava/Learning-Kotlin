// Anonymous objects is similar to singleton objects, but without the name of the object.

fun drawCircle()
{
    val circle = object {
        val x = 20
        val y = 10
        val radius = 30
    }
    println("Circle x: ${circle.x} y: ${circle.y} radius: ${circle.radius}")
}
fun createRunnable(): Runnable = object: Runnable, AutoCloseable {
    override fun run() { println("You called...") }
    override fun close() { println("closing...") }
}

fun main()
{
    drawCircle()
    val aRunnable = createRunnable()
    aRunnable.run()
}

/*
If you need a name for your anonymous object, or need it to store for later use,
you can initialize a variable with it.
Example:

val runnable = object : Runnable { }
*/