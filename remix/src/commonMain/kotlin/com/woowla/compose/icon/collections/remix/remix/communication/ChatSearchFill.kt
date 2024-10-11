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

public val CommunicationGroup.ChatSearchFill: ImageVector
    get() {
        if (_chatSearchFill != null) {
            return _chatSearchFill!!
        }
        _chatSearchFill = Builder(name = "ChatSearchFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(12.803f)
                curveTo(21.118f, 12.292f, 20.093f, 12.0f, 19.0f, 12.0f)
                curveTo(15.686f, 12.0f, 13.0f, 14.686f, 13.0f, 18.0f)
                curveTo(13.0f, 18.341f, 13.028f, 18.675f, 13.083f, 19.0f)
                horizontalLineTo(6.455f)
                close()
                moveTo(23.95f, 21.535f)
                lineTo(22.446f, 20.032f)
                curveTo(22.798f, 19.437f, 23.0f, 18.742f, 23.0f, 18.0f)
                curveTo(23.0f, 15.791f, 21.209f, 14.0f, 19.0f, 14.0f)
                curveTo(16.791f, 14.0f, 15.0f, 15.791f, 15.0f, 18.0f)
                curveTo(15.0f, 20.209f, 16.791f, 22.0f, 19.0f, 22.0f)
                curveTo(19.742f, 22.0f, 20.437f, 21.798f, 21.032f, 21.446f)
                lineTo(22.535f, 22.95f)
                lineTo(23.95f, 21.535f)
                close()
                moveTo(21.0f, 18.0f)
                curveTo(21.0f, 19.105f, 20.105f, 20.0f, 19.0f, 20.0f)
                curveTo(17.895f, 20.0f, 17.0f, 19.105f, 17.0f, 18.0f)
                curveTo(17.0f, 16.895f, 17.895f, 16.0f, 19.0f, 16.0f)
                curveTo(20.105f, 16.0f, 21.0f, 16.895f, 21.0f, 18.0f)
                close()
            }
        }
        .build()
        return _chatSearchFill!!
    }

private var _chatSearchFill: ImageVector? = null
