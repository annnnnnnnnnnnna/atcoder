package abc.`183`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (Sx, Sy, Gx, Gy) = readLine()!!.split(' ').map { it.toDouble() }
    val tate = Sy + Gy
    val yoko = Sx*Gy + Gx*Sy

    println("%.12f".format(yoko / tate))
}
