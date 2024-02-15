class Laptop (brand: String, cpuCores: Int, memory: Int, magsafe: Boolean): Computer (brand, cpuCores, memory) {
    override fun messageMaker() {
        println("This is a message from a laptop")
    }
}