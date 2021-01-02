package abc.`187`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val orig = mutableSetOf<String>()
    val anoth = mutableSetOf<String>()
    val S = (1..N).map {
        val s = readLine()!!
        if(s[0] == '!') {
            anoth.add(s)
        } else {
            orig.add(s)
        }
    }
    orig.forEach {
        if (anoth.contains("!$it")) {
            println(it)
            return
        }
    }
    println ("satisfiable")
}
