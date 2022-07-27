fun main(args: Array<String>) {
    val args = readLine()!!.split(" ").map(String::toInt)
    val n = args[0]
    val a = args[1]
    val b = args[2]

    var result = 0
    for(i in 1..n) {
        val fourth = i / 10000
        val third = (i - 10000 * fourth) / 1000
        val second = (i - 10000 * fourth - 1000 * third) / 100
        val first = (i - 10000 * fourth - 1000 * third - 100 * second) / 10
        val zero = (i - 10000 * fourth - 1000 * third - 100 * second - 10 * first)
        val value = zero + first + second + third + fourth
        if (value in a..b) result += i
    }
    println(result)
}

