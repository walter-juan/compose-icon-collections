package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.RepeatOneLine: ImageVector
    get() {
        if (_repeatOneLine != null) {
            return _repeatOneLine!!
        }
        _repeatOneLine = Builder(name = "RepeatOneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                verticalLineTo(21.933f)
                curveTo(8.0f, 22.209f, 7.776f, 22.433f, 7.5f, 22.433f)
                curveTo(7.383f, 22.433f, 7.27f, 22.392f, 7.18f, 22.317f)
                lineTo(3.061f, 18.884f)
                curveTo(2.849f, 18.707f, 2.82f, 18.392f, 2.997f, 18.18f)
                curveTo(3.092f, 18.066f, 3.233f, 18.0f, 3.381f, 18.0f)
                lineTo(18.0f, 18.0f)
                curveTo(19.105f, 18.0f, 20.0f, 17.105f, 20.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 18.209f, 20.209f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(16.0f, 2.068f)
                curveTo(16.0f, 1.791f, 16.224f, 1.567f, 16.5f, 1.567f)
                curveTo(16.617f, 1.567f, 16.73f, 1.609f, 16.82f, 1.683f)
                lineTo(20.939f, 5.116f)
                curveTo(21.151f, 5.293f, 21.18f, 5.608f, 21.003f, 5.82f)
                curveTo(20.908f, 5.934f, 20.767f, 6.0f, 20.619f, 6.0f)
                lineTo(6.0f, 6.0f)
                curveTo(4.895f, 6.0f, 4.0f, 6.895f, 4.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 5.791f, 3.791f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.068f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                lineTo(11.0f, 8.0f)
                close()
            }
        }
        .build()
        return _repeatOneLine!!
    }

private var _repeatOneLine: ImageVector? = null
