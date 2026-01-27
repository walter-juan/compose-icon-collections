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

public val SolidGroup.VolumeControlPhone: ImageVector
    get() {
        if (_volumeControlPhone != null) {
            return _volumeControlPhone!!
        }
        _volumeControlPhone = Builder(name = "VolumeControlPhone", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, -32.0f)
                curveToRelative(128.1f, 0.0f, 232.0f, 103.9f, 232.0f, 232.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -101.6f, -82.4f, -184.0f, -184.0f, -184.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(352.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(320.0f, 88.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                curveToRelative(75.1f, 0.0f, 136.0f, 60.9f, 136.0f, 136.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(144.1f, 1.4f)
                curveToRelative(19.7f, -5.4f, 40.3f, 4.7f, 48.1f, 23.5f)
                lineToRelative(40.5f, 97.3f)
                curveToRelative(6.9f, 16.5f, 2.1f, 35.6f, -11.8f, 47.0f)
                lineToRelative(-44.1f, 36.1f)
                curveToRelative(32.5f, 71.6f, 89.0f, 130.0f, 159.3f, 164.9f)
                lineTo(374.7f, 323.0f)
                curveToRelative(11.3f, -13.9f, 30.4f, -18.6f, 47.0f, -11.8f)
                lineTo(519.0f, 351.8f)
                curveToRelative(18.8f, 7.8f, 28.9f, 28.4f, 23.5f, 48.1f)
                lineToRelative(-1.5f, 5.5f)
                curveTo(523.4f, 470.1f, 460.9f, 525.3f, 384.6f, 509.2f)
                curveTo(209.6f, 472.1f, 71.9f, 334.4f, 34.8f, 159.4f)
                curveTo(18.7f, 83.1f, 73.9f, 20.6f, 138.5f, 2.9f)
                lineToRelative(5.5f, -1.5f)
                close()
            }
        }
        .build()
        return _volumeControlPhone!!
    }

private var _volumeControlPhone: ImageVector? = null
