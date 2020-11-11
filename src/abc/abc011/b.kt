fun main(args: Array<String>) {
    val s = readLine()!!
    val str = s.toLowerCase().toCharArray()
    str[0] = s[0].toUpperCase()
    println(str)
}
