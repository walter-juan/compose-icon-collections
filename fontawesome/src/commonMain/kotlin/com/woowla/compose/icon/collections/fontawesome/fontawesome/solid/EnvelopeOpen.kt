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

public val SolidGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.4f, 175.8f)
                lineTo(256.0f, 33.9f)
                lineTo(447.6f, 175.8f)
                lineTo(289.5f, 293.0f)
                curveToRelative(-9.7f, 7.2f, -21.4f, 11.0f, -33.5f, 11.0f)
                reflectiveCurveToRelative(-23.8f, -3.9f, -33.5f, -11.0f)
                lineTo(64.4f, 175.8f)
                close()
                moveTo(256.0f, -32.0f)
                curveToRelative(-12.1f, 0.0f, -23.8f, 3.9f, -33.5f, 11.0f)
                lineTo(25.9f, 124.7f)
                curveTo(9.6f, 136.8f, 0.0f, 155.8f, 0.0f, 176.1f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -239.9f)
                curveToRelative(0.0f, -20.3f, -9.6f, -39.4f, -25.9f, -51.4f)
                lineTo(289.5f, -21.0f)
                curveToRelative(-9.7f, -7.2f, -21.4f, -11.0f, -33.5f, -11.0f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
