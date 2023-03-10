package com.example.games.data

import com.example.games.R
import com.example.games.affirmations.Affirmations

class DataSource1  {
    fun loadAffirmations(): List<Affirmations> {
    return listOf<Affirmations>(
        Affirmations(R.drawable.swim,R.string.swim,R.string.search),
        Affirmations(R.drawable.golf,R.string.golf,R.string.search),
        Affirmations(R.drawable.archery,R.string.archery,R.string.search)


    )
}
}