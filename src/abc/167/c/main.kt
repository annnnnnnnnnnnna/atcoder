package abc.`167`.c

fun main(args: Array<String>) {
    val (n ,m, x) = readLine()!!.split(' ').map { it.toInt() }

    var min = Int.MAX_VALUE
    val arr = Array(n) {listOf<Int>()}
    repeat(n) {
        arr[it] = readLine()!!.split(' ').map { it.toInt() }
    }

    fun chk(buy: BooleanArray) {
        var plice = 0
        val exp = IntArray(m) {0}
        val fin = BooleanArray(m) {false}
        var clear = 0
        repeat(n) {
            if (buy[it]) {
                plice += arr[it][0]
                for (i in 1 .. m) {
                    exp[i-1] += arr[it][i]
                    if (!fin[i-1] && exp[i-1] >= x) {
                        fin[i-1] = true
                        clear++
                    }
                }
            }
        }
        if (clear == m) min = Math.min(min, plice)
    }

    val buyList = BooleanArray(n) { false }
    fun create(d:Int) {
        arrayOf(true,false).forEach {
            buyList[d] = it
            if (d+1 == n) {
                chk(buyList)
            } else {
                create(d+1)
            }
        }
    }

    create(0)
    if (min == Int.MAX_VALUE) println(-1)
    else println(min)
}
