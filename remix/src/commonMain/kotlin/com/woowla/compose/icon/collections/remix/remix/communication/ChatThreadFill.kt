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

public val CommunicationGroup.ChatThreadFill: ImageVector
    get() {
        if (_chatThreadFill != null) {
            return _chatThreadFill!!
        }
        _chatThreadFill = Builder(name = "ChatThreadFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.449f, 7.0f)
                lineTo(15.274f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.099f)
                lineTo(14.924f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.749f)
                lineTo(14.574f, 17.0f)
                horizontalLineTo(12.566f)
                lineTo(12.741f, 15.0f)
                horizontalLineTo(10.733f)
                lineTo(10.559f, 17.0f)
                horizontalLineTo(8.551f)
                lineTo(8.726f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.901f)
                lineTo(9.076f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.251f)
                lineTo(9.426f, 7.0f)
                horizontalLineTo(11.433f)
                lineTo(11.258f, 9.0f)
                horizontalLineTo(13.266f)
                lineTo(13.441f, 7.0f)
                horizontalLineTo(15.449f)
                close()
                moveTo(11.083f, 11.0f)
                lineTo(10.908f, 13.0f)
                horizontalLineTo(12.916f)
                lineTo(13.091f, 11.0f)
                horizontalLineTo(11.083f)
                close()
            }
        }
        .build()
        return _chatThreadFill!!
    }

private var _chatThreadFill: ImageVector? = null
