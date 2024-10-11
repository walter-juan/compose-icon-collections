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

public val SystemGroup.LogoutCircleLine: ImageVector
    get() {
        if (_logoutCircleLine != null) {
            return _logoutCircleLine!!
        }
        _logoutCircleLine = Builder(name = "LogoutCircleLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                lineTo(0.0f, 12.0f)
                lineTo(5.0f, 8.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(3.999f, 18.0f)
                horizontalLineTo(6.708f)
                curveTo(8.119f, 19.245f, 9.971f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(9.971f, 4.0f, 8.119f, 4.755f, 6.708f, 6.0f)
                horizontalLineTo(3.999f)
                curveTo(5.824f, 3.571f, 8.728f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(8.728f, 22.0f, 5.824f, 20.429f, 3.999f, 18.0f)
                close()
            }
        }
        .build()
        return _logoutCircleLine!!
    }

private var _logoutCircleLine: ImageVector? = null
