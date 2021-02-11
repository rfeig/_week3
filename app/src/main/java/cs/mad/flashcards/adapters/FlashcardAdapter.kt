package cs.mad.flashcards.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.entities.Flashcard
import cs.mad.flashcards.entities.FlashcardSet
import org.w3c.dom.Text


class FlashcardAdapter(deck: FlashcardSet) : RecyclerView.Adapter<FlashcardAdapter.ViewHolder>() {
    private var deck: FlashcardSet = deck
    class ViewHolder(inflate: View) : RecyclerView.ViewHolder(inflate){
        var text: TextView = inflate.findViewById(R.id.term)

    }

    override fun getItemCount(): Int {
        return deck.cards.size
    }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_flashcard_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val text: TextView = holder.text
        val strT: String = deck.cards[position].term
        val strD: String = deck.cards[position].definition
        var t: Boolean = true
        text.setText(strT)
        text.setOnClickListener {
            if (t)
                text.setText(strD)
            else
                text.setText(strT)
            t = !t
        }
    }

    fun addCard() {
        deck.add(Flashcard("new term", "no definition"))
        notifyDataSetChanged()
    }

}