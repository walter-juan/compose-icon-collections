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

public val Simpleicons.Endeavouros: ImageVector
    get() {
        if (_endeavouros != null) {
            return _endeavouros!!
        }
        _endeavouros = Builder(name = "Endeavouros", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.03f, 2.036f)
                verticalLineToRelative(0.002f)
                curveTo(13.303f, 2.138f, 0.0f, 18.46f, 0.0f, 18.46f)
                reflectiveCurveToRelative(0.957f, 0.272f, 3.135f, 0.588f)
                curveToRelative(0.0f, 0.0f, 10.435f, -17.061f, 10.904f, -17.008f)
                curveToRelative(-0.001f, 0.0f, -0.01f, -0.006f, -0.01f, -0.004f)
                close()
                moveTo(3.135f, 19.048f)
                curveToRelative(-0.95f, 1.562f, -1.71f, 2.818f, -1.71f, 2.818f)
                reflectiveCurveToRelative(10.218f, 0.46f, 18.165f, -0.606f)
                curveToRelative(11.308f, -1.516f, -2.324f, -15.96f, -5.537f, -19.214f)
                curveToRelative(2.542f, 3.36f, 13.473f, 17.751f, 2.459f, 17.937f)
                curveToRelative(-3.89f, 0.066f, -13.377f, -0.935f, -13.377f, -0.935f)
                close()
                moveTo(14.041f, 2.038f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.022f, 0.01f, 0.0f, 0.002f, 0.0f, -0.002f)
                close()
                moveTo(14.004f, 2.835f)
                curveToRelative(-0.055f, 0.073f, -0.09f, 0.112f, -0.156f, 0.205f)
                arcToRelative(61.39f, 61.39f, 0.0f, false, false, -1.285f, 1.9f)
                arcToRelative(356.805f, 356.805f, 0.0f, false, false, -3.723f, 5.842f)
                curveToRelative(-2.448f, 3.908f, -4.467f, 7.208f, -4.846f, 7.826f)
                curveToRelative(1.034f, 0.107f, 8.948f, 0.935f, 12.508f, 0.875f)
                curveToRelative(1.322f, -0.022f, 2.274f, -0.26f, 2.926f, -0.623f)
                curveToRelative(0.652f, -0.363f, 1.022f, -0.839f, 1.228f, -1.447f)
                curveToRelative(0.413f, -1.217f, 0.063f, -3.047f, -0.753f, -5.018f)
                curveToRelative(-1.537f, -3.711f, -4.485f, -7.686f, -5.899f, -9.56f)
                close()
            }
        }
        .build()
        return _endeavouros!!
    }

private var _endeavouros: ImageVector? = null
