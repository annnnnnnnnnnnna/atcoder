package abc.`148`.b

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val (s,t) = readLine()!!.split(" ")

    repeat(n) {
        print("${s[it]}${t[it]}")
    }
    println()
}
