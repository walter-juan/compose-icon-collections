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

public val SolidGroup.PlugCircleBolt: ImageVector
    get() {
        if (_plugCircleBolt != null) {
            return _plugCircleBolt!!
        }
        _plugCircleBolt = Builder(name = "PlugCircleBolt", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, -32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 48.7f)
                curveToRelative(-98.6f, 8.1f, -176.0f, 90.7f, -176.0f, 191.3f)
                curveToRelative(0.0f, 27.3f, 5.7f, 53.3f, 16.0f, 76.9f)
                lineToRelative(0.0f, 3.1f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -66.7f)
                curveTo(165.2f, 398.1f, 96.0f, 319.1f, 96.0f, 224.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveTo(78.3f, 96.0f, 96.0f, 96.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(352.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(529.4f, 323.0f)
                curveToRelative(-5.8f, -4.2f, -13.8f, -4.0f, -19.4f, 0.5f)
                lineToRelative(-80.0f, 64.0f)
                curveToRelative(-5.3f, 4.2f, -7.4f, 11.4f, -5.1f, 17.8f)
                reflectiveCurveTo(433.2f, 416.0f, 440.0f, 416.0f)
                lineToRelative(32.9f, 0.0f)
                lineToRelative(-15.9f, 42.4f)
                curveToRelative(-2.5f, 6.7f, -0.2f, 14.3f, 5.6f, 18.6f)
                reflectiveCurveToRelative(13.8f, 4.0f, 19.4f, -0.5f)
                lineToRelative(80.0f, -64.0f)
                curveToRelative(5.3f, -4.2f, 7.4f, -11.4f, 5.1f, -17.8f)
                reflectiveCurveTo(558.8f, 384.0f, 552.0f, 384.0f)
                lineToRelative(-32.9f, 0.0f)
                lineToRelative(15.9f, -42.4f)
                curveToRelative(2.5f, -6.7f, 0.2f, -14.3f, -5.6f, -18.6f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
