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

public val LogosGroup.XingFill: ImageVector
    get() {
        if (_xingFill != null) {
            return _xingFill!!
        }
        _xingFill = Builder(name = "XingFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.462f, 3.231f)
                curveTo(20.616f, 3.231f, 20.77f, 3.308f, 20.847f, 3.385f)
                curveTo(20.924f, 3.538f, 20.924f, 3.692f, 20.847f, 3.846f)
                lineTo(14.77f, 14.615f)
                lineTo(18.616f, 21.692f)
                curveTo(18.693f, 21.846f, 18.693f, 22.0f, 18.616f, 22.154f)
                curveTo(18.539f, 22.231f, 18.385f, 22.308f, 18.231f, 22.308f)
                horizontalLineTo(15.462f)
                curveTo(15.077f, 22.308f, 14.847f, 22.0f, 14.693f, 21.769f)
                lineTo(10.77f, 14.615f)
                curveTo(11.0f, 14.308f, 16.924f, 3.769f, 16.924f, 3.769f)
                curveTo(17.077f, 3.461f, 17.308f, 3.231f, 17.693f, 3.231f)
                horizontalLineTo(20.462f)
                close()
                moveTo(8.923f, 7.0f)
                curveTo(9.308f, 7.0f, 9.539f, 7.308f, 9.693f, 7.538f)
                lineTo(11.616f, 10.846f)
                curveTo(11.462f, 11.0f, 8.616f, 16.077f, 8.616f, 16.077f)
                curveTo(8.462f, 16.308f, 8.231f, 16.615f, 7.847f, 16.615f)
                horizontalLineTo(5.154f)
                curveTo(5.0f, 16.615f, 4.847f, 16.538f, 4.77f, 16.462f)
                curveTo(4.693f, 16.308f, 4.693f, 16.154f, 4.77f, 16.0f)
                lineTo(7.616f, 10.846f)
                lineTo(5.77f, 7.615f)
                curveTo(5.693f, 7.461f, 5.693f, 7.308f, 5.77f, 7.154f)
                curveTo(5.847f, 7.077f, 6.0f, 7.0f, 6.154f, 7.0f)
                horizontalLineTo(8.923f)
                close()
            }
        }
        .build()
        return _xingFill!!
    }

private var _xingFill: ImageVector? = null
