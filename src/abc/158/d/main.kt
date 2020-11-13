package abc.`158`.d

import java.util.*

fun main(args: Array<String>) {

    var s = readLine()!!
    var deq = ArrayDeque<Char>()
    deq.addAll(s.toCharArray().asList())
    val q =  readLine()!!.toInt()

    var rev = false
    repeat(q) {
        val qu = readLine()!!
        if (qu == "1") rev = !rev
        else {
            val (t,f,c) =  qu.split(' ')
            if (f == "1") {
                if (rev) deq.addLast(c.toCharArray()[0])
                else deq.addFirst(c.toCharArray()[0])
            } else {
                if (rev) deq.addFirst(c.toCharArray()[0])
                else deq.addLast(c.toCharArray()[0])
            }
        }
    }


    while(deq.isNotEmpty()) {
        if (rev) {
            print(deq.pollLast())
        } else {
            print(deq.pollFirst())
        }

    }
    println()

}
