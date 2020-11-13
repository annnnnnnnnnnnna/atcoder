package abc.`153`.e

fun main(args: Array<String>) {

    val (h,n) = readLine()!!.split(" ").map{ it.toInt() }

    val magicList = mutableListOf<Magic>()

    repeat(n) {
        val (a,b) = readLine()!!.split(" ").map{ it.toInt() }
        magicList.add(Magic(a,b))
    }


    val dp = IntArray (h+1)
    dp[0] = 0
    for (i in 1..h) {
        dp[i] = (0 until n).map{
            dp.getOrElse(i-magicList[it].atk){0} + magicList[it].mp
        }.min()!!
    }

    println(dp[h])

}

class Magic(val atk: Int, val mp:Int)
