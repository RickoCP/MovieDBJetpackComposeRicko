package com.example.moviedbjetpackcompose.ui.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviedbjetpackcompose.R
import com.example.moviedbjetpackcompose.ui.*
import com.example.moviedbjetpackcompose.widget.GradientButton

@Composable
fun OnboardingScreen(openDashboard: () -> Unit) {

    MoviedbJetpackComposeTheme {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(colorSecondary),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 19.dp, bottom = 0.dp),
                        bitmap = ImageBitmap.imageResource(id = R.drawable.image_onboarding),
                        contentScale = ContentScale.FillWidth,
                        contentDescription = "header_view_login_bg"
                    )
                    Text(
                        text = "Watch movie anywhere. anytime.",
                        style = MaterialTheme.typography.subtitle1.copy(color = white),
                        modifier = Modifier.padding(start = 34.dp, end = 34.dp,top = 45.dp),
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam.",
                        style = MaterialTheme.typography.subtitle2.copy(color = gray),
                        modifier = Modifier.padding(top = 24.dp, bottom= 39.dp, start = 55.dp, end = 55.dp),
                        textAlign = TextAlign.Center
                    )

                    val gradient =
                        Brush.linearGradient(listOf(colorPrimary, colorPrimaryVariant))

                    GradientButton(
                        onClick = openDashboard,
                        text = "Get Started",
                        gradient = gradient,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                        shape = RoundedCornerShape(16.dp),
                    )

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun OnboardingScreenDefaultPreview() {
    OnboardingScreen(openDashboard = {})
}