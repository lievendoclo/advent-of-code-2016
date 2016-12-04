package be.insaneprogramming.adventofcode

interface TriangleCollection {
    fun populate(definition: String)
    fun getAmountOfValidTriangles() : Int = getTriangles().filter { it.isValid() }.size
    fun getTriangles() : List<Triangle>
}
