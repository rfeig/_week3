package cs.mad.flashcards.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.activities.FlashcardSetDetailView
import cs.mad.flashcards.entities.FlashcardSet


class FlashcardSetAdapter() : RecyclerView.Adapter<FlashcardSetAdapter.ViewHolder>() {
    // need to get and store a reference to the data set
    var flashSet = FlashcardSet.tenDecks()

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // store view references as properties using findViewById on view
        var button: Button = view.findViewById(R.id.button)

        fun onClick(view: View) {
            //Add other function here later
            button.setText("no why did you that ")
            view.invalidate()
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        /*
            this is written for you but understand what is happening here
            the layout for an individual item is being inflated
            the inflated layout is passed to view holder for storage

            THE ITEM LAYOUT STILL NEEDS TO BE SETUP IN THE LAYOUT EDITOR
         */

        return ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_flashcard_set, viewGroup, false))
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        /*
            fill the contents of the view using references in view holder and current position in data set

            to launch FlashcardSetDetailActivity ->
            viewHolder.itemView.context.startActivity(Intent(viewHolder.itemView.context, FlashcardSetDetailActivity::class.java))
         */
        val but: TextView = viewHolder.button
        val str: String = flashSet[position].title + position.toString()
        but.setText(str)
       but.setOnClickListener {
            viewHolder.itemView.context.startActivity(Intent(viewHolder.itemView.context, FlashcardSetDetailView()::class.java))
        }
    }

    override fun getItemCount(): Int {
        // return the size of the data set
        return flashSet.size
    }

    fun addDeck() {
        flashSet.add(FlashcardSet.tenCardDeck())
        notifyDataSetChanged()
    }

}