class Book (name: String, price: Int, quantity: Int): Product (name, price, quantity) {
    override fun identifyProductGategory() {
        println("This is a Book")
    }
}