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

public val RegularGroup.LaughSquint: ImageVector
    get() {
        if (_laughSquint != null) {
            return _laughSquint!!
        }
        _laughSquint = Builder(name = "LaughSquint", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(125.2f, 332.4f)
                curveToRelative(-6.5f, -14.0f, 5.0f, -28.4f, 20.4f, -28.4f)
                lineToRelative(220.8f, 0.0f)
                curveToRelative(15.4f, 0.0f, 26.8f, 14.4f, 20.4f, 28.4f)
                curveToRelative(-22.8f, 49.4f, -72.8f, 83.6f, -130.8f, 83.6f)
                reflectiveCurveToRelative(-107.9f, -34.2f, -130.8f, -83.6f)
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
        return _laughSquint!!
    }

private var _laughSquint: ImageVector? = null
