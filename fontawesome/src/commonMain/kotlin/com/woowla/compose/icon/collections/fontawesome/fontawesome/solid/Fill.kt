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

public val SolidGroup.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 64.0f)
                curveToRelative(6.9f, 0.0f, 13.5f, 2.7f, 18.3f, 7.6f)
                lineTo(440.4f, 197.7f)
                curveToRelative(4.9f, 4.9f, 7.6f, 11.5f, 7.6f, 18.3f)
                reflectiveCurveToRelative(-2.7f, 13.5f, -7.6f, 18.3f)
                lineTo(386.7f, 288.0f)
                lineTo(65.3f, 288.0f)
                curveToRelative(1.3f, -3.9f, 3.4f, -7.4f, 6.3f, -10.3f)
                lineToRelative(96.4f, -96.4f)
                lineToRelative(33.4f, 33.4f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(213.3f, 136.0f)
                lineTo(277.7f, 71.6f)
                curveToRelative(4.9f, -4.9f, 11.5f, -7.6f, 18.3f, -7.6f)
                close()
                moveTo(122.7f, 136.0f)
                lineTo(26.3f, 232.4f)
                curveTo(9.5f, 249.3f, 0.0f, 272.1f, 0.0f, 296.0f)
                reflectiveCurveToRelative(9.5f, 46.7f, 26.3f, 63.6f)
                lineTo(152.4f, 485.7f)
                curveTo(169.3f, 502.5f, 192.1f, 512.0f, 216.0f, 512.0f)
                reflectiveCurveToRelative(46.7f, -9.5f, 63.6f, -26.3f)
                lineTo(485.7f, 279.6f)
                curveTo(502.5f, 262.7f, 512.0f, 239.9f, 512.0f, 216.0f)
                reflectiveCurveToRelative(-9.5f, -46.7f, -26.3f, -63.6f)
                lineTo(359.6f, 26.3f)
                curveTo(342.7f, 9.5f, 319.9f, 0.0f, 296.0f, 0.0f)
                reflectiveCurveToRelative(-46.7f, 9.5f, -63.6f, 26.3f)
                lineTo(168.0f, 90.7f)
                lineTo(118.6f, 41.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(122.7f, 136.0f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
