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

public val CommunicationGroup.ChatFollowUpFill: ImageVector
    get() {
        if (_chatFollowUpFill != null) {
            return _chatFollowUpFill!!
        }
        _chatFollowUpFill = Builder(name = "ChatFollowUpFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.552f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.455f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.999f)
                lineTo(7.0f, 10.0f)
                verticalLineTo(12.0f)
                lineTo(9.0f, 11.999f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.999f)
                lineTo(13.0f, 12.0f)
                verticalLineTo(10.0f)
                lineTo(11.0f, 9.999f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _chatFollowUpFill!!
    }

private var _chatFollowUpFill: ImageVector? = null
