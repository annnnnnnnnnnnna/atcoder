package abc.`002`.b

fun main() {
    val w = readLine()!!

    println(w.replace("[aiueo]".toRegex(), ""))
}
