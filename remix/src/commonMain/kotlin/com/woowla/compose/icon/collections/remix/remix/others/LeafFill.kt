package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.LeafFill: ImageVector
    get() {
        if (_leafFill != null) {
            return _leafFill!!
        }
        _leafFill = Builder(name = "LeafFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(20.998f, 14.627f, 15.625f, 19.0f, 8.998f, 19.0f)
                lineTo(7.096f, 19.0f)
                curveTo(7.308f, 15.988f, 8.245f, 14.165f, 10.694f, 11.999f)
                curveTo(11.898f, 10.934f, 11.797f, 10.319f, 11.203f, 10.672f)
                curveTo(7.119f, 13.102f, 5.091f, 16.386f, 5.001f, 21.63f)
                lineTo(4.998f, 22.0f)
                horizontalLineTo(2.998f)
                curveTo(2.998f, 20.637f, 3.114f, 19.4f, 3.344f, 18.268f)
                curveTo(3.113f, 16.974f, 2.998f, 15.218f, 2.998f, 13.0f)
                curveTo(2.998f, 7.477f, 7.475f, 3.0f, 12.998f, 3.0f)
                curveTo(14.998f, 3.0f, 16.998f, 4.0f, 20.998f, 3.0f)
                close()
            }
        }
        .build()
        return _leafFill!!
    }

private var _leafFill: ImageVector? = null
