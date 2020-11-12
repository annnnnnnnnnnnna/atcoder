package abc.`110`.c

fun main() {
    val s = readLine()!!
    val t = readLine()!!

    val n = s.length
    val conv = mutableMapOf<Char, Char>()
    val convR = mutableMapOf<Char, Char>()

    var ans = true
    repeat(n) {
        if (conv[s[it]] == null) {
            conv[s[it]] = t[it]
        } else {
            if (conv[s[it]] != t[it]) ans = false
        }
        if (convR[t[it]] == null) {
            convR[t[it]] = s[it]
        } else {
            if (convR[t[it]] != s[it]) ans = false
        }
    }

    if (ans) println("Yes")
    else println("No")
}
