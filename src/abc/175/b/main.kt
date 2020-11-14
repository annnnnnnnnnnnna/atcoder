package abc.`175`.b

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(' ').map { it.toLong() }

    var ans = 0
    for (i in 0 until n-2) {
        for (j in i+1 until n-1) {
            for (k in j+1 until n) {
                if (l[i] != l[j] && l[j] != l[k] && l[k] != l[i]) {
                    if ((l[i] + l[j]) > l[k] &&
                        (l[k] + l[i]) > l[j] &&
                        (l[j] + l[k]) > l[i]
                    ) ans++
                }
            }
        }
    }

    println(ans)
}
