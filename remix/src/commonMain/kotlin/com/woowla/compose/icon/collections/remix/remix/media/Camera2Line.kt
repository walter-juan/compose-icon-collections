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

public val MediaGroup.Camera2Line: ImageVector
    get() {
        if (_camera2Line != null) {
            return _camera2Line!!
        }
        _camera2Line = Builder(name = "Camera2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                curveTo(7.0f, 9.239f, 9.239f, 7.0f, 12.0f, 7.0f)
                curveTo(14.761f, 7.0f, 17.0f, 9.239f, 17.0f, 12.0f)
                curveTo(17.0f, 14.761f, 14.761f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(17.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _camera2Line!!
    }

private var _camera2Line: ImageVector? = null
