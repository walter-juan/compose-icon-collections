package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ScrollToBottomLine: ImageVector
    get() {
        if (_scrollToBottomLine != null) {
            return _scrollToBottomLine!!
        }
        _scrollToBottomLine = Builder(name = "ScrollToBottomLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.013f, 4.565f)
                curveTo(8.754f, 4.169f, 9.559f, 4.0f, 11.141f, 4.0f)
                horizontalLineTo(12.859f)
                curveTo(14.441f, 4.0f, 15.246f, 4.169f, 15.987f, 4.565f)
                curveTo(16.617f, 4.902f, 17.098f, 5.383f, 17.435f, 6.013f)
                curveTo(17.831f, 6.754f, 18.0f, 7.559f, 18.0f, 9.141f)
                verticalLineTo(14.859f)
                curveTo(18.0f, 16.441f, 17.831f, 17.246f, 17.435f, 17.987f)
                curveTo(17.098f, 18.617f, 16.617f, 19.098f, 15.987f, 19.435f)
                curveTo(15.246f, 19.831f, 14.441f, 20.0f, 12.859f, 20.0f)
                horizontalLineTo(11.141f)
                curveTo(9.559f, 20.0f, 8.754f, 19.831f, 8.013f, 19.435f)
                curveTo(7.383f, 19.098f, 6.902f, 18.617f, 6.565f, 17.987f)
                curveTo(6.169f, 17.246f, 6.0f, 16.441f, 6.0f, 14.859f)
                verticalLineTo(9.141f)
                curveTo(6.0f, 7.559f, 6.169f, 6.754f, 6.565f, 6.013f)
                curveTo(6.902f, 5.383f, 7.383f, 4.902f, 8.013f, 4.565f)
                close()
                moveTo(12.859f, 2.0f)
                horizontalLineTo(11.141f)
                curveTo(9.127f, 2.0f, 8.047f, 2.278f, 7.069f, 2.801f)
                curveTo(6.092f, 3.324f, 5.324f, 4.092f, 4.801f, 5.069f)
                curveTo(4.278f, 6.047f, 4.0f, 7.127f, 4.0f, 9.141f)
                verticalLineTo(14.859f)
                curveTo(4.0f, 16.873f, 4.278f, 17.953f, 4.801f, 18.931f)
                curveTo(5.324f, 19.908f, 6.092f, 20.676f, 7.069f, 21.199f)
                curveTo(8.047f, 21.722f, 9.127f, 22.0f, 11.141f, 22.0f)
                horizontalLineTo(12.859f)
                curveTo(14.873f, 22.0f, 15.953f, 21.722f, 16.931f, 21.199f)
                curveTo(17.908f, 20.676f, 18.676f, 19.908f, 19.199f, 18.931f)
                curveTo(19.722f, 17.953f, 20.0f, 16.873f, 20.0f, 14.859f)
                verticalLineTo(9.141f)
                curveTo(20.0f, 7.127f, 19.722f, 6.047f, 19.199f, 5.069f)
                curveTo(18.676f, 4.092f, 17.908f, 3.324f, 16.931f, 2.801f)
                curveTo(15.953f, 2.278f, 14.873f, 2.0f, 12.859f, 2.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.758f, 13.758f)
                lineTo(12.0f, 18.001f)
                lineTo(16.243f, 13.758f)
                lineTo(14.829f, 12.344f)
                lineTo(12.0f, 15.172f)
                lineTo(9.172f, 12.344f)
                lineTo(7.758f, 13.758f)
                close()
            }
        }
        .build()
        return _scrollToBottomLine!!
    }

private var _scrollToBottomLine: ImageVector? = null
