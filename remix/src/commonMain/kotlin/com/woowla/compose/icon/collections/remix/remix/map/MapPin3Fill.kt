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

public val MapGroup.MapPin3Fill: ImageVector
    get() {
        if (_mapPin3Fill != null) {
            return _mapPin3Fill!!
        }
        _mapPin3Fill = Builder(name = "MapPin3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.945f)
                curveTo(6.5f, 19.448f, 3.0f, 15.633f, 3.0f, 11.0f)
                curveTo(3.0f, 6.029f, 7.029f, 2.0f, 12.0f, 2.0f)
                curveTo(16.971f, 2.0f, 21.0f, 6.029f, 21.0f, 11.0f)
                curveTo(21.0f, 15.633f, 17.5f, 19.448f, 13.0f, 19.945f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.945f)
                close()
            }
        }
        .build()
        return _mapPin3Fill!!
    }

private var _mapPin3Fill: ImageVector? = null
