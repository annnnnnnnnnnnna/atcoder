fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    if (n < 105) println(0)
    else {
        if (n%2==0) n--
        var ans = 0
        while (n > 103) {
            var cnt = 0
            for (i in 1..n) {
                if (n%i == 0) {
                    cnt++
                }
            }
            if (cnt == 8) ans++
            n-=2
        }
        println (ans)
    }
}
