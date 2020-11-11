package abc.`116`.c

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }.toIntArray()

    var finish = false
    var ans = 0

    while(!finish) {
        var begin = false
        var did = false
        for (i in 0 until n) {
            if (a[i] == 0) {
                if (begin) ans++
                begin = false
            } else {
                begin = true
                did = true
                a[i]--
            }
        }
        if (did && begin) ans++
        if (!did) finish = true
    }
    println(ans)
}
