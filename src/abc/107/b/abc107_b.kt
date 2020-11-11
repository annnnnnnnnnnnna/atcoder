fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }

    var harr = BooleanArray(h){ false }
    var warr = BooleanArray(w){ false }

    var aarr = Array<String>(h){""}
    repeat(h) { hh ->
        val a = readLine()!!

        var all = true
        repeat(w) { ww ->
            if (a[ww] == '#') {
                warr[ww] = true
                all = false
            }
        }
        harr[hh] = !all
        aarr[hh] = a
    }

    repeat(h) { hh ->
        if (harr[hh]) {
            repeat(w) { ww ->
                if (warr[ww]) print(aarr[hh][ww])
            }
            println()
        }
    }
}
