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

public val CommunicationGroup.ChatQuoteFill: ImageVector
    get() {
        if (_chatQuoteFill != null) {
            return _chatQuoteFill!!
        }
        _chatQuoteFill = Builder(name = "ChatQuoteFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(10.515f, 7.412f)
                curveTo(8.728f, 8.187f, 7.5f, 9.755f, 7.5f, 11.505f)
                curveTo(7.5f, 12.5f, 7.777f, 13.114f, 8.292f, 13.66f)
                curveTo(8.616f, 14.005f, 9.129f, 14.25f, 9.666f, 14.25f)
                curveTo(10.632f, 14.25f, 11.416f, 13.467f, 11.416f, 12.5f)
                curveTo(11.416f, 11.58f, 10.705f, 10.839f, 9.802f, 10.755f)
                curveTo(9.641f, 10.74f, 9.478f, 10.743f, 9.323f, 10.764f)
                lineTo(9.323f, 10.673f)
                curveTo(9.329f, 10.232f, 9.422f, 8.933f, 10.962f, 8.1f)
                lineTo(10.515f, 7.412f)
                close()
                moveTo(15.515f, 7.412f)
                curveTo(13.728f, 8.187f, 12.5f, 9.755f, 12.5f, 11.505f)
                curveTo(12.5f, 12.5f, 12.777f, 13.114f, 13.292f, 13.66f)
                curveTo(13.616f, 14.005f, 14.129f, 14.25f, 14.666f, 14.25f)
                curveTo(15.632f, 14.25f, 16.416f, 13.467f, 16.416f, 12.5f)
                curveTo(16.416f, 11.58f, 15.705f, 10.839f, 14.802f, 10.755f)
                curveTo(14.641f, 10.74f, 14.478f, 10.743f, 14.323f, 10.764f)
                lineTo(14.323f, 10.673f)
                curveTo(14.329f, 10.232f, 14.422f, 8.933f, 15.962f, 8.1f)
                lineTo(15.515f, 7.412f)
                close()
            }
        }
        .build()
        return _chatQuoteFill!!
    }

private var _chatQuoteFill: ImageVector? = null
