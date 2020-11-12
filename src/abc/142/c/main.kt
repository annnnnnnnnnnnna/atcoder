package abc.`142`.c

fun main() {
    val n = readLine()!!.toInt()

    var ans = arrayOfNulls<Int>(n)
    val a = readLine()!!.split(" ").map(String::toInt)
    repeat(n){ ans[a[it] -1] = it + 1 }
    println(ans.joinToString(separator = " "))
}
