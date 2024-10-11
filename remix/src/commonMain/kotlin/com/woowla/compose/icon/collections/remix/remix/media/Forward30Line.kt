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

public val MediaGroup.Forward30Line: ImageVector
    get() {
        if (_forward30Line != null) {
            return _forward30Line!!
        }
        _forward30Line = Builder(name = "Forward30Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(15.271f, 2.0f, 18.176f, 3.571f, 20.0f, 5.999f)
                lineTo(20.0f, 3.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(17.166f)
                curveTo(17.378f, 9.868f, 17.5f, 10.295f, 17.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(17.5f, 14.631f, 16.381f, 15.75f, 15.0f, 15.75f)
                curveTo(13.619f, 15.75f, 12.5f, 14.631f, 12.5f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(12.5f, 9.369f, 13.619f, 8.25f, 15.0f, 8.25f)
                curveTo(15.356f, 8.25f, 15.694f, 8.324f, 16.0f, 8.458f)
                verticalLineTo(7.5f)
                lineTo(18.615f, 7.5f)
                curveTo(17.176f, 5.387f, 14.75f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                close()
                moveTo(15.0f, 9.75f)
                curveTo(14.448f, 9.75f, 14.0f, 10.198f, 14.0f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(14.0f, 13.802f, 14.448f, 14.25f, 15.0f, 14.25f)
                curveTo(15.552f, 14.25f, 16.0f, 13.802f, 16.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(16.0f, 10.198f, 15.552f, 9.75f, 15.0f, 9.75f)
                close()
                moveTo(9.375f, 12.75f)
                curveTo(9.72f, 12.75f, 10.0f, 13.03f, 10.0f, 13.375f)
                curveTo(10.0f, 13.72f, 9.72f, 14.0f, 9.375f, 14.0f)
                horizontalLineTo(6.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(9.375f)
                curveTo(10.548f, 15.5f, 11.5f, 14.549f, 11.5f, 13.375f)
                curveTo(11.5f, 12.851f, 11.31f, 12.371f, 10.995f, 12.0f)
                curveTo(11.31f, 11.629f, 11.5f, 11.149f, 11.5f, 10.625f)
                curveTo(11.5f, 9.451f, 10.548f, 8.5f, 9.375f, 8.5f)
                horizontalLineTo(6.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.375f)
                curveTo(9.72f, 10.0f, 10.0f, 10.28f, 10.0f, 10.625f)
                curveTo(10.0f, 10.97f, 9.72f, 11.25f, 9.375f, 11.25f)
                horizontalLineTo(7.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(9.375f)
                close()
            }
        }
        .build()
        return _forward30Line!!
    }

private var _forward30Line: ImageVector? = null
