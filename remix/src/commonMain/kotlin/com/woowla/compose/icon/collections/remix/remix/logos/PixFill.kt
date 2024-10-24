package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.PixFill: ImageVector
    get() {
        if (_pixFill != null) {
            return _pixFill!!
        }
        _pixFill = Builder(name = "PixFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.385f, 18.114f)
                    lineTo(9.525f, 22.253f)
                    curveTo(10.892f, 23.62f, 13.108f, 23.62f, 14.475f, 22.253f)
                    lineTo(18.614f, 18.114f)
                    curveTo(17.509f, 18.182f, 16.38f, 17.795f, 15.535f, 16.95f)
                    lineTo(12.53f, 13.944f)
                    curveTo(12.237f, 13.652f, 11.762f, 13.652f, 11.469f, 13.944f)
                    lineTo(8.464f, 16.95f)
                    curveTo(7.62f, 17.795f, 6.491f, 18.182f, 5.385f, 18.114f)
                    close()
                    moveTo(20.485f, 16.243f)
                    lineTo(22.253f, 14.475f)
                    curveTo(23.62f, 13.108f, 23.62f, 10.892f, 22.253f, 9.525f)
                    lineTo(20.485f, 7.757f)
                    curveTo(19.314f, 6.586f, 17.414f, 6.586f, 16.243f, 7.757f)
                    lineTo(13.237f, 10.762f)
                    curveTo(12.554f, 11.446f, 11.446f, 11.446f, 10.762f, 10.762f)
                    lineTo(7.757f, 7.757f)
                    curveTo(6.586f, 6.586f, 4.686f, 6.586f, 3.515f, 7.757f)
                    lineTo(1.747f, 9.525f)
                    curveTo(0.38f, 10.892f, 0.38f, 13.108f, 1.747f, 14.475f)
                    lineTo(3.515f, 16.243f)
                    curveTo(4.686f, 17.414f, 6.586f, 17.414f, 7.757f, 16.243f)
                    lineTo(10.762f, 13.237f)
                    curveTo(11.446f, 12.554f, 12.554f, 12.554f, 13.237f, 13.237f)
                    lineTo(16.243f, 16.243f)
                    curveTo(17.414f, 17.414f, 19.314f, 17.414f, 20.485f, 16.243f)
                    close()
                    moveTo(5.385f, 5.886f)
                    curveTo(6.491f, 5.818f, 7.62f, 6.205f, 8.464f, 7.05f)
                    lineTo(11.469f, 10.055f)
                    curveTo(11.762f, 10.348f, 12.237f, 10.348f, 12.53f, 10.055f)
                    lineTo(15.535f, 7.05f)
                    curveTo(16.38f, 6.205f, 17.509f, 5.818f, 18.614f, 5.886f)
                    lineTo(14.475f, 1.747f)
                    curveTo(13.108f, 0.38f, 10.892f, 0.38f, 9.525f, 1.747f)
                    lineTo(5.385f, 5.886f)
                    close()
                }
            }
        }
        .build()
        return _pixFill!!
    }

private var _pixFill: ImageVector? = null
