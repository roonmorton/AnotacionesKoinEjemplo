package com.example.anotacioneskoinejemplo.model

import android.graphics.Color
import org.koin.core.annotation.Single

@Single
class ColorProvider {
    val colors = listOf<ColorModel>(
        ColorModel(
            color = "#d84315",
            colorName = "orange",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#0277bd",
            colorName = "blue",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#4f5b62",
            colorName = "gray",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#000000",
            colorName = "black",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#fdd835",
            colorName = "yellow",
            textColor = "#000000"
        ),
        ColorModel(
            color = "#00701a",
            colorName = "green",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#007c91",
            colorName = "cyan",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#005cb2",
            colorName = "blue",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#3949ab",
            colorName = "indigo",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#8e24aa",
            colorName = "purple",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#d81b60",
            colorName = "pink",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#e53935",
            colorName = "red",
            textColor = "#ffffff"
        ),
        ColorModel(
            color = "#ffffff",
            colorName = "white",
            textColor = "#718792"
        )
    )

    fun random() : ColorModel{
        return colors.get((0..(colors.size-1)).random())
    }
}