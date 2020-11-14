package abc.`173`.b

fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    val map = mutableMapOf<String, Int>()
    map["AC"] = 0
    map["WA"] = 0
    map["TLE"] = 0
    map["RE"] = 0
    repeat(n) {
        val s = readLine()!!
        map[s] = map[s]!! + 1
    }
    println("AC x ${map["AC"]}")
    println("WA x ${map["WA"]}")
    println("TLE x ${map["TLE"]}")
    println("RE x ${map["RE"]}")
}
