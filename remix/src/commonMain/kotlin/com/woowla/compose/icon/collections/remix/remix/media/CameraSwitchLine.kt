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

public val MediaGroup.CameraSwitchLine: ImageVector
    get() {
        if (_cameraSwitchLine != null) {
            return _cameraSwitchLine!!
        }
        _cameraSwitchLine = Builder(name = "CameraSwitchLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.828f, 5.0f)
                lineTo(7.828f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.172f)
                lineTo(14.172f, 5.0f)
                horizontalLineTo(9.828f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(9.64f, 7.53f)
                curveTo(10.356f, 7.19f, 11.156f, 7.0f, 12.0f, 7.0f)
                curveTo(15.038f, 7.0f, 17.5f, 9.462f, 17.5f, 12.5f)
                curveTo(17.5f, 14.05f, 16.859f, 15.45f, 15.827f, 16.45f)
                lineTo(13.75f, 12.6f)
                horizontalLineTo(15.499f)
                curveTo(15.5f, 12.567f, 15.5f, 12.533f, 15.5f, 12.5f)
                curveTo(15.5f, 10.567f, 13.933f, 9.0f, 12.0f, 9.0f)
                curveTo(11.491f, 9.0f, 11.008f, 9.109f, 10.572f, 9.304f)
                lineTo(9.64f, 7.53f)
                close()
                moveTo(14.318f, 17.489f)
                curveTo(13.613f, 17.817f, 12.828f, 18.0f, 12.0f, 18.0f)
                curveTo(8.962f, 18.0f, 6.5f, 15.538f, 6.5f, 12.5f)
                curveTo(6.5f, 10.968f, 7.127f, 9.582f, 8.137f, 8.585f)
                lineTo(10.25f, 12.5f)
                horizontalLineTo(8.5f)
                curveTo(8.5f, 14.433f, 10.067f, 16.0f, 12.0f, 16.0f)
                curveTo(12.492f, 16.0f, 12.961f, 15.898f, 13.386f, 15.715f)
                lineTo(14.318f, 17.489f)
                close()
            }
        }
        .build()
        return _cameraSwitchLine!!
    }

private var _cameraSwitchLine: ImageVector? = null
