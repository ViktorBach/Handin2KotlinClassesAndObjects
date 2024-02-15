class SmartPhone (brand: String, cpuCores: Int, memory: Int, USBC: Boolean): Computer (brand, cpuCores, memory) {
    override fun messageMaker() {
        println("This is a message from a Smartphone")
    }
}