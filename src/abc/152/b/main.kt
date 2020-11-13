package abc.`152`.b

fun main(args: Array<String>) {
    val (a , b) = readLine()!!.split(' ').map { it.toInt() }
    val astr = StringBuffer("")
    repeat(a) {
        astr.append(b)
    }
    val bstr = StringBuffer("")
    repeat(b) {
        bstr.append(a)
    }
    println(listOf(astr.toString(),bstr.toString()).sorted()[0])
}
