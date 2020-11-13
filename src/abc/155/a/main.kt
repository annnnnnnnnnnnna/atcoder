package abc.`155`.a

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    val c = sc.next()

    if (a == b && b != c ||
        a == c && b != c ||
        b == c && a != b) {
        println("Yes")
    } else {
        println("No")
    }
}
