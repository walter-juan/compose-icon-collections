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

public val CommunicationGroup.ChatQuoteLine: ImageVector
    get() {
        if (_chatQuoteLine != null) {
            return _chatQuoteLine!!
        }
        _chatQuoteLine = Builder(name = "ChatQuoteLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.385f)
                lineTo(5.763f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(10.515f, 7.412f)
                lineTo(10.962f, 8.1f)
                curveTo(9.294f, 9.003f, 9.323f, 10.452f, 9.323f, 10.764f)
                curveTo(9.478f, 10.743f, 9.641f, 10.74f, 9.802f, 10.755f)
                curveTo(10.705f, 10.839f, 11.416f, 11.58f, 11.416f, 12.5f)
                curveTo(11.416f, 13.467f, 10.632f, 14.25f, 9.666f, 14.25f)
                curveTo(9.129f, 14.25f, 8.616f, 14.005f, 8.292f, 13.66f)
                curveTo(7.777f, 13.114f, 7.5f, 12.5f, 7.5f, 11.505f)
                curveTo(7.5f, 9.755f, 8.728f, 8.187f, 10.515f, 7.412f)
                close()
                moveTo(15.515f, 7.412f)
                lineTo(15.962f, 8.1f)
                curveTo(14.294f, 9.003f, 14.323f, 10.452f, 14.323f, 10.764f)
                curveTo(14.478f, 10.743f, 14.641f, 10.74f, 14.802f, 10.755f)
                curveTo(15.705f, 10.839f, 16.416f, 11.58f, 16.416f, 12.5f)
                curveTo(16.416f, 13.467f, 15.632f, 14.25f, 14.666f, 14.25f)
                curveTo(14.129f, 14.25f, 13.616f, 14.005f, 13.292f, 13.66f)
                curveTo(12.777f, 13.114f, 12.5f, 12.5f, 12.5f, 11.505f)
                curveTo(12.5f, 9.755f, 13.728f, 8.187f, 15.515f, 7.412f)
                close()
            }
        }
        .build()
        return _chatQuoteLine!!
    }

private var _chatQuoteLine: ImageVector? = null
