import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.userinterfaceapp.Book // Assurez-vous que cette importation est correcte.

class BookAdapter(private val bookList: List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    // ViewHolder pour le RecyclerView
    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.tvBookTitle)
        val authorTextView: TextView = itemView.findViewById(R.id.tvBookAuthor)
    }

    // Création de nouvelles vues
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    // Liaison des données aux vues
    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.titleTextView.text = book.title  // Liaison du titre
        holder.authorTextView.text = book.author // Liaison de l'auteur
    }

    // Retourne la taille de la liste
    override fun getItemCount(): Int = bookList.size
}
