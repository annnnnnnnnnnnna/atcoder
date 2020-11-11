fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    val atcoder = "atcoder".toCharArray()
    var success = true
    for (i in s.indices) {
        if (s[i] == t[i]) continue
        if (s[i] == '@') {
            if (t[i] !in atcoder) success = false
        } else if (t[i] == '@') {
            if (s[i] !in atcoder) success = false
        } else if (s[i] != t[i]) success = false
    }
    if (success) println("You can win")
    else println("You will lose")
}
