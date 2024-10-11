package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.SoundcloudLine: ImageVector
    get() {
        if (_soundcloudLine != null) {
            return _soundcloudLine!!
        }
        _soundcloudLine = Builder(name = "SoundcloudLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                curveTo(4.552f, 10.0f, 5.0f, 10.448f, 5.0f, 11.0f)
                verticalLineTo(18.0f)
                curveTo(5.0f, 18.552f, 4.552f, 19.0f, 4.0f, 19.0f)
                curveTo(3.448f, 19.0f, 3.0f, 18.552f, 3.0f, 18.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.448f, 3.448f, 10.0f, 4.0f, 10.0f)
                close()
                moveTo(7.0f, 11.0f)
                curveTo(7.552f, 11.0f, 8.0f, 11.448f, 8.0f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(8.0f, 18.552f, 7.552f, 19.0f, 7.0f, 19.0f)
                curveTo(6.448f, 19.0f, 6.0f, 18.552f, 6.0f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(6.0f, 11.448f, 6.448f, 11.0f, 7.0f, 11.0f)
                close()
                moveTo(10.0f, 7.0f)
                curveTo(10.552f, 7.0f, 11.0f, 7.448f, 11.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 18.552f, 10.552f, 19.0f, 10.0f, 19.0f)
                curveTo(9.448f, 19.0f, 9.0f, 18.552f, 9.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(9.0f, 7.448f, 9.448f, 7.0f, 10.0f, 7.0f)
                close()
                moveTo(15.0f, 6.0f)
                curveTo(18.238f, 6.0f, 20.878f, 8.566f, 20.996f, 11.775f)
                lineTo(20.999f, 12.035f)
                curveTo(22.696f, 12.278f, 24.0f, 13.736f, 24.0f, 15.5f)
                curveTo(24.0f, 17.369f, 22.536f, 18.895f, 20.692f, 18.995f)
                lineTo(20.5f, 19.0f)
                horizontalLineTo(16.999f)
                curveTo(16.447f, 19.0f, 15.999f, 18.552f, 15.999f, 18.0f)
                curveTo(15.999f, 17.487f, 16.385f, 17.065f, 16.882f, 17.007f)
                lineTo(16.999f, 17.0f)
                lineTo(20.446f, 17.001f)
                lineTo(20.584f, 16.998f)
                curveTo(21.375f, 16.955f, 22.0f, 16.298f, 22.0f, 15.5f)
                curveTo(22.0f, 14.798f, 21.514f, 14.199f, 20.851f, 14.041f)
                lineTo(20.716f, 14.015f)
                lineTo(18.947f, 13.763f)
                lineTo(18.999f, 11.976f)
                lineTo(18.995f, 11.8f)
                curveTo(18.894f, 9.75f, 17.25f, 8.106f, 15.2f, 8.005f)
                lineTo(15.0f, 8.0f)
                curveTo(14.732f, 8.0f, 14.469f, 8.026f, 14.212f, 8.077f)
                lineTo(13.999f, 8.126f)
                lineTo(13.999f, 18.0f)
                curveTo(13.999f, 18.513f, 13.613f, 18.935f, 13.116f, 18.993f)
                lineTo(13.0f, 19.0f)
                curveTo(12.448f, 19.0f, 12.0f, 18.552f, 12.0f, 18.0f)
                lineTo(11.999f, 6.803f)
                curveTo(12.882f, 6.292f, 13.907f, 6.0f, 15.0f, 6.0f)
                close()
                moveTo(1.0f, 12.0f)
                curveTo(1.552f, 12.0f, 2.0f, 12.448f, 2.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 17.552f, 1.552f, 18.0f, 1.0f, 18.0f)
                curveTo(0.448f, 18.0f, 0.0f, 17.552f, 0.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(0.0f, 12.448f, 0.448f, 12.0f, 1.0f, 12.0f)
                close()
            }
        }
        .build()
        return _soundcloudLine!!
    }

private var _soundcloudLine: ImageVector? = null
