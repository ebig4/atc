fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)

    val sorted = a.sorted()
    var result = 0
    for (i in 1..n / 2) {
        result += sorted[n - 2 * i + 1] - sorted[n - 2 * i]
    }
    if (n % 2 == 1) result+= sorted[0]
    println(result)
}

