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

public val SolidGroup.ChatBubbleOvalLeft: ImageVector
    get() {
        if (_chatBubbleOvalLeft != null) {
            return _chatBubbleOvalLeft!!
        }
        _chatBubbleOvalLeft = Builder(name = "ChatBubbleOvalLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.337f, 21.718f)
                curveTo(5.157f, 21.7f, 4.979f, 21.676f, 4.804f, 21.644f)
                curveTo(4.54f, 21.597f, 4.321f, 21.412f, 4.23f, 21.16f)
                curveTo(4.139f, 20.907f, 4.19f, 20.626f, 4.364f, 20.421f)
                curveTo(4.767f, 19.945f, 5.053f, 19.368f, 5.178f, 18.735f)
                curveTo(5.201f, 18.62f, 5.156f, 18.418f, 4.924f, 18.192f)
                curveTo(3.275f, 16.587f, 2.25f, 14.409f, 2.25f, 12.0f)
                curveTo(2.25f, 6.969f, 6.678f, 3.0f, 12.0f, 3.0f)
                curveTo(17.322f, 3.0f, 21.75f, 6.969f, 21.75f, 12.0f)
                curveTo(21.75f, 17.031f, 17.322f, 21.0f, 12.0f, 21.0f)
                curveTo(11.167f, 21.0f, 10.357f, 20.903f, 9.583f, 20.721f)
                curveTo(8.544f, 21.373f, 7.315f, 21.75f, 6.0f, 21.75f)
                curveTo(5.776f, 21.75f, 5.555f, 21.739f, 5.337f, 21.718f)
                close()
            }
        }
        .build()
        return _chatBubbleOvalLeft!!
    }

private var _chatBubbleOvalLeft: ImageVector? = null
