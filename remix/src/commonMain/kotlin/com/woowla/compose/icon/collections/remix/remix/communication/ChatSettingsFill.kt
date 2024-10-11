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

public val CommunicationGroup.ChatSettingsFill: ImageVector
    get() {
        if (_chatSettingsFill != null) {
            return _chatSettingsFill!!
        }
        _chatSettingsFill = Builder(name = "ChatSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.552f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.455f)
                close()
                moveTo(8.145f, 12.071f)
                lineTo(7.17f, 12.634f)
                lineTo(8.17f, 14.366f)
                lineTo(9.146f, 13.802f)
                curveTo(9.647f, 14.313f, 10.285f, 14.69f, 11.0f, 14.874f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.874f)
                curveTo(13.715f, 14.69f, 14.352f, 14.313f, 14.854f, 13.802f)
                lineTo(15.83f, 14.366f)
                lineTo(16.83f, 12.634f)
                lineTo(15.855f, 12.071f)
                curveTo(15.95f, 11.73f, 16.0f, 11.371f, 16.0f, 11.0f)
                curveTo(16.0f, 10.629f, 15.95f, 10.27f, 15.855f, 9.929f)
                lineTo(16.83f, 9.366f)
                lineTo(15.83f, 7.634f)
                lineTo(14.854f, 8.197f)
                curveTo(14.352f, 7.687f, 13.715f, 7.31f, 13.0f, 7.126f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.126f)
                curveTo(10.285f, 7.31f, 9.647f, 7.687f, 9.146f, 8.197f)
                lineTo(8.17f, 7.634f)
                lineTo(7.17f, 9.366f)
                lineTo(8.145f, 9.929f)
                curveTo(8.05f, 10.27f, 8.0f, 10.629f, 8.0f, 11.0f)
                curveTo(8.0f, 11.371f, 8.05f, 11.73f, 8.145f, 12.071f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.895f, 13.0f, 10.0f, 12.105f, 10.0f, 11.0f)
                curveTo(10.0f, 9.895f, 10.895f, 9.0f, 12.0f, 9.0f)
                curveTo(13.105f, 9.0f, 14.0f, 9.895f, 14.0f, 11.0f)
                curveTo(14.0f, 12.105f, 13.105f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _chatSettingsFill!!
    }

private var _chatSettingsFill: ImageVector? = null
