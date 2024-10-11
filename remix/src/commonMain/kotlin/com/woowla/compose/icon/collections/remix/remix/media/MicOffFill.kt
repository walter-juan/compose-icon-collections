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

public val MediaGroup.MicOffFill: ImageVector
    get() {
        if (_micOffFill != null) {
            return _micOffFill!!
        }
        _micOffFill = Builder(name = "MicOffFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.425f, 17.839f)
                curveTo(15.393f, 18.423f, 14.234f, 18.809f, 13.0f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.945f)
                curveTo(6.829f, 18.484f, 3.516f, 15.172f, 3.055f, 11.0f)
                horizontalLineTo(5.071f)
                curveTo(5.556f, 14.392f, 8.474f, 17.0f, 12.0f, 17.0f)
                curveTo(13.05f, 17.0f, 14.046f, 16.769f, 14.94f, 16.354f)
                lineTo(13.39f, 14.804f)
                curveTo(12.949f, 14.932f, 12.483f, 15.0f, 12.0f, 15.0f)
                curveTo(9.239f, 15.0f, 7.0f, 12.761f, 7.0f, 10.0f)
                verticalLineTo(8.414f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                lineTo(22.607f, 21.192f)
                lineTo(21.192f, 22.607f)
                lineTo(16.425f, 17.839f)
                close()
                moveTo(19.375f, 15.16f)
                lineTo(17.932f, 13.718f)
                curveTo(18.441f, 12.908f, 18.788f, 11.987f, 18.929f, 11.0f)
                horizontalLineTo(20.945f)
                curveTo(20.775f, 12.537f, 20.219f, 13.957f, 19.375f, 15.16f)
                close()
                moveTo(16.466f, 12.251f)
                lineTo(7.686f, 3.471f)
                curveTo(8.554f, 1.993f, 10.161f, 1.0f, 12.0f, 1.0f)
                curveTo(14.762f, 1.0f, 17.0f, 3.239f, 17.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 10.81f, 16.808f, 11.575f, 16.466f, 12.251f)
                close()
            }
        }
        .build()
        return _micOffFill!!
    }

private var _micOffFill: ImageVector? = null
