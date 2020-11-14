package abc.`165`.d

fun main(args: Array<String>) {
    val (a, b, n) = readLine()!!.split(' ').map { it.toLong() }

    fun calc(a: Long, b:Long, x:Long):Long {
        val ad = a.toDouble()
        val bd = b.toDouble()
        val xd = x.toDouble()
        val ret = (Math.floor(ad * xd / bd) - ad * Math.floor(xd / bd)).toLong()
        return ret
    }

    println(calc(a, b, Math.min(n, b-1)))
}
