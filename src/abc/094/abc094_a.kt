package abc.`094`
import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B, X) = readLine()!!.split(' ').map { it.toInt() }
    if (A+B >= X && A <= X) println("YES")
    else println("NO")
}
