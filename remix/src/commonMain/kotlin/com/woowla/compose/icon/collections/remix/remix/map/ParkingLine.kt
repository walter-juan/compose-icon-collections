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

public val MapGroup.ParkingLine: ImageVector
    get() {
        if (_parkingLine != null) {
            return _parkingLine!!
        }
        _parkingLine = Builder(name = "ParkingLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(16.314f, 3.0f, 19.0f, 5.686f, 19.0f, 9.0f)
                curveTo(19.0f, 12.314f, 16.314f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(8.0f, 5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                curveTo(15.209f, 13.0f, 17.0f, 11.209f, 17.0f, 9.0f)
                curveTo(17.0f, 6.791f, 15.209f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _parkingLine!!
    }

private var _parkingLine: ImageVector? = null
