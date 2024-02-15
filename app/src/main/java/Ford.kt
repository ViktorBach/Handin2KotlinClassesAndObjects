class Ford (speed: Int, override var regularPrice: Int, color: String, val weight: Int, year: Int, manufacturerDiscount: String): Car (speed, regularPrice, color) {
    var manufacturerDiscount: String = manufacturerDiscount
    override fun getSalePrice() {
        val discountSplit = manufacturerDiscount.split("")
        val discountToInt = discountSplit[1].toString() + discountSplit[2].toString()

        regularPrice -= (regularPrice * discountToInt.toInt() / 100)
        println(regularPrice)
    }
}