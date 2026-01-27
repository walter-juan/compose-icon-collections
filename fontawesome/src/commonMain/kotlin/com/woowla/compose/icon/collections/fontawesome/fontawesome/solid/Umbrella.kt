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

public val SolidGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, -32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 2.0f)
                curveToRelative(126.3f, 15.7f, 224.0f, 123.5f, 224.0f, 254.0f)
                curveToRelative(0.0f, 3.8f, -0.1f, 7.5f, -0.2f, 11.3f)
                curveToRelative(-0.3f, 6.9f, -5.0f, 12.8f, -11.7f, 14.7f)
                reflectiveCurveToRelative(-13.8f, -0.7f, -17.6f, -6.5f)
                curveToRelative(-14.4f, -21.4f, -38.8f, -35.5f, -66.5f, -35.5f)
                curveToRelative(-29.3f, 0.0f, -54.9f, 15.7f, -68.9f, 39.3f)
                curveToRelative(-2.7f, 4.6f, -7.6f, 7.6f, -13.0f, 7.8f)
                reflectiveCurveToRelative(-10.5f, -2.2f, -13.7f, -6.5f)
                curveToRelative(-14.6f, -19.8f, -38.0f, -32.6f, -64.5f, -32.6f)
                reflectiveCurveToRelative(-49.9f, 12.8f, -64.5f, 32.6f)
                curveToRelative(-3.2f, 4.3f, -8.3f, 6.8f, -13.7f, 6.5f)
                reflectiveCurveToRelative(-10.2f, -3.2f, -13.0f, -7.8f)
                curveToRelative(-14.0f, -23.6f, -39.6f, -39.3f, -68.9f, -39.3f)
                curveToRelative(-27.7f, 0.0f, -52.1f, 14.1f, -66.5f, 35.5f)
                curveToRelative(-3.9f, 5.7f, -11.0f, 8.4f, -17.6f, 6.5f)
                reflectiveCurveTo(0.5f, 274.2f, 0.2f, 267.3f)
                curveTo(0.1f, 263.5f, 0.0f, 259.8f, 0.0f, 256.0f)
                curveTo(0.0f, 125.5f, 97.7f, 17.7f, 224.0f, 2.0f)
                lineToRelative(0.0f, -2.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(288.0f, 328.0f)
                lineToRelative(0.0f, 102.6f)
                curveToRelative(0.0f, 45.0f, -36.5f, 81.4f, -81.4f, 81.4f)
                curveToRelative(-30.8f, 0.0f, -59.0f, -17.4f, -72.8f, -45.0f)
                lineToRelative(-2.3f, -4.7f)
                curveToRelative(-7.9f, -15.8f, -1.5f, -35.0f, 14.3f, -42.9f)
                reflectiveCurveToRelative(35.0f, -1.5f, 42.9f, 14.3f)
                lineToRelative(2.3f, 4.7f)
                curveToRelative(3.0f, 5.9f, 9.0f, 9.6f, 15.6f, 9.6f)
                curveToRelative(9.6f, 0.0f, 17.4f, -7.8f, 17.4f, -17.4f)
                lineTo(224.0f, 328.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
