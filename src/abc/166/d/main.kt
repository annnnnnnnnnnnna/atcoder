package abc.`166`.d

fun main(args: Array<String>) {
    val x = readLine()!!.toDouble()

    val min = -1000.0
    val max = 1000.0
    var a = min
    var b = min

    while(a <= max) {
        val ap = Math.pow(a, 5.0)
        b = min
        var bp = Math.pow(b, 5.0)
        while(b <= max) {
            if (ap - bp == x) break
            b++
            bp = Math.pow(b, 5.0)
        }
        if (ap - bp == x) break
        a++
    }

    println("${a.toInt()} ${b.toInt()}")

}
