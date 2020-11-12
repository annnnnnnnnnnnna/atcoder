package abc.`136`.d

fun main() {
    val s = readLine()!!
    val n = s.length
    val ans = IntArray(n)

    var teamHE = 0
    var teamHO = 0
    var teamTE = 0
    var teamTO = 0

    repeat(n) {
        val e = it % 2 == 0
        if (s[it] == 'R') {
            if (e) teamHE++
            else teamHO++
        } else{
            if (e) {
                ans[it] += teamHE
                ans[it-1] += teamHO
            } else {
                ans[it] += teamHO
                ans[it-1] += teamHE
            }
            teamHE = 0
            teamHO = 0
        }
        if (s[n - it - 1] == 'L') {
            if (e) teamTE++
            else teamTO++
        } else {
            if (e) {
                ans[n - it - 1] += teamTE
                ans[n - it] += teamTO
            } else {
                ans[n - it - 1] += teamTO
                ans[n - it] += teamTE
            }
            teamTE = 0
            teamTO = 0
        }
    }
    println(ans.joinToString(" "))

}
