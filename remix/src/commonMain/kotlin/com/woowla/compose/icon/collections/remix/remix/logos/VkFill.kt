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

public val LogosGroup.VkFill: ImageVector
    get() {
        if (_vkFill != null) {
            return _vkFill!!
        }
        _vkFill = Builder(name = "VkFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.26f, 4.26f)
                curveTo(3.0f, 5.532f, 3.0f, 7.566f, 3.0f, 11.64f)
                verticalLineTo(12.36f)
                curveTo(3.0f, 16.428f, 3.0f, 18.462f, 4.26f, 19.74f)
                curveTo(5.532f, 21.0f, 7.566f, 21.0f, 11.64f, 21.0f)
                horizontalLineTo(12.36f)
                curveTo(16.428f, 21.0f, 18.462f, 21.0f, 19.74f, 19.74f)
                curveTo(21.0f, 18.468f, 21.0f, 16.434f, 21.0f, 12.36f)
                verticalLineTo(11.64f)
                curveTo(21.0f, 7.572f, 21.0f, 5.538f, 19.74f, 4.26f)
                curveTo(18.468f, 3.0f, 16.434f, 3.0f, 12.36f, 3.0f)
                horizontalLineTo(11.64f)
                curveTo(7.572f, 3.0f, 5.538f, 3.0f, 4.26f, 4.26f)
                close()
                moveTo(6.036f, 8.478f)
                horizontalLineTo(8.1f)
                curveTo(8.166f, 11.91f, 9.678f, 13.362f, 10.878f, 13.662f)
                verticalLineTo(8.478f)
                horizontalLineTo(12.816f)
                verticalLineTo(11.436f)
                curveTo(13.998f, 11.31f, 15.246f, 9.96f, 15.666f, 8.472f)
                horizontalLineTo(17.598f)
                curveTo(17.441f, 9.242f, 17.126f, 9.972f, 16.674f, 10.615f)
                curveTo(16.222f, 11.258f, 15.642f, 11.801f, 14.97f, 12.21f)
                curveTo(15.719f, 12.583f, 16.381f, 13.111f, 16.912f, 13.758f)
                curveTo(17.442f, 14.406f, 17.83f, 15.158f, 18.048f, 15.966f)
                horizontalLineTo(15.918f)
                curveTo(15.462f, 14.544f, 14.322f, 13.44f, 12.816f, 13.29f)
                verticalLineTo(15.966f)
                horizontalLineTo(12.582f)
                horizontalLineTo(12.576f)
                curveTo(8.472f, 15.966f, 6.132f, 13.158f, 6.036f, 8.478f)
                close()
            }
        }
        .build()
        return _vkFill!!
    }

private var _vkFill: ImageVector? = null
