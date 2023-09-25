package baitap1

abstract class Employee(
    var code : Int = -1,
    var surname : String = "",
    var name : String = "",
    var dob : Date = Date(),
    var yearWorking : Int = 0
) {
    abstract fun input()
    abstract fun output()
    abstract fun tinhLuong()
}