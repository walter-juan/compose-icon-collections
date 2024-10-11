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

public val SystemGroup.LoopRightFill: ImageVector
    get() {
        if (_loopRightFill != null) {
            return _loopRightFill!!
        }
        _loopRightFill = Builder(name = "LoopRightFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(14.59f, 4.0f, 16.894f, 5.231f, 18.357f, 7.143f)
                lineTo(16.0f, 9.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.5f)
                lineTo(19.781f, 5.719f)
                curveTo(17.949f, 3.452f, 15.144f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(9.41f, 20.0f, 7.106f, 18.77f, 5.643f, 16.857f)
                lineTo(8.0f, 14.5f)
                lineTo(2.0f, 14.5f)
                verticalLineTo(20.5f)
                lineTo(4.219f, 18.281f)
                curveTo(6.051f, 20.548f, 8.856f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _loopRightFill!!
    }

private var _loopRightFill: ImageVector? = null
