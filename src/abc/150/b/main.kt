package abc.`150`.b

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    println(("(ABC)").toRegex().findAll(s).count())
}
