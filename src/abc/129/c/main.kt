package abc.`129`.c

fun main() {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    val arr = Array(N+1) { -1L }
    arr[0] = 1
    repeat(M) {
        arr[readLine()!!.toInt()] = 0L
    }
    if (arr[1] == -1L) arr[1] = 1L
    for (i in 2 .. N) {
        if (arr[i] == -1L) {
            arr[i] = modAdd(arr[i - 1], arr[i - 2])
        }
    }
    println(arr[N])
}
const val mod = 1000000007L
fun modAdd(a: Long, b:Long):Long = (a + b) % mod
