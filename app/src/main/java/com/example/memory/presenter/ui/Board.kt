package com.example.memory.presenter.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.memory.domain.entities.Hero


@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun Board(heroCards: List<Hero>) {

    LazyVerticalGrid(
        cells = GridCells.Fixed(4),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        items(heroCards.size) { index ->
            HeroCard(onclick = {
                // val firstSelectedHero = gameState.firstSelectedHero
                //if(firstSelectedHero == null) {
                // gameEvent.saveHeroSelected(heroId, HeroIndex)
            // else gameEvent.compare(firstSelectHero,  )
            //}
            })
        }
    }
}