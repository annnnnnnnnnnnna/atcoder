package abc.`168`.a

fun main(args: Array<String>) {
    val n = readLine()!!

    when(n[n.length -1]) {
        '2','4','5','7','9' -> println("hon")
        '0','1','6','8' -> println("pon")
        '3' -> println("bon")
    }

}
