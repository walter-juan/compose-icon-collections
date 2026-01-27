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

public val SolidGroup.ScaleUnbalanced: ImageVector
    get() {
        if (_scaleUnbalanced != null) {
            return _scaleUnbalanced!!
        }
        _scaleUnbalanced = Builder(name = "ScaleUnbalanced", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(519.8f, 62.4f)
                curveToRelative(16.8f, -5.6f, 25.8f, -23.7f, 20.2f, -40.5f)
                reflectiveCurveTo(516.3f, -3.9f, 499.6f, 1.6f)
                lineToRelative(-113.0f, 37.7f)
                curveToRelative(-13.9f, -23.5f, -39.6f, -39.3f, -68.9f, -39.3f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                curveToRelative(0.0f, 3.0f, 0.2f, 5.9f, 0.5f, 8.8f)
                lineTo(115.6f, 129.6f)
                curveToRelative(-16.8f, 5.6f, -25.8f, 23.7f, -20.2f, 40.5f)
                reflectiveCurveToRelative(23.7f, 25.8f, 40.5f, 20.2f)
                lineToRelative(135.5f, -45.2f)
                curveToRelative(4.5f, 3.2f, 9.3f, 5.9f, 14.4f, 8.2f)
                lineToRelative(0.0f, 326.7f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, -294.7f)
                curveToRelative(21.0f, -9.2f, 37.2f, -27.0f, 44.2f, -49.0f)
                lineToRelative(125.9f, -42.0f)
                close()
                moveTo(437.3f, 288.0f)
                lineToRelative(72.4f, -124.2f)
                lineToRelative(72.4f, 124.2f)
                lineToRelative(-144.9f, 0.0f)
                close()
                moveTo(509.7f, 384.0f)
                curveToRelative(62.9f, 0.0f, 115.2f, -34.0f, 126.0f, -78.9f)
                curveToRelative(2.6f, -11.0f, -1.0f, -22.3f, -6.7f, -32.1f)
                lineTo(533.8f, 109.8f)
                curveToRelative(-5.0f, -8.6f, -14.2f, -13.8f, -24.1f, -13.8f)
                reflectiveCurveToRelative(-19.1f, 5.3f, -24.1f, 13.8f)
                lineTo(390.4f, 273.1f)
                curveToRelative(-5.7f, 9.8f, -9.3f, 21.1f, -6.7f, 32.1f)
                curveToRelative(10.8f, 44.8f, 63.1f, 78.9f, 126.0f, 78.9f)
                close()
                moveTo(126.8f, 291.8f)
                lineToRelative(72.4f, 124.2f)
                lineToRelative(-144.9f, 0.0f)
                lineToRelative(72.4f, -124.2f)
                close()
                moveTo(0.9f, 433.1f)
                curveTo(11.7f, 478.0f, 64.0f, 512.0f, 126.8f, 512.0f)
                reflectiveCurveToRelative(115.2f, -34.0f, 126.0f, -78.9f)
                curveToRelative(2.6f, -11.0f, -1.0f, -22.3f, -6.7f, -32.1f)
                lineTo(150.9f, 237.8f)
                curveToRelative(-5.0f, -8.6f, -14.2f, -13.8f, -24.1f, -13.8f)
                reflectiveCurveToRelative(-19.1f, 5.3f, -24.1f, 13.8f)
                lineTo(7.6f, 401.1f)
                curveToRelative(-5.7f, 9.8f, -9.3f, 21.1f, -6.7f, 32.1f)
                close()
            }
        }
        .build()
        return _scaleUnbalanced!!
    }

private var _scaleUnbalanced: ImageVector? = null
