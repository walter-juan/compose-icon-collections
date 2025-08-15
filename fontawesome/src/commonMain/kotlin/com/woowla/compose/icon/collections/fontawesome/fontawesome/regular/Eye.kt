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

public val RegularGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 80.0f)
                curveTo(222.8f, 80.0f, 169.2f, 109.6f, 128.1f, 147.7f)
                curveTo(89.6f, 183.5f, 63.0f, 226.0f, 49.4f, 256.0f)
                curveTo(63.0f, 286.0f, 89.6f, 328.5f, 128.1f, 364.3f)
                curveTo(169.2f, 402.4f, 222.8f, 432.0f, 288.0f, 432.0f)
                reflectiveCurveToRelative(118.8f, -29.6f, 159.9f, -67.7f)
                curveTo(486.4f, 328.5f, 513.0f, 286.0f, 526.6f, 256.0f)
                curveTo(513.0f, 226.0f, 486.4f, 183.5f, 447.9f, 147.7f)
                curveTo(406.8f, 109.6f, 353.2f, 80.0f, 288.0f, 80.0f)
                close()
                moveTo(95.4f, 112.6f)
                curveTo(142.5f, 68.8f, 207.2f, 32.0f, 288.0f, 32.0f)
                reflectiveCurveToRelative(145.5f, 36.8f, 192.6f, 80.6f)
                curveToRelative(46.8f, 43.5f, 78.1f, 95.4f, 93.0f, 131.1f)
                curveToRelative(3.3f, 7.9f, 3.3f, 16.7f, 0.0f, 24.6f)
                curveToRelative(-14.9f, 35.7f, -46.2f, 87.7f, -93.0f, 131.1f)
                curveToRelative(-47.1f, 43.7f, -111.8f, 80.6f, -192.6f, 80.6f)
                reflectiveCurveTo(142.5f, 443.2f, 95.4f, 399.4f)
                curveToRelative(-46.8f, -43.5f, -78.1f, -95.4f, -93.0f, -131.1f)
                curveToRelative(-3.3f, -7.9f, -3.3f, -16.7f, 0.0f, -24.6f)
                curveToRelative(14.9f, -35.7f, 46.2f, -87.7f, 93.0f, -131.1f)
                close()
                moveTo(288.0f, 336.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -29.6f, -16.1f, -55.5f, -40.0f, -69.3f)
                curveToRelative(-1.4f, 59.7f, -49.6f, 107.9f, -109.3f, 109.3f)
                curveToRelative(13.8f, 23.9f, 39.7f, 40.0f, 69.3f, 40.0f)
                close()
                moveTo(208.4f, 247.6f)
                curveToRelative(2.5f, 0.3f, 5.0f, 0.4f, 7.6f, 0.4f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                curveToRelative(0.0f, -2.6f, -0.2f, -5.1f, -0.4f, -7.6f)
                curveToRelative(-37.4f, 3.9f, -67.2f, 33.7f, -71.1f, 71.1f)
                close()
                moveTo(254.0f, 132.6f)
                curveToRelative(10.8f, -3.0f, 22.2f, -4.5f, 33.9f, -4.5f)
                curveToRelative(8.8f, 0.0f, 17.5f, 0.9f, 25.8f, 2.6f)
                curveToRelative(0.3f, 0.1f, 0.5f, 0.1f, 0.8f, 0.2f)
                curveToRelative(57.9f, 12.2f, 101.4f, 63.7f, 101.4f, 125.2f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                curveToRelative(-61.6f, 0.0f, -113.0f, -43.5f, -125.2f, -101.4f)
                curveToRelative(-1.8f, -8.6f, -2.8f, -17.5f, -2.8f, -26.6f)
                curveToRelative(0.0f, -11.0f, 1.4f, -21.8f, 4.0f, -32.0f)
                curveToRelative(0.2f, -0.7f, 0.3f, -1.3f, 0.5f, -1.9f)
                curveToRelative(11.9f, -43.4f, 46.1f, -77.6f, 89.5f, -89.5f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
