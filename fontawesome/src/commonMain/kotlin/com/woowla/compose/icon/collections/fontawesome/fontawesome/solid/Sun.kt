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

public val SolidGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, -32.0f)
                curveToRelative(8.4f, 0.0f, 16.3f, 4.4f, 20.6f, 11.7f)
                lineTo(364.1f, 72.3f)
                lineTo(468.9f, 46.0f)
                curveToRelative(8.2f, -2.0f, 16.9f, 0.4f, 22.8f, 6.3f)
                reflectiveCurveTo(500.0f, 67.0f, 498.0f, 75.1f)
                lineToRelative(-26.3f, 104.7f)
                lineToRelative(92.7f, 55.5f)
                curveToRelative(7.2f, 4.3f, 11.7f, 12.2f, 11.7f, 20.6f)
                reflectiveCurveToRelative(-4.4f, 16.3f, -11.7f, 20.6f)
                lineTo(471.7f, 332.1f)
                lineTo(498.0f, 436.8f)
                curveToRelative(2.0f, 8.2f, -0.4f, 16.9f, -6.3f, 22.8f)
                reflectiveCurveTo(477.0f, 468.0f, 468.9f, 466.0f)
                lineToRelative(-104.7f, -26.3f)
                lineToRelative(-55.5f, 92.7f)
                curveToRelative(-4.3f, 7.2f, -12.2f, 11.7f, -20.6f, 11.7f)
                reflectiveCurveToRelative(-16.3f, -4.4f, -20.6f, -11.7f)
                lineTo(211.9f, 439.7f)
                lineTo(107.2f, 466.0f)
                curveToRelative(-8.2f, 2.0f, -16.8f, -0.4f, -22.8f, -6.3f)
                reflectiveCurveTo(76.0f, 445.0f, 78.0f, 436.8f)
                lineToRelative(26.2f, -104.7f)
                lineToRelative(-92.6f, -55.5f)
                curveTo(4.4f, 272.2f, 0.0f, 264.4f, 0.0f, 256.0f)
                reflectiveCurveToRelative(4.4f, -16.3f, 11.7f, -20.6f)
                lineTo(104.3f, 179.9f)
                lineTo(78.0f, 75.1f)
                curveToRelative(-2.0f, -8.2f, 0.3f, -16.8f, 6.3f, -22.8f)
                reflectiveCurveTo(99.0f, 44.0f, 107.2f, 46.0f)
                lineToRelative(104.7f, 26.2f)
                lineToRelative(55.5f, -92.6f)
                lineToRelative(1.8f, -2.6f)
                curveToRelative(4.5f, -5.7f, 11.4f, -9.1f, 18.8f, -9.1f)
                close()
                moveTo(288.0f, 112.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                close()
                moveTo(288.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
