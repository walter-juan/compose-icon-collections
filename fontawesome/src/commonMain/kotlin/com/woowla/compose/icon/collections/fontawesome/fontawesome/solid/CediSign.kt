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

public val SolidGroup.CediSign: ImageVector
    get() {
        if (_cediSign != null) {
            return _cediSign!!
        }
        _cediSign = Builder(name = "CediSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 32.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 26.5f)
                curveTo(88.8f, 73.9f, 16.0f, 156.4f, 16.0f, 256.0f)
                reflectiveCurveTo(88.8f, 438.1f, 184.0f, 453.5f)
                lineToRelative(0.0f, 26.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -24.6f)
                curveToRelative(46.8f, -3.7f, 89.1f, -23.6f, 121.3f, -53.9f)
                curveToRelative(12.9f, -12.1f, 13.4f, -32.4f, 1.3f, -45.2f)
                reflectiveCurveToRelative(-32.4f, -13.4f, -45.2f, -1.3f)
                curveToRelative(-20.7f, 19.6f, -47.6f, 32.7f, -77.3f, 36.2f)
                lineToRelative(0.0f, -270.1f)
                curveToRelative(29.8f, 3.5f, 56.6f, 16.6f, 77.3f, 36.2f)
                curveToRelative(12.9f, 12.1f, 33.1f, 11.5f, 45.2f, -1.3f)
                reflectiveCurveToRelative(11.5f, -33.1f, -1.3f, -45.2f)
                curveTo(321.1f, 80.2f, 278.8f, 60.3f, 232.0f, 56.6f)
                lineTo(232.0f, 32.0f)
                close()
                moveTo(184.0f, 123.8f)
                lineToRelative(0.0f, 264.4f)
                curveTo(124.3f, 373.8f, 80.0f, 320.1f, 80.0f, 256.0f)
                reflectiveCurveToRelative(44.3f, -117.8f, 104.0f, -132.2f)
                close()
            }
        }
        .build()
        return _cediSign!!
    }

private var _cediSign: ImageVector? = null
