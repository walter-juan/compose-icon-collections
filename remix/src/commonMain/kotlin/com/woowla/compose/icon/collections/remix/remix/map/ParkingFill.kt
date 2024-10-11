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

public val MapGroup.ParkingFill: ImageVector
    get() {
        if (_parkingFill != null) {
            return _parkingFill!!
        }
        _parkingFill = Builder(name = "ParkingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(16.314f, 3.0f, 19.0f, 5.686f, 19.0f, 9.0f)
                curveTo(19.0f, 12.314f, 16.314f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                curveTo(14.105f, 11.0f, 15.0f, 10.105f, 15.0f, 9.0f)
                curveTo(15.0f, 7.895f, 14.105f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _parkingFill!!
    }

private var _parkingFill: ImageVector? = null
