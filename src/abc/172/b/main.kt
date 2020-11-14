package abc.`172`.b

fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!

    var ans = 0
    repeat(s.length) {
        if (s[it] != t[it]) ans++
    }
    println(ans)
}
