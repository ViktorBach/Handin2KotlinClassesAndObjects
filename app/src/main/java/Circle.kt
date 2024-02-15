class Circle (color: String, isTransparent: Boolean, pi: Double, val radius: Int): Shape (color, isTransparent) {
    val pi = 3.14
    override fun calculatePerimeter() {
        val perimeter = 2 * pi * radius
        println("The perimeter of the circle is $perimeter")
    }

    override fun calculateArea() {
        val area = pi * radius * radius
        println("The area of the circle is $area")
    }
}