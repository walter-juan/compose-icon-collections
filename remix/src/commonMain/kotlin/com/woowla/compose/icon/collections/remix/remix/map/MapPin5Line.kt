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

public val MapGroup.MapPin5Line: ImageVector
    get() {
        if (_mapPin5Line != null) {
            return _mapPin5Line!!
        }
        _mapPin5Line = Builder(name = "MapPin5Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.485f)
                lineTo(16.243f, 14.243f)
                curveTo(18.586f, 11.899f, 18.586f, 8.101f, 16.243f, 5.757f)
                curveTo(13.899f, 3.414f, 10.101f, 3.414f, 7.757f, 5.757f)
                curveTo(5.414f, 8.101f, 5.414f, 11.899f, 7.757f, 14.243f)
                lineTo(12.0f, 18.485f)
                close()
                moveTo(17.657f, 15.657f)
                lineTo(12.0f, 21.314f)
                lineTo(6.343f, 15.657f)
                curveTo(3.219f, 12.533f, 3.219f, 7.467f, 6.343f, 4.343f)
                curveTo(9.467f, 1.219f, 14.533f, 1.219f, 17.657f, 4.343f)
                curveTo(20.781f, 7.467f, 20.781f, 12.533f, 17.657f, 15.657f)
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
        return _mapPin5Line!!
    }

private var _mapPin5Line: ImageVector? = null
