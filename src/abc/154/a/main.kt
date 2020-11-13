package abc.`154`.a

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    var a = sc.nextInt()
    var b = sc.nextInt()
    val u = sc.next()

    if (u == s) {
        a--
    } else {
        b--
    }
    println("$a $b")
}
