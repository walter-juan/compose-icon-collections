package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ChatBubbleOvalLeftEllipsis: ImageVector
    get() {
        if (_chatBubbleOvalLeftEllipsis != null) {
            return _chatBubbleOvalLeftEllipsis!!
        }
        _chatBubbleOvalLeftEllipsis = Builder(name = "ChatBubbleOvalLeftEllipsis", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.804f, 21.644f)
                curveTo(4.979f, 21.676f, 5.157f, 21.7f, 5.337f, 21.718f)
                curveTo(5.555f, 21.739f, 5.776f, 21.75f, 6.0f, 21.75f)
                curveTo(7.315f, 21.75f, 8.544f, 21.373f, 9.583f, 20.721f)
                curveTo(10.357f, 20.903f, 11.167f, 21.0f, 12.0f, 21.0f)
                curveTo(17.322f, 21.0f, 21.75f, 17.031f, 21.75f, 12.0f)
                curveTo(21.75f, 6.969f, 17.322f, 3.0f, 12.0f, 3.0f)
                curveTo(6.678f, 3.0f, 2.25f, 6.969f, 2.25f, 12.0f)
                curveTo(2.25f, 14.409f, 3.275f, 16.587f, 4.924f, 18.192f)
                curveTo(5.156f, 18.418f, 5.201f, 18.62f, 5.178f, 18.735f)
                curveTo(5.053f, 19.368f, 4.767f, 19.945f, 4.364f, 20.421f)
                curveTo(4.19f, 20.626f, 4.139f, 20.907f, 4.23f, 21.16f)
                curveTo(4.321f, 21.412f, 4.54f, 21.597f, 4.804f, 21.644f)
                close()
                moveTo(8.25f, 10.875f)
                curveTo(7.629f, 10.875f, 7.125f, 11.379f, 7.125f, 12.0f)
                curveTo(7.125f, 12.621f, 7.629f, 13.125f, 8.25f, 13.125f)
                curveTo(8.871f, 13.125f, 9.375f, 12.621f, 9.375f, 12.0f)
                curveTo(9.375f, 11.379f, 8.871f, 10.875f, 8.25f, 10.875f)
                close()
                moveTo(10.875f, 12.0f)
                curveTo(10.875f, 11.379f, 11.379f, 10.875f, 12.0f, 10.875f)
                curveTo(12.621f, 10.875f, 13.125f, 11.379f, 13.125f, 12.0f)
                curveTo(13.125f, 12.621f, 12.621f, 13.125f, 12.0f, 13.125f)
                curveTo(11.379f, 13.125f, 10.875f, 12.621f, 10.875f, 12.0f)
                close()
                moveTo(15.75f, 10.875f)
                curveTo(15.129f, 10.875f, 14.625f, 11.379f, 14.625f, 12.0f)
                curveTo(14.625f, 12.621f, 15.129f, 13.125f, 15.75f, 13.125f)
                curveTo(16.371f, 13.125f, 16.875f, 12.621f, 16.875f, 12.0f)
                curveTo(16.875f, 11.379f, 16.371f, 10.875f, 15.75f, 10.875f)
                close()
            }
        }
        .build()
        return _chatBubbleOvalLeftEllipsis!!
    }

private var _chatBubbleOvalLeftEllipsis: ImageVector? = null
