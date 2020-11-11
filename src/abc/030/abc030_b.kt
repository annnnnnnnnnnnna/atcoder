fun main(args: Array<String>) {
    var (h, m) = readLine()!!.split(' ').map { it.toInt() }
    if (h >= 12) h -= 12
    val s = m*6.0
    val l = h*30.0 + m*0.5
    var d = Math.abs(l-s)
    if (d > 180) d = 360-d
    println(d)
}
