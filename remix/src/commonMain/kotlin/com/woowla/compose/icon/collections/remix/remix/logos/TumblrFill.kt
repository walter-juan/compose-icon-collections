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

public val LogosGroup.TumblrFill: ImageVector
    get() {
        if (_tumblrFill != null) {
            return _tumblrFill!!
        }
        _tumblrFill = Builder(name = "TumblrFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.271f, 7.63f)
                curveTo(8.868f, 7.073f, 10.816f, 4.764f, 10.816f, 2.0f)
                horizontalLineTo(13.846f)
                verticalLineTo(7.152f)
                horizontalLineTo(17.483f)
                verticalLineTo(10.788f)
                horizontalLineTo(13.846f)
                verticalLineTo(16.242f)
                curveTo(13.846f, 16.757f, 14.044f, 17.449f, 14.755f, 17.909f)
                curveTo(15.23f, 18.216f, 16.24f, 18.367f, 17.786f, 18.364f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.543f)
                curveTo(11.033f, 22.0f, 8.998f, 19.965f, 8.998f, 17.455f)
                verticalLineTo(10.788f)
                horizontalLineTo(6.271f)
                verticalLineTo(7.63f)
                close()
            }
        }
        .build()
        return _tumblrFill!!
    }

private var _tumblrFill: ImageVector? = null
