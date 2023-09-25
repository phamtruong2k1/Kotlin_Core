open class SinhVien(
    var schoolName : String = ""
) : Persion(), DongVat, DongVat2 {


    override fun chay() {
        super.chay()
        println("Chạy Sinh Vien")
    }


    fun showAll() {
        show1()
        show3()

    }

    fun plusAge() {
        age++
    }

    override fun show() {

    }

    override fun getName2() {

    }

    override fun disPlay() {

    }

}