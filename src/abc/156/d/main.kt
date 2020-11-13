package abc.`156`.d

fun main(args: Array<String>) {

    val (n, a, b) = readLine()!!.split(" ").map{ it.toLong() }

    modFactInit(n, a, b)

    var ans = modPow(2, n) - 1 + mod
    val minus = modAdd(nCr(n,a), nCr(n,b))

    ans = modSub(ans, minus)
    if (ans < 0L) ans += mod
    println(ans)

}

const val mod = 1000000007L
fun modAdd(a: Long, b:Long):Long = (a + b) % mod
fun modSub(a: Long, b:Long):Long = (a - b) % mod
fun modMul(a: Long, b:Long):Long = (a % mod) * (b % mod) % mod
fun modDiv(a: Long, b:Long):Long = modMul(a, modPow(b, mod - 2))
fun modPow(a: Long, b:Long):Long =
    when {
        b == 0L -> 1L
        b == 1L -> a
        b % 2L == 0L -> modPow(a, b / 2L).let { (it * it) % mod }
        else -> (a * modPow(a, b - 1)) % mod
    }
val factList = mutableListOf<Long>()
val factInvList = mutableListOf<Long>()
fun modFactInit(n: Long, a:Long, b:Long) {
    val limit = Math.max(Math.min(a, n-a), Math.min(b, n-b))
    var tmp = 1L
    var tmpInv = 1L
    for(i in 0 until limit) {
        tmp = modMul(tmp, n-i)
        tmpInv = modMul(tmpInv, i+1)
        factList.add(tmp)
        factInvList.add(tmpInv)
    }
}
fun nCr(n: Long, r: Long):Long {
    if (n == r) return 1L
    var ans = 1L
    var bunbo = 1L
    val limit = Math.min(r, n-r)
    for (i in 0 until limit) {
        ans = modMul(ans, n-i)
        bunbo = modMul(bunbo, i + 1)
    }
    return modDiv(factList[limit.toInt() -1], factInvList[limit.toInt() -1])
}
