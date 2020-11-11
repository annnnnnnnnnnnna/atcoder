fun main(args: Array<String>) {
    val l = readLine()!!.split(' ').map { it.toInt() }.sorted()
    println(
        if (l[0] == l[1]) l[2]
        else l[0]
    )
}
