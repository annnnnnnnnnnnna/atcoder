package abc.`123`.c

fun main(args: Array<String>) {
    val n = readLine()!!.toDouble()
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    val c = readLine()!!.toLong()
    val d = readLine()!!.toLong()
    val e = readLine()!!.toLong()
    val bottleNeck = Math.min(a,Math.min(b, Math.min(c, Math.min(d, e))))
    val t = Math.ceil(n / bottleNeck.toDouble()).toLong()
    println(t+4)
}
