package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.GamepadLine: ImageVector
    get() {
        if (_gamepadLine != null) {
            return _gamepadLine!!
        }
        _gamepadLine = Builder(name = "GamepadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                curveTo(20.314f, 4.0f, 23.0f, 6.686f, 23.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 17.314f, 20.314f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(3.686f, 20.0f, 1.0f, 17.314f, 1.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 6.686f, 3.686f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(17.0f, 6.0f)
                horizontalLineTo(7.0f)
                curveTo(4.858f, 6.0f, 3.109f, 7.684f, 3.005f, 9.8f)
                lineTo(3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 16.142f, 4.684f, 17.891f, 6.8f, 17.995f)
                lineTo(7.0f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(19.142f, 18.0f, 20.891f, 16.316f, 20.995f, 14.2f)
                lineTo(21.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 7.858f, 19.316f, 6.109f, 17.2f, 6.005f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(10.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.999f)
                lineTo(10.0f, 15.0f)
                horizontalLineTo(8.0f)
                lineTo(7.999f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(18.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _gamepadLine!!
    }

private var _gamepadLine: ImageVector? = null
