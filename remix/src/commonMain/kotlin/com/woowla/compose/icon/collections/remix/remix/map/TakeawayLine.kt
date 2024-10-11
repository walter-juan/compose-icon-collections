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

public val MapGroup.TakeawayLine: ImageVector
    get() {
        if (_takeawayLine != null) {
            return _takeawayLine!!
        }
        _takeawayLine = Builder(name = "TakeawayLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                curveTo(16.552f, 1.0f, 17.0f, 1.448f, 17.0f, 2.0f)
                verticalLineTo(2.999f)
                lineTo(22.0f, 3.0f)
                verticalLineTo(9.0f)
                lineTo(19.98f, 8.999f)
                lineTo(22.747f, 16.595f)
                curveTo(22.91f, 17.032f, 23.0f, 17.505f, 23.0f, 17.999f)
                curveTo(23.0f, 20.208f, 21.209f, 21.999f, 19.0f, 21.999f)
                curveTo(17.137f, 21.999f, 15.571f, 20.725f, 15.127f, 19.001f)
                lineTo(10.874f, 19.001f)
                curveTo(10.429f, 20.726f, 8.864f, 22.0f, 7.0f, 22.0f)
                curveTo(5.055f, 22.0f, 3.434f, 20.612f, 3.075f, 18.772f)
                curveTo(2.436f, 18.439f, 2.0f, 17.77f, 2.0f, 17.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(10.552f, 3.0f, 11.0f, 3.448f, 11.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(11.0f, 12.513f, 11.386f, 12.936f, 11.883f, 12.993f)
                lineTo(12.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.513f, 13.0f, 14.936f, 12.614f, 14.993f, 12.117f)
                lineTo(15.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(5.895f, 16.0f, 5.0f, 16.895f, 5.0f, 18.0f)
                curveTo(5.0f, 19.105f, 5.895f, 20.0f, 7.0f, 20.0f)
                curveTo(8.105f, 20.0f, 9.0f, 19.105f, 9.0f, 18.0f)
                curveTo(9.0f, 16.895f, 8.105f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(19.0f, 15.999f)
                curveTo(17.895f, 15.999f, 17.0f, 16.894f, 17.0f, 17.999f)
                curveTo(17.0f, 19.104f, 17.895f, 19.999f, 19.0f, 19.999f)
                curveTo(20.105f, 19.999f, 21.0f, 19.104f, 21.0f, 17.999f)
                curveTo(21.0f, 16.894f, 20.105f, 15.999f, 19.0f, 15.999f)
                close()
                moveTo(17.852f, 8.999f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 13.657f, 15.657f, 15.0f, 14.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(10.694f, 15.0f, 9.583f, 14.166f, 9.171f, 13.001f)
                lineTo(4.0f, 13.0f)
                verticalLineTo(15.354f)
                curveTo(4.733f, 14.524f, 5.805f, 14.0f, 7.0f, 14.0f)
                curveTo(8.864f, 14.0f, 10.43f, 15.275f, 10.874f, 17.0f)
                horizontalLineTo(15.126f)
                curveTo(15.569f, 15.274f, 17.136f, 13.999f, 19.0f, 13.999f)
                curveTo(19.237f, 13.999f, 19.47f, 14.02f, 19.696f, 14.059f)
                lineTo(17.852f, 8.999f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _takeawayLine!!
    }

private var _takeawayLine: ImageVector? = null
