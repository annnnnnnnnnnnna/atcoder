package abc.`009`.b

fun main() {
    val n = readLine()!!.toInt()
    val a = mutableSetOf<Int>()
    repeat(n) {
        a.add(readLine()!!.toInt())
    }

    println(a.toTypedArray().sortedDescending()[1])
}
