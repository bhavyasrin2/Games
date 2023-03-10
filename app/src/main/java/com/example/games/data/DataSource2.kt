package com.example.games.data

import com.example.games.R
import com.example.games.affirmations.Affirmations

class DataSource2 {
    fun loadAffirmations(): List<Affirmations> {
        return listOf<Affirmations>(
            Affirmations(R.drawable.tennis, R.string.tennis, R.string.search),
            Affirmations(R.drawable.chess, R.string.chess, R.string.search),



            )
    }
}