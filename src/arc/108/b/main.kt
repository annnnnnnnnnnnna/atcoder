package arc.`108`.b

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val s = readLine()!!

    val stack = Stack<Char>()

    var fox = 0
    for (i in s.indices) {
        if (s[i] in "fox") {
            stack.push(s[i])
        } else {
            stack.clear()
        }
        if (stack.size >= 3 && s[i] == 'x') {
            if (stack.pop() == 'x' && stack.pop() == 'o' && stack.pop() == 'f') {
                fox++
            } else {
                stack.clear()
            }
        }
    }
    println(N - fox*3)
}
