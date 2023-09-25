package baitap1

class Teacher(
    var subject: Subject,
    var coefficientsSalary : Double,
    var salary : Double,
    var teachingHours : Int= 0,
) : Employee() {


    fun createInfor(code : Int, surname : String, name : String) {
        super.code = code
        super.surname = surname
        super.name = name
    }

    override fun tinhLuong() {
        salary = coefficientsSalary*1150000 + teachingHours * 60000
    }


    override fun input() {

    }

    override fun output() {

    }
}