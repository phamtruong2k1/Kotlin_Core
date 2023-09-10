package test1

class BangDiem(
    val id : Int = 0,
    val maSV : Int = 0,
    val name : String = "",
    val listDiem : ArrayList<DiemModel> =  ArrayList<DiemModel>()
) {

    fun showBangDiem() {

        println(String.format("%5s  |%-15s %-15s %10s %15s", "STT", "Mã HP", "Tên HP", "Số TC", "Điểm"))
        listDiem.forEachIndexed { index, diemModel ->
            println(String.format("%5d  |%-15d %-15s %10d %15d", index + 1, diemModel.hocPhan.maHp, diemModel.hocPhan.name, diemModel.hocPhan.sTC, diemModel.diem))
        }

    }

}