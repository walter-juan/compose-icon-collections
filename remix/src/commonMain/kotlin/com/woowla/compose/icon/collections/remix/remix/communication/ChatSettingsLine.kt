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

public val CommunicationGroup.ChatSettingsLine: ImageVector
    get() {
        if (_chatSettingsLine != null) {
            return _chatSettingsLine!!
        }
        _chatSettingsLine = Builder(name = "ChatSettingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.385f)
                lineTo(5.763f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.455f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(14.145f, 19.071f)
                curveTo(14.05f, 18.73f, 14.0f, 18.371f, 14.0f, 18.0f)
                curveTo(14.0f, 17.629f, 14.05f, 17.27f, 14.145f, 16.929f)
                lineTo(13.17f, 16.366f)
                lineTo(14.17f, 14.634f)
                lineTo(15.146f, 15.198f)
                curveTo(15.648f, 14.687f, 16.285f, 14.31f, 17.0f, 14.126f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.126f)
                curveTo(19.715f, 14.31f, 20.353f, 14.687f, 20.854f, 15.198f)
                lineTo(21.83f, 14.634f)
                lineTo(22.83f, 16.366f)
                lineTo(21.855f, 16.929f)
                curveTo(21.949f, 17.27f, 22.0f, 17.629f, 22.0f, 18.0f)
                curveTo(22.0f, 18.371f, 21.949f, 18.73f, 21.855f, 19.071f)
                lineTo(22.83f, 19.634f)
                lineTo(21.83f, 21.366f)
                lineTo(20.854f, 20.802f)
                curveTo(20.353f, 21.313f, 19.715f, 21.69f, 19.0f, 21.874f)
                verticalLineTo(23.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.874f)
                curveTo(16.285f, 21.69f, 15.648f, 21.313f, 15.146f, 20.802f)
                lineTo(14.17f, 21.366f)
                lineTo(13.17f, 19.634f)
                lineTo(14.145f, 19.071f)
                close()
                moveTo(18.0f, 20.0f)
                curveTo(19.105f, 20.0f, 20.0f, 19.105f, 20.0f, 18.0f)
                curveTo(20.0f, 16.895f, 19.105f, 16.0f, 18.0f, 16.0f)
                curveTo(16.895f, 16.0f, 16.0f, 16.895f, 16.0f, 18.0f)
                curveTo(16.0f, 19.105f, 16.895f, 20.0f, 18.0f, 20.0f)
                close()
            }
        }
        .build()
        return _chatSettingsLine!!
    }

private var _chatSettingsLine: ImageVector? = null
