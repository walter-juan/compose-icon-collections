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

public val MediaGroup.VolumeMuteFill: ImageVector
    get() {
        if (_volumeMuteFill != null) {
            return _volumeMuteFill!!
        }
        _volumeMuteFill = Builder(name = "VolumeMuteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.889f, 16.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 16.0f, 1.0f, 15.552f, 1.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.0f, 8.448f, 1.448f, 8.0f, 2.0f, 8.0f)
                horizontalLineTo(5.889f)
                lineTo(11.183f, 3.668f)
                curveTo(11.397f, 3.493f, 11.712f, 3.525f, 11.887f, 3.739f)
                curveTo(11.96f, 3.828f, 12.0f, 3.94f, 12.0f, 4.055f)
                verticalLineTo(19.945f)
                curveTo(12.0f, 20.221f, 11.776f, 20.445f, 11.5f, 20.445f)
                curveTo(11.385f, 20.445f, 11.273f, 20.405f, 11.183f, 20.332f)
                lineTo(5.889f, 16.0f)
                close()
                moveTo(20.414f, 12.0f)
                lineTo(23.95f, 15.536f)
                lineTo(22.535f, 16.95f)
                lineTo(19.0f, 13.414f)
                lineTo(15.465f, 16.95f)
                lineTo(14.05f, 15.536f)
                lineTo(17.586f, 12.0f)
                lineTo(14.05f, 8.465f)
                lineTo(15.465f, 7.05f)
                lineTo(19.0f, 10.586f)
                lineTo(22.535f, 7.05f)
                lineTo(23.95f, 8.465f)
                lineTo(20.414f, 12.0f)
                close()
            }
        }
        .build()
        return _volumeMuteFill!!
    }

private var _volumeMuteFill: ImageVector? = null
