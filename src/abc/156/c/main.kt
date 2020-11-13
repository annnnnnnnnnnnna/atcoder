package abc.`156`.c

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var sum:Double = 0.0
    val a = readLine()!!.split(" ").map {
        val i = it.toInt()
        sum += i
        i
    }
    val ave:Long = Math.round(sum/n)

    var ans: Double = 0.0
    a.forEach {
        val i = it.toInt()
        ans += Math.pow(Math.abs(ave - i).toDouble(), 2.0)
    }

    println(ans.toInt())

}
