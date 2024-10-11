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

public val LogosGroup.MicrosoftLoopLine: ImageVector
    get() {
        if (_microsoftLoopLine != null) {
            return _microsoftLoopLine!!
        }
        _microsoftLoopLine = Builder(name = "MicrosoftLoopLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                horizontalLineTo(7.69f)
                curveTo(8.593f, 19.059f, 9.215f, 17.848f, 9.424f, 16.5f)
                horizontalLineTo(12.0f)
                curveTo(14.485f, 16.5f, 16.5f, 14.485f, 16.5f, 12.0f)
                curveTo(16.5f, 9.515f, 14.485f, 7.5f, 12.0f, 7.5f)
                curveTo(9.515f, 7.5f, 7.5f, 9.515f, 7.5f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(7.5f, 17.642f, 6.004f, 19.434f, 4.0f, 19.889f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(9.5f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(9.5f, 10.619f, 10.619f, 9.5f, 12.0f, 9.5f)
                curveTo(13.381f, 9.5f, 14.5f, 10.619f, 14.5f, 12.0f)
                curveTo(14.5f, 13.381f, 13.381f, 14.5f, 12.0f, 14.5f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _microsoftLoopLine!!
    }

private var _microsoftLoopLine: ImageVector? = null
