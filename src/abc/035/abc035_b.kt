enum class Direction(val x:Int, val y: Int) {
    L(-1, 0),
    R(1, 0),
    U(0, 1),
    D(0, -1),
}

fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!.toInt()
    val q = s.count { it == '?' }
    var x = 0
    var y = 0
    s.replace("?", "").toCharArray().forEach {
        val m = Direction.valueOf(it.toString())
        x += m.x
        y += m.y
    }
    val dist = Math.abs(x) + Math.abs(y)
    println(
        if (t == 1) dist + q
        else {
            if (dist - q >= 0) {
                dist - q
            } else {
                val mod = q - dist
                if (mod%2 == 0) 0
                else 1
            }
        }
    )
}
