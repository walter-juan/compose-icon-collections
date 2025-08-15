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

public val SolidGroup.Blind: ImageVector
    get() {
        if (_blind != null) {
            return _blind!!
        }
        _blind = Builder(name = "Blind", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, -32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(160.0f, 205.3f)
                lineToRelative(-22.6f, 22.6f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                lineToRelative(0.0f, 37.5f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -37.5f)
                curveToRelative(0.0f, -25.5f, 10.1f, -49.9f, 28.1f, -67.9f)
                lineToRelative(34.4f, -34.4f)
                curveToRelative(23.2f, -23.2f, 54.6f, -36.2f, 87.3f, -36.2f)
                curveToRelative(36.1f, 0.0f, 70.3f, 15.8f, 93.8f, 43.1f)
                lineToRelative(68.6f, 80.0f)
                curveToRelative(11.5f, 13.4f, 9.9f, 33.6f, -3.5f, 45.1f)
                reflectiveCurveToRelative(-33.6f, 9.9f, -45.1f, -3.5f)
                lineToRelative(-55.7f, -65.0f)
                lineToRelative(0.0f, 118.6f)
                lineToRelative(34.5f, 29.6f)
                curveToRelative(17.7f, 15.2f, 29.3f, 36.2f, 32.6f, 59.3f)
                lineToRelative(12.6f, 88.1f)
                curveToRelative(2.5f, 17.5f, -9.7f, 33.7f, -27.2f, 36.2f)
                reflectiveCurveToRelative(-33.7f, -9.7f, -36.2f, -27.2f)
                lineToRelative(-12.6f, -88.1f)
                curveToRelative(-1.1f, -7.7f, -5.0f, -14.7f, -10.9f, -19.8f)
                lineToRelative(-71.4f, -61.2f)
                curveToRelative(-21.3f, -18.2f, -33.5f, -44.9f, -33.5f, -72.9f)
                lineToRelative(0.0f, -69.3f)
                close()
                moveTo(160.1f, 371.1f)
                curveToRelative(2.4f, 2.3f, 4.8f, 4.6f, 7.4f, 6.8f)
                lineToRelative(46.0f, 39.4f)
                lineToRelative(-2.2f, 7.6f)
                curveToRelative(-4.5f, 15.7f, -12.9f, 30.0f, -24.4f, 41.5f)
                lineToRelative(-68.3f, 68.3f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(68.3f, -68.3f)
                curveToRelative(3.8f, -3.8f, 6.6f, -8.6f, 8.1f, -13.8f)
                lineTo(160.1f, 371.0f)
                close()
                moveTo(393.6f, 308.9f)
                curveToRelative(10.6f, -8.0f, 25.6f, -5.8f, 33.6f, 4.8f)
                lineToRelative(144.0f, 192.0f)
                curveToRelative(8.0f, 10.6f, 5.8f, 25.6f, -4.8f, 33.6f)
                reflectiveCurveToRelative(-25.6f, 5.8f, -33.6f, -4.8f)
                lineToRelative(-144.0f, -192.0f)
                curveToRelative(-8.0f, -10.6f, -5.8f, -25.6f, 4.8f, -33.6f)
                close()
            }
        }
        .build()
        return _blind!!
    }

private var _blind: ImageVector? = null
