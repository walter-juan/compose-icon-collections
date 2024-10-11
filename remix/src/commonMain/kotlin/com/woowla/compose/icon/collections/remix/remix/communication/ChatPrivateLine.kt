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

public val CommunicationGroup.ChatPrivateLine: ImageVector
    get() {
        if (_chatPrivateLine != null) {
            return _chatPrivateLine!!
        }
        _chatPrivateLine = Builder(name = "ChatPrivateLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(10.298f, 22.0f, 8.695f, 21.575f, 7.292f, 20.825f)
                lineTo(2.0f, 22.0f)
                lineTo(3.176f, 16.71f)
                curveTo(2.426f, 15.306f, 2.0f, 13.703f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 13.335f, 4.326f, 14.618f, 4.94f, 15.766f)
                lineTo(5.29f, 16.42f)
                lineTo(4.634f, 19.366f)
                lineTo(7.582f, 18.712f)
                lineTo(8.235f, 19.061f)
                curveTo(9.383f, 19.675f, 10.666f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(13.657f, 7.0f, 15.0f, 8.343f, 15.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 8.343f, 10.343f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(11.448f, 9.0f, 11.0f, 9.45f, 11.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                curveTo(13.0f, 9.448f, 12.552f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _chatPrivateLine!!
    }

private var _chatPrivateLine: ImageVector? = null
