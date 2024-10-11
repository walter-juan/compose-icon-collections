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

public val MediaGroup.VolumeUpFill: ImageVector
    get() {
        if (_volumeUpFill != null) {
            return _volumeUpFill!!
        }
        _volumeUpFill = Builder(name = "VolumeUpFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                horizontalLineTo(5.889f)
                lineTo(11.183f, 20.332f)
                curveTo(11.273f, 20.405f, 11.385f, 20.445f, 11.5f, 20.445f)
                curveTo(11.776f, 20.445f, 12.0f, 20.221f, 12.0f, 19.945f)
                verticalLineTo(4.055f)
                curveTo(12.0f, 3.94f, 11.96f, 3.828f, 11.887f, 3.739f)
                curveTo(11.712f, 3.525f, 11.397f, 3.493f, 11.183f, 3.668f)
                lineTo(5.889f, 8.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 8.0f, 1.0f, 8.448f, 1.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 15.552f, 1.448f, 16.0f, 2.0f, 16.0f)
                close()
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 15.292f, 21.554f, 18.246f, 19.262f, 20.262f)
                lineTo(17.844f, 18.844f)
                curveTo(19.776f, 17.194f, 21.0f, 14.74f, 21.0f, 12.0f)
                curveTo(21.0f, 9.26f, 19.776f, 6.806f, 17.844f, 5.156f)
                lineTo(19.262f, 3.738f)
                curveTo(21.554f, 5.754f, 23.0f, 8.708f, 23.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 10.088f, 17.106f, 8.385f, 15.713f, 7.287f)
                lineTo(14.284f, 8.716f)
                curveTo(15.321f, 9.439f, 16.0f, 10.64f, 16.0f, 12.0f)
                curveTo(16.0f, 13.36f, 15.321f, 14.561f, 14.284f, 15.284f)
                lineTo(15.713f, 16.713f)
                curveTo(17.106f, 15.615f, 18.0f, 13.912f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _volumeUpFill!!
    }

private var _volumeUpFill: ImageVector? = null
