package at.fh.swengb.karim.moviereview

import android.view.CollapsibleActionView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.text.FieldPosition

object MovieRepository {
    private val movies: List<Movie>

    init {
        val mainactor = Person("Daniel Radcliffe", "23.07.1989")
        val coactor = Person("Emma Watson", "15.04.1990")
        val coactor2 = Person("Rupert Grint", "24.08.1988")
        val producer = Person("J. K. Rowling","31.07.1965")
        val leo = Person("Leonardo Dicaprio", "11.11.1974")

        movies = listOf(
            Movie("0",
                "Harry Potter and the Philosopher's Stone",
                "04.11.2001",
                "The young orphan Harry Potter grows up with his aunt and uncle, of whom he is only exploited. Shortly before his eleventh birthday, however, his life changes when he receives an invitation to Hogwarts, a school of witchcraft and sorcery. There magical creatures, potion classes and the teacher Snape await him, who doesn't seem to like him. Harry makes friends in his classmates Ron and Hermione. And soon he'll be dealing with the worst of all wizards.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("1",
                "Harry Potter and the Chamber of Secrets",
                "03.11.2002",
                "Harry, Ron, and Hermione return to Hogwarts for their second year, which proves to be more challenging than the last. The Chamber of Secrets has been opened, leaving students and ghosts petrified by an unleashed monster. Harry must face up to claims that he is the heir of Salazar Slytherin (founder of the Chamber), learn that he can speak Parseltongue, and also discover the properties of a mysterious diary, only to find himself trapped within the Chamber of Secrets itself.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("2",
                "Harry Potter and the Prisoner of Azkaban",
                "23.06.2004",
                "Harry Potter's third year sees the boy wizard, along with his friends, attending Hogwarts School once again. Professor R. J. Lupin joins the staff as Defence Against the Dark Arts teacher, while convicted murderer Sirius Black escapes from Azkaban Prison. The Ministry of Magic entrusts the Dementors of Azkaban to guard Hogwarts from Black. Harry learns more about his past and his connection with the escaped prisoner.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("3",
                "Harry Potter and the Goblet of Fire",
                "06.11.2005",
                "During Harry's fourth year, Hogwarts plays host to a legendary event: the Triwizard Tournament. Three European schools participate in the tournament, with three 'champions' representing each school in the deadly tasks. The Goblet of Fire chooses Fleur Delacour, Viktor Krum, and Cedric Diggory to compete against each other. However, curiously, Harry's name is also produced from the Goblet thus making him a fourth champion, which results in a terrifying encounter with a reborn Lord Voldemort.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("4",
                "Harry Potter and the Order of the Phoenix",
                "28.06.2007",
                "Harry's fifth year begins with him being attacked by Dementors in Little Whinging. Later, he finds out that the Ministry of Magic is in denial of Lord Voldemort's return. Harry is also beset by disturbing and realistic nightmares, while Professor Umbridge, a representative of Minister for Magic Cornelius Fudge, is the new Defence Against the Dark Arts teacher. Harry becomes aware that Voldemort is after a prophecy which reveals: \"neither can live while the other survives\". The rebellion involving the students of Hogwarts, secret organisation Order of the Phoenix, the Ministry of Magic, and the Death Eaters begins.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("5",
                "Harry Potter and the Half-Blood Prince",
                "07.07.2009",
                "In Harry's sixth year at Hogwarts, Lord Voldemort and his Death Eaters are increasing their terror upon the Wizarding and Muggle worlds. Headmaster Albus Dumbledore persuades his old friend Horace Slughorn to return to Hogwarts as a professor as there is a vacancy to fill. There is a more important reason, however, for Slughorn's return. While in a Potions lesson, Harry takes possession of a strangely annotated school textbook, inscribed 'This is the property of the Half-Blood Prince'. Draco Malfoy struggles to carry out a deed presented to him by Voldemort. Meanwhile, Dumbledore and Harry secretly work together to discover the method on how to destroy the Dark Lord once and for all.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("6",
                "Harry Potter and the Deathly Hallows: Part 1",
                "11.11.2010",
                "After unexpected events at the end of the previous year, Harry, Ron, and Hermione are entrusted with a quest to find and destroy Lord Voldemort's secret to immortality – the Horcruxes. It is supposed to be their final year at Hogwarts, but the collapse of the Ministry of Magic and Voldemort's rise to power prevents them from attending. The trio undergo a long journey with many obstacles in their path including Death Eaters, Snatchers, the mysterious Deathly Hallows, and Harry's connection with the Dark Lord's mind becoming ever stronger.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("7",
                "Harry Potter and the Deathly Hallows: Part 2",
                "07.07.2011",
                "After destroying one Horcrux and discovering the significance of the three Deathly Hallows, Harry, Ron and Hermione continue to seek the other Horcruxes in an attempt to destroy Voldemort, who has now obtained the powerful Elder Wand. The Dark Lord discovers Harry's hunt for Horcruxes and launches an attack on Hogwarts School, where the trio return for one last stand against the dark forces that threaten the Wizarding and Muggle worlds.",
                MovieGenre.ACTION,
                producer,
                listOf(mainactor, coactor, coactor2),
                mutableListOf()
            ),
            Movie("8",
                "Titanic",
                "09.01.1998",
                "Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.",
            MovieGenre.ROMANCE,
                Person("James Cameron", "16.08.1954"),
            listOf(leo),
            mutableListOf()
            ),
            Movie("9",
                "The Wolf of Wall Street",
                "17.12.2013",
                "Introduced to life in the fast lane through stockbroking, Jordan Belfort takes a hit after a Wall Street crash. He teams up with Donnie Azoff, cheating his way to the top as his relationships slide.",
                MovieGenre.ROMANCE,
                Person("Martin Scorsee","17.11.1942"),
                listOf(leo),
                mutableListOf()
            ),
            Movie("10",
                "The Revanant",
                "22.01.2016",
                "Hugh Glass, a legendary frontiersman, is severely injured in a bear attack and is abandoned by his hunting crew. He uses his skills to survive and take revenge on his companion, who betrayed him.",
                MovieGenre.ROMANCE,
                Person("Alejandro González Iñárritu","15.08.1963"),
                        listOf(leo),
                        mutableListOf()
            ),
            Movie("11",
                "Inception",
                "30.07.2010",
                "Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform the impossible, an inception.",
                MovieGenre.ROMANCE,
                Person("Christopher Nolan", "30.07.1970"),
                        listOf(leo),
                        mutableListOf()
            ),
            Movie("12",
                "Romeo and Juliet",
                "27.10.1996",
                "The rivalry between Verona's two well-established families, the Capulets and the Montagues, affects the relationship of their children Romeo and Juliet.",
                MovieGenre.ROMANCE,
                Person("Baz Luhrmann", "17.09.1962"),
                        listOf(leo),
                        mutableListOf()
            ),
            Movie("13",
                "The Great Gadsby",
                "16.05.2013",
                "Nick Carraway, a World War I veteran who works as a stock market trader after settling in NYC, finds himself attracted to Jay Gatsby and his flamboyant lifestyle.",
                MovieGenre.ROMANCE,
                Person("Baz Luhrmann", "17.09.1962"),
                        listOf(leo),
                        mutableListOf()
            ),
            Movie("14",
                "Shutter Island",
                "26.02.2010",
                "Teddy Daniels and Chuck Aule, two US marshals, are sent to an asylum on a remote island in order to investigate the disappearance of a patient, where Teddy uncovers a shocking truth about the place.",
                MovieGenre.ROMANCE,
                Person("Martin Scorsee","17.11.1942"),
                        listOf(leo),
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

    fun getItemId(position: Int): Any {
        return position.toLong()
    }

}


