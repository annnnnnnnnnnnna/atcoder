package abc.`149`.b

fun main() {
    val (a,b,k) = readLine()!!.split(' ').map{ it.toLong()}

    var aa = a-k
    if (aa < 0L) aa = 0L
    var kk = k-a
    if (kk < 0L) kk = 0L
    var bb = b-kk
    if (bb < 0L) bb = 0L
    println("$aa $bb")
}
