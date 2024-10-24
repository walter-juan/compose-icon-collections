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

public val MediaGroup.NotificationSnoozeFill: ImageVector
    get() {
        if (_notificationSnoozeFill != null) {
            return _notificationSnoozeFill!!
        }
        _notificationSnoozeFill = Builder(name = "NotificationSnoozeFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 5.582f, 16.418f, 2.0f, 12.0f, 2.0f)
                curveTo(7.582f, 2.0f, 4.0f, 5.582f, 4.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.0f, 23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.414f)
                lineTo(11.414f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.586f)
                lineTo(12.586f, 9.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _notificationSnoozeFill!!
    }

private var _notificationSnoozeFill: ImageVector? = null
