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

public val SolidGroup.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.5f, -32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(123.6f, 176.0f)
                curveToRelative(-3.3f, 0.0f, -6.2f, 2.0f, -7.4f, 5.0f)
                lineTo(94.2f, 235.9f)
                curveToRelative(-6.6f, 16.4f, -25.2f, 24.4f, -41.6f, 17.8f)
                reflectiveCurveToRelative(-24.4f, -25.2f, -17.8f, -41.6f)
                lineToRelative(21.9f, -54.9f)
                curveTo(67.7f, 129.9f, 94.1f, 112.0f, 123.6f, 112.0f)
                lineToRelative(97.3f, 0.0f)
                curveToRelative(28.5f, 0.0f, 54.8f, 15.1f, 69.1f, 39.7f)
                lineToRelative(32.8f, 56.3f)
                lineToRelative(61.6f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-61.6f, 0.0f)
                curveToRelative(-22.8f, 0.0f, -43.8f, -12.1f, -55.3f, -31.8f)
                lineToRelative(-10.0f, -17.1f)
                lineToRelative(-20.7f, 70.4f)
                lineToRelative(75.4f, 22.6f)
                curveToRelative(27.7f, 8.3f, 41.8f, 39.0f, 30.1f, 65.5f)
                lineTo(285.7f, 509.0f)
                curveToRelative(-7.2f, 16.2f, -26.1f, 23.4f, -42.2f, 16.2f)
                reflectiveCurveToRelative(-23.4f, -26.1f, -16.2f, -42.2f)
                lineToRelative(49.2f, -110.8f)
                lineToRelative(-95.9f, -28.8f)
                curveToRelative(-32.7f, -9.8f, -52.0f, -43.7f, -43.7f, -76.8f)
                lineToRelative(22.7f, -90.6f)
                lineToRelative(-35.9f, 0.0f)
                close()
                moveTo(115.6f, 357.0f)
                curveToRelative(13.3f, 14.9f, 30.7f, 26.3f, 51.2f, 32.4f)
                lineToRelative(4.7f, 1.4f)
                lineToRelative(-6.9f, 19.3f)
                curveToRelative(-5.8f, 16.3f, -16.0f, 30.8f, -29.3f, 41.8f)
                lineTo(52.9f, 519.8f)
                curveToRelative(-13.6f, 11.2f, -33.8f, 9.3f, -45.0f, -4.3f)
                reflectiveCurveToRelative(-9.3f, -33.8f, 4.3f, -45.0f)
                lineToRelative(82.4f, -67.9f)
                curveToRelative(4.5f, -3.7f, 7.8f, -8.5f, 9.8f, -13.9f)
                lineTo(115.6f, 357.0f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
