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

public val BuildingsGroup.AncientPavilionLine: ImageVector
    get() {
        if (_ancientPavilionLine != null) {
            return _ancientPavilionLine!!
        }
        _ancientPavilionLine = Builder(name = "AncientPavilionLine", defaultWidth = 24.0.dp,
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
                moveTo(18.556f, 9.937f)
                lineTo(18.281f, 10.0f)
                horizontalLineTo(5.719f)
                lineTo(5.445f, 9.937f)
                curveTo(5.308f, 9.906f, 5.178f, 9.866f, 5.053f, 9.816f)
                curveTo(6.59f, 9.532f, 8.023f, 8.921f, 9.351f, 7.981f)
                curveTo(10.408f, 7.234f, 11.291f, 6.356f, 12.0f, 5.346f)
                curveTo(12.71f, 6.356f, 13.593f, 7.234f, 14.649f, 7.981f)
                curveTo(15.977f, 8.921f, 17.41f, 9.532f, 18.947f, 9.816f)
                curveTo(18.822f, 9.866f, 18.692f, 9.906f, 18.556f, 9.937f)
                close()
            }
        }
        .build()
        return _ancientPavilionLine!!
    }

private var _ancientPavilionLine: ImageVector? = null
