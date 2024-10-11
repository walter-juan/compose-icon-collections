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

public val MediaGroup.Camera3Line: ImageVector
    get() {
        if (_camera3Line != null) {
            return _camera3Line!!
        }
        _camera3Line = Builder(name = "Camera3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.001f)
                curveTo(2.0f, 5.448f, 2.455f, 5.0f, 2.992f, 5.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 5.0f, 22.0f, 5.445f, 22.0f, 6.001f)
                verticalLineTo(19.999f)
                curveTo(22.0f, 20.552f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 19.999f)
                verticalLineTo(6.001f)
                close()
                moveTo(4.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(14.0f, 16.0f)
                curveTo(15.657f, 16.0f, 17.0f, 14.657f, 17.0f, 13.0f)
                curveTo(17.0f, 11.343f, 15.657f, 10.0f, 14.0f, 10.0f)
                curveTo(12.343f, 10.0f, 11.0f, 11.343f, 11.0f, 13.0f)
                curveTo(11.0f, 14.657f, 12.343f, 16.0f, 14.0f, 16.0f)
                close()
                moveTo(14.0f, 18.0f)
                curveTo(11.239f, 18.0f, 9.0f, 15.761f, 9.0f, 13.0f)
                curveTo(9.0f, 10.239f, 11.239f, 8.0f, 14.0f, 8.0f)
                curveTo(16.761f, 8.0f, 19.0f, 10.239f, 19.0f, 13.0f)
                curveTo(19.0f, 15.761f, 16.761f, 18.0f, 14.0f, 18.0f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _camera3Line!!
    }

private var _camera3Line: ImageVector? = null
