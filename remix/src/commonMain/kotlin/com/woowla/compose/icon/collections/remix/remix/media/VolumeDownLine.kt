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

public val MediaGroup.VolumeDownLine: ImageVector
    get() {
        if (_volumeDownLine != null) {
            return _volumeDownLine!!
        }
        _volumeDownLine = Builder(name = "VolumeDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.22f)
                lineTo(9.603f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.603f)
                lineTo(13.0f, 16.779f)
                verticalLineTo(7.22f)
                close()
                moveTo(8.889f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 16.0f, 4.0f, 15.552f, 4.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 8.448f, 4.448f, 8.0f, 5.0f, 8.0f)
                horizontalLineTo(8.889f)
                lineTo(14.183f, 3.668f)
                curveTo(14.397f, 3.493f, 14.712f, 3.525f, 14.887f, 3.739f)
                curveTo(14.96f, 3.828f, 15.0f, 3.94f, 15.0f, 4.055f)
                verticalLineTo(19.945f)
                curveTo(15.0f, 20.221f, 14.776f, 20.445f, 14.5f, 20.445f)
                curveTo(14.385f, 20.445f, 14.273f, 20.405f, 14.183f, 20.332f)
                lineTo(8.889f, 16.0f)
                close()
                moveTo(18.863f, 16.591f)
                lineTo(17.441f, 15.169f)
                curveTo(18.389f, 14.438f, 19.0f, 13.29f, 19.0f, 12.0f)
                curveTo(19.0f, 10.57f, 18.249f, 9.315f, 17.12f, 8.608f)
                lineTo(18.559f, 7.169f)
                curveTo(20.04f, 8.262f, 21.0f, 10.019f, 21.0f, 12.0f)
                curveTo(21.0f, 13.842f, 20.17f, 15.49f, 18.863f, 16.591f)
                close()
            }
        }
        .build()
        return _volumeDownLine!!
    }

private var _volumeDownLine: ImageVector? = null
