package abc.`011`.b

fun main() {
    val s = readLine()!!
    val str = s.toLowerCase().toCharArray()
    str[0] = s[0].toUpperCase()
    println(str)
}
