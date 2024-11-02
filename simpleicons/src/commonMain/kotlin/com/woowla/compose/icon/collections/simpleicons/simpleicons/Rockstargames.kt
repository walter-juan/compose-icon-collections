package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Rockstargames: ImageVector
    get() {
        if (_rockstargames != null) {
            return _rockstargames!!
        }
        _rockstargames = Builder(name = "Rockstargames", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.971f, 6.816f)
                horizontalLineToRelative(3.241f)
                curveToRelative(1.469f, 0.0f, 2.741f, -0.448f, 2.741f, -2.084f)
                curveToRelative(0.0f, -1.3f, -1.117f, -1.576f, -2.19f, -1.576f)
                lineTo(6.748f, 3.156f)
                lineToRelative(-0.777f, 3.66f)
                close()
                moveTo(18.805f, 15.569f)
                horizontalLineToRelative(5.168f)
                lineToRelative(-4.664f, 3.228f)
                lineToRelative(0.755f, 5.087f)
                lineToRelative(-4.041f, -3.07f)
                lineTo(10.599f, 24.0f)
                lineToRelative(2.536f, -5.392f)
                reflectiveCurveToRelative(-2.95f, -3.075f, -2.947f, -3.075f)
                curveToRelative(-0.198f, -0.262f, -0.265f, -0.936f, -0.265f, -1.226f)
                curveToRelative(0.0f, -0.367f, 0.024f, -0.739f, 0.049f, -1.134f)
                curveToRelative(0.028f, -0.451f, 0.058f, -0.933f, 0.058f, -1.476f)
                curveToRelative(0.0f, -1.338f, -0.59f, -2.038f, -2.036f, -2.038f)
                lineTo(5.283f, 9.659f)
                lineToRelative(-1.18f, 5.525f)
                lineTo(0.026f, 15.184f)
                lineTo(3.269f, 0.0f)
                horizontalLineToRelative(7.672f)
                curveToRelative(2.852f, 0.0f, 5.027f, 0.702f, 5.027f, 3.936f)
                curveToRelative(0.0f, 2.276f, -1.12f, 3.894f, -3.592f, 4.233f)
                verticalLineToRelative(0.045f)
                curveToRelative(1.162f, 0.276f, 1.598f, 1.062f, 1.598f, 2.527f)
                curveToRelative(0.0f, 0.585f, -0.018f, 1.098f, -0.034f, 1.581f)
                curveToRelative(-0.015f, 0.428f, -0.03f, 0.834f, -0.03f, 1.243f)
                curveToRelative(0.0f, 0.525f, 0.137f, 1.382f, 0.48f, 1.968f)
                horizontalLineToRelative(0.567f)
                lineToRelative(3.028f, -5.06f)
                lineToRelative(0.82f, 5.096f)
                close()
                moveTo(17.572f, 12.621f)
                lineTo(15.385f, 16.275f)
                horizontalLineToRelative(-3.457f)
                lineToRelative(2.103f, 2.189f)
                lineToRelative(-1.73f, 3.672f)
                lineToRelative(3.777f, -2.218f)
                lineToRelative(2.976f, 2.263f)
                lineToRelative(-0.553f, -3.731f)
                lineToRelative(3.093f, -2.139f)
                horizontalLineToRelative(-3.43f)
                lineToRelative(-0.592f, -3.69f)
                close()
            }
        }
        .build()
        return _rockstargames!!
    }

private var _rockstargames: ImageVector? = null
