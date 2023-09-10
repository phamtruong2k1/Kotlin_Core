

fun main() {

    val giaoVien = Persion(1, 2)

    val giaoVien2 = Persion()

    val list = arrayOf<Persion>(
        Persion(2, 2),
        Persion(2, 2),
        Persion(2, 2),
        Persion(2, 2),
        Persion(2, 2),
        Persion(2, 2)
    )

    val array = ArrayList<Persion>()

    array.add(Persion(2, 2))

    array.add(0, Persion(2, 2))

    array.addAll(list)

    array.removeAt(1)

    val array2 = array.clone() as ArrayList<Persion>
    array.clear()
    array2.forEach {
        println(it.tay)
    }
}
