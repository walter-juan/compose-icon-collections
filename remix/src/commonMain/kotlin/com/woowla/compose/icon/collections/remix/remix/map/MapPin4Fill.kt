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

public val MapGroup.MapPin4Fill: ImageVector
    get() {
        if (_mapPin4Fill != null) {
            return _mapPin4Fill!!
        }
        _mapPin4Fill = Builder(name = "MapPin4Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.938f)
                curveTo(7.054f, 17.446f, 4.0f, 14.08f, 4.0f, 10.0f)
                curveTo(4.0f, 5.582f, 7.582f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.0f, 5.582f, 20.0f, 10.0f)
                curveTo(20.0f, 14.08f, 16.946f, 17.446f, 13.0f, 17.938f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.938f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _mapPin4Fill!!
    }

private var _mapPin4Fill: ImageVector? = null
