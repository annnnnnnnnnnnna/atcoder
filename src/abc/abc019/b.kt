import java.lang.StringBuilder

fun main(args: Array<String>) {
    val s = readLine()!!
    var ans = StringBuilder("")
    var pre = ' '
    var cnt = 0
    repeat(s.length) {
        if(s[it] != pre) {
            if (pre != ' ') {
                ans.append("$pre$cnt")
            }
            cnt= 0
            pre = s[it]
        }
        cnt++
    }
    ans.append("$pre$cnt")
    println(ans)
}
