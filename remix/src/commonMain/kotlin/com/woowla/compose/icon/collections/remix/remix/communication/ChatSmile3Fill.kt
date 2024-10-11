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

public val CommunicationGroup.ChatSmile3Fill: ImageVector
    get() {
        if (_chatSmile3Fill != null) {
            return _chatSmile3Fill!!
        }
        _chatSmile3Fill = Builder(name = "ChatSmile3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(2.0f)
                lineTo(4.929f, 19.071f)
                curveTo(3.119f, 17.261f, 2.0f, 14.761f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 15.209f, 9.791f, 17.0f, 12.0f, 17.0f)
                curveTo(14.209f, 17.0f, 16.0f, 15.209f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _chatSmile3Fill!!
    }

private var _chatSmile3Fill: ImageVector? = null
