package abc.`181`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val S = readLine()!!
    var e = 104
    val haveList = Array(113){ IntArray(10) }
    var cnt = 0
    while(e < 1000) {
        val have = IntArray(10)
        e.toString().forEach {
            have[it-'0']++
        }
        haveList[cnt] = have
        cnt++
        e +=8
    }
    haveList[112] = arrayOf(3, 0, 0, 0, 0, 0, 0, 0, 0, 0).toIntArray()
    println(
    when(S.length) {
        1 -> {
            if (S == "8") "Yes"
            else "No"
        }
        2 -> {
            if (S.toInt()%8 == 0 || ("${S[1]}${S[0]}").toInt() % 8 == 0) "Yes"
            else "No"
        }
        else -> {
            val have = IntArray(10)
            for (i in S.indices) {
                have[S[i]-'0']++
            }
            var ok = true
            for (need in haveList) {
                ok = true
                for (i in 0 .. 9) {
                    if (have[i] < need[i]) {
                        ok = false
                        break
                    }
                }
                if (ok) break
            }
            if(ok) "Yes"
            else "No"
        }
    }
    )
}
