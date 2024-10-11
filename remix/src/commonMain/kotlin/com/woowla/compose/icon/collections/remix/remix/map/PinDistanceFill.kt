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

public val MapGroup.PinDistanceFill: ImageVector
    get() {
        if (_pinDistanceFill != null) {
            return _pinDistanceFill!!
        }
        _pinDistanceFill = Builder(name = "PinDistanceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.389f, 10.389f)
                lineTo(7.5f, 14.278f)
                lineTo(3.611f, 10.389f)
                curveTo(1.463f, 8.241f, 1.463f, 4.759f, 3.611f, 2.611f)
                curveTo(5.759f, 0.463f, 9.241f, 0.463f, 11.389f, 2.611f)
                curveTo(13.537f, 4.759f, 13.537f, 8.241f, 11.389f, 10.389f)
                close()
                moveTo(7.5f, 8.5f)
                curveTo(8.605f, 8.5f, 9.5f, 7.605f, 9.5f, 6.5f)
                curveTo(9.5f, 5.395f, 8.605f, 4.5f, 7.5f, 4.5f)
                curveTo(6.395f, 4.5f, 5.5f, 5.395f, 5.5f, 6.5f)
                curveTo(5.5f, 7.605f, 6.395f, 8.5f, 7.5f, 8.5f)
                close()
                moveTo(20.389f, 19.389f)
                lineTo(16.5f, 23.278f)
                lineTo(12.611f, 19.389f)
                curveTo(10.463f, 17.241f, 10.463f, 13.759f, 12.611f, 11.611f)
                curveTo(14.759f, 9.463f, 18.241f, 9.463f, 20.389f, 11.611f)
                curveTo(22.537f, 13.759f, 22.537f, 17.241f, 20.389f, 19.389f)
                close()
                moveTo(16.5f, 17.5f)
                curveTo(17.605f, 17.5f, 18.5f, 16.605f, 18.5f, 15.5f)
                curveTo(18.5f, 14.395f, 17.605f, 13.5f, 16.5f, 13.5f)
                curveTo(15.395f, 13.5f, 14.5f, 14.395f, 14.5f, 15.5f)
                curveTo(14.5f, 16.605f, 15.395f, 17.5f, 16.5f, 17.5f)
                close()
            }
        }
        .build()
        return _pinDistanceFill!!
    }

private var _pinDistanceFill: ImageVector? = null
