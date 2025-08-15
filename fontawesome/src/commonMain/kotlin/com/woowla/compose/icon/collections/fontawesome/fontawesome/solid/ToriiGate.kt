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
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                lineTo(0.0f, 28.5f)
                curveTo(0.0f, 21.6f, 5.6f, 16.0f, 12.5f, 16.0f)
                curveTo(14.8f, 16.0f, 17.0f, 16.6f, 19.0f, 17.8f)
                lineTo(58.0f, 41.2f)
                curveTo(82.9f, 56.1f, 111.3f, 64.0f, 140.3f, 64.0f)
                lineToRelative(167.4f, 0.0f)
                curveToRelative(29.0f, 0.0f, 57.5f, -7.9f, 82.3f, -22.8f)
                lineToRelative(39.0f, -23.4f)
                curveToRelative(1.9f, -1.2f, 4.2f, -1.8f, 6.4f, -1.8f)
                curveToRelative(6.9f, 0.0f, 12.5f, 5.6f, 12.5f, 12.5f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                curveTo(28.7f, 160.0f, 0.0f, 131.3f, 0.0f, 96.0f)
                close()
                moveTo(128.0f, 224.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(256.0f, 224.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null
