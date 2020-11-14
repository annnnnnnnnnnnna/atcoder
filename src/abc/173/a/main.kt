package abc.`173`.a

fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    while(n > 1000) {
        n-=1000
    }
    println(1000- n)
}
