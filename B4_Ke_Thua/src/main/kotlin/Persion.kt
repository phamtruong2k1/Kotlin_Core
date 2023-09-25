open class Persion(
    private var name : String = "Người",
    var age : Int = 1
) {

    open fun chay() {
        println("Chạy")
    }

    fun getName() = name

    fun setName(name : String) {
        this.name = name
    }

    fun show1() {
        println(1)
    }

    fun show2() {
        println(2)
    }

    fun show3() {
        println(3)
    }

}