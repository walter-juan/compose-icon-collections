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

public val SolidGroup.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-183.4f, -183.4f)
                lineToRelative(7.1f, -7.7f)
                lineToRelative(127.3f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, -25.1f, 56.0f, -56.0f)
                reflectiveCurveToRelative(-25.1f, -56.0f, -56.0f, -56.0f)
                lineTo(392.7f, 200.0f)
                lineTo(233.5f, 26.4f)
                curveTo(227.5f, 19.8f, 218.9f, 16.0f, 209.9f, 16.0f)
                lineToRelative(-43.7f, 0.0f)
                curveToRelative(-10.9f, 0.0f, -18.6f, 10.7f, -15.2f, 21.1f)
                lineTo(175.1f, 109.2f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(130.2f, 200.0f)
                lineToRelative(-24.6f, 0.0f)
                lineToRelative(-52.8f, -66.0f)
                curveToRelative(-3.0f, -3.8f, -7.6f, -6.0f, -12.5f, -6.0f)
                lineToRelative(-19.8f, 0.0f)
                curveToRelative(-10.4f, 0.0f, -18.0f, 9.8f, -15.5f, 19.9f)
                lineTo(32.0f, 256.0f)
                lineTo(5.0f, 364.1f)
                curveTo(2.4f, 374.2f, 10.1f, 384.0f, 20.5f, 384.0f)
                lineToRelative(19.8f, 0.0f)
                curveToRelative(4.9f, 0.0f, 9.5f, -2.2f, 12.5f, -6.0f)
                lineToRelative(52.8f, -66.0f)
                lineToRelative(99.7f, 0.0f)
                lineToRelative(-54.3f, 162.9f)
                curveToRelative(-3.5f, 10.4f, 4.3f, 21.1f, 15.2f, 21.1f)
                lineToRelative(43.7f, 0.0f)
                curveToRelative(9.0f, 0.0f, 17.5f, -3.8f, 23.6f, -10.4f)
                lineTo(320.7f, 390.5f)
                lineTo(130.2f, 200.0f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
