package test1

fun main() {

    val hocPhan1 = HocPhan(1, "Toán", 3)
    val hocPhan2 = HocPhan(2, "Lý", 3)
    val hocPhan3 = HocPhan(3, "Hóa", 3)
    val hocPhan4 = HocPhan(4, "Văn", 3)


    val list = ArrayList<DiemModel>()
    list.add(DiemModel(1, hocPhan1, 10))
    list.add(DiemModel(2, hocPhan2, 10))
    list.add(DiemModel(3, hocPhan3, 10))
    list.add(DiemModel(4, hocPhan4, 10))


    val bangDiem = BangDiem(1, 123, "Trường", list)



    bangDiem.listDiem[1].diem = 1
    bangDiem.showBangDiem()

}