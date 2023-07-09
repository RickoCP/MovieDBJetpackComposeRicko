package com.example.moviedbjetpackcompose.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val ColorPalette = lightColors(
        primary = colorPrimary,
        primaryVariant = colorPrimaryVariant,
        secondary = colorSecondary,

        /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MoviedbJetpackComposeTheme(content: @Composable() () -> Unit) {

    MaterialTheme(
            colors = ColorPalette,
            typography = typography,
            shapes = shapes,
            content = content
    )
}