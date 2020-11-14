package abc.`164`.b

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    var (a,b,c,d) = readLine()!!.split(' ').map { it.toInt() }
    var t = true
    while(a > 0 && c > 0) {
        if (t) c -= b
        else a -= d
        t = !t
    }
    if (a <= 0) println("No")
    else println("Yes")
}
