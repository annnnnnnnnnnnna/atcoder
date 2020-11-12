package abc.`041`.b

fun main() {
    val mod = 1000000007L
    val n = readLine()!!.split(' ').map { it.toLong()%mod }
    var ans = 1L
    n.forEach {
        ans *= it
        ans %= mod
    }
    println(ans)
}
