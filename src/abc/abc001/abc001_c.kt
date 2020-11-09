fun main(args: Array<String>) {
    val d = readLine()!!.split(' ').map { it.toInt() }
    val deg = d[0]
    val dis = Math.round(d[1] / 6.0)

    val w = when {
        dis <= 2 -> 0
        dis in 3..15 -> 1
        dis in 16..33 -> 2
        dis in 34..54 -> 3
        dis in 55..79 -> 4
        dis in 80..107 -> 5
        dis in 108..138 -> 6
        dis in 139..171 -> 7
        dis in 172..207 -> 8
        dis in 208..244 -> 9
        dis in 245..284 -> 10
        dis in 285..326 -> 11
        else -> 12
    }

    val dir = when {
        w == 0 -> "C"
        deg in 113..337 -> "NNE"
        deg in 338..562 -> "NE"
        deg in 563..787 -> "ENE"
        deg in 788..1012 -> "E"
        deg in 1013..1237 -> "ESE"
        deg in 1238..1462 -> "SE"
        deg in 1463..1687 -> "SSE"
        deg in 1688..1912 -> "S"
        deg in 1913..2137 -> "SSW"
        deg in 2138..2362 -> "SW"
        deg in 2363..2587 -> "WSW"
        deg in 2588..2812 -> "W"
        deg in 2813..3037 -> "WNW"
        deg in 3038..3262 -> "NW"
        deg in 3263..3487 -> "NNW"
        else -> "N"
    }

    println("$dir $w")
}
