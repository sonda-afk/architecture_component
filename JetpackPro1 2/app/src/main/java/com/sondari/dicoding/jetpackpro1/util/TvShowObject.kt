package com.sondari.dicoding.jetpackpro1.util

import com.sondari.dicoding.jetpackpro1.R
import com.sondari.dicoding.jetpackpro1.data.CatalogueData

object TvShowObject {

    fun generateDummyTvShow(): List<CatalogueData> {

        val tv = ArrayList<CatalogueData>()

        tv.add(
            CatalogueData(
                11,
                R.drawable.poster_arrow,
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                "66%",
                "Ended"
            )
        )

        tv.add(
            CatalogueData(
                12,
                R.drawable.poster_doom_patrol,
                "Doom Patrol",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "2019",
                "76%",
                "Returning Series"
            )
        )

        tv.add(
            CatalogueData(
                13,
                R.drawable.poster_dragon_ball,
                "Dragon Ball Absalon",
                "The series begins twelve years after Goku is seen leaving on Shenron not at the end of Dragon Ball GT, and diverges entirely into its own plot from there, on an alternate timeline from the one which shows Goku Jr. fighting Vegeta Jr. at the World Martial Arts Tournament. In this series, Majuub has reached new levels of power, and has honed the techniques taught to him by Goku. We also see Gotenks finally mature, and Vegeta more powerful than ever.Each character will bring forth their own set of capabilities and purpose, winning fights and being relevant, in order to create an environment that emphasizes teamwork as well as individual worth for each character. In this series, the main set of villains are Saiyans, with abilities highly similar to the Saiyans that we are familiar with. These new Saiyans are more powerful than any threat the Z Fighters have ever faced, but after twelve years of intensive training, our heroes will not be easily defeated .",
                "2012",
                "53%",
                "Returning Series"
            )
        )

        tv.add(
            CatalogueData(
                14,
                R.drawable.poster_fairytail,
                "Fairy Tail",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "2009",
                "78%",
                "Ended"
            )
        )

        tv.add(
            CatalogueData(
                15,
                R.drawable.poster_family_guy,
                "Family Guy",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "1999",
                "70%",
                "Returning Series"
            )
        )

        tv.add(
            CatalogueData(
                16,
                R.drawable.poster_flash,
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash",
                "2014",
                "77%",
                "Returning Series"
            )
        )

        tv.add(
            CatalogueData(
                17,
                R.drawable.poster_the_simpson,
                "The Simpsons",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "1989",
                "78%",
                "Returning Series"
            )
        )

        tv.add(
            CatalogueData(
                18,
                R.drawable.poster_gotham,
                "Gotham",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "2014",
                "75%",
                "Ended"
            )
        )

        tv.add(
            CatalogueData(
                19,
                R.drawable.poster_hanna,
                "Hanna",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "2019",
                "75%",
                "Returning Series"
            )
        )

        tv.add(
            CatalogueData(
                20,
                R.drawable.poster_grey_anatomy,
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2005",
                "82%",
                "Returning Series"
            )
        )

        return tv
    }
}