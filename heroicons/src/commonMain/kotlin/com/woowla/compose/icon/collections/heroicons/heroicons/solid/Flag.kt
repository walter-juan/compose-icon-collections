package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 2.25f)
                curveTo(3.414f, 2.25f, 3.75f, 2.586f, 3.75f, 3.0f)
                verticalLineTo(3.539f)
                lineTo(5.588f, 3.08f)
                curveTo(7.846f, 2.515f, 10.231f, 2.777f, 12.313f, 3.818f)
                lineTo(12.421f, 3.872f)
                curveTo(14.147f, 4.735f, 16.121f, 4.966f, 18.0f, 4.524f)
                lineTo(21.11f, 3.792f)
                curveTo(21.347f, 3.736f, 21.596f, 3.799f, 21.778f, 3.96f)
                curveTo(21.961f, 4.121f, 22.053f, 4.361f, 22.027f, 4.603f)
                curveTo(21.844f, 6.293f, 21.75f, 8.01f, 21.75f, 9.75f)
                curveTo(21.75f, 11.504f, 21.846f, 13.236f, 22.032f, 14.939f)
                curveTo(22.073f, 15.316f, 21.827f, 15.664f, 21.458f, 15.751f)
                lineTo(18.344f, 16.484f)
                curveTo(16.123f, 17.006f, 13.79f, 16.734f, 11.75f, 15.714f)
                lineTo(11.642f, 15.66f)
                curveTo(9.881f, 14.779f, 7.863f, 14.557f, 5.952f, 15.035f)
                lineTo(3.75f, 15.586f)
                verticalLineTo(21.0f)
                curveTo(3.75f, 21.414f, 3.414f, 21.75f, 3.0f, 21.75f)
                curveTo(2.586f, 21.75f, 2.25f, 21.414f, 2.25f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(2.25f, 2.586f, 2.586f, 2.25f, 3.0f, 2.25f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
