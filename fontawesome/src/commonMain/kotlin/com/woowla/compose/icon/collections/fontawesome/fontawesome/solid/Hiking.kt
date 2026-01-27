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

public val SolidGroup.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, -32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(128.0f, 173.6f)
                curveToRelative(0.0f, -34.0f, 27.6f, -61.6f, 61.6f, -61.6f)
                curveToRelative(20.3f, 0.0f, 39.7f, 8.1f, 54.0f, 22.4f)
                lineToRelative(48.2f, 48.2f)
                curveToRelative(6.0f, 6.0f, 14.1f, 9.4f, 22.6f, 9.4f)
                lineToRelative(37.5f, 0.0f)
                curveToRelative(5.8f, 0.0f, 11.3f, 1.6f, 16.0f, 4.3f)
                lineToRelative(0.0f, -76.3f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 400.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -268.3f)
                curveToRelative(-4.7f, 2.7f, -10.2f, 4.3f, -16.0f, 4.3f)
                lineToRelative(-37.5f, 0.0f)
                curveToRelative(-25.5f, 0.0f, -49.9f, -10.1f, -67.9f, -28.1f)
                lineToRelative(-6.6f, -6.6f)
                lineToRelative(0.0f, 109.2f)
                lineToRelative(34.5f, 29.6f)
                curveToRelative(17.7f, 15.2f, 29.3f, 36.2f, 32.6f, 59.3f)
                lineToRelative(12.6f, 88.1f)
                curveToRelative(2.5f, 17.5f, -9.7f, 33.7f, -27.2f, 36.2f)
                reflectiveCurveToRelative(-33.7f, -9.7f, -36.2f, -27.2f)
                lineToRelative(-12.6f, -88.1f)
                curveToRelative(-1.1f, -7.7f, -5.0f, -14.7f, -10.9f, -19.8f)
                lineToRelative(-71.4f, -61.2f)
                curveToRelative(-21.3f, -18.2f, -33.5f, -44.9f, -33.5f, -72.9f)
                lineToRelative(0.0f, -101.0f)
                close()
                moveTo(123.2f, 377.3f)
                curveToRelative(2.3f, 2.3f, 4.7f, 4.4f, 7.1f, 6.5f)
                lineToRelative(44.9f, 38.5f)
                curveToRelative(-3.6f, 8.4f, -8.5f, 16.3f, -14.4f, 23.4f)
                lineTo(88.6f, 532.5f)
                curveToRelative(-11.3f, 13.6f, -31.5f, 15.4f, -45.1f, 4.1f)
                reflectiveCurveToRelative(-15.4f, -31.5f, -4.1f, -45.1f)
                lineToRelative(72.3f, -86.7f)
                curveToRelative(2.6f, -3.1f, 4.5f, -6.6f, 5.8f, -10.4f)
                lineToRelative(5.7f, -17.1f)
                close()
                moveTo(0.0f, 160.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
