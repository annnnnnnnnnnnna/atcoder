fun main(args: Array<String>) {
    val s = readLine()!!
    val k = readLine()!!.toInt()
    if (k > s.length) {
        println(0)
        return
    }
    val ans = mutableSetOf<String>()
    for (i in 0 until s.length-k+1) {
        val ss = s.substring(i,i+k)
        ans.add(ss)
    }
    println(ans.size)
}
