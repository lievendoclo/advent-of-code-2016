package be.insaneprogramming.adventofcode

class SingleLineTriangleCollection : TriangleCollection {
    internal var triangles : List<Triangle> = listOf()

    override fun populate(definition: String) {
        triangles = definition.split("\n").map { getTriangle(it) }
    }

    private fun getTriangle(line: String): Triangle = Triangle(listOf(getSideFromString(1, line), getSideFromString(2, line), getSideFromString(3, line)))

    private fun getSideFromString(side: Int, line: String) = Integer.parseInt(line.substring((side - 1) * 5, (side - 1) * 5 + 5).trim())

    override fun getTriangles(): List<Triangle> = triangles
}
