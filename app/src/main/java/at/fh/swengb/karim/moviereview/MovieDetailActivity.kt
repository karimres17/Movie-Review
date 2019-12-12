package at.fh.swengb.karim.moviereview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.activity_movie_review.*

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieId = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)

        if (movieId == null) {
            Toast.makeText(this, "This option does not work", Toast.LENGTH_SHORT).show()
            finish()

        } else {
            title_detail.text = MovieRepository.movieById(movieId)?.title
            director_content.text = MovieRepository.movieById(movieId)?.director?.name.toString()
            actor_content.text = MovieRepository.movieById(movieId)?.actors?.map { it.name }?.joinToString()
            genre_content.text = MovieRepository.movieById(movieId)?.genre?.description
            ratingBar.rating = MovieRepository.movieById(movieId)?.ratingAverage()!!.toFloat()
            release_content.text = MovieRepository.movieById(movieId)?.release
            plot_id.text = MovieRepository.movieById(movieId)?.plot
            rating_content.text = MovieRepository.movieById(movieId)?.reviews?.size.toString()
            rating_detail.text = MovieRepository.movieById(movieId)?.ratingAverage()!!.toString()
        }

        open_movie_review.setOnClickListener {
            val intent = Intent (this, MovieReviewActivity::class.java)
            intent.putExtra("PassedId", movieId)
            startActivity(intent)
        }

    }

}
