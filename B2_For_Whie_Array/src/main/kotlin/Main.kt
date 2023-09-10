

fun main() {

    val arr = arrayOf<Int>(
        10, 11, 12, 13
    )


    for (i in 1..9 step 2) {
        println(i)
    }

    for (i in 0 until 9 step 5) {
        println(i)
    }

    for (i in 9 downTo  1 step 5) {
        for (i in 0 until 9 step 5) {
            println(i)
            break
        }
    }

    for (i in 9 downTo  1 step 5) {
        for (i in 9 downTo  1 step 5) {
            println(i)
            if (i % 2 ==0 ){
                continue
            }
            println(i)
        }
    }

    //Duyệt tuần tự
    for (item in arr) {
        println(item)
    }

    //Duyệt tuần tự
    arr.forEach { item->
        println(item)
    }

    //Duyệt tuần tự có index
    arr.forEachIndexed { index, item ->
        println("$index : $item")
    }

    var n = 9
    while (n >4) {
        println(n)
        n--
    }

    //Lưu ý: Duyệt tuần tự k dc thay dổi vị trí
}