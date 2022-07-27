fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val list: Array<Int> = Array(n) {
        readLine()!!.toInt()
    }

    println(list.distinct().size)
}

