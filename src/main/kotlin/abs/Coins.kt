fun main(args: Array<String>) {
    val a = readLine()!!.toInt() // 500
    val b = readLine()!!.toInt() // 100
    val c = readLine()!!.toInt() // 50
    val x = readLine()!!.toInt() // X円

    var result = 0
    for(i in 0..a) {
        for(j in 0..b) {
            for(k in 0..c) {
                if ((500 * i + 100 * j + 50 * k) == x ) result +=1
            }
        }
    }
    println(result)
}

