package be.insaneprogramming.adventofcode


class Keypad(layout: String, var currentCoordinate: Coordinate) {
    val layoutLines: List<String>
    val height : Int
    val width: Int

    init {
        layoutLines = layout.split("\n")
        width = layoutLines[0].length
        height = layoutLines.size
    }

    fun getCurrentKey() : String {
        return getKeyAtCoordinate(currentCoordinate)
    }

    fun getKeyAtCoordinate(coordinate: Coordinate) : String {
        return layoutLines.get(coordinate.y).substring(coordinate.x, coordinate.x + 1)
    }

    fun moveUp() {
        val targetCoordinate = getTargetCoordinate(0, -1)
        currentCoordinate = if(getKeyAtCoordinate(targetCoordinate).isBlank()) currentCoordinate else targetCoordinate

    }

    private fun getTargetCoordinate(dX: Int, dY: Int): Coordinate {
        var targetX = if(currentCoordinate.x + dX < 0) 0 else currentCoordinate.x + dX
        targetX = if(targetX > height - 1) height - 1 else targetX
        var targetY = if(currentCoordinate.y + dY < 0) 0 else currentCoordinate.y + dY
        targetY = if(targetY > width - 1) width - 1 else targetY
        return Coordinate(targetX, targetY)
    }

    fun moveDown() {
        val targetCoordinate = getTargetCoordinate(0, 1)
        currentCoordinate = if(getKeyAtCoordinate(targetCoordinate).isBlank()) currentCoordinate else targetCoordinate
    }

    fun moveLeft() {
        val targetCoordinate = getTargetCoordinate(-1, 0)
        currentCoordinate = if(getKeyAtCoordinate(targetCoordinate).isBlank()) currentCoordinate else targetCoordinate
    }

    fun moveRight() {
        val targetCoordinate = getTargetCoordinate(1, 0)
        currentCoordinate = if(getKeyAtCoordinate(targetCoordinate).isBlank()) currentCoordinate else targetCoordinate

    }

}