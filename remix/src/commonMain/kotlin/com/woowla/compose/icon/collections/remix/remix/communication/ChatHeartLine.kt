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

public val CommunicationGroup.ChatHeartLine: ImageVector
    get() {
        if (_chatHeartLine != null) {
            return _chatHeartLine!!
        }
        _chatHeartLine = Builder(name = "ChatHeartLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(4.0f, 18.385f)
                lineTo(5.763f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.385f)
                close()
                moveTo(12.018f, 14.7f)
                lineTo(8.659f, 11.341f)
                curveTo(7.78f, 10.462f, 7.78f, 9.038f, 8.659f, 8.159f)
                curveTo(9.538f, 7.28f, 10.962f, 7.28f, 11.841f, 8.159f)
                lineTo(12.018f, 8.336f)
                lineTo(12.194f, 8.159f)
                curveTo(13.073f, 7.28f, 14.498f, 7.28f, 15.377f, 8.159f)
                curveTo(16.255f, 9.038f, 16.255f, 10.462f, 15.377f, 11.341f)
                lineTo(12.018f, 14.7f)
                close()
            }
        }
        .build()
        return _chatHeartLine!!
    }

private var _chatHeartLine: ImageVector? = null
