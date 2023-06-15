// Destructuring is used to extract values into variables from within an existing object.
// This facility is useful to remove noisy, repetitive code.

fun getFullName() = Triple("John", "Quincy", "Adams")

fun main() {

    val result = getFullName()
    val one = result.first
    val two = result.second
    val three = result.third

    println("$one $two $three")

// Use Destructuring to extract the values into variables.

    println("\nUsing Destructring")
// 1.
    val(a, b, c) = getFullName()
    println("$a $b $c")

// 2.
    val stringList = arrayOf("a", "b", "c", "d", "e")

    val(s1,s2, s3, s4, s5) = stringList
    println("$s1 $s2 $s3 $s4 $s5")

// 3.
    val (third) = getFullName()
    println("$third")

// 4.
    val (_, first) = getFullName()
    println("$first")
}