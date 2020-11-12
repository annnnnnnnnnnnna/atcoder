package abc.`148`.b

fun main() {
    val n = readLine()!!.toInt()
    val (s,t) = readLine()!!.split(" ")

    repeat(n) {
        print("${s[it]}${t[it]}")
    }
    println()
}
