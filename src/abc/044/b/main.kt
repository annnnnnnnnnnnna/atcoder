package abc.`044`.b

fun main() {
    val w = readLine()!!
    val arr = IntArray(26)
    for (i in w.indices) {
        arr[w[i]-'a']++
    }
    var ans = true
    arr.forEach {
        if(it % 2 != 0) ans = false
    }
    if (ans) println("Yes")
    else println("No")
}
