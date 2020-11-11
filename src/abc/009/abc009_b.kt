fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = mutableSetOf<Int>()
    repeat(n) {
        a.add(readLine()!!.toInt())
    }

    println(a.toTypedArray().sortedDescending()[1])
}
