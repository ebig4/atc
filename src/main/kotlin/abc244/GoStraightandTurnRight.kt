fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val t = readLine()!!

    var d = Direction.EAST
    var (x, y) = listOf(0, 0)
    for (i in 0 until n) {
        val isS = t[i] == 'S'
        when{
            d == Direction.EAST  -> if (isS) x++ else d = Direction.SOUTH
            d == Direction.SOUTH -> if (isS) y-- else d = Direction.WEST
            d == Direction.WEST  -> if (isS) x-- else d = Direction.NORTH
            d == Direction.NORTH -> if (isS) y++ else d = Direction.EAST
        }
    }
    println("$x $y")
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}