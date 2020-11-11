fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    val max = a.max()!!+2
    val st = mutableSetOf<Int>()
    a.forEach {
        var i = it * 2
        while (i < max) {
            st.add(i)
            i *= 2
        }
    }

    var ans = 0
    a.forEach {
        if (it !in st) ans++
    }
    println(ans)
}
