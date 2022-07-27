import kotlin.math.abs
fun main() {
    val n = readLine()!!.toInt()
    val list = Array(n) {
        readLine()!!.split(" ").map(String::toInt)
    }
    var result = true
    for (i in 0..n-1) {
        var t = list[i][0]
        var x = list[i][1]
        var y = list[i][2]

        if (i > 0) {
            t -= list[i - 1][0]
            x -= list[i - 1][1]
            y -= list[i - 1][2]
        }

        val abs = abs(x) + abs(y)
        if (!(abs <= t && (t - abs) % 2 == 0)) {
            println("No")
            return
        }
    }
    println("Yes")
}

