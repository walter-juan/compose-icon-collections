package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.FaceTired: ImageVector
    get() {
        if (_faceTired != null) {
            return _faceTired!!
        }
        _faceTired = Builder(name = "FaceTired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, -416.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(176.5f, 320.3f)
                curveTo(196.1f, 302.1f, 223.8f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(59.9f, 14.1f, 79.5f, 32.3f)
                curveToRelative(19.0f, 17.8f, 32.5f, 41.7f, 32.5f, 63.7f)
                curveToRelative(0.0f, 5.4f, -2.7f, 10.4f, -7.2f, 13.4f)
                reflectiveCurveToRelative(-10.2f, 3.4f, -15.2f, 1.3f)
                lineToRelative(-17.2f, -7.5f)
                curveToRelative(-22.8f, -10.0f, -47.5f, -15.1f, -72.4f, -15.1f)
                reflectiveCurveToRelative(-49.6f, 5.2f, -72.4f, 15.1f)
                lineToRelative(-17.2f, 7.5f)
                curveToRelative(-4.9f, 2.2f, -10.7f, 1.7f, -15.2f, -1.3f)
                reflectiveCurveToRelative(-7.2f, -8.0f, -7.2f, -13.4f)
                curveToRelative(0.0f, -22.0f, 13.5f, -45.9f, 32.5f, -63.7f)
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
        return _faceTired!!
    }

private var _faceTired: ImageVector? = null
