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

public val MapGroup.HotelBedLine: ImageVector
    get() {
        if (_hotelBedLine != null) {
            return _hotelBedLine!!
        }
        _hotelBedLine = Builder(name = "HotelBedLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                curveTo(20.209f, 7.0f, 22.0f, 8.791f, 22.0f, 11.0f)
                close()
                moveTo(20.0f, 14.0f)
                verticalLineTo(11.0f)
                curveTo(20.0f, 9.895f, 19.105f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(8.552f, 11.0f, 9.0f, 10.552f, 9.0f, 10.0f)
                curveTo(9.0f, 9.448f, 8.552f, 9.0f, 8.0f, 9.0f)
                curveTo(7.448f, 9.0f, 7.0f, 9.448f, 7.0f, 10.0f)
                curveTo(7.0f, 10.552f, 7.448f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveTo(6.343f, 13.0f, 5.0f, 11.657f, 5.0f, 10.0f)
                curveTo(5.0f, 8.343f, 6.343f, 7.0f, 8.0f, 7.0f)
                curveTo(9.657f, 7.0f, 11.0f, 8.343f, 11.0f, 10.0f)
                curveTo(11.0f, 11.657f, 9.657f, 13.0f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _hotelBedLine!!
    }

private var _hotelBedLine: ImageVector? = null
