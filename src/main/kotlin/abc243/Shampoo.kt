fun main(args: Array<String>) {
    val (v, f, m, t) = readLine()!!.split(" ").map { it.toInt() }

    val x =v % (f+m+t)
    when {
        x < f -> println("F")
        x < f + m -> println("M")
        x < f + m + t -> println("T")
    }
}
