package abc.`165`.b

fun main(args: Array<String>) {
    val x = readLine()!!.toLong()
    var m = 100L
    var ans = 0
    while(m < x) {
        m = (m.toDouble() * 1.01).toLong()
        ans++
    }
    println(ans)
}
