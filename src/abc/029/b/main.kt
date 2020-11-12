package abc.`029`.b

fun main() {
    var ans = 0
    repeat(12) {
        val s = readLine()!!
        if(s.count { it == 'r' } > 0) ans++
    }
    println(ans)
}
