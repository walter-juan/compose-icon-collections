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

public val SystemGroup.NotificationBadgeFill: ImageVector
    get() {
        if (_notificationBadgeFill != null) {
            return _notificationBadgeFill!!
        }
        _notificationBadgeFill = Builder(name = "NotificationBadgeFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.341f, 4.0f)
                curveTo(13.12f, 4.626f, 13.0f, 5.299f, 13.0f, 6.0f)
                curveTo(13.0f, 9.314f, 15.686f, 12.0f, 19.0f, 12.0f)
                curveTo(19.701f, 12.0f, 20.374f, 11.88f, 21.0f, 11.659f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.448f, 3.448f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(13.341f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(16.791f, 10.0f, 15.0f, 8.209f, 15.0f, 6.0f)
                curveTo(15.0f, 3.791f, 16.791f, 2.0f, 19.0f, 2.0f)
                curveTo(21.209f, 2.0f, 23.0f, 3.791f, 23.0f, 6.0f)
                curveTo(23.0f, 8.209f, 21.209f, 10.0f, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _notificationBadgeFill!!
    }

private var _notificationBadgeFill: ImageVector? = null
