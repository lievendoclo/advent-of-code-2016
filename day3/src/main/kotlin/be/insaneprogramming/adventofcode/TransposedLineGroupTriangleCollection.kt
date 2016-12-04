package be.insaneprogramming.adventofcode

class TransposedLineGroupTriangleCollection : TriangleCollection {
    internal var triangles : MutableList<Triangle> = mutableListOf()

    override fun populate(definition: String) {
        val singleLineTriangleCollection = SingleLineTriangleCollection()
        singleLineTriangleCollection.populate(definition)
        val intermediateTriangles = singleLineTriangleCollection.triangles
        val iterator = intermediateTriangles.iterator()
        while(iterator.hasNext()) {
            val fakeTriangle1 = iterator.next()
            val fakeTriangle2 = iterator.next()
            val fakeTriangle3 = iterator.next()
            val triangle1 = Triangle(listOf(fakeTriangle1.getSide(1), fakeTriangle2.getSide(1), fakeTriangle3.getSide(1)))
            val triangle2 = Triangle(listOf(fakeTriangle1.getSide(2), fakeTriangle2.getSide(2), fakeTriangle3.getSide(2)))
            val triangle3 = Triangle(listOf(fakeTriangle1.getSide(3), fakeTriangle2.getSide(3), fakeTriangle3.getSide(3)))
            triangles.add(triangle1)
            triangles.add(triangle2)
            triangles.add(triangle3)
        }
    }

    override fun getTriangles(): List<Triangle> = triangles
}
