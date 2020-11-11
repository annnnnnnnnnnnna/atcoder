fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    if (n * 4 < m || n * 2 > m) {
        println("-1 -1 -1")
        return
    }
    var four = m/4
    var three = (m-(four*4))/3
    var two = (m-((four*4)+(three*3))) /2
    while (n != (four + three + two) || m != (four*4 + three*3 + two*2)) {
        four--
        val mm = m-(four*4)
        val nn = n - four
        if (nn * 3 < mm || nn * 2 > mm) {
            continue
        }
        three = (m - (four * 4)) / 3
        two = (m - ((four * 4) + (three * 3))) / 2
        while (n != (four + three + two) || m != (four*4 + three*3 + two*2)) {
            three--
            two = (m - ((four * 4) + (three * 3))) / 2
        }
    }
    println("$two $three $four")
}
