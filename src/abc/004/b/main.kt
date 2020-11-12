package abc.`004`.b

fun main() {
    val c = arrayOf<String>("", "", "", "")
    repeat(4) {
        c[it] = readLine()!!.split(" ").reversed().joinToString(" ")
    }
    for (i in 0..3) {
        println(c[3-i])
    }
}
