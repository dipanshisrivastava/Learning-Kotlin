/*
Inline function: instruct compiler to insert the complete body of the function wherever that function gets used
in the code.

Advantage of inline function:
Function call overhead doesn't occur, less overhead and faster program execution.

*/

fun main()
{
    println("Main Function")
    teach()
    println("Main Function")
}

// 1.
inline fun teach()
{
    println("Teach Function")
}

// After decompiling the code, for teach function main function will look like:
/*
fun main()
{
    system.out.println("Main Function")
    system.out.println("Teach Function")
    system.out.println("Main Function")
}
*/

// 2.
/*
fun teach()
{
    println("Teach Function")
}
After decompiling the code, for teach function main function will look like:
fun main()
{
    system.out.println("Main Function")
    teach()
    system.out.println("Main Function")
}
*/