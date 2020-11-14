package abc.`167`.d

fun main(args: Array<String>) {
    val nk = readLine()!!.split(' ')
    val n = nk[0].toInt()
    val k = nk[1].toLong()
    
    val a = readLine()!!.split(' ').map { it.toInt()-1 }
    val plan = IntArray(n+1){-1}
    val visited = IntArray(n){-1}
    var now = 0
    var loopEnd = n
    var loopHead = 0
    for (i in 0 .. n) {
        if (visited[now] == -1) {
            plan[i] = a[now]
            visited[now] = i
            now = a[now]
        } else {
            loopEnd = i
            loopHead = visited[now]
            break
        }
    }

    val tail = k - loopHead.toLong()
    if (tail >= 0) {
        var m = (tail % (loopEnd - loopHead).toLong()).toInt()
        if (m == 0) m = loopEnd - loopHead
        println(plan[loopHead + m -1] + 1)
    } else {
        println(plan[k.toInt() -1] + 1)
    }

}
