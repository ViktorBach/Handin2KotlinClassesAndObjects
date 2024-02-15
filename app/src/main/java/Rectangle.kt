class Rectangle (color: String, isTransparent: Boolean, var height: Double, var width: Double): Shape (color, isTransparent) {
    override fun calculatePerimeter() {
        val perimeter = 2 * (height + width)
        println("The perimeter of the rectangle is $perimeter")
    }

    override fun calculateArea() {
        val area = height * width
        println("The area of the rectangle is $area")
    }
}