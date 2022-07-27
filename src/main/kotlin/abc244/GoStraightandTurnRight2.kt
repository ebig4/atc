fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val t = readLine()!!

    var (x, y) = listOf(0, 0)
    var dir = 0
    t.forEach {
        if(it == 'S'){
            when(dir){
                0 -> x++
                1 -> y--
                2 -> x--
                else -> y++
            }
        }else{
            dir++
            dir %= 4
        }
    }
    println("$x $y")
}
