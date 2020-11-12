package abc.`005`.b

fun main() {
    val n = readLine()!!.toInt()
    var min = Int.MAX_VALUE
    repeat(n) {
        min = Math.min(min, readLine()!!.toInt())
    }
    println(min)
}
