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

public val SolidGroup.CarTunnel: ImageVector
    get() {
        if (_carTunnel != null) {
            return _carTunnel!!
        }
        _carTunnel = Builder(name = "CarTunnel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(42.8f, 0.0f)
                curveToRelative(-6.6f, -5.9f, -10.8f, -14.4f, -10.8f, -24.0f)
                lineToRelative(0.0f, -113.1f)
                curveToRelative(0.0f, -13.5f, 3.1f, -26.8f, 9.0f, -38.9f)
                lineToRelative(39.7f, -80.8f)
                curveToRelative(9.4f, -19.1f, 28.9f, -31.3f, 50.2f, -31.3f)
                lineTo(317.0f, 224.0f)
                curveToRelative(21.3f, 0.0f, 40.8f, 12.1f, 50.2f, 31.3f)
                lineTo(407.0f, 336.0f)
                curveToRelative(5.9f, 12.1f, 9.0f, 25.4f, 9.0f, 38.9f)
                lineTo(416.0f, 488.0f)
                curveToRelative(0.0f, 9.6f, -4.2f, 18.1f, -10.8f, 24.0f)
                lineToRelative(42.8f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -192.0f)
                curveTo(512.0f, 114.6f, 397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(362.8f, 512.0f)
                curveToRelative(-6.6f, -5.9f, -10.8f, -14.4f, -10.8f, -24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 9.6f, -4.2f, 18.1f, -10.8f, 24.0f)
                lineToRelative(213.7f, 0.0f)
                close()
                moveTo(187.8f, 276.5f)
                lineToRelative(-29.3f, 59.5f)
                lineToRelative(194.9f, 0.0f)
                lineToRelative(-29.3f, -59.5f)
                curveToRelative(-1.3f, -2.7f, -4.1f, -4.5f, -7.2f, -4.5f)
                lineTo(195.0f, 272.0f)
                curveToRelative(-3.0f, 0.0f, -5.8f, 1.7f, -7.2f, 4.5f)
                close()
                moveTo(176.0f, 424.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(360.0f, 400.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _carTunnel!!
    }

private var _carTunnel: ImageVector? = null
