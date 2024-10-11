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

public val CommunicationGroup.ChatSmileLine: ImageVector
    get() {
        if (_chatSmileLine != null) {
            return _chatSmileLine!!
        }
        _chatSmileLine = Builder(name = "ChatSmileLine", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.552f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.455f)
                close()
                moveTo(5.763f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.385f)
                lineTo(5.763f, 17.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 11.657f, 10.343f, 13.0f, 12.0f, 13.0f)
                curveTo(13.657f, 13.0f, 15.0f, 11.657f, 15.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 12.761f, 14.761f, 15.0f, 12.0f, 15.0f)
                curveTo(9.239f, 15.0f, 7.0f, 12.761f, 7.0f, 10.0f)
                close()
            }
        }
        .build()
        return _chatSmileLine!!
    }

private var _chatSmileLine: ImageVector? = null
