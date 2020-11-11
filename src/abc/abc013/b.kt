fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(
        Math.min(
            Math.max(a,b)-Math.min(a,b),
            Math.min(a,b)-Math.max(a,b) + 10
        )
    )
}
