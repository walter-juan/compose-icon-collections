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

public val SolidGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.9f, 85.2f)
                lineTo(152.3f, 214.8f)
                curveToRelative(-4.6f, 5.1f, -4.4f, 13.0f, 0.5f, 17.9f)
                curveToRelative(30.5f, 30.5f, 80.0f, 30.5f, 110.5f, 0.0f)
                lineToRelative(31.8f, -31.8f)
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
                close()
                moveTo(116.6f, 182.7f)
                lineTo(223.4f, 64.0f)
                lineTo(183.8f, 64.0f)
                curveToRelative(-25.5f, 0.0f, -49.9f, 10.1f, -67.9f, 28.1f)
                lineTo(112.0f, 96.0f)
                lineTo(0.0f, 32.0f)
                lineTo(0.0f, 320.0f)
                lineTo(156.4f, 450.3f)
                curveToRelative(23.0f, 19.2f, 52.0f, 29.7f, 81.9f, 29.7f)
                lineToRelative(15.7f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(41.0f, 41.0f)
                lineToRelative(9.0f, 0.0f)
                curveToRelative(19.1f, 0.0f, 37.8f, -4.3f, 54.8f, -12.3f)
                lineTo(359.0f, 441.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                lineToRelative(17.5f, -17.5f)
                curveToRelative(8.9f, -8.9f, 11.5f, -21.8f, 7.6f, -33.1f)
                lineToRelative(-137.9f, -136.8f)
                lineToRelative(-14.9f, 14.9f)
                curveToRelative(-49.3f, 49.3f, -129.1f, 49.3f, -178.4f, 0.0f)
                curveToRelative(-23.0f, -23.0f, -23.9f, -59.9f, -2.2f, -84.0f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
