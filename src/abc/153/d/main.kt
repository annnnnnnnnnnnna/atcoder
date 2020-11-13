package abc.`153`.d

fun main(args: Array<String>) {

    var h = readLine()!!.toLong()

    var atk = 0L
    var nums = 1L
    while(h > 1) {
        atk += nums
        h /= 2
        nums *= 2
    }
    println(atk + nums)

}
