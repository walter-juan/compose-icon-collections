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

public val SolidGroup.Leo: ImageVector
    get() {
        if (_leo != null) {
            return _leo!!
        }
        _leo = Builder(name = "Leo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(260.0f, 0.0f)
                curveToRelative(72.9f, 0.0f, 132.0f, 59.1f, 132.0f, 132.0f)
                lineToRelative(0.0f, 5.4f)
                lineToRelative(-0.1f, 1.4f)
                lineToRelative(-23.8f, 270.0f)
                curveToRelative(0.4f, 21.7f, 18.2f, 39.2f, 40.0f, 39.2f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 57.4f, -46.6f, 104.0f, -104.0f, 104.0f)
                reflectiveCurveTo(304.0f, 465.4f, 304.0f, 408.0f)
                lineToRelative(0.0f, -1.4f)
                lineToRelative(0.1f, -1.4f)
                lineToRelative(23.9f, -270.6f)
                lineToRelative(0.0f, -2.6f)
                curveToRelative(0.0f, -37.6f, -30.4f, -68.0f, -68.0f, -68.0f)
                reflectiveCurveToRelative(-68.0f, 30.4f, -68.0f, 68.0f)
                lineToRelative(0.0f, 4.0f)
                curveToRelative(0.0f, 3.7f, 0.3f, 7.3f, 0.8f, 11.0f)
                lineToRelative(29.7f, 193.4f)
                curveToRelative(0.9f, 6.1f, 1.4f, 12.2f, 1.4f, 18.4f)
                lineToRelative(0.0f, 9.2f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                reflectiveCurveTo(0.0f, 429.9f, 0.0f, 368.0f)
                reflectiveCurveTo(50.1f, 256.0f, 112.0f, 256.0f)
                curveToRelative(11.7f, 0.0f, 23.0f, 1.8f, 33.7f, 5.1f)
                lineTo(129.6f, 156.7f)
                curveToRelative(-1.1f, -6.8f, -1.6f, -13.8f, -1.6f, -20.7f)
                lineToRelative(0.0f, -4.0f)
                curveTo(128.0f, 59.1f, 187.1f, 0.0f, 260.0f, 0.0f)
                close()
                moveTo(112.0f, 320.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _leo!!
    }

private var _leo: ImageVector? = null
