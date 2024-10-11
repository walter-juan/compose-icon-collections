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

public val MapGroup.Compass2Line: ImageVector
    get() {
        if (_compass2Line != null) {
            return _compass2Line!!
        }
        _compass2Line = Builder(name = "Compass2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.625f, 3.133f)
                lineTo(15.125f, 4.633f)
                curveTo(14.165f, 4.225f, 13.109f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 10.891f, 19.775f, 9.835f, 19.367f, 8.875f)
                lineTo(20.867f, 7.375f)
                curveTo(21.591f, 8.759f, 22.0f, 10.332f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(13.668f, 2.0f, 15.241f, 2.409f, 16.625f, 3.133f)
                close()
                moveTo(18.364f, 4.222f)
                lineTo(19.778f, 5.636f)
                lineTo(12.0f, 13.414f)
                lineTo(10.586f, 12.0f)
                lineTo(18.364f, 4.222f)
                close()
            }
        }
        .build()
        return _compass2Line!!
    }

private var _compass2Line: ImageVector? = null
