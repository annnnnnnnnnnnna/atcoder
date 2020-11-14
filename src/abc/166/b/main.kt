package abc.`166`.b

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }

    val arr = BooleanArray(n) { false }
    repeat(k) {
        val d = readLine()!!.toInt()
        val a = readLine()!!.split(' ').map { it.toInt() }
        a.forEach { aa->
            arr[aa-1] = true
        }
    }

    var ans = 0
    arr.forEach {
        if (!it) ans++
    }

    println(ans)

}
