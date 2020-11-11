package abc.`147`.b

fun main(args: Array<String>) {
    val s = readLine()!!
    var ans = 0
    repeat(s.length/2) {
        if (s[it] != s[s.length-1-it]) ans++
    }
    println(ans)
}
