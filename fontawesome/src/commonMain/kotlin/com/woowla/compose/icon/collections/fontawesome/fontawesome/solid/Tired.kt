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

public val SolidGroup.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(164.7f, 328.7f)
                curveToRelative(22.0f, -22.0f, 53.9f, -40.7f, 91.3f, -40.7f)
                reflectiveCurveToRelative(69.3f, 18.7f, 91.3f, 40.7f)
                curveToRelative(11.1f, 11.1f, 20.1f, 23.4f, 26.4f, 35.4f)
                curveToRelative(6.2f, 11.7f, 10.3f, 24.4f, 10.3f, 35.9f)
                curveToRelative(0.0f, 5.2f, -2.6f, 10.2f, -6.9f, 13.2f)
                reflectiveCurveToRelative(-9.8f, 3.7f, -14.7f, 1.8f)
                lineToRelative(-20.5f, -7.7f)
                curveToRelative(-26.9f, -10.1f, -55.5f, -15.3f, -84.3f, -15.3f)
                lineToRelative(-3.2f, 0.0f)
                curveToRelative(-28.8f, 0.0f, -57.3f, 5.2f, -84.3f, 15.3f)
                lineTo(149.6f, 415.0f)
                curveToRelative(-4.9f, 1.8f, -10.4f, 1.2f, -14.7f, -1.8f)
                reflectiveCurveTo(128.0f, 405.2f, 128.0f, 400.0f)
                curveToRelative(0.0f, -11.6f, 4.2f, -24.2f, 10.3f, -35.9f)
                curveToRelative(6.3f, -12.0f, 15.3f, -24.3f, 26.4f, -35.4f)
                close()
                moveTo(122.6f, 159.2f)
                curveToRelative(4.5f, -6.8f, 13.3f, -9.2f, 20.6f, -5.5f)
                lineToRelative(79.6f, 40.0f)
                curveToRelative(5.4f, 2.7f, 8.8f, 8.2f, 8.8f, 14.3f)
                reflectiveCurveToRelative(-3.4f, 11.6f, -8.8f, 14.3f)
                lineToRelative(-79.6f, 40.0f)
                curveToRelative(-7.3f, 3.6f, -16.1f, 1.3f, -20.6f, -5.5f)
                reflectiveCurveToRelative(-3.1f, -15.9f, 3.1f, -21.1f)
                lineTo(159.0f, 208.0f)
                lineTo(125.8f, 180.3f)
                curveToRelative(-6.2f, -5.2f, -7.6f, -14.3f, -3.1f, -21.1f)
                close()
                moveTo(386.2f, 180.3f)
                lineTo(353.0f, 208.0f)
                lineTo(386.2f, 235.7f)
                curveToRelative(6.2f, 5.2f, 7.6f, 14.3f, 3.1f, 21.1f)
                reflectiveCurveToRelative(-13.3f, 9.2f, -20.6f, 5.5f)
                lineToRelative(-79.6f, -40.0f)
                curveToRelative(-5.4f, -2.7f, -8.8f, -8.2f, -8.8f, -14.3f)
                reflectiveCurveToRelative(3.4f, -11.6f, 8.8f, -14.3f)
                lineToRelative(79.6f, -40.0f)
                curveToRelative(7.3f, -3.6f, 16.1f, -1.3f, 20.6f, 5.5f)
                reflectiveCurveToRelative(3.1f, 15.9f, -3.1f, 21.1f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null
