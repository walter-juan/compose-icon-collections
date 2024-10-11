package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.Glasses2Fill: ImageVector
    get() {
        if (_glasses2Fill != null) {
            return _glasses2Fill!!
        }
        _glasses2Fill = Builder(name = "Glasses2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.031f, 10.976f)
                curveTo(3.07f, 9.495f, 3.158f, 8.309f, 3.356f, 7.321f)
                curveTo(3.687f, 5.663f, 4.31f, 4.662f, 5.555f, 3.832f)
                lineTo(4.446f, 2.168f)
                curveTo(2.691f, 3.338f, 1.813f, 4.837f, 1.394f, 6.929f)
                curveTo(1.0f, 8.901f, 1.0f, 11.484f, 1.0f, 14.88f)
                verticalLineTo(14.88f)
                lineTo(1.0f, 14.999f)
                curveTo(1.0f, 15.0f, 1.0f, 15.0f, 1.0f, 15.0f)
                curveTo(1.0f, 17.761f, 3.239f, 20.0f, 6.0f, 20.0f)
                curveTo(8.761f, 20.0f, 11.0f, 17.761f, 11.0f, 15.0f)
                curveTo(11.0f, 14.726f, 10.978f, 14.457f, 10.935f, 14.194f)
                curveTo(11.266f, 14.069f, 11.624f, 14.0f, 12.0f, 14.0f)
                curveTo(12.376f, 14.0f, 12.734f, 14.069f, 13.065f, 14.194f)
                curveTo(13.022f, 14.457f, 13.0f, 14.726f, 13.0f, 15.0f)
                curveTo(13.0f, 17.761f, 15.239f, 20.0f, 18.0f, 20.0f)
                curveTo(20.761f, 20.0f, 23.0f, 17.761f, 23.0f, 15.0f)
                verticalLineTo(14.88f)
                curveTo(23.0f, 11.484f, 23.0f, 8.901f, 22.606f, 6.929f)
                curveTo(22.187f, 4.837f, 21.31f, 3.338f, 19.555f, 2.168f)
                lineTo(18.446f, 3.832f)
                curveTo(19.691f, 4.662f, 20.313f, 5.663f, 20.645f, 7.321f)
                curveTo(20.842f, 8.309f, 20.93f, 9.495f, 20.969f, 10.976f)
                curveTo(20.139f, 10.363f, 19.112f, 10.0f, 18.0f, 10.0f)
                curveTo(16.222f, 10.0f, 14.662f, 10.928f, 13.776f, 12.325f)
                curveTo(13.223f, 12.115f, 12.625f, 12.0f, 12.0f, 12.0f)
                curveTo(11.375f, 12.0f, 10.777f, 12.115f, 10.224f, 12.325f)
                curveTo(9.338f, 10.928f, 7.778f, 10.0f, 6.0f, 10.0f)
                curveTo(4.888f, 10.0f, 3.861f, 10.363f, 3.031f, 10.976f)
                close()
            }
        }
        .build()
        return _glasses2Fill!!
    }

private var _glasses2Fill: ImageVector? = null
