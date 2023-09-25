


lateinit var persion1: Persion
lateinit var sinhVien: SinhVien

var persion2 : Persion? = null

fun main(args: Array<String>) {

    val persion = Persion("Trường", 3)


    persion1 = Persion("Hiep", 2)
    sinhVien = SinhVien("Hiep")
    //persion2 = Persion("Hiep", 3)

    /*try {
        println(persion1.age / 0)
    } catch (e : Exception) {
        e.printStackTrace()
    }
    println(persion2?.age)*/

    /*persion2?.let { item ->
        println(item.age)
        println(item.name)
    }?: run {
        showNull()
    }

    persion1.let { item ->
        println(item.age)
        println(item.name)
    }*/

    /*persion2?.apply {
        age++
        println(age)
        show1()
        show2()
        show3()
    }*/

    /*with(persion1) {
        age++
        println(age)
        show1()
        show2()
        show3()
    }*/


    /*persion2?.run {
        show1()
        show2()
        show3()
    }


    persion2?.let {
        with(it) {
            age++
            println(age)
            show1()
            show2()
            show3()
        }
    }

    if (persion2 != null) {
        persion2!!.show3()
    } else {
        showNull()
    }*/

    //sinhVien.chay()


    val sucVat = SucVat("Chó")
    val giaCam = GiaCam(2)


    sucVat.show()
    giaCam.show()

}


private fun showNull() {
    println("persion2 null")
}


//let - check khác null thì chạy trong let
//apply - tổ hợp
//with - tổ hợp
//run = let + with
// ?. và !!