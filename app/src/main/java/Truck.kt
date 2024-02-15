class Truck (speed: Int, override var regularPrice: Int, color: String, val weight: Int): Car (speed, regularPrice, color) {
    override fun getSalePrice() {
        if (weight < 2000) {
            regularPrice = (regularPrice - regularPrice * 0.20).toInt()
            println(regularPrice)
        }
    }
    fun discountCalculator () {
        if (weight > 2000) {
            regularPrice = (regularPrice - regularPrice* 0.10).toInt()
            println(regularPrice)
        }
    }
}