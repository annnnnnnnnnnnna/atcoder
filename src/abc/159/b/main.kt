package abc.`159`.b

fun main(args: Array<String>) {

    val s = readLine()!!
    val n = s.length
    var ans = true

    val s2 = s.substring(0, (n-1)/2)
    val s3 = s.substring((n+3)/2-1, n)

    ans = ans && chk(s)
    ans = ans && chk(s2)
    ans = ans && chk(s3)

    if (ans) println("Yes")
    else println("No")
}

fun chk(s: String):Boolean {
    val n = s.length
    val arr = s.toCharArray()
    var ret = true
    repeat(n/2) {
        if (arr[it] != arr[n-it-1]) ret = false
    }
    return ret
}
