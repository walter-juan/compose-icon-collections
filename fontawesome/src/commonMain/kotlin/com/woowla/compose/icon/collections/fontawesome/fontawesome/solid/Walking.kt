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

public val SolidGroup.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, -112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, 112.0f)
                close()
                moveTo(105.4f, 227.9f)
                lineToRelative(22.6f, -22.6f)
                lineToRelative(0.0f, 69.3f)
                curveToRelative(0.0f, 28.0f, 12.2f, 54.7f, 33.5f, 72.9f)
                lineToRelative(71.4f, 61.2f)
                curveToRelative(5.9f, 5.1f, 9.8f, 12.1f, 10.9f, 19.8f)
                lineToRelative(12.6f, 88.1f)
                curveToRelative(2.5f, 17.5f, 18.7f, 29.7f, 36.2f, 27.2f)
                reflectiveCurveToRelative(29.7f, -18.7f, 27.2f, -36.2f)
                lineToRelative(-12.6f, -88.1f)
                curveToRelative(-3.3f, -23.1f, -14.9f, -44.1f, -32.6f, -59.3f)
                lineToRelative(-34.5f, -29.6f)
                lineToRelative(0.0f, -115.2f)
                lineToRelative(3.8f, 4.7f)
                curveToRelative(18.2f, 22.8f, 45.8f, 36.0f, 75.0f, 36.0f)
                lineToRelative(33.2f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-33.2f, 0.0f)
                curveToRelative(-9.7f, 0.0f, -18.9f, -4.4f, -25.0f, -12.0f)
                lineToRelative(-17.9f, -22.4f)
                curveToRelative(-23.0f, -28.8f, -57.9f, -45.6f, -94.8f, -45.6f)
                curveToRelative(-32.2f, 0.0f, -63.1f, 12.8f, -85.8f, 35.6f)
                lineTo(60.1f, 182.6f)
                curveTo(42.1f, 200.6f, 32.0f, 225.0f, 32.0f, 250.5f)
                lineTo(32.0f, 288.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -37.5f)
                curveToRelative(0.0f, -8.5f, 3.4f, -16.6f, 9.4f, -22.6f)
                close()
                moveTo(117.8f, 407.3f)
                curveToRelative(-1.5f, 5.2f, -4.3f, 10.0f, -8.1f, 13.8f)
                lineTo(41.4f, 489.4f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(68.3f, -68.3f)
                curveToRelative(11.5f, -11.5f, 19.9f, -25.8f, 24.4f, -41.5f)
                lineToRelative(2.2f, -7.6f)
                lineToRelative(-46.0f, -39.4f)
                curveToRelative(-2.5f, -2.2f, -5.0f, -4.4f, -7.4f, -6.8f)
                lineToRelative(-10.4f, 36.2f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
