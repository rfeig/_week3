package cs.mad.flashcards.entities


data class Flashcard(
    val question: String,
    val answer: String
)

fun getHardcodedFlashcards(): List<Flashcard> {
    return listOf(Flashcard("Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
        Flashcard( "Term 1", "Def 1"),
    )
}