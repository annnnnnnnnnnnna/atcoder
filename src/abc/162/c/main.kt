package abc.`162`.c

fun main(args: Array<String>) {
    val k = readLine()!!.toInt()

    var answer = 0L

    for (h in 1..k) {
        for (i in 1..k) {
            val gcdhi = gcd(h,i)
            for (j in 1..k) {
                answer += gcd(gcdhi, j)
            }
        }
    }
    println(answer)
}

fun gcd(a: Int, b: Int): Int {
    if (a==1 || b== 1) return 1
    if (a < b) return gcd(b, a)
    if (b == 0) return a
    return gcd(b, a % b)
}
