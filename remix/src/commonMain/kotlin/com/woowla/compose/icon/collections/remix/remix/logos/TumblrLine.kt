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

public val LogosGroup.TumblrLine: ImageVector
    get() {
        if (_tumblrLine != null) {
            return _tumblrLine!!
        }
        _tumblrLine = Builder(name = "TumblrLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.001f, 8.0f)
                curveTo(9.076f, 8.0f, 11.498f, 7.327f, 11.498f, 3.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(12.909f)
                curveTo(13.001f, 15.391f, 13.001f, 16.596f, 13.001f, 17.0f)
                curveTo(12.999f, 19.208f, 14.616f, 20.4f, 17.786f, 20.4f)
                verticalLineTo(22.0f)
                curveTo(17.151f, 21.999f, 16.403f, 21.999f, 15.544f, 22.0f)
                curveTo(13.142f, 22.002f, 10.998f, 19.965f, 10.998f, 17.455f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.001f)
                close()
            }
        }
        .build()
        return _tumblrLine!!
    }

private var _tumblrLine: ImageVector? = null
