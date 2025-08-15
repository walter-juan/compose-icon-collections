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

public val SolidGroup.HouseLaptop: ImageVector
    get() {
        if (_houseLaptop != null) {
            return _houseLaptop!!
        }
        _houseLaptop = Builder(name = "HouseLaptop", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 240.0f)
                lineToRelative(19.9f, 0.0f)
                curveToRelative(15.5f, 0.0f, 28.1f, -12.6f, 28.1f, -28.1f)
                curveToRelative(0.0f, -7.6f, -3.1f, -14.9f, -8.6f, -20.2f)
                lineTo(283.5f, -4.9f)
                curveTo(276.1f, -12.0f, 266.3f, -16.0f, 256.0f, -16.0f)
                reflectiveCurveToRelative(-20.1f, 4.0f, -27.5f, 11.1f)
                lineTo(24.6f, 191.7f)
                curveTo(19.1f, 197.0f, 16.0f, 204.3f, 16.0f, 211.9f)
                curveTo(16.0f, 227.4f, 28.6f, 240.0f, 44.1f, 240.0f)
                lineToRelative(19.9f, 0.0f)
                lineToRelative(0.0f, 144.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(85.7f, 0.0f)
                curveToRelative(7.4f, -6.6f, 16.4f, -11.4f, 26.3f, -14.0f)
                lineToRelative(0.0f, -130.0f)
                curveToRelative(0.0f, -5.5f, 0.7f, -10.9f, 2.0f, -16.0f)
                lineToRelative(-10.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(144.0f, 0.0f)
                close()
                moveTo(352.0f, 352.0f)
                lineToRelative(160.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                close()
                moveTo(288.0f, 320.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-224.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _houseLaptop!!
    }

private var _houseLaptop: ImageVector? = null
