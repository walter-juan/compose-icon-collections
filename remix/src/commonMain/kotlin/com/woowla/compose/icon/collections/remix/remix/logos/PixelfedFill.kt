package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.PixelfedFill: ImageVector
    get() {
        if (_pixelfedFill != null) {
            return _pixelfedFill!!
        }
        _pixelfedFill = Builder(name = "PixelfedFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(13.032f, 8.099f)
                horizontalLineTo(10.408f)
                curveTo(9.42f, 8.099f, 8.619f, 8.875f, 8.619f, 9.832f)
                verticalLineTo(16.58f)
                lineTo(11.214f, 14.109f)
                horizontalLineTo(13.032f)
                curveTo(14.745f, 14.109f, 16.133f, 12.764f, 16.133f, 11.104f)
                curveTo(16.133f, 9.444f, 14.745f, 8.099f, 13.032f, 8.099f)
                close()
            }
        }
        .build()
        return _pixelfedFill!!
    }

private var _pixelfedFill: ImageVector? = null
