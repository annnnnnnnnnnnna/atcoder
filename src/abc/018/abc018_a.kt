fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val lst = listOf(a, b, c).sortedDescending()
    println(lst.indexOf(a)+1)
    println(lst.indexOf(b)+1)
    println(lst.indexOf(c)+1)
}
