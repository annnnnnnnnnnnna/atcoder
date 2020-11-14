package abc.`180`.b

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val x = readLine()!!.split(' ').map { it.toLong() }
    var m = 0L
    var y = 0L
    var c = 0L

    x.forEach {
        m += Math.abs(it)
        y += Math.abs(it) * Math.abs(it)
        c = Math.max(c, Math.abs(it))
    }
    println(m)
    println(Math.sqrt(y.toDouble()))
    println(c)
}
