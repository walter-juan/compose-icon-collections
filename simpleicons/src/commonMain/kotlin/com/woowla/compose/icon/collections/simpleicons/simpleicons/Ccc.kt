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

public val Simpleicons.Ccc: ImageVector
    get() {
        if (_ccc != null) {
            return _ccc!!
        }
        _ccc = Builder(name = "Ccc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.4f)
                curveTo(5.814f, 3.4f, 0.8f, 7.253f, 0.8f, 12.0f)
                curveToRelative(0.0f, 4.75f, 5.014f, 8.6f, 11.2f, 8.6f)
                reflectiveCurveToRelative(11.2f, -3.85f, 11.2f, -8.6f)
                curveToRelative(0.0f, -4.747f, -5.015f, -8.6f, -11.2f, -8.6f)
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 5.19f, -5.374f, 9.4f, -12.0f, 9.4f)
                reflectiveCurveTo(0.0f, 17.19f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.374f, -9.4f, 12.0f, -9.4f)
                reflectiveCurveTo(24.0f, 6.81f, 24.0f, 12.0f)
                moveTo(10.0f, 7.0f)
                curveToRelative(-2.83f, 0.0f, -5.026f, 2.229f, -5.026f, 5.0f)
                curveToRelative(0.0f, 2.882f, 2.487f, 4.997f, 5.026f, 4.997f)
                lineTo(10.0f, 15.44f)
                curveToRelative(-1.708f, 0.0f, -3.442f, -1.36f, -3.445f, -3.44f)
                curveTo(6.547f, 9.65f, 8.476f, 8.544f, 10.0f, 8.544f)
                close()
                moveTo(13.8f, 7.0f)
                curveToRelative(-2.83f, 0.0f, -5.026f, 2.229f, -5.026f, 5.0f)
                curveToRelative(0.0f, 2.882f, 2.484f, 4.997f, 5.026f, 4.997f)
                lineTo(13.8f, 15.44f)
                curveToRelative(-1.705f, 0.0f, -3.442f, -1.36f, -3.447f, -3.44f)
                curveToRelative(-0.007f, -2.35f, 1.923f, -3.456f, 3.447f, -3.456f)
                close()
                moveTo(17.6f, 7.003f)
                curveToRelative(-2.83f, 0.0f, -5.026f, 2.23f, -5.026f, 4.997f)
                curveToRelative(0.0f, 2.886f, 2.487f, 5.0f, 5.026f, 5.0f)
                verticalLineToRelative(-1.56f)
                curveToRelative(-1.708f, 0.0f, -3.442f, -1.358f, -3.448f, -3.44f)
                curveToRelative(-0.005f, -2.35f, 1.924f, -3.456f, 3.448f, -3.456f)
                close()
            }
        }
        .build()
        return _ccc!!
    }

private var _ccc: ImageVector? = null
