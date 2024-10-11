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

public val CommunicationGroup.ChatSmile3Line: ImageVector
    get() {
        if (_chatSmile3Line != null) {
            return _chatSmile3Line!!
        }
        _chatSmile3Line = Builder(name = "ChatSmile3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(2.0f)
                lineTo(4.929f, 19.071f)
                curveTo(3.119f, 17.261f, 2.0f, 14.761f, 2.0f, 12.0f)
                close()
                moveTo(6.828f, 20.0f)
                horizontalLineTo(12.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 14.152f, 4.851f, 16.165f, 6.343f, 17.657f)
                lineTo(7.757f, 19.071f)
                lineTo(6.828f, 20.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 15.209f, 14.209f, 17.0f, 12.0f, 17.0f)
                curveTo(9.791f, 17.0f, 8.0f, 15.209f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _chatSmile3Line!!
    }

private var _chatSmile3Line: ImageVector? = null
