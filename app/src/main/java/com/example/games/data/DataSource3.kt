package com.example.games.data

import com.example.games.R
import com.example.games.affirmations.Affirmations

class DataSource3 {
    fun loadAffirmations(): List<Affirmations> {
        return listOf<Affirmations>(
            Affirmations(R.drawable.cricket, R.string.cricket, R.string.search),
            Affirmations(R.drawable.volley, R.string.volleyball, R.string.search),



            )
    }
}