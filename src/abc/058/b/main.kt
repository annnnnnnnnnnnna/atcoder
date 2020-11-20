package abc.`058`.b

import java.io.PrintWriter
import java.lang.StringBuilder
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val O = readLine()!!
    val E = readLine()!!
    val ans = StringBuilder()
    for (i in E.indices) {
        ans.append(O[i])
        ans.append(E[i])
    }
    if (O.length > E.length) ans.append(O.last())
    println(ans)
}
