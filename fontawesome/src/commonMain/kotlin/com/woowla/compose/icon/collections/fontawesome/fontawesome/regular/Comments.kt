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

public val RegularGroup.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.2f, 258.7f)
                curveToRelative(6.1f, -15.2f, 4.0f, -32.6f, -5.6f, -45.9f)
                curveToRelative(-14.5f, -20.1f, -22.6f, -43.7f, -22.6f, -68.8f)
                curveToRelative(0.0f, -66.8f, 60.5f, -128.0f, 144.0f, -128.0f)
                reflectiveCurveToRelative(144.0f, 61.2f, 144.0f, 128.0f)
                reflectiveCurveToRelative(-60.5f, 128.0f, -144.0f, 128.0f)
                curveToRelative(-15.9f, 0.0f, -31.1f, -2.3f, -45.3f, -6.5f)
                curveToRelative(-10.3f, -3.1f, -21.4f, -2.5f, -31.4f, 1.5f)
                lineToRelative(-50.4f, 20.2f)
                lineToRelative(11.4f, -28.5f)
                close()
                moveTo(0.0f, 144.0f)
                curveToRelative(0.0f, 35.8f, 11.6f, 69.1f, 31.7f, 96.8f)
                lineTo(1.9f, 315.2f)
                curveToRelative(-1.3f, 3.2f, -1.9f, 6.6f, -1.9f, 10.0f)
                curveToRelative(0.0f, 14.8f, 12.0f, 26.8f, 26.8f, 26.8f)
                curveToRelative(3.4f, 0.0f, 6.8f, -0.7f, 10.0f, -1.9f)
                lineToRelative(96.3f, -38.5f)
                curveToRelative(18.6f, 5.5f, 38.4f, 8.4f, 58.9f, 8.4f)
                curveToRelative(106.0f, 0.0f, 192.0f, -78.8f, 192.0f, -176.0f)
                reflectiveCurveTo(298.0f, -32.0f, 192.0f, -32.0f)
                reflectiveCurveTo(0.0f, 46.8f, 0.0f, 144.0f)
                close()
                moveTo(384.0f, 512.0f)
                curveToRelative(20.6f, 0.0f, 40.3f, -3.0f, 58.9f, -8.4f)
                lineToRelative(96.3f, 38.5f)
                curveToRelative(3.2f, 1.3f, 6.6f, 1.9f, 10.0f, 1.9f)
                curveToRelative(14.8f, 0.0f, 26.8f, -12.0f, 26.8f, -26.8f)
                curveToRelative(0.0f, -3.4f, -0.7f, -6.8f, -1.9f, -10.0f)
                lineToRelative(-29.7f, -74.4f)
                curveToRelative(20.0f, -27.8f, 31.7f, -61.1f, 31.7f, -96.8f)
                curveToRelative(0.0f, -82.4f, -61.7f, -151.5f, -145.0f, -170.7f)
                curveToRelative(-1.6f, 16.3f, -5.1f, 31.9f, -10.1f, 46.9f)
                curveToRelative(63.9f, 14.8f, 107.2f, 67.3f, 107.2f, 123.9f)
                curveToRelative(0.0f, 25.1f, -8.1f, 48.7f, -22.6f, 68.8f)
                curveToRelative(-9.6f, 13.3f, -11.7f, 30.6f, -5.6f, 45.9f)
                lineToRelative(11.4f, 28.5f)
                lineToRelative(-50.4f, -20.2f)
                curveToRelative(-10.0f, -4.0f, -21.1f, -4.5f, -31.4f, -1.5f)
                curveToRelative(-14.2f, 4.2f, -29.4f, 6.5f, -45.3f, 6.5f)
                curveToRelative(-72.2f, 0.0f, -127.1f, -45.7f, -140.7f, -101.2f)
                curveToRelative(-15.6f, 3.2f, -31.7f, 5.0f, -48.1f, 5.2f)
                curveToRelative(16.4f, 81.9f, 94.7f, 144.0f, 188.8f, 144.0f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
