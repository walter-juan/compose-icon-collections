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

public val Simpleicons.Animalplanet: ImageVector
    get() {
        if (_animalplanet != null) {
            return _animalplanet!!
        }
        _animalplanet = Builder(name = "Animalplanet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.814f, 5.94f)
                lineToRelative(-0.494f, 0.858f)
                curveToRelative(2.605f, 0.509f, 4.118f, 1.618f, 4.118f, 2.917f)
                curveToRelative(0.0f, 0.865f, -0.649f, 1.696f, -1.762f, 1.696f)
                curveToRelative(-1.699f, 0.0f, -2.949f, -2.673f, -2.949f, -2.673f)
                curveToRelative(-0.356f, -0.011f, -0.993f, -0.026f, -0.993f, -0.026f)
                reflectiveCurveToRelative(-1.822f, -2.342f, -4.595f, -3.168f)
                verticalLineToRelative(3.798f)
                curveToRelative(0.244f, 0.205f, 0.559f, 0.499f, 0.855f, 0.863f)
                curveToRelative(-1.252f, -0.757f, -2.552f, -1.317f, -4.847f, -1.317f)
                curveToRelative(-2.496f, 0.0f, -5.547f, 1.007f, -7.242f, 3.763f)
                lineToRelative(0.178f, 0.322f)
                curveToRelative(0.773f, -0.873f, 1.968f, -1.402f, 2.006f, -1.416f)
                curveTo(1.424f, 13.012f, 0.469f, 15.427f, 0.0f, 16.998f)
                lineToRelative(1.456f, 1.457f)
                arcToRelative(10.687f, 10.687f, 0.0f, false, true, 8.055f, -3.588f)
                curveToRelative(2.77f, 0.0f, 5.582f, 1.157f, 7.534f, 3.157f)
                lineToRelative(1.577f, -1.579f)
                curveToRelative(-1.324f, -2.263f, -2.924f, -3.861f, -2.972f, -3.909f)
                curveToRelative(0.068f, 0.031f, 1.487f, 0.85f, 3.975f, 0.85f)
                curveToRelative(2.312f, 0.0f, 4.375f, -1.285f, 4.375f, -3.203f)
                curveToRelative(0.0f, -2.292f, -1.965f, -3.745f, -5.186f, -4.243f)
            }
        }
        .build()
        return _animalplanet!!
    }

private var _animalplanet: ImageVector? = null
