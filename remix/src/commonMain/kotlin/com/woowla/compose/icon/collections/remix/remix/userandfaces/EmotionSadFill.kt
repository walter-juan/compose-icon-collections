package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.EmotionSadFill: ImageVector
    get() {
        if (_emotionSadFill != null) {
            return _emotionSadFill!!
        }
        _emotionSadFill = Builder(name = "EmotionSadFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 13.617f, 21.616f, 15.144f, 20.935f, 16.496f)
                curveTo(20.863f, 16.218f, 20.731f, 15.952f, 20.537f, 15.721f)
                lineTo(20.414f, 15.586f)
                lineTo(19.0f, 14.172f)
                lineTo(17.586f, 15.586f)
                lineTo(17.469f, 15.713f)
                curveTo(16.807f, 16.499f, 16.846f, 17.674f, 17.586f, 18.414f)
                curveTo(18.014f, 18.842f, 18.588f, 19.036f, 19.148f, 18.995f)
                curveTo(17.332f, 20.849f, 14.801f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(10.62f, 15.0f, 9.37f, 15.559f, 8.466f, 16.463f)
                lineTo(8.3f, 16.637f)
                lineTo(9.245f, 17.496f)
                curveTo(10.035f, 17.183f, 10.982f, 17.0f, 12.0f, 17.0f)
                curveTo(12.905f, 17.0f, 13.754f, 17.144f, 14.486f, 17.396f)
                lineTo(14.755f, 17.496f)
                lineTo(15.7f, 16.637f)
                curveTo(14.785f, 15.631f, 13.466f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(8.5f, 10.0f)
                curveTo(7.672f, 10.0f, 7.0f, 10.672f, 7.0f, 11.5f)
                curveTo(7.0f, 12.328f, 7.672f, 13.0f, 8.5f, 13.0f)
                curveTo(9.328f, 13.0f, 10.0f, 12.328f, 10.0f, 11.5f)
                curveTo(10.0f, 10.672f, 9.328f, 10.0f, 8.5f, 10.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveTo(14.672f, 10.0f, 14.0f, 10.672f, 14.0f, 11.5f)
                curveTo(14.0f, 12.328f, 14.672f, 13.0f, 15.5f, 13.0f)
                curveTo(16.328f, 13.0f, 17.0f, 12.328f, 17.0f, 11.5f)
                curveTo(17.0f, 10.672f, 16.328f, 10.0f, 15.5f, 10.0f)
                close()
            }
        }
        .build()
        return _emotionSadFill!!
    }

private var _emotionSadFill: ImageVector? = null
