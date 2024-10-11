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

public val MediaGroup.NotificationLine: ImageVector
    get() {
        if (_notificationLine != null) {
            return _notificationLine!!
        }
        _notificationLine = Builder(name = "NotificationLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.031f)
                curveTo(19.0f, 7.148f, 15.866f, 4.0f, 12.0f, 4.0f)
                curveTo(8.134f, 4.0f, 5.0f, 7.148f, 5.0f, 11.031f)
                verticalLineTo(18.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(16.971f, 2.0f, 21.0f, 6.043f, 21.0f, 11.031f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.031f)
                curveTo(3.0f, 6.043f, 7.029f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 22.381f, 13.381f, 23.5f, 12.0f, 23.5f)
                curveTo(10.619f, 23.5f, 9.5f, 22.381f, 9.5f, 21.0f)
                close()
            }
        }
        .build()
        return _notificationLine!!
    }

private var _notificationLine: ImageVector? = null
