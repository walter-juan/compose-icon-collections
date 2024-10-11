package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.AncientPavilionFill: ImageVector
    get() {
        if (_ancientPavilionFill != null) {
            return _ancientPavilionFill!!
        }
        _ancientPavilionFill = Builder(name = "AncientPavilionFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.516f, 7.877f)
                curveTo(1.68f, 9.83f, 3.089f, 11.452f, 5.0f, 11.887f)
                verticalLineTo(19.001f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.001f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.001f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.887f)
                curveTo(20.911f, 11.452f, 22.32f, 9.83f, 22.484f, 7.877f)
                curveTo(21.994f, 7.959f, 21.497f, 8.0f, 21.0f, 8.0f)
                curveTo(17.186f, 8.0f, 13.786f, 5.596f, 12.515f, 2.0f)
                horizontalLineTo(11.485f)
                curveTo(10.214f, 5.596f, 6.814f, 8.0f, 3.0f, 8.0f)
                curveTo(2.503f, 8.0f, 2.006f, 7.959f, 1.516f, 7.877f)
                close()
                moveTo(17.0f, 19.001f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.001f)
                close()
            }
        }
        .build()
        return _ancientPavilionFill!!
    }

private var _ancientPavilionFill: ImageVector? = null
