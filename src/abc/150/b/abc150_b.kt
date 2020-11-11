package abc.`150`.b

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    println(("(ABC)").toRegex().findAll(s).count())
}
