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

public val MapGroup.TruckFill: ImageVector
    get() {
        if (_truckFill != null) {
            return _truckFill!!
        }
        _truckFill = Builder(name = "TruckFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                horizontalLineTo(20.0f)
                lineTo(23.0f, 12.056f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.965f)
                curveTo(20.722f, 19.696f, 19.263f, 21.0f, 17.5f, 21.0f)
                curveTo(15.737f, 21.0f, 14.278f, 19.696f, 14.035f, 18.0f)
                horizontalLineTo(8.965f)
                curveTo(8.722f, 19.696f, 7.263f, 21.0f, 5.5f, 21.0f)
                curveTo(3.737f, 21.0f, 2.278f, 19.696f, 2.035f, 18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 5.448f, 1.448f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.715f)
                lineTo(18.992f, 10.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _truckFill!!
    }

private var _truckFill: ImageVector? = null
