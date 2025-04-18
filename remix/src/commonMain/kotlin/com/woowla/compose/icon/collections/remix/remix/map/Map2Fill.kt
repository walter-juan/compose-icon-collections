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

public val MapGroup.Map2Fill: ImageVector
    get() {
        if (_map2Fill != null) {
            return _map2Fill!!
        }
        _map2Fill = Builder(name = "Map2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineTo(9.0f, 2.0f)
                lineTo(15.0f, 5.0f)
                lineTo(21.303f, 2.299f)
                curveTo(21.557f, 2.19f, 21.851f, 2.307f, 21.96f, 2.561f)
                curveTo(21.986f, 2.624f, 22.0f, 2.691f, 22.0f, 2.758f)
                verticalLineTo(19.0f)
                lineTo(15.0f, 22.0f)
                lineTo(9.0f, 19.0f)
                lineTo(2.697f, 21.701f)
                curveTo(2.443f, 21.81f, 2.149f, 21.692f, 2.04f, 21.439f)
                curveTo(2.014f, 21.376f, 2.0f, 21.309f, 2.0f, 21.242f)
                verticalLineTo(5.0f)
                close()
                moveTo(15.0f, 19.764f)
                verticalLineTo(7.176f)
                lineTo(14.935f, 7.204f)
                lineTo(9.0f, 4.236f)
                verticalLineTo(16.824f)
                lineTo(9.065f, 16.796f)
                lineTo(15.0f, 19.764f)
                close()
            }
        }
        .build()
        return _map2Fill!!
    }

private var _map2Fill: ImageVector? = null
