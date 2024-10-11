package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.LoopRightLine: ImageVector
    get() {
        if (_loopRightLine != null) {
            return _loopRightLine!!
        }
        _loopRightLine = Builder(name = "LoopRightLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(14.749f, 4.0f, 17.175f, 5.386f, 18.616f, 7.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.999f)
                curveTo(18.176f, 3.572f, 15.272f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(9.251f, 20.0f, 6.825f, 18.614f, 5.384f, 16.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.001f)
                curveTo(5.824f, 20.428f, 8.728f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _loopRightLine!!
    }

private var _loopRightLine: ImageVector? = null
