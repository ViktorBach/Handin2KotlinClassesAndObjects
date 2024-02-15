open class Car (speed: Int, open var regularPrice: Int, color: String) {
    open fun getSalePrice () {
        println(regularPrice)
    }
}