fun main(args: Array<String>) {
    val w = readLine()!!

    println(w.replace("[aiueo]".toRegex(), ""))
}
