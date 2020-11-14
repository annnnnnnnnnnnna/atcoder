package abc.`168`.b

fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    val s = readLine()!!

    if (s.length <= k) println(s)
    else {
        println("${s.substring(0,k)}...")
    }

}
