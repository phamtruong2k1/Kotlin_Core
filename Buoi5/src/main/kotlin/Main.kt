import java.util.Collections
import kotlin.Comparator


fun main() {

    /*val teacher = Teacher(1, 2)
    val teacher2 = Teacher(1, 2)
    val teacher3 = teacher2
    val student = Student()

    teacher3.setTuoi(2)

    println(teacher2.toString())


    println(teacher3.equals(student))*/

    val list = ArrayList<Teacher>()

    list.add(Teacher(8, 2))
    list.add(Teacher(1, 2))
    list.add(Teacher(6, 2))
    list.add(Teacher(3, 2))
    list.add(Teacher(10, 2))
    list.add(Teacher(5, 2))

    /*Collections.sort(list, object : Comparator<Teacher> {
        override fun compare(teacher1: Teacher, teacher2: Teacher): Int {
            if (teacher1.tuoi > teacher2.tuoi) {
                return  -1
            }
            return 1
        }

    })*/

    list.sortBy {
        it.tuoi
    }

    list.sortWith(object : Comparator<Teacher> {
        override fun compare(teacher1: Teacher, teacher2: Teacher): Int {
            if (teacher1.tuoi > teacher2.tuoi) {
                return  -1
            }
            return 1
        }
    })

    list.reverse()


    list.forEach {
        println(it.toString())
    }
}
