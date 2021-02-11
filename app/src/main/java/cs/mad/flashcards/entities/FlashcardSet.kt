package cs.mad.flashcards.entities

data class FlashcardSet(val t:String) {
    val title:String
    val cards = ArrayList<Flashcard>()

    init {
        title = t
    }

    fun add(f: Flashcard) {
        cards.add(f)
    }

    fun addList(f: Array<Flashcard>) {
        cards.addAll(f)
    }
    companion object {
        fun tenCardDeck(): FlashcardSet {
            val out = FlashcardSet("MAD Lecture 1 Terms")
            val cards = Flashcard.tenCards()
            out.addList(cards)
            return out
        }

        fun tenDecks(): ArrayList<FlashcardSet> {
            var list = ArrayList<FlashcardSet>()
            for (i in 0..9)
                list.add(tenCardDeck())
            return list
        }
    }
}