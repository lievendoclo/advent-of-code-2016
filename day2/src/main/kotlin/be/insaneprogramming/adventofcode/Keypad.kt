package be.insaneprogramming.adventofcode


class Keypad(layout: String) {
    val layoutLines: List<String>
    val height : Int
    val width: Int
    var currentCoordinate: Coordinate? = null

    init {
        layoutLines = layout.split("\n")
        width = layoutLines[0].length
        height = layoutLines.size
    }

    fun getCurrentKey() = getKeyAtCoordinate(currentCoordinate!!)

    fun getKeyAtCoordinate(coordinate: Coordinate) = layoutLines.get(coordinate.y).substring(coordinate.x, coordinate.x + 1)

    fun moveUp() = updateCoordinateIfValid(0, -1)

    fun moveDown() = updateCoordinateIfValid(0, 1)

    fun moveLeft() = updateCoordinateIfValid(-1, 0)

    fun moveRight() = updateCoordinateIfValid(1, 0)

    private fun getTargetCoordinate(dX: Int, dY: Int): Coordinate {
        val targetX = if(isWithinRange(currentCoordinate!!.x + dX, 0, width - 1)) currentCoordinate!!.x else currentCoordinate!!.x + dX
        val targetY = if(isWithinRange(currentCoordinate!!.y + dY, 0, height - 1)) currentCoordinate!!.y else currentCoordinate!!.y + dY
        return Coordinate(targetX, targetY)
    }

    private fun isWithinRange(value: Int, min: Int, max: Int) : Boolean {
        return value < min || value > max
    }

    private fun updateCoordinateIfValid(dX: Int, dY: Int) {
        val targetCoordinate = getTargetCoordinate(dX, dY)
        currentCoordinate = if (getKeyAtCoordinate(targetCoordinate).isBlank()) currentCoordinate else targetCoordinate
    }
}