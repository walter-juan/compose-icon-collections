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

public val RegularGroup.GrinSquint: ImageVector
    get() {
        if (_grinSquint != null) {
            return _grinSquint!!
        }
        _grinSquint = Builder(name = "GrinSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(372.2f, 302.3f)
                curveToRelative(11.8f, -3.6f, 23.7f, 6.1f, 19.6f, 17.8f)
                curveToRelative(-19.8f, 55.9f, -73.1f, 96.0f, -135.8f, 96.0f)
                curveToRelative(-62.7f, 0.0f, -116.0f, -40.0f, -135.8f, -95.9f)
                curveToRelative(-4.1f, -11.6f, 7.8f, -21.4f, 19.6f, -17.8f)
                curveToRelative(34.7f, 10.6f, 74.2f, 16.5f, 116.1f, 16.5f)
                curveToRelative(42.0f, 0.0f, 81.5f, -6.0f, 116.3f, -16.6f)
                close()
                moveTo(122.6f, 159.3f)
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
                moveTo(386.2f, 180.4f)
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
        return _grinSquint!!
    }

private var _grinSquint: ImageVector? = null
