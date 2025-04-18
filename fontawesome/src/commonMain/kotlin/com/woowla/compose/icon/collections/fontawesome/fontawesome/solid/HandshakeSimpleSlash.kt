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

public val SolidGroup.HandshakeSimpleSlash: ImageVector
    get() {
        if (_handshakeSimpleSlash != null) {
            return _handshakeSimpleSlash!!
        }
        _handshakeSimpleSlash = Builder(name = "HandshakeSimpleSlash", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineToRelative(-135.0f, -105.8f)
                curveToRelative(-1.1f, -11.4f, -6.3f, -22.3f, -15.3f, -30.7f)
                lineToRelative(-134.2f, -123.0f)
                lineToRelative(-23.4f, 18.2f)
                lineToRelative(-26.0f, -20.3f)
                lineToRelative(77.2f, -60.1f)
                curveToRelative(7.0f, -5.4f, 17.0f, -4.2f, 22.5f, 2.8f)
                reflectiveCurveToRelative(4.2f, 17.0f, -2.8f, 22.5f)
                lineToRelative(-20.9f, 16.2f)
                lineTo(550.2f, 352.0f)
                lineToRelative(41.8f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-76.0f, 0.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(-0.7f, 0.0f)
                lineToRelative(-3.9f, -2.5f)
                lineTo(434.8f, 79.0f)
                curveToRelative(-15.3f, -9.8f, -33.2f, -15.0f, -51.4f, -15.0f)
                curveToRelative(-21.8f, 0.0f, -43.0f, 7.5f, -60.0f, 21.2f)
                lineToRelative(-89.7f, 72.6f)
                lineToRelative(-25.8f, -20.3f)
                lineToRelative(81.8f, -66.2f)
                curveToRelative(-11.6f, -4.9f, -24.1f, -7.4f, -36.8f, -7.4f)
                curveTo(234.0f, 64.0f, 215.7f, 69.6f, 200.0f, 80.0f)
                lineToRelative(-35.5f, 23.7f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(0.0f, 176.0f)
                lineTo(0.0f, 304.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(108.2f, 0.0f)
                lineToRelative(91.4f, 83.4f)
                curveToRelative(19.6f, 17.9f, 49.9f, 16.5f, 67.8f, -3.1f)
                curveToRelative(5.5f, -6.1f, 9.2f, -13.2f, 11.1f, -20.6f)
                lineToRelative(17.0f, 15.6f)
                curveToRelative(19.5f, 17.9f, 49.9f, 16.6f, 67.8f, -2.9f)
                curveToRelative(0.8f, -0.8f, 1.5f, -1.7f, 2.2f, -2.6f)
                lineTo(41.2f, 128.5f)
                curveTo(17.9f, 131.8f, 0.0f, 151.8f, 0.0f, 176.0f)
                close()
            }
        }
        .build()
        return _handshakeSimpleSlash!!
    }

private var _handshakeSimpleSlash: ImageVector? = null
