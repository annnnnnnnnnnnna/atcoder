package abc.`163`.d

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toLong() }

    var ans = 0L
    for (i in k .. n+1) {
        val min = ((0 + i)* i)/2
        val max = ((n+1) + (n+1-i)) * i /2
        ans = modAdd(ans,max+1)
        ans = modSub(ans,min)
        if (ans < 0) ans = modAdd(ans, mod)
    }
    println(ans)
}

const val mod = 1000000007L
fun modAdd(a: Long, b:Long):Long = (a + b) % mod
fun modSub(a: Long, b:Long):Long = (a - b) % mod
