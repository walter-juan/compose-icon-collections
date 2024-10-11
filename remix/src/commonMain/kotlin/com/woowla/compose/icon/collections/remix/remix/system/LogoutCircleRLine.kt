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

public val SystemGroup.LogoutCircleRLine: ImageVector
    get() {
        if (_logoutCircleRLine != null) {
            return _logoutCircleRLine!!
        }
        _logoutCircleRLine = Builder(name = "LogoutCircleRLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(15.271f, 2.0f, 18.176f, 3.571f, 20.0f, 5.999f)
                lineTo(17.291f, 5.999f)
                curveTo(15.881f, 4.755f, 14.028f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(14.029f, 20.0f, 15.882f, 19.245f, 17.292f, 18.0f)
                lineTo(20.001f, 18.0f)
                curveTo(18.177f, 20.429f, 15.272f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                lineTo(24.0f, 12.0f)
                lineTo(19.0f, 16.0f)
                close()
            }
        }
        .build()
        return _logoutCircleRLine!!
    }

private var _logoutCircleRLine: ImageVector? = null
