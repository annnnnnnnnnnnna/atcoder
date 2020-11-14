package abc.`177`.b

fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    var max = Int.MIN_VALUE
    for (i in 0 .. s.length - t.length) {
        var cnt = 0
        for (j in t.indices) {
            if (s[i+j] == t[j]) cnt++
        }
        max = Math.max(max, cnt)
    }
    println(t.length-max)
}
