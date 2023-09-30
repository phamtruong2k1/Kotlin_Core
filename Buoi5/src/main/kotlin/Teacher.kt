class Teacher(
    var tuoi : Int,
    var namCT : Int
) {

    override fun equals(other: Any?): Boolean {
        if (other is Student)
            return true
        other as Teacher
        return other.tuoi == tuoi && other.namCT==namCT
    }

    override fun toString(): String {
        return String.format("Teacher: $tuoi , $namCT")
    }
}