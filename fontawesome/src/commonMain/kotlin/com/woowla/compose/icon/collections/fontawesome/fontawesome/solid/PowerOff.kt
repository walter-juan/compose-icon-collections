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

public val SolidGroup.PowerOff: ImageVector
    get() {
        if (_powerOff != null) {
            return _powerOff!!
        }
        _powerOff = Builder(name = "PowerOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(224.0f, -17.7f, 224.0f, 0.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(288.0f, 0.0f)
                close()
                moveTo(146.3f, 98.4f)
                curveToRelative(14.5f, -10.1f, 18.0f, -30.1f, 7.9f, -44.6f)
                reflectiveCurveToRelative(-30.1f, -18.0f, -44.6f, -7.9f)
                curveTo(43.4f, 92.1f, 0.0f, 169.0f, 0.0f, 256.0f)
                curveTo(0.0f, 397.4f, 114.6f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveTo(512.0f, 397.4f, 512.0f, 256.0f)
                curveToRelative(0.0f, -87.0f, -43.4f, -163.9f, -109.7f, -210.1f)
                curveToRelative(-14.5f, -10.1f, -34.4f, -6.6f, -44.6f, 7.9f)
                reflectiveCurveToRelative(-6.6f, 34.4f, 7.9f, 44.6f)
                curveToRelative(49.8f, 34.8f, 82.3f, 92.4f, 82.3f, 157.6f)
                curveToRelative(0.0f, 106.0f, -86.0f, 192.0f, -192.0f, 192.0f)
                reflectiveCurveTo(64.0f, 362.0f, 64.0f, 256.0f)
                curveToRelative(0.0f, -65.2f, 32.5f, -122.9f, 82.3f, -157.6f)
                close()
            }
        }
        .build()
        return _powerOff!!
    }

private var _powerOff: ImageVector? = null
