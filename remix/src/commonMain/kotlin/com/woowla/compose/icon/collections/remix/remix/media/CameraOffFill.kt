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

public val MediaGroup.CameraOffFill: ImageVector
    get() {
        if (_cameraOffFill != null) {
            return _cameraOffFill!!
        }
        _cameraOffFill = Builder(name = "CameraOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.586f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(3.586f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                lineTo(22.607f, 21.192f)
                lineTo(21.192f, 22.607f)
                lineTo(19.586f, 21.0f)
                close()
                moveTo(7.555f, 8.97f)
                curveTo(6.589f, 10.035f, 6.0f, 11.449f, 6.0f, 13.0f)
                curveTo(6.0f, 16.314f, 8.686f, 19.0f, 12.0f, 19.0f)
                curveTo(13.552f, 19.0f, 14.966f, 18.411f, 16.031f, 17.445f)
                lineTo(14.614f, 16.028f)
                curveTo(13.913f, 16.634f, 12.999f, 17.0f, 12.0f, 17.0f)
                curveTo(9.791f, 17.0f, 8.0f, 15.209f, 8.0f, 13.0f)
                curveTo(8.0f, 12.001f, 8.366f, 11.087f, 8.972f, 10.386f)
                lineTo(7.555f, 8.97f)
                close()
                moveTo(22.0f, 17.786f)
                lineTo(17.955f, 13.741f)
                curveTo(17.985f, 13.498f, 18.0f, 13.251f, 18.0f, 13.0f)
                curveTo(18.0f, 9.686f, 15.314f, 7.0f, 12.0f, 7.0f)
                curveTo(11.749f, 7.0f, 11.502f, 7.015f, 11.26f, 7.045f)
                lineTo(8.107f, 3.893f)
                lineTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(17.786f)
                close()
                moveTo(13.509f, 9.294f)
                curveTo(14.505f, 9.7f, 15.3f, 10.496f, 15.706f, 11.492f)
                lineTo(13.509f, 9.294f)
                close()
            }
        }
        .build()
        return _cameraOffFill!!
    }

private var _cameraOffFill: ImageVector? = null
