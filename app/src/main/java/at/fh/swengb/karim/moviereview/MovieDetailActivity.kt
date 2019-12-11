package at.fh.swengb.karim.moviereview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieId = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)

        open_movie_review.setOnClickListener {
            val intent = Intent (this, MovieReviewActivity::class.java)
            intent.putExtra("PassedId", movieId)
            startActivity(intent)
        }

    }

}
