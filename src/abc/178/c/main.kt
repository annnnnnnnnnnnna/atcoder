package abc.`178`.c

fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    val all = modPow(10L, n)
    val ex = modSub(modAdd(modPow(9L, n), modPow(9L, n)), modPow(8L, n))
    val ans = modSub(all, ex)
    println(ans)
}

const val mod = 1000000007L
fun modAdd(a: Long, b:Long):Long = (a + b) % mod
fun modSub(a: Long, b:Long):Long {
    val ret = (a - b) % mod
    return if (ret < 0) ret + mod
    else ret
}
fun modPow(a: Long, b:Long):Long =
    when {
        b == 0L -> 1L
        b == 1L -> a
        b % 2L == 0L -> modPow(a, b / 2L).let { (it * it) % mod }
        else -> (a * modPow(a, b - 1)) % mod
    }

