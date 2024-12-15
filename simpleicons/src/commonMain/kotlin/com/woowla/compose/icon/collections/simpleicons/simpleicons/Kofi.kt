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

public val Simpleicons.Kofi: ImageVector
    get() {
        if (_kofi != null) {
            return _kofi!!
        }
        _kofi = Builder(name = "Kofi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.351f, 2.715f)
                curveToRelative(-2.7f, 0.0f, -4.986f, 0.025f, -6.83f, 0.26f)
                curveTo(2.078f, 3.285f, 0.0f, 5.154f, 0.0f, 8.61f)
                curveToRelative(0.0f, 3.506f, 0.182f, 6.13f, 1.585f, 8.493f)
                curveToRelative(1.584f, 2.701f, 4.233f, 4.182f, 7.662f, 4.182f)
                horizontalLineToRelative(0.83f)
                curveToRelative(4.209f, 0.0f, 6.494f, -2.234f, 7.637f, -4.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 1.091f, -2.338f)
                curveTo(21.792f, 14.688f, 24.0f, 12.22f, 24.0f, 9.208f)
                verticalLineToRelative(-0.415f)
                curveToRelative(0.0f, -3.247f, -2.13f, -5.507f, -5.792f, -5.87f)
                curveToRelative(-1.558f, -0.156f, -2.65f, -0.208f, -6.857f, -0.208f)
                moveToRelative(0.0f, 1.947f)
                curveToRelative(4.208f, 0.0f, 5.09f, 0.052f, 6.571f, 0.182f)
                curveToRelative(2.624f, 0.311f, 4.13f, 1.584f, 4.13f, 4.0f)
                verticalLineToRelative(0.39f)
                curveToRelative(0.0f, 2.156f, -1.792f, 3.844f, -3.87f, 3.844f)
                horizontalLineToRelative(-0.935f)
                lineToRelative(-0.156f, 0.649f)
                curveToRelative(-0.208f, 1.013f, -0.597f, 1.818f, -1.039f, 2.546f)
                curveToRelative(-0.909f, 1.428f, -2.545f, 3.064f, -5.922f, 3.064f)
                horizontalLineToRelative(-0.805f)
                curveToRelative(-2.571f, 0.0f, -4.831f, -0.883f, -6.078f, -3.195f)
                curveToRelative(-1.09f, -2.0f, -1.298f, -4.155f, -1.298f, -7.506f)
                curveToRelative(0.0f, -2.181f, 0.857f, -3.402f, 3.012f, -3.714f)
                curveToRelative(1.533f, -0.233f, 3.559f, -0.26f, 6.39f, -0.26f)
                moveToRelative(6.547f, 2.287f)
                curveToRelative(-0.416f, 0.0f, -0.65f, 0.234f, -0.65f, 0.546f)
                verticalLineToRelative(2.935f)
                curveToRelative(0.0f, 0.311f, 0.234f, 0.545f, 0.65f, 0.545f)
                curveToRelative(1.324f, 0.0f, 2.051f, -0.754f, 2.051f, -2.0f)
                reflectiveCurveToRelative(-0.727f, -2.026f, -2.052f, -2.026f)
                moveToRelative(-10.39f, 0.182f)
                curveToRelative(-1.818f, 0.0f, -3.013f, 1.48f, -3.013f, 3.142f)
                curveToRelative(0.0f, 1.533f, 0.858f, 2.857f, 1.949f, 3.897f)
                curveToRelative(0.727f, 0.701f, 1.87f, 1.429f, 2.649f, 1.896f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, false, 1.507f, 0.0f)
                curveToRelative(0.78f, -0.467f, 1.922f, -1.195f, 2.623f, -1.896f)
                curveToRelative(1.117f, -1.039f, 1.974f, -2.364f, 1.974f, -3.897f)
                curveToRelative(0.0f, -1.662f, -1.247f, -3.142f, -3.039f, -3.142f)
                curveToRelative(-1.065f, 0.0f, -1.792f, 0.545f, -2.338f, 1.298f)
                curveToRelative(-0.493f, -0.753f, -1.246f, -1.298f, -2.312f, -1.298f)
            }
        }
        .build()
        return _kofi!!
    }

private var _kofi: ImageVector? = null
