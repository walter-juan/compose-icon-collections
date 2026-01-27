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

public val Simpleicons.Niri: ImageVector
    get() {
        if (_niri != null) {
            return _niri!!
        }
        _niri = Builder(name = "Niri", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.239f, 21.913f)
                curveToRelative(0.0f, 1.044f, -0.522f, 2.087f, -4.174f, 2.087f)
                curveToRelative(-3.652f, 0.0f, -4.174f, -1.044f, -4.174f, -2.087f)
                curveToRelative(0.0f, -1.565f, 1.044f, -2.609f, 4.174f, -2.609f)
                reflectiveCurveToRelative(4.174f, 1.043f, 4.174f, 2.609f)
                close()
                moveTo(7.891f, -0.0f)
                curveToRelative(2.087f, 0.0f, 10.435f, 6.261f, 10.435f, 11.478f)
                curveToRelative(0.0f, 3.521f, -1.65f, 5.062f, -3.095f, 5.736f)
                curveToRelative(-1.094f, 0.511f, -1.397f, -0.17f, -0.789f, -1.219f)
                curveToRelative(0.409f, -0.704f, 0.753f, -1.557f, 0.753f, -2.431f)
                curveToRelative(0.0f, -1.565f, -0.522f, -2.609f, -1.565f, -3.652f)
                curveToRelative(-1.044f, -1.044f, -2.384f, -1.565f, -3.13f, -1.565f)
                curveToRelative(-1.044f, 0.0f, -1.565f, 3.067f, -1.565f, 4.696f)
                curveToRelative(0.0f, 1.298f, 0.387f, 2.466f, 0.777f, 3.313f)
                curveToRelative(0.367f, 0.799f, 0.06f, 1.347f, -0.764f, 1.044f)
                curveToRelative(-0.9f, -0.331f, -1.978f, -0.984f, -2.622f, -2.271f)
                curveToRelative(-1.044f, -2.087f, -0.522f, -5.09f, -0.522f, -7.826f)
                curveToRelative(0.0f, -4.174f, 0.0f, -7.304f, 2.087f, -7.304f)
                close()
            }
        }
        .build()
        return _niri!!
    }

private var _niri: ImageVector? = null
