class Triangle (color: String, isTransparent: Boolean, val base: Double, val a: Double, val b: Double, val height: Double): Shape (color, isTransparent) {
    override fun calculatePerimeter() {
        val perimeter = base + a + b
        println("The perimeter of the triangle is $perimeter")
    }

    override fun calculateArea() {
        val area = 0.5 * a * height
        println("The area of the triangle is $area")
    }
}