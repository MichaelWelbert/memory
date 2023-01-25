package com.example.memory.presenter.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.memory.R

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun HeroCard(
    modifier: Modifier = Modifier,
    cardState: CardState = CardState.HIDDEN,
    onclick: () -> Unit,
) {
    Card(
        modifier = modifier
            .wrapContentSize(),
        onClick = onclick,
        border = BorderStroke(width =  2.dp, color = Color.Gray),
        shape = RoundedCornerShape(16.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.hero_1),
            contentDescription = null,
            contentScale = ContentScale.Crop

        )
    }
}


@Preview(showBackground = true)
@Composable
internal fun HeroCardPreview() {
    HeroCard(onclick = {})
}
