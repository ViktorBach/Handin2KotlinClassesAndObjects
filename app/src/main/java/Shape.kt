open class Shape(color: String, isTransparent: Boolean) {
    open fun calculatePerimeter () {
        println("perimeter")
    }

    open fun calculateArea () {
        println("area")
    }
}