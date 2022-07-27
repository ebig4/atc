package abc242
import kotlin.math.*
fun main() {
    val n = readLine()!!.toInt()
    val mod = 998244353
    val dp = Array(n) { IntArray(10) }
    for (i in 1..9) { dp[0][i] = 1 }
    for (i in 1..n-1) {
        for ( d in 1..9) {
            if (d != 9) dp[i][d] += dp[i-1][d+1]
            dp[i][d] += dp[i-1][d]
            if (d != 1) dp[i][d] += dp[i-1][d-1]
            dp[i][d] %=mod
        }
    }

    println(dp[n-1].sum())
}