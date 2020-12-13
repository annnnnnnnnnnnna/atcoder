package abc.`153`.a

import java.text.DecimalFormat
import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val h = sc.nextDouble()
        val a = sc.nextDouble()
        println(DecimalFormat("###########").format(Math.ceil(h / a)))
    }
}