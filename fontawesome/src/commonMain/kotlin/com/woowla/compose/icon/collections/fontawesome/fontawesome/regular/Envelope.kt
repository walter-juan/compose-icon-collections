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

public val RegularGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.4f, 64.0f)
                curveTo(27.5f, 64.0f, 0.0f, 91.5f, 0.0f, 125.4f)
                curveTo(0.0f, 126.3f, 0.0f, 127.1f, 0.1f, 128.0f)
                lineTo(0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -256.0f)
                lineToRelative(-0.1f, 0.0f)
                curveToRelative(0.0f, -0.9f, 0.1f, -1.7f, 0.1f, -2.6f)
                curveToRelative(0.0f, -33.9f, -27.5f, -61.4f, -61.4f, -61.4f)
                lineTo(61.4f, 64.0f)
                close()
                moveTo(464.0f, 192.3f)
                lineTo(464.0f, 384.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 400.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -191.7f)
                lineToRelative(154.8f, 117.4f)
                curveToRelative(31.4f, 23.9f, 74.9f, 23.9f, 106.4f, 0.0f)
                lineTo(464.0f, 192.3f)
                close()
                moveTo(48.0f, 125.4f)
                curveTo(48.0f, 118.0f, 54.0f, 112.0f, 61.4f, 112.0f)
                lineToRelative(389.2f, 0.0f)
                curveToRelative(7.4f, 0.0f, 13.4f, 6.0f, 13.4f, 13.4f)
                curveToRelative(0.0f, 4.2f, -2.0f, 8.2f, -5.3f, 10.7f)
                lineTo(280.2f, 271.5f)
                curveToRelative(-14.3f, 10.8f, -34.1f, 10.8f, -48.4f, 0.0f)
                lineTo(53.3f, 136.1f)
                curveToRelative(-3.3f, -2.5f, -5.3f, -6.5f, -5.3f, -10.7f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
