package abc.`180`.d

import java.math.BigDecimal

fun main(args: Array<String>) {
    var (X, Y, A, B) = readLine()!!.split(' ').map { BigDecimal(it) }
    var ans = BigDecimal.ZERO

    while (A*X <= X+B && A*X < Y) {
        X *= A
        ans++
    }

    var bNum2 = (Y-X)/B
    if (bNum2*B + X >= Y) bNum2--
    ans+= bNum2
    X += bNum2*B

    println(ans)
}
