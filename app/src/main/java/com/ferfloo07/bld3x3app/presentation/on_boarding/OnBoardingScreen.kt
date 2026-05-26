package com.ferfloo07.bld3x3app.presentation.on_boarding

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnBoardingScreen() {

    val pages = listOf(
        OnBoardingPage.First,
        OnBoardingPage.Second,
        OnBoardingPage.Thrid
    )
    val pagerState = rememberPagerState(pageCount = { pages.count() })


    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //Horizontal Pager
        HorizontalPager(
            modifier = Modifier.weight(10f),
            state = pagerState
        ) { indexPage ->
            PagerScreen(onBoardingPage = pages[indexPage])
        }
        Row(
            modifier = Modifier
                .weight(2f)
                .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.spacedBy(8.dp)

        ) {
            DotComponet(
                pages = pages,
                pagerState = pagerState
            )
        }
        FinishButton(pagerState = pagerState)
    }
}

@Composable
fun PagerScreen(onBoardingPage: OnBoardingPage) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.7f),
            painter = painterResource(onBoardingPage.image),
            contentDescription = "image "
        )

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = onBoardingPage.title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(top = 10.dp),
            text = onBoardingPage.descripcion,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
    }
}

@Composable
fun DotComponet(pages: List<OnBoardingPage>, pagerState: PagerState) {
    repeat(pages.count()) { iteration ->
        val color = if (pagerState.currentPage == iteration) Color.Blue else Color.Black
        Box(
            modifier = Modifier
                .padding(2.dp)
                .clip(CircleShape)
                .background(color)
                .size(12.dp)
        )

    }
}

@Composable
fun FinishButton(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    Row(modifier = Modifier.padding(horizontal = 40.dp)
        .padding(bottom = 8.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center) {
        AnimatedVisibility(
            modifier = Modifier.fillMaxWidth(),
            visible = pagerState.currentPage == 2
        ) {
            Button(onClick = {}) {
                Text(text = "Finish")
            }
        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun OnBoardingPreview() {
    OnBoardingScreen()
}