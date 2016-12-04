package be.insaneprogramming.adventofcode

data class Triangle(val sides: List<Int>) {
    fun isValid(): Boolean {
        if(sides.size != 3)
            return false
        return getSortedSide(1) + getSortedSide(2) > getSortedSide(3)
    }

    fun getSide(side: Int) : Int {
        return sides[side - 1]
    }

    fun getSortedSide(side: Int) : Int {
        return sides.sorted()[side - 1]
    }
}