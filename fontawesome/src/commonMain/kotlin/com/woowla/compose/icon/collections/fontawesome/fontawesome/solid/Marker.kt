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

public val SolidGroup.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.8f, 0.0f)
                curveToRelative(-27.4f, 0.0f, -53.6f, 10.9f, -73.0f, 30.2f)
                lineTo(318.1f, 48.0f)
                lineTo(305.0f, 34.9f)
                curveToRelative(-28.1f, -28.1f, -73.7f, -28.1f, -101.8f, 0.0f)
                lineTo(103.0f, 135.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineTo(237.1f, 68.9f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineTo(284.1f, 81.9f)
                lineTo(184.0f, 182.1f)
                lineTo(329.9f, 328.0f)
                lineTo(481.8f, 176.2f)
                curveToRelative(19.4f, -19.4f, 30.2f, -45.6f, 30.2f, -73.0f)
                curveToRelative(0.0f, -57.0f, -46.2f, -103.2f, -103.2f, -103.2f)
                close()
                moveTo(102.4f, 263.7f)
                curveToRelative(-49.9f, 49.9f, -83.3f, 114.0f, -95.5f, 183.5f)
                lineTo(0.4f, 483.8f)
                curveTo(-1.0f, 491.6f, 1.5f, 499.4f, 7.0f, 505.0f)
                reflectiveCurveToRelative(13.4f, 8.0f, 21.1f, 6.7f)
                lineToRelative(36.7f, -6.5f)
                curveToRelative(69.5f, -12.3f, 133.6f, -45.6f, 183.5f, -95.5f)
                lineTo(296.0f, 361.9f)
                lineTo(150.1f, 216.0f)
                lineTo(102.4f, 263.7f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
