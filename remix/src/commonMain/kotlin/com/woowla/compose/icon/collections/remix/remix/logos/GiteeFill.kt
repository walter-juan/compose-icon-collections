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

public val LogosGroup.GiteeFill: ImageVector
    get() {
        if (_giteeFill != null) {
            return _giteeFill!!
        }
        _giteeFill = Builder(name = "GiteeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.148f, 6.444f)
                curveTo(8.103f, 6.444f, 6.444f, 8.103f, 6.444f, 10.148f)
                verticalLineTo(17.062f)
                curveTo(6.444f, 17.334f, 6.666f, 17.556f, 6.938f, 17.556f)
                horizontalLineTo(14.223f)
                curveTo(16.063f, 17.555f, 17.555f, 16.063f, 17.556f, 14.223f)
                verticalLineTo(11.383f)
                curveTo(17.556f, 11.11f, 17.334f, 10.889f, 17.062f, 10.889f)
                horizontalLineTo(11.383f)
                curveTo(11.11f, 10.889f, 10.889f, 11.11f, 10.889f, 11.383f)
                verticalLineTo(12.617f)
                curveTo(10.889f, 12.89f, 11.109f, 13.111f, 11.382f, 13.111f)
                horizontalLineTo(14.84f)
                curveTo(15.112f, 13.112f, 15.333f, 13.332f, 15.333f, 13.604f)
                verticalLineTo(13.852f)
                curveTo(15.333f, 14.67f, 14.67f, 15.333f, 13.852f, 15.333f)
                horizontalLineTo(9.16f)
                curveTo(8.888f, 15.333f, 8.666f, 15.112f, 8.666f, 14.84f)
                verticalLineTo(10.148f)
                curveTo(8.666f, 9.33f, 9.329f, 8.667f, 10.148f, 8.667f)
                horizontalLineTo(17.06f)
                curveTo(17.333f, 8.667f, 17.554f, 8.445f, 17.555f, 8.173f)
                verticalLineTo(6.938f)
                curveTo(17.555f, 6.666f, 17.334f, 6.445f, 17.062f, 6.444f)
                horizontalLineTo(10.148f)
                close()
            }
        }
        .build()
        return _giteeFill!!
    }

private var _giteeFill: ImageVector? = null
