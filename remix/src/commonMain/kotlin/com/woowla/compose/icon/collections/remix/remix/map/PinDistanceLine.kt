package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.PinDistanceLine: ImageVector
    get() {
        if (_pinDistanceLine != null) {
            return _pinDistanceLine!!
        }
        _pinDistanceLine = Builder(name = "PinDistanceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.975f, 8.975f)
                curveTo(11.342f, 7.608f, 11.342f, 5.392f, 9.975f, 4.025f)
                curveTo(8.608f, 2.658f, 6.392f, 2.658f, 5.025f, 4.025f)
                curveTo(3.658f, 5.392f, 3.658f, 7.608f, 5.025f, 8.975f)
                lineTo(7.5f, 11.45f)
                lineTo(9.975f, 8.975f)
                close()
                moveTo(7.5f, 14.278f)
                lineTo(3.611f, 10.389f)
                curveTo(1.463f, 8.241f, 1.463f, 4.759f, 3.611f, 2.611f)
                curveTo(5.759f, 0.463f, 9.241f, 0.463f, 11.389f, 2.611f)
                curveTo(13.537f, 4.759f, 13.537f, 8.241f, 11.389f, 10.389f)
                lineTo(7.5f, 14.278f)
                close()
                moveTo(7.5f, 8.0f)
                curveTo(6.672f, 8.0f, 6.0f, 7.328f, 6.0f, 6.5f)
                curveTo(6.0f, 5.672f, 6.672f, 5.0f, 7.5f, 5.0f)
                curveTo(8.328f, 5.0f, 9.0f, 5.672f, 9.0f, 6.5f)
                curveTo(9.0f, 7.328f, 8.328f, 8.0f, 7.5f, 8.0f)
                close()
                moveTo(16.5f, 20.45f)
                lineTo(18.975f, 17.975f)
                curveTo(20.342f, 16.608f, 20.342f, 14.392f, 18.975f, 13.025f)
                curveTo(17.608f, 11.658f, 15.392f, 11.658f, 14.025f, 13.025f)
                curveTo(12.658f, 14.392f, 12.658f, 16.608f, 14.025f, 17.975f)
                lineTo(16.5f, 20.45f)
                close()
                moveTo(20.389f, 19.389f)
                lineTo(16.5f, 23.278f)
                lineTo(12.611f, 19.389f)
                curveTo(10.463f, 17.241f, 10.463f, 13.759f, 12.611f, 11.611f)
                curveTo(14.759f, 9.463f, 18.241f, 9.463f, 20.389f, 11.611f)
                curveTo(22.537f, 13.759f, 22.537f, 17.241f, 20.389f, 19.389f)
                close()
                moveTo(16.5f, 17.0f)
                curveTo(15.672f, 17.0f, 15.0f, 16.328f, 15.0f, 15.5f)
                curveTo(15.0f, 14.672f, 15.672f, 14.0f, 16.5f, 14.0f)
                curveTo(17.328f, 14.0f, 18.0f, 14.672f, 18.0f, 15.5f)
                curveTo(18.0f, 16.328f, 17.328f, 17.0f, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _pinDistanceLine!!
    }

private var _pinDistanceLine: ImageVector? = null
