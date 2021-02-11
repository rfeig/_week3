package cs.mad.flashcards.activities

import android.app.ActionBar
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.adapters.FlashcardAdapter
import cs.mad.flashcards.entities.FlashcardSet

class FlashcardSetDetailView() : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val deck: FlashcardSet = FlashcardSet.tenCardDeck()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard_set_detail_view)

        actionBar?.setDisplayHomeAsUpEnabled(true)


        val adap: FlashcardAdapter = FlashcardAdapter(deck)
        recyclerView = findViewById(R.id.termsList)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@FlashcardSetDetailView)
            adapter = adap
        }
        //val abbBut: Button = findViewById(R.id.addButton)
        //abbBut.setText("NO NO NO ")
       val addBut: Button = findViewById(R.id.addBut)
        addBut.setOnClickListener {
            adap.addCard()
        }
        val title: TextView = findViewById(R.id.title)
        title.setText(deck.title)


    }


}