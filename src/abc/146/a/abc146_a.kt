package abc.`146`.a

fun main(args: Array<String>) {
    val s = readLine()!!
    println(when(s) {
        "SUN"->7
        "MON"->6
        "TUE"->5
        "WED"->4
        "THU"->3
        "FRI"->2
        "SAT"->1
        else ->0
    })
}
