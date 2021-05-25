package com.sondari.dicoding.jetpackpro1.util

import com.sondari.dicoding.jetpackpro1.R
import com.sondari.dicoding.jetpackpro1.data.CatalogueData

object MovieObject {

    fun generateDummyMovie(): List<CatalogueData> {

        val movies = ArrayList<CatalogueData>()

        movies.add(
            CatalogueData(
                1,
                R.drawable.poster_infinity_war,
                "Avengers: Infinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "2018",
                "83%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                2,
                R.drawable.poster_marry_queen,
                "Mary Queen of Scots",
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "2018",
                "66%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                3,
                R.drawable.poster_master_z,
                "Master Z: Ip Man Legacy ",
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "2018",
                "60%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                4,
                R.drawable.poster_mortal_engines,
                "Mortal Engines",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "2018",
                "61%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                5,
                R.drawable.poster_overlord,
                "Overlord",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "2018",
                "67%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                6,
                R.drawable.poster_ralph,
                "Wreck-It Ralph",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                "2012",
                "73%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                7,
                R.drawable.poster_robin_hood,
                "Robin Hood",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "2018",
                "59%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                8,
                R.drawable.poster_serenity,
                "Serenity",
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                "2019",
                "54%",
                "Released"
            )
        )

        movies.add(
            CatalogueData(
                9,
                R.drawable.poster_spiderman,
                "Spider-Man",
                "After being bitten by a genetically altered spider, nerdy high school student Peter Parker is endowed with amazing powers to become the Amazing superhero known as Spider-Man.",
                "2002",
                "72%",
                "Released"
            )
        )


        movies.add(
            CatalogueData(
                10,
                R.drawable.poster_t34,
                "T-34",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                "2018",
                "69%",
                "Released"
            )
        )

        return movies
    }
}