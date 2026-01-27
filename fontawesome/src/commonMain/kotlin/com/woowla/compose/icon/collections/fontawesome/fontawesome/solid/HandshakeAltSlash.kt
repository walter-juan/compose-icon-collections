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

public val SolidGroup.HandshakeAltSlash: ImageVector
    get() {
        if (_handshakeAltSlash != null) {
            return _handshakeAltSlash!!
        }
        _handshakeAltSlash = Builder(name = "HandshakeAltSlash", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-288.0f, -288.0f)
                lineToRelative(14.2f, -14.2f)
                curveToRelative(4.2f, -4.2f, 9.5f, -6.5f, 14.9f, -6.9f)
                curveToRelative(6.8f, -0.6f, 13.8f, 1.7f, 19.0f, 6.9f)
                lineTo(505.6f, 376.0f)
                lineTo(576.0f, 320.0f)
                lineTo(576.0f, 32.0f)
                lineTo(464.0f, 96.0f)
                lineTo(440.2f, 80.1f)
                curveTo(424.4f, 69.6f, 405.9f, 64.0f, 386.9f, 64.0f)
                lineToRelative(-70.4f, 0.0f)
                curveToRelative(-1.1f, 0.0f, -2.3f, 0.0f, -3.4f, 0.1f)
                curveToRelative(-16.9f, 0.9f, -32.8f, 8.5f, -44.2f, 21.1f)
                lineToRelative(-55.8f, 62.1f)
                lineToRelative(-34.0f, -34.0f)
                lineToRelative(44.3f, -49.2f)
                lineToRelative(-39.7f, 0.0f)
                curveToRelative(-15.3f, 0.0f, -30.1f, 3.6f, -43.5f, 10.4f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(0.0f, 69.8f)
                lineTo(0.0f, 320.0f)
                lineTo(156.4f, 450.3f)
                curveToRelative(23.0f, 19.2f, 52.0f, 29.7f, 81.9f, 29.7f)
                lineToRelative(15.7f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(41.0f, 41.0f)
                lineToRelative(9.0f, 0.0f)
                curveToRelative(22.2f, 0.0f, 43.8f, -5.8f, 62.8f, -16.4f)
                lineTo(0.0f, 69.8f)
                close()
            }
        }
        .build()
        return _handshakeAltSlash!!
    }

private var _handshakeAltSlash: ImageVector? = null
