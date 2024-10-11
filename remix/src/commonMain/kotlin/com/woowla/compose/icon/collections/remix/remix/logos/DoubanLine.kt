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

public val LogosGroup.DoubanLine: ImageVector
    get() {
        if (_doubanLine != null) {
            return _doubanLine!!
        }
        _doubanLine = Builder(name = "DoubanLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.274f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.376f)
                lineTo(16.077f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.612f)
                lineTo(6.8f, 16.5f)
                lineTo(8.702f, 15.882f)
                lineTo(9.715f, 19.0f)
                horizontalLineTo(13.974f)
                lineTo(15.274f, 15.0f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(7.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _doubanLine!!
    }

private var _doubanLine: ImageVector? = null
