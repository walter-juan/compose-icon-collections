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

public val MediaGroup.NotificationOffFill: ImageVector
    get() {
        if (_notificationOffFill != null) {
            return _notificationOffFill!!
        }
        _notificationOffFill = Builder(name = "NotificationOffFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.586f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.724f, 20.0f, 3.5f, 19.776f, 3.5f, 19.5f)
                curveTo(3.5f, 19.392f, 3.535f, 19.287f, 3.6f, 19.2f)
                lineTo(4.0f, 18.667f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 8.67f, 4.325f, 7.416f, 4.899f, 6.313f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                lineTo(22.607f, 21.192f)
                lineTo(21.192f, 22.607f)
                lineTo(18.586f, 20.0f)
                close()
                moveTo(20.0f, 15.786f)
                lineTo(7.559f, 3.345f)
                curveTo(8.83f, 2.495f, 10.357f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.0f, 5.582f, 20.0f, 10.0f)
                verticalLineTo(15.786f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 22.381f, 13.381f, 23.5f, 12.0f, 23.5f)
                curveTo(10.619f, 23.5f, 9.5f, 22.381f, 9.5f, 21.0f)
                close()
            }
        }
        .build()
        return _notificationOffFill!!
    }

private var _notificationOffFill: ImageVector? = null
