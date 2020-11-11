fun main(args: Array<String>) {
    val a = readLine()!!.split(' ').map { it.toInt() }.sorted()
    println(a[1])
}
