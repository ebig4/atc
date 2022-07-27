fun main() {
    val args = readLine()!!.split(" ").map(String::toInt)
    val n = args[0]
    val y = args[1]

    for (i in 0..n) {
        for (j in 0..n-i) {
            val k = n - i - j
            if (10000 * i + 5000 * j + 1000 * k == y) {
                println("$i $j $k")
                return
            }
        }
    }
    println("-1 -1 -1")
}

