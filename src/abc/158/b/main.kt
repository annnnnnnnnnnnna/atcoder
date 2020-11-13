package abc.`158`.b

fun main(args: Array<String>) {
    val (n,a,b) =  readLine()!!.split(' ').map { it.toLong() }

    val nn = n / (a+b)
    var blue = nn * a
    val red = nn * b

    if (blue + red + a <= n) blue += a
    else blue += (n - (blue + red))

    println(blue)

}
