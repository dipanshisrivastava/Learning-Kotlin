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