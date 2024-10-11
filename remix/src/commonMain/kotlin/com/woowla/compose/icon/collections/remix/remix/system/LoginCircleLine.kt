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

public val SystemGroup.LoginCircleLine: ImageVector
    get() {
        if (_loginCircleLine != null) {
            return _loginCircleLine!!
        }
        _loginCircleLine = Builder(name = "LoginCircleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                verticalLineTo(8.0f)
                lineTo(15.0f, 12.0f)
                lineTo(10.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(2.458f, 15.0f)
                horizontalLineTo(4.582f)
                curveTo(5.768f, 17.932f, 8.643f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(8.643f, 4.0f, 5.768f, 6.068f, 4.582f, 9.0f)
                horizontalLineTo(2.458f)
                curveTo(3.732f, 4.943f, 7.522f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(7.522f, 22.0f, 3.732f, 19.057f, 2.458f, 15.0f)
                close()
            }
        }
        .build()
        return _loginCircleLine!!
    }

private var _loginCircleLine: ImageVector? = null
