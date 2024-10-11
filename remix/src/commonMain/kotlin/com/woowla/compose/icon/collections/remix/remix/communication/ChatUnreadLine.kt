package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.ChatUnreadLine: ImageVector
    get() {
        if (_chatUnreadLine != null) {
            return _chatUnreadLine!!
        }
        _chatUnreadLine = Builder(name = "ChatUnreadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                curveTo(22.657f, 7.0f, 24.0f, 5.657f, 24.0f, 4.0f)
                curveTo(24.0f, 2.343f, 22.657f, 1.0f, 21.0f, 1.0f)
                curveTo(19.343f, 1.0f, 18.0f, 2.343f, 18.0f, 4.0f)
                curveTo(18.0f, 5.657f, 19.343f, 7.0f, 21.0f, 7.0f)
                close()
                moveTo(22.0f, 18.0f)
                verticalLineTo(8.9f)
                curveTo(21.677f, 8.966f, 21.343f, 9.0f, 21.0f, 9.0f)
                curveTo(20.657f, 9.0f, 20.323f, 8.966f, 20.0f, 8.9f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.763f)
                lineTo(4.0f, 18.385f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.1f)
                curveTo(16.034f, 4.677f, 16.0f, 4.342f, 16.0f, 4.0f)
                curveTo(16.0f, 3.658f, 16.034f, 3.323f, 16.1f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(22.5f)
                lineTo(6.455f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 19.0f, 22.0f, 18.552f, 22.0f, 18.0f)
                close()
            }
        }
        .build()
        return _chatUnreadLine!!
    }

private var _chatUnreadLine: ImageVector? = null
