package abc.`158`.a

fun main(args: Array<String>) {
    val s = readLine()!!
    val res = s.toCharArray()[0] != s.toCharArray()[1] || s.toCharArray()[0] != s.toCharArray()[2] || s.toCharArray()[1] != s.toCharArray()[2]

    if (res) println("Yes")
    else println("No")
}
