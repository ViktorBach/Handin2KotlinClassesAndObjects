class Shoe (name: String, price: Int, quantity: Int): Product (name, price, quantity) {
    override fun identifyProductGategory() {
        println("I am a shoe")
    }
}