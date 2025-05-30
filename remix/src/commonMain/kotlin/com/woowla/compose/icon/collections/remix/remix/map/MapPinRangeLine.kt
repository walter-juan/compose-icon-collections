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

public val MapGroup.MapPinRangeLine: ImageVector
    get() {
        if (_mapPinRangeLine != null) {
            return _mapPinRangeLine!!
        }
        _mapPinRangeLine = Builder(name = "MapPinRangeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.938f)
                curveTo(7.054f, 17.446f, 4.0f, 14.08f, 4.0f, 10.0f)
                curveTo(4.0f, 5.582f, 7.582f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.0f, 5.582f, 20.0f, 10.0f)
                curveTo(20.0f, 14.08f, 16.946f, 17.446f, 13.0f, 17.938f)
                verticalLineTo(20.012f)
                curveTo(16.946f, 20.104f, 20.0f, 20.735f, 20.0f, 21.5f)
                curveTo(20.0f, 22.328f, 16.418f, 23.0f, 12.0f, 23.0f)
                curveTo(7.582f, 23.0f, 4.0f, 22.328f, 4.0f, 21.5f)
                curveTo(4.0f, 20.735f, 7.054f, 20.104f, 11.0f, 20.012f)
                verticalLineTo(17.938f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(15.314f, 16.0f, 18.0f, 13.314f, 18.0f, 10.0f)
                curveTo(18.0f, 6.686f, 15.314f, 4.0f, 12.0f, 4.0f)
                curveTo(8.686f, 4.0f, 6.0f, 6.686f, 6.0f, 10.0f)
                curveTo(6.0f, 13.314f, 8.686f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.895f, 12.0f, 10.0f, 11.105f, 10.0f, 10.0f)
                curveTo(10.0f, 8.895f, 10.895f, 8.0f, 12.0f, 8.0f)
                curveTo(13.105f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                curveTo(14.0f, 11.105f, 13.105f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _mapPinRangeLine!!
    }

private var _mapPinRangeLine: ImageVector? = null
