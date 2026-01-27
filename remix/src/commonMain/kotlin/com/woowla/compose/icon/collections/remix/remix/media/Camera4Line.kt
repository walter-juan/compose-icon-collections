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

public val MediaGroup.Camera4Line: ImageVector
    get() {
        if (_camera4Line != null) {
            return _camera4Line!!
        }
        _camera4Line = Builder(name = "Camera4Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.434f, 3.0f)
                curveTo(15.136f, 3.0f, 15.787f, 3.369f, 16.148f, 3.971f)
                lineTo(16.921f, 5.257f)
                curveTo(17.011f, 5.407f, 17.174f, 5.5f, 17.35f, 5.5f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 5.5f, 22.0f, 6.843f, 22.0f, 8.5f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.657f, 20.657f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 21.0f, 2.0f, 19.657f, 2.0f, 18.0f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 6.843f, 3.343f, 5.5f, 5.0f, 5.5f)
                horizontalLineTo(6.65f)
                curveTo(6.826f, 5.5f, 6.989f, 5.407f, 7.079f, 5.257f)
                lineTo(7.852f, 3.971f)
                curveTo(8.213f, 3.369f, 8.864f, 3.0f, 9.566f, 3.0f)
                horizontalLineTo(14.434f)
                close()
                moveTo(8.795f, 6.286f)
                curveTo(8.343f, 7.039f, 7.529f, 7.5f, 6.65f, 7.5f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 7.5f, 4.0f, 7.948f, 4.0f, 8.5f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 18.552f, 4.448f, 19.0f, 5.0f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 19.0f, 20.0f, 18.552f, 20.0f, 18.0f)
                verticalLineTo(8.5f)
                curveTo(20.0f, 7.948f, 19.552f, 7.5f, 19.0f, 7.5f)
                horizontalLineTo(17.35f)
                curveTo(16.472f, 7.5f, 15.657f, 7.039f, 15.205f, 6.286f)
                lineTo(14.434f, 5.0f)
                horizontalLineTo(9.566f)
                lineTo(8.795f, 6.286f)
                close()
                moveTo(12.0f, 8.5f)
                curveTo(14.485f, 8.5f, 16.5f, 10.515f, 16.5f, 13.0f)
                curveTo(16.5f, 15.485f, 14.485f, 17.5f, 12.0f, 17.5f)
                curveTo(9.515f, 17.5f, 7.5f, 15.485f, 7.5f, 13.0f)
                curveTo(7.5f, 10.515f, 9.515f, 8.5f, 12.0f, 8.5f)
                close()
                moveTo(12.0f, 10.5f)
                curveTo(10.619f, 10.5f, 9.5f, 11.619f, 9.5f, 13.0f)
                curveTo(9.5f, 14.381f, 10.619f, 15.5f, 12.0f, 15.5f)
                curveTo(13.381f, 15.5f, 14.5f, 14.381f, 14.5f, 13.0f)
                curveTo(14.5f, 11.619f, 13.381f, 10.5f, 12.0f, 10.5f)
                close()
            }
        }
        .build()
        return _camera4Line!!
    }

private var _camera4Line: ImageVector? = null
