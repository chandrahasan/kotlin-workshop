package demo3classesInterface.demo3


class Exam {
    fun score(name: String, score: Int) {
        if(score < 0 || score > 100) throw IllegalArgumentException()
    }

    fun amendScore(id: Int, newScore: Int) {
        if(newScore < 0 || newScore > 100) throw IllegalArgumentException()
    }
}

/*
Inline classes
- Declared with the ‘value’ keyword
- And the ‘JvmInline’ annotation
- Have a single property
- Compile down to the type of the property - Efficient and carry more meaning
 */


@JvmInline
value class Score(val score: Int) {
    init {
        if(score < 0 || score > 100) throw IllegalArgumentException()
    }
}

class Exam1 {
    fun score(name: String, studentScore: Score) {
        // ...
    }

    fun amendScore(id: Int, newScore: Score) {
        //  ...
    }
}

fun main() {
//    var exam = Exam()
//    exam.score("Kevin",101)

    val exam1 = Exam1()
    val score = Score(101)
    exam1.score("Kevin",score)
}

