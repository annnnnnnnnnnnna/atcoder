package abc.`175`.a

fun main(args: Array<String>) {
    val s = readLine()!!

    if (s == "RRR" ) println(3)
    else if (s.indexOf("RR") >= 0) println(2)
    else if (s.indexOf("R") >= 0) println(1)
    else println(0)
}
