package abc.`122`.b

fun main() {
    val s = readLine()!! + " "
    var ans = 0
    for (i in s.indices) {
        var j = i
        var ren = 0
        while(s[j] == 'A' || s[j] == 'C' || s[j] == 'G' || s[j] == 'T') {
            ren++
            j++
        }
        ans = Math.max(ans, ren)
    }
    println(ans)
}
