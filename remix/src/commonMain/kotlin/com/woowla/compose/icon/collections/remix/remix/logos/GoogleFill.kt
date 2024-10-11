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

public val LogosGroup.GoogleFill: ImageVector
    get() {
        if (_googleFill != null) {
            return _googleFill!!
        }
        _googleFill = Builder(name = "GoogleFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.064f, 7.509f)
                curveTo(4.709f, 4.241f, 8.091f, 2.0f, 12.0f, 2.0f)
                curveTo(14.695f, 2.0f, 16.959f, 2.991f, 18.691f, 4.605f)
                lineTo(15.823f, 7.473f)
                curveTo(14.786f, 6.482f, 13.468f, 5.977f, 12.0f, 5.977f)
                curveTo(9.395f, 5.977f, 7.191f, 7.736f, 6.405f, 10.1f)
                curveTo(6.205f, 10.7f, 6.091f, 11.341f, 6.091f, 12.0f)
                curveTo(6.091f, 12.659f, 6.205f, 13.3f, 6.405f, 13.9f)
                curveTo(7.191f, 16.264f, 9.395f, 18.023f, 12.0f, 18.023f)
                curveTo(13.345f, 18.023f, 14.491f, 17.668f, 15.386f, 17.068f)
                curveTo(16.445f, 16.359f, 17.15f, 15.3f, 17.382f, 14.05f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.182f)
                horizontalLineTo(21.418f)
                curveTo(21.536f, 10.836f, 21.6f, 11.518f, 21.6f, 12.227f)
                curveTo(21.6f, 15.273f, 20.509f, 17.836f, 18.618f, 19.577f)
                curveTo(16.964f, 21.105f, 14.7f, 22.0f, 12.0f, 22.0f)
                curveTo(8.091f, 22.0f, 4.709f, 19.759f, 3.064f, 16.491f)
                curveTo(2.386f, 15.141f, 2.0f, 13.614f, 2.0f, 12.0f)
                curveTo(2.0f, 10.386f, 2.386f, 8.859f, 3.064f, 7.509f)
                close()
            }
        }
        .build()
        return _googleFill!!
    }

private var _googleFill: ImageVector? = null
