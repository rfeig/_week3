package cs.mad.flashcards.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.adapters.FlashcardSetAdapter

/*
===================================================================================================================

     Reference documentation for recyclers: https://developer.android.com/guide/topics/ui/layout/recyclerview

===================================================================================================================
 */

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val adap: FlashcardSetAdapter = FlashcardSetAdapter()
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = adap
        }
        val addBut: Button = findViewById(R.id.addButton)
        addBut.setOnClickListener {
            adap.addDeck()
        }


        /*
            connect to views using findViewById
            setup views here - recyclerview, button
            don't forget to notify the adapter if the data set is changed
         */
    }

}