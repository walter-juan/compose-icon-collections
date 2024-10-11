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

public val CommunicationGroup.ChatThreadLine: ImageVector
    get() {
        if (_chatThreadLine != null) {
            return _chatThreadLine!!
        }
        _chatThreadLine = Builder(name = "ChatThreadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineTo(7.291f, 20.824f)
                curveTo(8.694f, 21.575f, 10.297f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 13.703f, 2.425f, 15.306f, 3.176f, 16.709f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(8.234f, 19.06f)
                lineTo(7.581f, 18.711f)
                lineTo(4.634f, 19.366f)
                lineTo(5.289f, 16.419f)
                lineTo(4.939f, 15.766f)
                curveTo(4.325f, 14.618f, 4.0f, 13.335f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(10.665f, 20.0f, 9.382f, 19.674f, 8.234f, 19.06f)
                close()
                moveTo(15.449f, 7.0f)
                horizontalLineTo(13.441f)
                lineTo(13.266f, 9.0f)
                horizontalLineTo(11.258f)
                lineTo(11.433f, 7.0f)
                horizontalLineTo(9.426f)
                lineTo(9.251f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.076f)
                lineTo(8.901f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.726f)
                lineTo(8.551f, 17.0f)
                horizontalLineTo(10.559f)
                lineTo(10.733f, 15.0f)
                horizontalLineTo(12.741f)
                lineTo(12.566f, 17.0f)
                horizontalLineTo(14.574f)
                lineTo(14.749f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.924f)
                lineTo(15.099f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.274f)
                lineTo(15.449f, 7.0f)
                close()
                moveTo(11.083f, 11.0f)
                horizontalLineTo(13.091f)
                lineTo(12.916f, 13.0f)
                horizontalLineTo(10.908f)
                lineTo(11.083f, 11.0f)
                close()
            }
        }
        .build()
        return _chatThreadLine!!
    }

private var _chatThreadLine: ImageVector? = null
