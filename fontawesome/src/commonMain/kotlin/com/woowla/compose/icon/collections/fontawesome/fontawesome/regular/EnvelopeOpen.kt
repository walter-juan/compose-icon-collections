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

public val RegularGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.5f, 64.0f, -63.9f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.4f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 164.0f)
                curveToRelative(0.1f, -15.5f, 7.8f, -30.0f, 20.5f, -38.8f)
                lineTo(206.0f, -2.7f)
                curveToRelative(30.1f, -20.7f, 69.8f, -20.7f, 99.9f, 0.0f)
                lineTo(491.5f, 125.2f)
                curveToRelative(12.8f, 8.8f, 20.4f, 23.3f, 20.5f, 38.8f)
                lineToRelative(0.0f, 252.0f)
                close()
                moveTo(64.0f, 432.0f)
                lineToRelative(384.1f, 0.0f)
                curveToRelative(8.8f, 0.0f, 15.9f, -7.1f, 15.9f, -16.0f)
                lineToRelative(0.0f, -191.7f)
                lineToRelative(-154.8f, 117.4f)
                curveToRelative(-31.4f, 23.9f, -74.9f, 23.9f, -106.4f, 0.0f)
                lineTo(48.0f, 224.3f)
                lineTo(48.0f, 416.0f)
                curveToRelative(0.0f, 8.9f, 7.2f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(463.6f, 164.4f)
                lineTo(278.7f, 36.8f)
                curveToRelative(-13.7f, -9.4f, -31.7f, -9.4f, -45.4f, 0.0f)
                lineTo(48.4f, 164.4f)
                lineTo(231.8f, 303.5f)
                curveToRelative(14.3f, 10.8f, 34.1f, 10.8f, 48.4f, 0.0f)
                lineTo(463.6f, 164.4f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
