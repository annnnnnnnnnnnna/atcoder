package abc.`148`.c

fun main() {
    val (a,b) = readLine()!!.split(" ").map{ it.toLong() }

    fun gcd(a: Long, b: Long): Long {
        return if (a==1L || b== 1L) 1L
        else if (b == 0L) a
        else if (a < b) gcd(a, b % a)
        else gcd(b, a % b)
    }

    println(a*b/gcd(a,b))
}
