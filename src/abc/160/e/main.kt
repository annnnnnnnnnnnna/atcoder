package abc.`160`.e

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val redArr = LongArray(a)
    repeat(a) {
        val red = sc.nextLong()
        redArr[it] = red
    }
    val sortedRedArr = redArr.sortedArrayDescending().take(x).toLongArray()

    val greenArr = LongArray(b)
    repeat(b) {
        val green = sc.nextLong()
        greenArr[it] = green
    }
    val sortedGreenArr = greenArr.sortedArrayDescending().take(y).toLongArray()

    val nonArr = LongArray(c)
    repeat(c) {
        val non = sc.nextLong()
        nonArr[it] = non
    }

    val sorted = (sortedRedArr + sortedGreenArr + nonArr).sortedArrayDescending()

    var answer = 0L
    repeat(x + y) {
        answer += sorted[it]
    }
    println(answer)


}
