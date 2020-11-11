import java.util.*
fun main(args: Array<String>) {
    val abc = (1..3).map { ArrayDeque<Int>().apply { addAll(readLine()!!.map { it - 'a' }) } }
    var turn = 0
    while (abc[turn].isNotEmpty()) {
        turn = abc[turn].poll()
    }
    println('A' + turn)
}
