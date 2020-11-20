package abc.`056`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (W, a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(
        if (b in a .. a+W || a in b .. b+W) 0
        else {
            if (b > a+W) b-a-W
            else a-b-W
        }
    )
}
