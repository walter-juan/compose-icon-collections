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

public val MediaGroup.VolumeVibrateLine: ImageVector
    get() {
        if (_volumeVibrateLine != null) {
            return _volumeVibrateLine!!
        }
        _volumeVibrateLine = Builder(name = "VolumeVibrateLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.389f, 3.161f)
                lineTo(20.803f, 4.575f)
                lineTo(18.328f, 7.05f)
                lineTo(20.803f, 9.525f)
                lineTo(18.328f, 11.999f)
                lineTo(20.803f, 14.475f)
                lineTo(18.328f, 16.95f)
                lineTo(20.803f, 19.425f)
                lineTo(19.389f, 20.839f)
                lineTo(15.5f, 16.95f)
                lineTo(17.975f, 14.475f)
                lineTo(15.5f, 12.0f)
                lineTo(17.975f, 9.525f)
                lineTo(15.5f, 7.05f)
                lineTo(19.389f, 3.161f)
                close()
                moveTo(12.887f, 3.738f)
                curveTo(12.96f, 3.828f, 13.0f, 3.94f, 13.0f, 4.055f)
                verticalLineTo(19.945f)
                curveTo(13.0f, 20.221f, 12.776f, 20.445f, 12.5f, 20.445f)
                curveTo(12.385f, 20.445f, 12.273f, 20.405f, 12.183f, 20.332f)
                lineTo(6.889f, 15.999f)
                lineTo(3.0f, 16.0f)
                curveTo(2.448f, 16.0f, 2.0f, 15.552f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.448f, 2.448f, 8.0f, 3.0f, 8.0f)
                lineTo(6.889f, 7.999f)
                lineTo(12.183f, 3.668f)
                curveTo(12.397f, 3.493f, 12.712f, 3.525f, 12.887f, 3.738f)
                close()
                moveTo(11.0f, 7.22f)
                lineTo(7.603f, 9.999f)
                lineTo(4.0f, 9.999f)
                verticalLineTo(14.0f)
                lineTo(7.603f, 13.999f)
                lineTo(11.0f, 16.779f)
                verticalLineTo(7.22f)
                close()
            }
        }
        .build()
        return _volumeVibrateLine!!
    }

private var _volumeVibrateLine: ImageVector? = null
