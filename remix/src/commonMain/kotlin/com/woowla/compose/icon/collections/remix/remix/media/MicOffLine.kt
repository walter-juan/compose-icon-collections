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

public val MediaGroup.MicOffLine: ImageVector
    get() {
        if (_micOffLine != null) {
            return _micOffLine!!
        }
        _micOffLine = Builder(name = "MicOffLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.425f, 17.839f)
                lineTo(21.192f, 22.607f)
                lineTo(22.607f, 21.192f)
                lineTo(2.808f, 1.393f)
                lineTo(1.394f, 2.808f)
                lineTo(7.0f, 8.414f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 12.761f, 9.239f, 15.0f, 12.0f, 15.0f)
                curveTo(12.483f, 15.0f, 12.949f, 14.932f, 13.39f, 14.804f)
                lineTo(14.94f, 16.354f)
                curveTo(14.046f, 16.769f, 13.05f, 17.0f, 12.0f, 17.0f)
                curveTo(8.474f, 17.0f, 5.556f, 14.392f, 5.071f, 11.0f)
                horizontalLineTo(3.055f)
                curveTo(3.516f, 15.172f, 6.829f, 18.484f, 11.0f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.945f)
                curveTo(14.234f, 18.809f, 15.393f, 18.423f, 16.425f, 17.839f)
                close()
                moveTo(11.553f, 12.967f)
                curveTo(10.254f, 12.773f, 9.227f, 11.746f, 9.033f, 10.447f)
                lineTo(11.553f, 12.967f)
                close()
                moveTo(19.375f, 15.16f)
                lineTo(17.932f, 13.718f)
                curveTo(18.441f, 12.908f, 18.788f, 11.987f, 18.929f, 11.0f)
                horizontalLineTo(20.945f)
                curveTo(20.775f, 12.537f, 20.219f, 13.957f, 19.375f, 15.16f)
                close()
                moveTo(16.466f, 12.251f)
                lineTo(14.917f, 10.703f)
                curveTo(14.972f, 10.477f, 15.0f, 10.242f, 15.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.343f, 13.657f, 3.0f, 12.0f, 3.0f)
                curveTo(10.706f, 3.0f, 9.603f, 3.82f, 9.182f, 4.968f)
                lineTo(7.686f, 3.471f)
                curveTo(8.554f, 1.993f, 10.161f, 1.0f, 12.0f, 1.0f)
                curveTo(14.762f, 1.0f, 17.0f, 3.239f, 17.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 10.81f, 16.808f, 11.575f, 16.466f, 12.251f)
                close()
            }
        }
        .build()
        return _micOffLine!!
    }

private var _micOffLine: ImageVector? = null
