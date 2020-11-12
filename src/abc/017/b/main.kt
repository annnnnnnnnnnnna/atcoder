package abc.`017`.b

fun main() {
    val x = readLine()!!
    if(x.replace("ch", "")
            .replace("o", "")
            .replace("k", "")
            .replace("u", "")
            .isEmpty())
        println("YES")
    else println("NO")

}
