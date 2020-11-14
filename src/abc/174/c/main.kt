package abc.`174`.c

fun main(args: Array<String>) {
    val k = readLine()!!.toLong()
    var seven = 0L
    var ans = 1
    var cnt = 0L
    while (cnt <= k) {
        seven = (seven * 10 + 7) % k
        if (seven % k == 0L) {
            println(ans)
            return
        }
        ans++
        cnt++
    }
    println (-1)
}
