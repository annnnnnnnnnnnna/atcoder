package abc.`168`.c

fun main(args: Array<String>) {
    val (a, b, h, m) = readLine()!!.split(' ').map { it.toDouble() }

    // 短針 1分0.5度
    val sd = (h*30 + m*0.5) * Math.PI/180
    val sx = Math.sin(sd) * a
    val sy = Math.cos(sd) * a

    // 長針 1分6度
    val ld = m*6 * Math.PI/180
    val lx = Math.sin(ld) * b
    val ly = Math.cos(ld) * b


    println("%.20f".format(Math.sqrt(Math.pow(sx-lx,2.0) + Math.pow(sy-ly,2.0))))

}
