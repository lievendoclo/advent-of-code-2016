package be.insaneprogramming.adventofcode

data class Coordinate(val x: Int, val y: Int) {
    fun rectilinearDistanceFrom(coordinate: Coordinate) : Int = Math.abs(x - coordinate.x) + Math.abs(y - coordinate.y)
}