package abc.`169`.c

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ')
    val bb = b.replace(".","")
    val ab = a.toLong() * bb.toLong()
    println(ab/100)
}
