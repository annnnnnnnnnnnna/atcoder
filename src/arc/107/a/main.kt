package arc.`107`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B, C) = readLine()!!.split(' ').map { ModInt(it.toLong()) }
    var ans = 0L


    val aSum = A * ( A + ModInt.ONE ) / ModInt.TWO
    val bSum = B * ( B + ModInt.ONE ) / ModInt.TWO
    val cSum = C * ( C + ModInt.ONE ) / ModInt.TWO

    println(aSum * bSum * cSum)
}

class ModInt(val value: Long) {
    companion object {
        const val modConst = 998244353L
        val ZERO = ModInt(0L)
        val ONE = ModInt(1L)
        val TWO = ModInt(2L)
        val modConstObj = ModInt(modConst)
        val divConst = ModInt(modConst - 2L)

        fun min(a: ModInt, b:ModInt): ModInt = if (a <= b) a else b
        fun max(a: ModInt, b:ModInt): ModInt = if (a >= b) a else b
    }

    operator fun plus(other: ModInt): ModInt = ModInt((value + other.value) % modConst)
    operator fun minus(other: ModInt): ModInt {
        val ret = (value - other.value) % modConst
        return if (ret < 0) ModInt(ret + modConst)
        else ModInt(ret)
    }
    operator fun times(other: ModInt): ModInt = ModInt((value * other.value) % modConst)
    operator fun div(other: ModInt): ModInt = this * other.pow(divConst)
    operator fun rem(other: ModInt): ModInt = ModInt(value % other.value)
    operator fun compareTo(other: ModInt) = value.compareTo(other.value)
    operator fun inc(): ModInt = ModInt(value+1)
    operator fun dec(): ModInt = ModInt(value-1)

    override operator fun equals(other: Any?) =
        if (other is ModInt) {
            value == other.value
        } else false

    fun abs(): ModInt =
        if (value < 0) ModInt(value * -1)
        else this

    fun pow(b: ModInt): ModInt =
        when {
            b == ZERO -> ONE
            b == ONE -> this
            b % TWO == ZERO -> this.pow(ModInt(b.value / 2)).let { ModInt((it.value * it.value) % modConst) }
            else -> (this * this.pow(ModInt(b.value - 1))) % modConstObj
        }

    override fun toString(): String {
        return value.toString()
    }

}
