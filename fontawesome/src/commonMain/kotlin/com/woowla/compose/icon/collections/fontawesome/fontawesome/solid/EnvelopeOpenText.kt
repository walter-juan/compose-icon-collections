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

public val SolidGroup.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 33.9f)
                lineTo(96.4f, 175.8f)
                lineTo(254.5f, 293.0f)
                curveToRelative(5.3f, 3.9f, 11.2f, 6.9f, 17.5f, 8.7f)
                lineTo(272.0f, 464.0f)
                curveToRelative(0.0f, 5.5f, 0.5f, 10.8f, 1.3f, 16.0f)
                lineTo(96.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -239.9f)
                curveToRelative(0.0f, -20.3f, 9.6f, -39.4f, 25.9f, -51.4f)
                lineTo(254.5f, -21.0f)
                curveToRelative(9.7f, -7.2f, 21.4f, -11.0f, 33.5f, -11.0f)
                reflectiveCurveToRelative(23.8f, 3.9f, 33.5f, 11.0f)
                lineTo(518.1f, 124.7f)
                curveToRelative(7.2f, 5.3f, 13.1f, 12.0f, 17.4f, 19.6f)
                curveToRelative(-2.5f, -0.2f, -5.0f, -0.3f, -7.5f, -0.3f)
                lineTo(436.6f, 144.0f)
                lineTo(288.0f, 33.9f)
                close()
                moveTo(320.0f, 240.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-160.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -224.0f)
                close()
                moveTo(400.0f, 256.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-96.0f, 0.0f)
                close()
                moveTo(400.0f, 352.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(56.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-56.0f, 0.0f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
