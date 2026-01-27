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

public val SolidGroup.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = Builder(name = "Socks", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.8f, 0.0f)
                lineTo(176.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -17.5f, 4.7f, -33.9f, 12.8f, -48.0f)
                close()
                moveTo(128.0f, 112.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 20.1f, -9.5f, 39.1f, -25.6f, 51.2f)
                lineToRelative(-64.0f, 48.0f)
                curveToRelative(-24.2f, 18.1f, -38.4f, 46.6f, -38.4f, 76.8f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(15.4f, 0.0f, 30.5f, -3.7f, 44.0f, -10.7f)
                curveToRelative(-17.6f, -23.9f, -28.0f, -53.4f, -28.0f, -85.3f)
                curveToRelative(0.0f, -45.3f, 21.3f, -88.0f, 57.6f, -115.2f)
                lineToRelative(64.0f, -48.0f)
                curveToRelative(4.0f, -3.0f, 6.4f, -7.8f, 6.4f, -12.8f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(-112.0f, 0.0f)
                close()
                moveTo(288.0f, 112.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 20.1f, -9.5f, 39.1f, -25.6f, 51.2f)
                lineToRelative(-64.0f, 48.0f)
                curveToRelative(-24.2f, 18.1f, -38.4f, 46.6f, -38.4f, 76.8f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(20.8f, 0.0f, 41.0f, -6.7f, 57.6f, -19.2f)
                lineToRelative(115.2f, -86.4f)
                curveTo(461.0f, 382.2f, 480.0f, 344.3f, 480.0f, 304.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(-192.0f, 0.0f)
                close()
                moveTo(480.0f, 64.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(336.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(192.0f, 0.0f)
                close()
            }
        }
        .build()
        return _socks!!
    }

private var _socks: ImageVector? = null
