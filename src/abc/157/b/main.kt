package abc.`157`.b

fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map(String::toInt)
    val b = readLine()!!.split(" ").map(String::toInt)
    val c = readLine()!!.split(" ").map(String::toInt)
    val n = readLine()!!.toInt()
    val card = a + b + c
    var stat = Array(3, { arrayOfNulls<Int>(3)})

    for (i in 1..n) {
        when (readLine()!!.toInt()) {
            card[0] -> stat[0][0] = 1
            card[1] -> stat[0][1] = 1
            card[2] -> stat[0][2] = 1
            card[3] -> stat[1][0] = 1
            card[4] -> stat[1][1] = 1
            card[5] -> stat[1][2] = 1
            card[6] -> stat[2][0] = 1
            card[7] -> stat[2][1] = 1
            card[8] -> stat[2][2] = 1
        }
    }

    if ((stat[0][0] == 1 && stat[0][1] == 1 && stat[0][2] == 1) ||
        (stat[1][0] == 1 && stat[1][1] == 1 && stat[1][2] == 1) ||
        (stat[2][0] == 1 && stat[2][1] == 1 && stat[2][2] == 1) ||
        (stat[0][0] == 1 && stat[1][0] == 1 && stat[2][0] == 1) ||
        (stat[0][1] == 1 && stat[1][1] == 1 && stat[2][1] == 1) ||
        (stat[0][2] == 1 && stat[1][2] == 1 && stat[2][2] == 1) ||
        (stat[0][0] == 1 && stat[1][1] == 1 && stat[2][2] == 1) ||
        (stat[0][2] == 1 && stat[1][1] == 1 && stat[2][0] == 1)) {
        println("Yes")
    } else {
        println("No")
    }
}
