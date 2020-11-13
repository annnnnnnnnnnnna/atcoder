package abc.`155`.b

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)

    a.forEach {
        if (it % 2 == 0 && (it % 3 != 0 && it % 5 != 0)) {
            println("DENIED")
            return
        }
    }
    println("APPROVED")
}
