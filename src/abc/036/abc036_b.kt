fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val arr = Array(n) {""}
    repeat(n) {
        arr[it] = readLine()!!
    }
    for (i in 0 until n) {
        for (j in 1 .. n) {
            print(arr[n-j][i])
        }
        println()
    }
}
