package abc.`146`.b

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    repeat(s.length) {
        if(s[it]+n <= 'Z') print(s[it]+n)
        else  print(s[it]+n-26)
    }
    println()
}
