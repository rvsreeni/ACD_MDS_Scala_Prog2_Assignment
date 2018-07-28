//Scala - Inheritance
//Parent Class
class Employee{
var salary:Float = 10000
}
//Child Class
class Programmer extends Employee{
var bonus:Int = 5000
println("Salary = " + salary)
println("Bonus = " + bonus)
}
//Create Object
new Programmer()
