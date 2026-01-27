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

public val MediaGroup.CameraAi2Line: ImageVector
    get() {
        if (_cameraAi2Line != null) {
            return _cameraAi2Line!!
        }
        _cameraAi2Line = Builder(name = "CameraAi2Line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.529f, 9.317f)
                curveTo(11.706f, 8.892f, 12.294f, 8.892f, 12.471f, 9.317f)
                lineTo(12.724f, 9.929f)
                curveTo(13.156f, 10.972f, 13.962f, 11.804f, 14.975f, 12.255f)
                lineTo(15.692f, 12.574f)
                curveTo(16.103f, 12.757f, 16.103f, 13.354f, 15.692f, 13.537f)
                lineTo(14.933f, 13.875f)
                curveTo(13.945f, 14.314f, 13.153f, 15.118f, 12.714f, 16.126f)
                lineTo(12.467f, 16.691f)
                curveTo(12.286f, 17.105f, 11.714f, 17.105f, 11.533f, 16.691f)
                lineTo(11.287f, 16.126f)
                curveTo(10.848f, 15.117f, 10.055f, 14.314f, 9.067f, 13.875f)
                lineTo(8.308f, 13.537f)
                curveTo(7.897f, 13.354f, 7.897f, 12.757f, 8.308f, 12.574f)
                lineTo(9.025f, 12.255f)
                curveTo(10.038f, 11.804f, 10.844f, 10.972f, 11.276f, 9.929f)
                lineTo(11.529f, 9.317f)
                close()
            }
        }
        .build()
        return _cameraAi2Line!!
    }

private var _cameraAi2Line: ImageVector? = null
