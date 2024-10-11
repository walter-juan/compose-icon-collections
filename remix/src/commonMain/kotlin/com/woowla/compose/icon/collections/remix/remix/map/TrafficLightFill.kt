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

public val MapGroup.TrafficLightFill: ImageVector
    get() {
        if (_trafficLightFill != null) {
            return _trafficLightFill!!
        }
        _trafficLightFill = Builder(name = "TrafficLightFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.448f, 7.448f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 2.0f, 17.0f, 2.448f, 17.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 6.5f, 17.5f, 7.5f, 17.0f, 7.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 12.5f, 17.5f, 13.5f, 17.0f, 13.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 18.5f, 17.5f, 19.5f, 17.0f, 19.5f)
                verticalLineTo(21.0f)
                curveTo(17.0f, 21.552f, 16.552f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(7.448f, 22.0f, 7.0f, 21.552f, 7.0f, 21.0f)
                verticalLineTo(19.5f)
                curveTo(6.5f, 19.5f, 4.0f, 18.5f, 4.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.5f)
                curveTo(6.5f, 13.5f, 4.0f, 12.5f, 4.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.5f)
                curveTo(6.5f, 7.5f, 4.0f, 6.5f, 4.0f, 4.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(13.105f, 20.0f, 14.0f, 19.105f, 14.0f, 18.0f)
                curveTo(14.0f, 16.895f, 13.105f, 16.0f, 12.0f, 16.0f)
                curveTo(10.895f, 16.0f, 10.0f, 16.895f, 10.0f, 18.0f)
                curveTo(10.0f, 19.105f, 10.895f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 13.105f, 10.0f, 12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(13.105f, 8.0f, 14.0f, 7.105f, 14.0f, 6.0f)
                curveTo(14.0f, 4.895f, 13.105f, 4.0f, 12.0f, 4.0f)
                curveTo(10.895f, 4.0f, 10.0f, 4.895f, 10.0f, 6.0f)
                curveTo(10.0f, 7.105f, 10.895f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _trafficLightFill!!
    }

private var _trafficLightFill: ImageVector? = null
