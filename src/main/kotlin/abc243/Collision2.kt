fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var points = List(n) {
        readLine()!!.split(" ").map { it.toInt() }.let{ Point(it[0], it[1]) }
    }
    val s = readLine()!!

    val pointDs = points.mapIndexed { index, point -> PointD(point.x, point.y, s[index]) }
    pointDs.forEach { d ->
        pointDs.forEach { d2 ->
            if (d.y == d2.y && isXCollusion(d, d2)) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}

private fun isXCollusion(d: PointD, d2: PointD) = (d.x < d2.x && d.d == 'R' && d2.d == 'L') || (d.x > d2.x &&  d.d == 'L' && d2.d == 'R')

data class Point(val x: Int, val y: Int)
data class PointD(val x: Int, val y: Int, val d: Char)
