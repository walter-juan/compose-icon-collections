package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCube: ImageVector
    get() {
        if (_bxsCube != null) {
            return _bxsCube!!
        }
        _bxsCube = Builder(name = "BxsCube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.406f, 6.086f)
                lineToRelative(-9.0f, -4.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.813f, 0.0f)
                lineToRelative(-9.0f, 4.0f)
                curveToRelative(-0.02f, 0.009f, -0.034f, 0.024f, -0.054f, 0.035f)
                curveToRelative(-0.028f, 0.014f, -0.058f, 0.023f, -0.084f, 0.04f)
                curveToRelative(-0.022f, 0.015f, -0.039f, 0.034f, -0.06f, 0.05f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, -0.19f, 0.194f)
                curveToRelative(-0.02f, 0.028f, -0.041f, 0.053f, -0.059f, 0.081f)
                arcToRelative(1.119f, 1.119f, 0.0f, false, false, -0.076f, 0.165f)
                curveToRelative(-0.009f, 0.027f, -0.023f, 0.052f, -0.031f, 0.079f)
                arcTo(1.013f, 1.013f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.396f, 0.232f, 0.753f, 0.594f, 0.914f)
                lineToRelative(9.0f, 4.0f)
                curveToRelative(0.13f, 0.058f, 0.268f, 0.086f, 0.406f, 0.086f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.402f, -0.096f)
                lineToRelative(0.004f, 0.01f)
                lineToRelative(9.0f, -4.0f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 22.0f, 17.0f)
                lineTo(22.0f, 7.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -0.594f, -0.914f)
                close()
                moveTo(12.0f, 4.095f)
                lineTo(18.538f, 7.0f)
                lineTo(12.0f, 9.905f)
                lineToRelative(-1.308f, -0.581f)
                lineTo(5.463f, 7.0f)
                lineTo(12.0f, 4.095f)
                close()
                moveTo(13.0f, 19.461f)
                lineTo(13.0f, 11.65f)
                lineToRelative(7.0f, -3.111f)
                verticalLineToRelative(7.812f)
                lineToRelative(-7.0f, 3.11f)
                close()
            }
        }
        .build()
        return _bxsCube!!
    }

private var _bxsCube: ImageVector? = null
