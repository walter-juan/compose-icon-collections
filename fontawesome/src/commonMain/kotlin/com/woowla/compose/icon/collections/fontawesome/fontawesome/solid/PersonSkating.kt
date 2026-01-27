package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.PersonSkating: ImageVector
    get() {
        if (_personSkating != null) {
            return _personSkating!!
        }
        _personSkating = Builder(name = "PersonSkating", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 56.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(128.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(150.1f, 0.0f)
                curveToRelative(49.9f, 0.0f, 74.9f, 60.3f, 39.6f, 95.6f)
                lineToRelative(-63.9f, 63.9f)
                lineToRelative(69.8f, 31.0f)
                curveToRelative(17.3f, 7.7f, 28.5f, 24.9f, 28.5f, 43.9f)
                lineToRelative(0.0f, 85.6f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -75.2f)
                lineToRelative(-82.4f, -36.6f)
                curveToRelative(-41.0f, -18.2f, -51.0f, -72.0f, -19.3f, -103.7f)
                lineToRelative(40.4f, -40.4f)
                lineToRelative(-98.7f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(89.4f, 361.4f)
                lineToRelative(75.9f, -75.9f)
                curveToRelative(7.7f, 19.7f, 21.6f, 37.3f, 41.0f, 49.6f)
                lineToRelative(-71.6f, 71.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                close()
                moveTo(435.9f, 448.5f)
                curveToRelative(8.6f, 2.1f, 13.8f, 10.8f, 11.6f, 19.4f)
                lineToRelative(-0.4f, 1.7f)
                curveToRelative(-6.2f, 24.9f, -28.6f, 42.4f, -54.3f, 42.4f)
                lineTo(304.0f, 512.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(88.8f, 0.0f)
                curveToRelative(11.0f, 0.0f, 20.6f, -7.5f, 23.3f, -18.2f)
                lineToRelative(0.4f, -1.7f)
                curveToRelative(2.1f, -8.6f, 10.8f, -13.8f, 19.4f, -11.6f)
                close()
                moveTo(143.2f, 486.3f)
                lineToRelative(-6.2f, 3.1f)
                curveToRelative(-21.6f, 10.8f, -47.6f, 6.6f, -64.6f, -10.5f)
                lineTo(12.7f, 419.3f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(59.6f, 59.6f)
                curveToRelative(7.3f, 7.3f, 18.5f, 9.1f, 27.7f, 4.5f)
                lineToRelative(6.2f, -3.1f)
                curveToRelative(7.9f, -4.0f, 17.5f, -0.7f, 21.5f, 7.2f)
                reflectiveCurveToRelative(0.7f, 17.5f, -7.2f, 21.5f)
                close()
            }
        }
        .build()
        return _personSkating!!
    }

private var _personSkating: ImageVector? = null
