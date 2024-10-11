package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.ShieldUserLine: ImageVector
    get() {
        if (_shieldUserLine != null) {
            return _shieldUserLine!!
        }
        _shieldUserLine = Builder(name = "ShieldUserLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.783f, 2.826f)
                lineTo(12.0f, 1.0f)
                lineTo(20.217f, 2.826f)
                curveTo(20.674f, 2.928f, 21.0f, 3.333f, 21.0f, 3.802f)
                verticalLineTo(13.789f)
                curveTo(21.0f, 15.795f, 19.997f, 17.668f, 18.328f, 18.781f)
                lineTo(12.0f, 23.0f)
                lineTo(5.672f, 18.781f)
                curveTo(4.003f, 17.668f, 3.0f, 15.795f, 3.0f, 13.789f)
                verticalLineTo(3.802f)
                curveTo(3.0f, 3.333f, 3.326f, 2.928f, 3.783f, 2.826f)
                close()
                moveTo(5.0f, 4.604f)
                verticalLineTo(13.789f)
                curveTo(5.0f, 15.126f, 5.668f, 16.375f, 6.781f, 17.117f)
                lineTo(12.0f, 20.596f)
                lineTo(17.219f, 17.117f)
                curveTo(18.332f, 16.375f, 19.0f, 15.126f, 19.0f, 13.789f)
                verticalLineTo(4.604f)
                lineTo(12.0f, 3.049f)
                lineTo(5.0f, 4.604f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(10.619f, 11.0f, 9.5f, 9.881f, 9.5f, 8.5f)
                curveTo(9.5f, 7.119f, 10.619f, 6.0f, 12.0f, 6.0f)
                curveTo(13.381f, 6.0f, 14.5f, 7.119f, 14.5f, 8.5f)
                curveTo(14.5f, 9.881f, 13.381f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(7.527f, 16.0f)
                curveTo(7.776f, 13.75f, 9.684f, 12.0f, 12.0f, 12.0f)
                curveTo(14.316f, 12.0f, 16.224f, 13.75f, 16.472f, 16.0f)
                horizontalLineTo(7.527f)
                close()
            }
        }
        .build()
        return _shieldUserLine!!
    }

private var _shieldUserLine: ImageVector? = null