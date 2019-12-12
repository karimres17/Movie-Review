package at.fh.swengb.karim.moviereview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(val clickListener: (movie: Movie) -> Unit): RecyclerView.Adapter<MovieViewHolder>() {

    private var movieList = listOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val movieItemView = inflater.inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(movieItemView, clickListener)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.bindItem(movie)
    }

    fun updateList(newList: List<Movie>) {
        movieList = newList
        notifyDataSetChanged()
    }

}

class MovieViewHolder(itemView: View, val clickListener: (movie: Movie) -> Unit): RecyclerView.ViewHolder(itemView) {
    fun bindItem(movie: Movie) {
        itemView.movie_title.text = movie.title
        itemView.movie_release.text = movie.release
        itemView.movie_person_actor.text = movie.actors.map {it.name}.joinToString()
        itemView.movie_person_director.text = movie.director.name.toString()

        itemView.movie_avg_rating_bar.rating = movie.ratingAverage().toFloat()
        itemView.movie_avg_rating_value.text = movie.ratingAverage().toString()
        itemView.movie_rating_count.text = movie.reviews.size.toString()

        itemView.setOnClickListener {
            clickListener(movie)
        }
    }
}

