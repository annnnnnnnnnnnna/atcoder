package abc.`171`.d

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val arr = LongArray(100001)
    var sum = 0L
    val a = readLine()!!.split(' ').map {
        val num = it.toInt()
        arr[num]++
        sum += num
        num
    }
    val q = readLine()!!.toInt()

    repeat(q) {
        val (b, c) = readLine()!!.split(' ').map { it.toLong() }
        val cnt = arr[b.toInt()]
        sum -= cnt*b
        sum += cnt*c
        println(sum)
        arr[b.toInt()] -= cnt
        arr[c.toInt()] += cnt
    }
}
