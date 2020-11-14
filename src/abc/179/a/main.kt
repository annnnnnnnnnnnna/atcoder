package abc.`179`.a

fun main(args: Array<String>) {
    val s = readLine()!!
    println(if (s[s.lastIndex] == 's') "${s}es"
    else "${s}s")
}
