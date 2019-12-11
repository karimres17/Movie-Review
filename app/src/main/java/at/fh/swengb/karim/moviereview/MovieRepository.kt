package at.fh.swengb.karim.moviereview

object MovieRepository {
    private val movies: List<Movie>

    init {
        val lecturerIlles = Person("Sanja Illes", "01.02.1993")
        val lecturerBloder = Person("Lukas Bloder","03.04.1954")
        movies = listOf(
            Movie("6",
                "Title 0",
                "09.10.2019",
                "abc",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerIlles, lecturerBloder ),
                mutableListOf()
            ),
            Movie("1",
                "Title 70",
                "09.10.2019",
                "def",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerIlles, lecturerBloder ),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}


