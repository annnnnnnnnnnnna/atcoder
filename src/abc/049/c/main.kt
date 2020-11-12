package abc.`049`.c

fun main() {
    val S = readLine()!!.reversed()
    var idx = 0
    while (idx < S.length) {
        idx += when (idx) {
            S.indexOf("maerd", idx) -> "dream".length
            S.indexOf("remaerd", idx) -> "dreamer".length
            S.indexOf("esare", idx) -> "erase".length
            S.indexOf("resare", idx) -> "eraser".length
            else -> {
                println("NO")
                return
            }
        }
    }
    println("YES")
}
