package abc.`158`.c

fun main(args: Array<String>) {
    val (a,b) =  readLine()!!.split(' ').map { it.toInt() }

    var aa = Math.floor(a /0.08)
    while (aa * 0.08 < a) aa++

    if (Math.floor(aa*0.1).toInt() == b) println(aa.toInt())
    else {
        var bb = Math.floor(b /0.1)
        while (bb * 0.1 < b) bb++
        if (Math.floor(bb*0.08).toInt() == a) println(bb.toInt())
        else println(-1)
    }
}
