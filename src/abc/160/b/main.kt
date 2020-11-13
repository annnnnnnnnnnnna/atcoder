package abc.`160`.b

fun main(args: Array<String>) {
    val x = readLine()!!.toLong()

    val fh = x / 500
    val f = (x - (fh * 500)) / 5

    println(fh * 1000 + f * 5)

}
