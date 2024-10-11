package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.AncientGateLine: ImageVector
    get() {
        if (_ancientGateLine != null) {
            return _ancientGateLine!!
        }
        _ancientGateLine = Builder(name = "AncientGateLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.964f, 3.0f)
                horizontalLineTo(17.036f)
                curveTo(17.284f, 4.722f, 18.76f, 6.0f, 20.5f, 6.0f)
                curveTo(20.832f, 6.0f, 21.163f, 5.953f, 21.481f, 5.86f)
                curveTo(21.297f, 7.644f, 19.794f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(4.206f, 9.0f, 2.703f, 7.644f, 2.518f, 5.86f)
                curveTo(2.837f, 5.953f, 3.168f, 6.0f, 3.5f, 6.0f)
                curveTo(5.24f, 6.0f, 6.716f, 4.722f, 6.964f, 3.0f)
                close()
                moveTo(16.899f, 6.658f)
                curveTo(16.339f, 6.172f, 15.902f, 5.62f, 15.588f, 5.0f)
                horizontalLineTo(8.412f)
                curveTo(8.098f, 5.62f, 7.661f, 6.172f, 7.101f, 6.658f)
                curveTo(6.959f, 6.78f, 6.814f, 6.894f, 6.667f, 7.0f)
                horizontalLineTo(17.333f)
                curveTo(17.185f, 6.894f, 17.041f, 6.78f, 16.899f, 6.658f)
                close()
                moveTo(21.5f, 11.5f)
                curveTo(22.038f, 11.5f, 22.542f, 11.359f, 22.979f, 11.111f)
                curveTo(22.993f, 11.239f, 23.0f, 11.369f, 23.0f, 11.5f)
                curveTo(23.0f, 12.897f, 22.183f, 14.102f, 21.0f, 14.664f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                curveTo(14.0f, 17.895f, 13.105f, 17.0f, 12.0f, 17.0f)
                curveTo(10.895f, 17.0f, 10.0f, 17.895f, 10.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.664f)
                curveTo(1.818f, 14.102f, 1.0f, 12.897f, 1.0f, 11.5f)
                curveTo(1.0f, 11.369f, 1.007f, 11.239f, 1.021f, 11.111f)
                curveTo(1.458f, 11.359f, 1.962f, 11.5f, 2.5f, 11.5f)
                curveTo(3.61f, 11.5f, 4.58f, 10.897f, 5.099f, 10.0f)
                horizontalLineTo(18.901f)
                curveTo(19.42f, 10.897f, 20.39f, 11.5f, 21.5f, 11.5f)
                close()
                moveTo(18.963f, 12.81f)
                curveTo(18.576f, 12.581f, 18.23f, 12.311f, 17.925f, 12.0f)
                horizontalLineTo(6.075f)
                curveTo(5.77f, 12.311f, 5.424f, 12.581f, 5.037f, 12.81f)
                curveTo(4.834f, 12.929f, 4.627f, 13.033f, 4.415f, 13.122f)
                lineTo(5.0f, 13.4f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 17.895f, 8.391f, 16.953f, 9.172f, 16.172f)
                curveTo(9.953f, 15.391f, 10.895f, 15.0f, 12.0f, 15.0f)
                curveTo(13.105f, 15.0f, 14.047f, 15.391f, 14.828f, 16.172f)
                curveTo(15.609f, 16.953f, 16.0f, 17.895f, 16.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.4f)
                lineTo(19.585f, 13.122f)
                curveTo(19.373f, 13.033f, 19.166f, 12.929f, 18.963f, 12.81f)
                close()
            }
        }
        .build()
        return _ancientGateLine!!
    }

private var _ancientGateLine: ImageVector? = null
