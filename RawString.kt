/*
Raw string is placed inside the triple quotes (“””….”””) and it does not have escape characters.
It provides the facility of writing the string into multiple lines so it is also called multi-line string.

Escape Characters:


\n : for newline
\’ : for single quote
\\ : for backslash
\t : for tab
\b : for backspace

*/
fun createMemoForWithIndentation(name: String): String {
    if (name == "Eve")
    {
        val memo = """Dear $name, a quick reminder about the
        party we have scheduled next Tuesday at
        the 'Low Ceremony Cafe' at Noon. | Please plan to..."""

        return memo
    }
    return ""
}

fun createMemoForWithNoIndentation(name: String): String {
    if (name == "Eve") {
        val memo = """Dear $name, a quick reminder about the
            |party we have scheduled next Tuesday at
            |the 'Low Ceremony Cafe' at Noon. | Please plan to..."""
        return memo.trimMargin()
    }
    return ""
}

fun DifferenciateBetweenOutputOfSecondAndThisFunction(name: String): String
{
    if (name == "Eve") {
        val memo = """Dear ＄name, a quick reminder about the
        ~party we have scheduled next Tuesday at
        ~the 'Low Ceremony Cafe' at Noon. | Please plan to..."""
        return memo.trimMargin("~")
    }
    return ""
}

fun main()
{
    println(createMemoForWithIndentation("Eve"))
    println()
    println(createMemoForWithNoIndentation("Eve"))
    println()
    println(DifferenciateBetweenOutputOfSecondAndThisFunction("Eve"))
}