package abc.`149`.c

fun main() {
    val x = readLine()!!.toInt()

    val max = Math.min(x * 2, 100004)
    val arr = BooleanArray(max+1) { false }
    var i = 3
    while(i <= max) {
        if (!arr[i]) {
            var j = i+i
            while(j <= max) {
                arr[j] = true
                j += i
            }
        }
        i += 2
    }
    i = x
    if (i != 2 && i % 2 == 0) i++
    while (arr[i]) {
        i+=2
    }
    println(i)
}
