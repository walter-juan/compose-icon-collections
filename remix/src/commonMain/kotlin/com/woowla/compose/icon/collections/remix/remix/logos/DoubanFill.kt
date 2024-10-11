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

public val LogosGroup.DoubanFill: ImageVector
    get() {
        if (_doubanFill != null) {
            return _doubanFill!!
        }
        _doubanFill = Builder(name = "DoubanFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.314f, 19.138f)
                horizontalLineTo(20.379f)
                curveTo(20.722f, 19.138f, 21.0f, 19.416f, 21.0f, 19.759f)
                verticalLineTo(20.379f)
                curveTo(21.0f, 20.722f, 20.722f, 21.0f, 20.379f, 21.0f)
                horizontalLineTo(3.621f)
                curveTo(3.278f, 21.0f, 3.0f, 20.722f, 3.0f, 20.379f)
                verticalLineTo(19.759f)
                curveTo(3.0f, 19.416f, 3.278f, 19.138f, 3.621f, 19.138f)
                horizontalLineTo(7.374f)
                lineTo(6.414f, 16.035f)
                horizontalLineTo(8.604f)
                curveTo(8.872f, 16.035f, 9.109f, 16.205f, 9.193f, 16.459f)
                lineTo(10.086f, 19.138f)
                horizontalLineTo(13.599f)
                lineTo(14.824f, 15.103f)
                horizontalLineTo(5.172f)
                curveTo(4.83f, 15.103f, 4.552f, 14.826f, 4.552f, 14.483f)
                verticalLineTo(7.345f)
                curveTo(4.552f, 7.002f, 4.83f, 6.724f, 5.172f, 6.724f)
                horizontalLineTo(18.828f)
                curveTo(19.17f, 6.724f, 19.448f, 7.002f, 19.448f, 7.345f)
                verticalLineTo(14.483f)
                curveTo(19.448f, 14.826f, 19.17f, 15.103f, 18.828f, 15.103f)
                horizontalLineTo(17.539f)
                lineTo(16.314f, 19.138f)
                close()
                moveTo(3.931f, 3.0f)
                horizontalLineTo(20.069f)
                curveTo(20.412f, 3.0f, 20.69f, 3.278f, 20.69f, 3.621f)
                verticalLineTo(4.241f)
                curveTo(20.69f, 4.584f, 20.412f, 4.862f, 20.069f, 4.862f)
                horizontalLineTo(3.931f)
                curveTo(3.588f, 4.862f, 3.31f, 4.584f, 3.31f, 4.241f)
                verticalLineTo(3.621f)
                curveTo(3.31f, 3.278f, 3.588f, 3.0f, 3.931f, 3.0f)
                close()
                moveTo(7.19f, 8.586f)
                curveTo(7.104f, 8.586f, 7.034f, 8.656f, 7.034f, 8.741f)
                verticalLineTo(12.776f)
                curveTo(7.034f, 12.862f, 7.104f, 12.931f, 7.19f, 12.931f)
                horizontalLineTo(16.81f)
                curveTo(16.896f, 12.931f, 16.965f, 12.862f, 16.965f, 12.776f)
                verticalLineTo(8.741f)
                curveTo(16.965f, 8.656f, 16.896f, 8.586f, 16.81f, 8.586f)
                horizontalLineTo(7.19f)
                close()
            }
        }
        .build()
        return _doubanFill!!
    }

private var _doubanFill: ImageVector? = null
