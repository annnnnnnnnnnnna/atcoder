package abc.`162`.d

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!


    var rcnt = 0L
    var gcnt = 0L
    var bcnt = 0L
    repeat(n) {
        when {
            s[it] == 'R' -> {
                rcnt++
            }
            s[it] == 'G' -> {
                gcnt++
            }
            s[it] == 'B' -> {
                bcnt++
            }
        }
    }

    val answer = rcnt * gcnt * bcnt
    var minus = 0
    for (a in 0 until n-2) {
        for (b in a+1 until n-1) {
            val c = b + (b-a)
            if (c < n && s[a] != s[b] && s[a] != s[c] && s[b] != s[c]) minus++
        }
    }
    println(answer - minus)
}
