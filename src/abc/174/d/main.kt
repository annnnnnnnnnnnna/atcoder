package abc.`174`.d

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val c = readLine()!!.toCharArray()
    var ans = 0

    var lp = 0
    var rp = n-1
    while (lp < n) {
        if (lp > rp && c[lp] == 'R') {
            ans++
            c[lp] = '_'
            lp++
        }
        if (lp < rp && c[lp] == 'W') {
            while (c[rp] != 'R' && rp > 0) rp--
            if (lp < rp) {
                c[lp] = 'R'
                c[rp] = 'W'
                ans++
            }
        }
        lp++
    }

    println(ans)
}
