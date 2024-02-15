class Employee (firstName: String, lastName: String, salary: Double) {
    var monthlySalary: Double = salary
    init {
        if (monthlySalary < 0) {
            this.monthlySalary = 0.0
        }
    }
}