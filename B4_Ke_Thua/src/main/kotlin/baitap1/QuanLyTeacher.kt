package baitap1


val listSubject = listOf<Subject>(
    Subject(1, "Toan"),
    Subject(2, "Văn"),
    Subject(3, "Anh"),
    Subject(4, "Hóa")
)

var listTeacher = ArrayList<Teacher>()

fun main() {

    addTeacher(1 )
    addTeacher(3 )
    addTeacher(4 )
    addTeacher(4 )
    addTeacher(1 )
    addTeacher(2 )
    addTeacher(1 )

    /*showDanhSachGVTheoLuong(5000000)

    showDanhSachGVTheoLuong(1000000)
*/
    //sapXepTheoTen()

    xepKhong()
}


fun showAllDanhSach() {
    println(String.format("%10s %10s %10s %10s %10s", "Code", "Họ", "Tên", "Môn", "Lương"))
    listTeacher.forEach { item->
        println(String.format("%10s %10s %10s %10s %10s", item.code, item.surname, item.name, item.subject.name, item.salary))
    }
}

fun sapXepTheoTen() {
    val n = listTeacher.size
    for (i in 0..n-2) {
        for (j in i+1..n-1) {
            if (listTeacher[i].name < listTeacher[j].name) {
                val tmp = listTeacher[i]
                listTeacher[i] = listTeacher[j]
                listTeacher[j] = tmp
            }
        }
    }
    showAllDanhSach()
}

fun xepKhong() {
    val listCoGioLam = ArrayList<Teacher>()
    val listKhongCoGioLam = ArrayList<Teacher>()
    listTeacher.forEach { item->
        if (item.teachingHours < 8) {
            listKhongCoGioLam.add(item)
        } else {
            listCoGioLam.add(item)
        }
    }

    clearData()
    listTeacher.addAll(listCoGioLam)
    listTeacher.addAll(listKhongCoGioLam)
    showAllDanhSach()
}

fun tinhTongLuong() : Double {
    var sum : Double = 0.0
    listTeacher.forEach { item->
        sum += item.salary
    }
    return sum
}

fun showDanhSachGVTheoLuong(luong : Int) {
    println("Danh sách giáo viên lương thấp hơn $luong")
    println(String.format("%10s %10s %10s %10s %10s", "Code", "Họ", "Tên", "Môn", "Lương"))
    listTeacher.forEach { item->
        if (item.salary < luong)
            println(String.format("%10s %10s %10s %10s %10s", item.code, item.surname, item.name, item.subject.name, item.salary))
    }
}


fun getNameSubject(id : Int) :String {
    listSubject.forEach {
        if (it.code == id){
            return it.name
        }
    }
    return ""
}

fun addTeacher(codeSubject : Int) {
    listSubject.forEach {
        if (it.code == codeSubject) {
            val teacher = Teacher(it, 1.0 , 1.0)
            teacher.tinhLuong()
            listTeacher.add(teacher)
            return
        }
    }
    println("Môn k có")
}

fun clearData() {
    listTeacher = ArrayList<Teacher>()
}