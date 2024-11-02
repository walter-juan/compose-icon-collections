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

public val SolidGroup.ToriiGate: ImageVector
    get() {
        if (_toriiGate != null) {
            return _toriiGate!!
        }
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 80.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -66.6f)
                curveTo(512.0f, 6.0f, 506.0f, 0.0f, 498.6f, 0.0f)
                curveToRelative(-1.7f, 0.0f, -3.4f, 0.3f, -5.0f, 1.0f)
                lineToRelative(-49.0f, 19.6f)
                curveTo(425.7f, 28.1f, 405.5f, 32.0f, 385.2f, 32.0f)
                lineTo(126.8f, 32.0f)
                curveToRelative(-20.4f, 0.0f, -40.5f, -3.9f, -59.4f, -11.4f)
                lineTo(18.4f, 1.0f)
                curveToRelative(-1.6f, -0.6f, -3.3f, -1.0f, -5.0f, -1.0f)
                curveTo(6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 13.4f)
                lineTo(0.0f, 80.0f)
                close()
                moveTo(64.0f, 288.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(256.0f, 0.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null
