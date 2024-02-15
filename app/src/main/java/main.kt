fun main () {
    // Exercise 1
    val employee1: Employee = Employee("John", "Doe", 145.5)
    val employee2: Employee = Employee("Jane", "Doe", 155.5)
    println(employee1.monthlySalary)
    println(employee2.monthlySalary)
    val e1SalaryRaise: Double = employee1.monthlySalary + employee1.monthlySalary * 0.10
    val e2SalaryRaise: Double = employee2.monthlySalary + employee2.monthlySalary * 0.10
    println(e1SalaryRaise)
    println(e2SalaryRaise)

    // Exercise 2
    val laptop1: Laptop = Laptop("Macbook", 8, 512, false)
    val smartPhone1: SmartPhone = SmartPhone("Iphone", 6, 258, true)
    println(laptop1.messageMaker())
    println(smartPhone1.messageMaker())

    // Exercise 3
    val shoe1: Shoe = Shoe("Adidas", 800, 2)
    println(shoe1.identifyProductGategory())

    // Exercise 4
    val circle1: Circle = Circle("Green", false, pi = 3.14, 4)
    println(circle1.calculateArea())

    val rectangle1: Rectangle = Rectangle("Black", true, 12.5, 4.2)
    println(rectangle1.calculatePerimeter())

    val triangle1: Triangle = Triangle("Yellow", false, 3.5, 2.4, 4.5, 10.5)
    println(triangle1.calculateArea())

    //Exercise 5
    val mac: Truck = Truck(80, 20000, "red", 1900)
    mac.discountCalculator()
    mac.getSalePrice()

    val fordFocus: Ford = Ford(120, 300000, "green", 2000, 2008, "10%")
    fordFocus.getSalePrice()

    val fordGT: Ford = Ford(320, 3000000, "blue", 1000, 2024, "20%")
    fordGT.getSalePrice()

    val car: Car = Car(140, 140000, "black")
    println(car.getSalePrice())
}