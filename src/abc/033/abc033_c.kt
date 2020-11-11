fun main(args: Array<String>) {
    val s = readLine()!!.split('+')
    var ans = 0
    s.forEach {
        if(!it.contains("0")) ans++
    }
    println(ans)
}
