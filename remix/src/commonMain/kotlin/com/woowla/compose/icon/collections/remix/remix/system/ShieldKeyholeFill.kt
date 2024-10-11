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

public val SystemGroup.ShieldKeyholeFill: ImageVector
    get() {
        if (_shieldKeyholeFill != null) {
            return _shieldKeyholeFill!!
        }
        _shieldKeyholeFill = Builder(name = "ShieldKeyholeFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(20.217f, 2.826f)
                curveTo(20.674f, 2.928f, 21.0f, 3.333f, 21.0f, 3.802f)
                verticalLineTo(13.789f)
                curveTo(21.0f, 15.795f, 19.997f, 17.668f, 18.328f, 18.781f)
                lineTo(12.0f, 23.0f)
                lineTo(5.672f, 18.781f)
                curveTo(4.003f, 17.668f, 3.0f, 15.795f, 3.0f, 13.789f)
                verticalLineTo(3.802f)
                curveTo(3.0f, 3.333f, 3.326f, 2.928f, 3.783f, 2.826f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(10.895f, 7.0f, 10.0f, 7.895f, 10.0f, 9.0f)
                curveTo(10.0f, 9.74f, 10.402f, 10.387f, 11.0f, 10.732f)
                lineTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                lineTo(13.001f, 10.732f)
                curveTo(13.598f, 10.386f, 14.0f, 9.74f, 14.0f, 9.0f)
                curveTo(14.0f, 7.895f, 13.105f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _shieldKeyholeFill!!
    }

private var _shieldKeyholeFill: ImageVector? = null
