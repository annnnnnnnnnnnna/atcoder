package abc.`043`.b

fun main() {
    var s = readLine()!!
    while("B" in s) {
        val new = s.replace("0B", " ").replace("1B", " ").replace(" ", "")
        if (new != s) s = new
        else break
    }
    println(s.replace("B", ""))
}
