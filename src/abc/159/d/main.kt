package abc.`159`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val arr = IntArray(N+1)
    val st = mutableSetOf<Int>()
    val A = readLine()!!.split(' ').map {
        val a = it.toInt()
        arr[a]++
        st.add(a)
        a
    }
    val ptns = LongArray(N+1)
    var all = 0L
    st.forEach {
        ptns[it] = arr[it] * (arr[it]-1L) / 2
        all += ptns[it]
    }
    for (i in 0 until N) {
        println(all - if(ptns[A[i]] > 0L) (arr[A[i]]-1L) else 0)
    }
}
