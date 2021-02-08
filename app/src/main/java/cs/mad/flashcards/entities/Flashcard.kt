package cs.mad.flashcards.entities

data class Flashcard(val t: String , val d: String) {
    val term: String
    val definition: String

    init {
        term = t
        definition = d
    }
    companion object {
        fun tenCards() : Array<Flashcard> {
            val card1 = Flashcard("Kotlin", "Programing language for android devices")
            val card2 = Flashcard("Swift", "Programing language for iOS devices")
            val card3 = Flashcard(
                    "var",
                    "variable data storage type. a variable can be changed after it is created"
            )
            val card4 = Flashcard(
                    "val",
                    "constant data storage. Contents cannot be changed after it is created."
            )
            val card5 = Flashcard("Nullable", "a variable that can be set to null")
            val card6 = Flashcard(
                    "map / dictionary",
                    "undordered data storage. Good for definitions. bad for sorting"
            )
            val card7 = Flashcard(
                    "When/then control",
                    "a control loop for switching between many options based values of a variable"
            )
            val card8 = Flashcard("data class", "a supporting class for storing data")
            val card9 = Flashcard("Arduino Studio", "Programming IDE for androind app development")
            val card0 = Flashcard("Xcode", "Programming IDE for iOS development")
            val out = arrayOf(card1, card2, card3, card4, card5, card6, card7, card8, card9, card0)
            return out
        }
    }

}