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
                moveTo(178.2f, -10.1f)
                curveToRelative(7.4f, -3.1f, 15.8f, -2.2f, 22.5f, 2.2f)
                lineToRelative(87.8f, 58.2f)
                lineToRelative(87.8f, -58.2f)
                curveToRelative(6.7f, -4.4f, 15.1f, -5.2f, 22.5f, -2.2f)
                reflectiveCurveTo(411.4f, -0.5f, 413.0f, 7.3f)
                lineToRelative(20.9f, 103.2f)
                lineToRelative(103.2f, 20.9f)
                curveToRelative(7.8f, 1.6f, 14.4f, 7.0f, 17.4f, 14.3f)
                reflectiveCurveToRelative(2.2f, 15.8f, -2.2f, 22.5f)
                lineToRelative(-58.2f, 87.8f)
                lineToRelative(58.2f, 87.8f)
                curveToRelative(4.4f, 6.7f, 5.2f, 15.1f, 2.2f, 22.5f)
                reflectiveCurveToRelative(-9.6f, 12.8f, -17.4f, 14.3f)
                lineTo(433.8f, 401.4f)
                lineTo(413.0f, 504.7f)
                curveToRelative(-1.6f, 7.8f, -7.0f, 14.4f, -14.3f, 17.4f)
                reflectiveCurveToRelative(-15.8f, 2.2f, -22.5f, -2.2f)
                lineToRelative(-87.8f, -58.2f)
                lineToRelative(-87.8f, 58.2f)
                curveToRelative(-6.7f, 4.4f, -15.1f, 5.2f, -22.5f, 2.2f)
                reflectiveCurveToRelative(-12.8f, -9.6f, -14.3f, -17.4f)
                lineTo(143.0f, 401.4f)
                lineTo(39.7f, 380.5f)
                curveToRelative(-7.8f, -1.6f, -14.4f, -7.0f, -17.4f, -14.3f)
                reflectiveCurveToRelative(-2.2f, -15.8f, 2.2f, -22.5f)
                lineTo(82.7f, 256.0f)
                lineTo(24.5f, 168.2f)
                curveToRelative(-4.4f, -6.7f, -5.2f, -15.1f, -2.2f, -22.5f)
                reflectiveCurveToRelative(9.6f, -12.8f, 17.4f, -14.3f)
                lineTo(143.0f, 110.6f)
                lineTo(163.9f, 7.3f)
                curveToRelative(1.6f, -7.8f, 7.0f, -14.4f, 14.3f, -17.4f)
                close()
                moveTo(207.6f, 256.0f)
                arcToRelative(80.4f, 80.4f, 0.0f, true, true, 160.8f, 0.0f)
                arcToRelative(80.4f, 80.4f, 0.0f, true, true, -160.8f, 0.0f)
                close()
                moveTo(416.4f, 256.0f)
                arcToRelative(128.4f, 128.4f, 0.0f, true, false, -256.8f, 0.0f)
                arcToRelative(128.4f, 128.4f, 0.0f, true, false, 256.8f, 0.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
