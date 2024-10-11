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

public val CommunicationGroup.ChatPrivateFill: ImageVector
    get() {
        if (_chatPrivateFill != null) {
            return _chatPrivateFill!!
        }
        _chatPrivateFill = Builder(name = "ChatPrivateFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 7.0f)
                curveTo(10.402f, 7.0f, 9.0f, 8.34f, 9.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 8.343f, 13.657f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(14.0f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.476f, 9.0f, 13.0f, 9.49f, 13.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 9.49f, 11.487f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _chatPrivateFill!!
    }

private var _chatPrivateFill: ImageVector? = null
