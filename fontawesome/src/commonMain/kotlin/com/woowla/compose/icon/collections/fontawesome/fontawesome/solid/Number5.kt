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

public val SolidGroup.Number5: ImageVector
    get() {
        if (_number5 != null) {
            return _number5!!
        }
        _number5 = Builder(name = "Number5", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.5f, 58.3f)
                curveTo(35.3f, 43.1f, 48.5f, 32.0f, 64.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(90.7f, 96.0f)
                lineTo(70.3f, 208.0f)
                lineTo(184.0f, 208.0f)
                curveToRelative(75.1f, 0.0f, 136.0f, 60.9f, 136.0f, 136.0f)
                reflectiveCurveToRelative(-60.9f, 136.0f, -136.0f, 136.0f)
                lineToRelative(-83.5f, 0.0f)
                curveToRelative(-39.4f, 0.0f, -75.4f, -22.3f, -93.0f, -57.5f)
                lineToRelative(-4.1f, -8.2f)
                curveToRelative(-7.9f, -15.8f, -1.5f, -35.0f, 14.3f, -42.9f)
                reflectiveCurveToRelative(35.0f, -1.5f, 42.9f, 14.3f)
                lineToRelative(4.1f, 8.2f)
                curveToRelative(6.8f, 13.6f, 20.6f, 22.1f, 35.8f, 22.1f)
                lineToRelative(83.5f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                reflectiveCurveToRelative(-32.2f, -72.0f, -72.0f, -72.0f)
                lineTo(32.0f, 272.0f)
                curveToRelative(-9.5f, 0.0f, -18.5f, -4.2f, -24.6f, -11.5f)
                reflectiveCurveToRelative(-8.6f, -16.9f, -6.9f, -26.2f)
                lineToRelative(32.0f, -176.0f)
                close()
            }
        }
        .build()
        return _number5!!
    }

private var _number5: ImageVector? = null
