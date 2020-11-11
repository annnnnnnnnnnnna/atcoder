package abc.`145`.b

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    if (n%2 == 1) {
        println("No")
        return
    }
    val len = n/2
    var ans = true
    repeat(len) {
        if(s[it] != s[it+len]) ans = false
    }
    if(ans) println("Yes")
    else println("No")
}
