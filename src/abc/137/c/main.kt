package abc.`137`.c

fun main() {
    val n = readLine()!!.toInt()
    val mp = mutableMapOf<String, Int>()
    repeat(n) {
        val s = readLine()!!.toCharArray().sortedArray().joinToString("")
        if (mp[s] == null) {
            mp[s] = 1
        } else {
            mp[s] = mp[s]!! + 1
        }
    }
    var ans = 0L
    mp.forEach {
        val cnt = it.value
        if (cnt > 1) {
            ans += cnt * (cnt - 1L) / 2L
        }
    }
    println(ans)
}
