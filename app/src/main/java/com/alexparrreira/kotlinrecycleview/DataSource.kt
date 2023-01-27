package com.alexparrreira.kotlinrecycleview

import com.alexparrreira.kotlinrecycleview.model.Manga

class DataSource {
    companion object{
        fun createDataSet(): ArrayList<Manga>{
            val list = ArrayList<Manga>()

            list.add(
                Manga(
                    "Solo Leveling",
                    "Jang Sung-Lak",
                    "https://static3.mangalivre.net/capas/IUQzYHNu_qeq5mosQv6wLw/7702/602ef3532b765external_cover.jpg",
                    "https://mangalivre.net/manga/solo-leveling/7702"
                )
            )

            list.add(
                Manga(
                    "Tales Of Demons And Gods",
                    "JMad Snail",
                    "https://static3.mangalivre.net/capas/gD0Oa7y2CPW5rtPpe0HmRA/2412/external_cover.jpg",
                    "https://mangalivre.net/manga/tales-of-demons-and-gods/2412"
                )
            )
            list.add(
                Manga(
                    "The Beginning After The End",
                    "TurtleMe",
                    "https://static3.mangalivre.net/capas/UfImono9zPu7PTk5SrpSdw/7403/625b30e19b8b3_external_cover.jpg",
                    "https://mangalivre.net/manga/the-beginning-after-the-end/7403"
                )
            )
            list.add(
                Manga(
                    "Pick Me Up!",
                    "Hermod & Nicesun",
                    "https://static3.mangalivre.net/capas/sbZABd0s616CQASd9IW-cA/16651/63aca68ec15c2_external_cover.jpg",
                    "https://mangalivre.net/manga/pick-me-up/16651"
                )
            )
            list.add(
                Manga(
                    "Boku no Hero Academia",
                    "Horikoshi, Kouhei",
                    "https://static3.mangalivre.net/capas/jaeCSPJqHxXp5R62fT43cw/1319/63cfe964afac4_external_cover.jpg",
                    "https://mangalivre.net/manga/boku-no-hero-academia/1319"
                )
            )
            list.add(
                Manga(
                    "Shingeki no Kyojin",
                    "Isayama",
                    "https://static3.mangalivre.net/capas/oA3IRYsUKsYzddF_M_z71Q/210/60293e103f488external_cover.jpg",
                    "https://mangalivre.net/manga/shingeki-no-kyojin/210"
                )
            )
            return list
        }

    }
}