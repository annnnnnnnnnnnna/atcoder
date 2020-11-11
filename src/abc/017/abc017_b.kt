fun main(args: Array<String>) {
    val x = readLine()!!
    if(x.replace("ch", "")
            .replace("o", "")
            .replace("k", "")
            .replace("u", "")
            .isEmpty())
        println("YES")
    else println("NO")

}
