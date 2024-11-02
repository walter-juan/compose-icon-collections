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

public val SolidGroup.ChatBubbleLeft: ImageVector
    get() {
        if (_chatBubbleLeft != null) {
            return _chatBubbleLeft!!
        }
        _chatBubbleLeft = Builder(name = "ChatBubbleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.848f, 2.771f)
                curveTo(7.183f, 2.428f, 9.571f, 2.25f, 12.0f, 2.25f)
                curveTo(14.429f, 2.25f, 16.817f, 2.428f, 19.152f, 2.771f)
                curveTo(21.13f, 3.062f, 22.5f, 4.794f, 22.5f, 6.741f)
                verticalLineTo(12.759f)
                curveTo(22.5f, 14.706f, 21.13f, 16.438f, 19.152f, 16.729f)
                curveTo(17.212f, 17.014f, 15.236f, 17.185f, 13.23f, 17.235f)
                curveTo(13.127f, 17.237f, 13.032f, 17.279f, 12.964f, 17.347f)
                lineTo(8.78f, 21.53f)
                curveTo(8.566f, 21.745f, 8.243f, 21.809f, 7.963f, 21.693f)
                curveTo(7.683f, 21.577f, 7.5f, 21.303f, 7.5f, 21.0f)
                verticalLineTo(17.045f)
                curveTo(6.609f, 16.963f, 5.725f, 16.858f, 4.848f, 16.729f)
                curveTo(2.87f, 16.438f, 1.5f, 14.705f, 1.5f, 12.759f)
                verticalLineTo(6.741f)
                curveTo(1.5f, 4.795f, 2.87f, 3.062f, 4.848f, 2.771f)
                close()
            }
        }
        .build()
        return _chatBubbleLeft!!
    }

private var _chatBubbleLeft: ImageVector? = null
