package cs.mad.flashcards.entities

data class FlashcardSet(val title: String)

fun getHardcodedFlashcardSets(): List<FlashcardSet> {
    return mutableListOf(FlashcardSet("Set 1"),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
        FlashcardSet( "Set 1",),
    )
}