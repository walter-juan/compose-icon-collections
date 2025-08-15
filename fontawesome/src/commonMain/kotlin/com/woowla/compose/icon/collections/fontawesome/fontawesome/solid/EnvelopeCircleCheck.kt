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

public val SolidGroup.EnvelopeCircleCheck: ImageVector
    get() {
        if (_envelopeCircleCheck != null) {
            return _envelopeCircleCheck!!
        }
        _envelopeCircleCheck = Builder(name = "EnvelopeCircleCheck", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(416.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 81.4f)
                curveToRelative(-24.4f, -11.2f, -51.4f, -17.4f, -80.0f, -17.4f)
                curveToRelative(-87.7f, 0.0f, -161.7f, 58.8f, -184.7f, 139.2f)
                curveToRelative(-7.1f, -1.3f, -14.1f, -4.2f, -20.1f, -8.8f)
                lineToRelative(-208.0f, -156.0f)
                curveTo(71.1f, 141.3f, 64.0f, 127.1f, 64.0f, 112.0f)
                close()
                moveTo(304.0f, 368.0f)
                curveToRelative(0.0f, 28.6f, 6.2f, 55.6f, 17.4f, 80.0f)
                lineTo(128.0f, 448.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -188.0f)
                lineToRelative(198.4f, 148.8f)
                curveToRelative(12.6f, 9.4f, 26.9f, 15.4f, 41.7f, 17.9f)
                curveToRelative(0.0f, 1.8f, -0.1f, 3.5f, -0.1f, 5.3f)
                close()
                moveTo(352.0f, 368.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(553.4f, 307.1f)
                curveToRelative(-7.1f, -5.2f, -17.2f, -3.6f, -22.4f, 3.5f)
                lineToRelative(-53.0f, 72.9f)
                lineToRelative(-26.8f, -26.8f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(40.0f, 40.0f)
                curveToRelative(3.3f, 3.3f, 7.9f, 5.0f, 12.6f, 4.6f)
                reflectiveCurveToRelative(8.9f, -2.8f, 11.7f, -6.5f)
                lineToRelative(64.0f, -88.0f)
                curveToRelative(5.2f, -7.1f, 3.6f, -17.2f, -3.5f, -22.3f)
                close()
            }
        }
        .build()
        return _envelopeCircleCheck!!
    }

private var _envelopeCircleCheck: ImageVector? = null
