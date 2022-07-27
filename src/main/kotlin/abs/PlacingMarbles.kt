fun main(args: Array<String>) {
    val args = readLine()!!.split(" ")

    if (args[0].toInt() * args[1].toInt() % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}

