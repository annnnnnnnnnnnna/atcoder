fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!

    var ans = s.toCharArray()
    var tOk = false
    for (i in s.length-t.length downTo 0) {
        ans = s.toCharArray()
        tOk = true
        for (j in t.indices) {
            if (s[i+j] == '?' || s[i+j] == t[j]) {
                ans[i+j] = t[j]
            } else {
                tOk = false
                break
            }
        }
        if (tOk) break
    }
    if (tOk) {
        println(ans.joinToString("").replace("?","a"))
    } else {
        println("UNRESTORABLE")
    }
}
