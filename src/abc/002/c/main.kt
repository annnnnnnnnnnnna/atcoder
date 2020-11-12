package abc.`002`.c

fun main() {
    val xy = readLine()!!.split(' ').map { it.toDouble() }.chunked(2)

    println(
        Math.abs(
            (xy[0][0] - xy[2][0]) * (xy[1][1] - xy[2][1])
                    - (xy[1][0] - xy[2][0]) * (xy[0][1] - xy[2][1])
        ) / 2
    )
}
