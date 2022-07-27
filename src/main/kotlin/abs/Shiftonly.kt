fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val an = readLine()!!.split(" ").map(String::toInt)

    var result = 0
    var ans = an
    while (true) {
        if (ans.any { a -> a % 2 == 1 }) break
        result += 1
        ans = ans.map { a -> a /2 }
    }
    println(result)
}

