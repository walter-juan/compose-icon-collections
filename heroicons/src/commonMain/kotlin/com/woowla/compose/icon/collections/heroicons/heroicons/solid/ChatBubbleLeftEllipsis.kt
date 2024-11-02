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

public val SolidGroup.ChatBubbleLeftEllipsis: ImageVector
    get() {
        if (_chatBubbleLeftEllipsis != null) {
            return _chatBubbleLeftEllipsis!!
        }
        _chatBubbleLeftEllipsis = Builder(name = "ChatBubbleLeftEllipsis", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(9.571f, 2.25f, 7.183f, 2.428f, 4.848f, 2.771f)
                curveTo(2.87f, 3.062f, 1.5f, 4.795f, 1.5f, 6.741f)
                verticalLineTo(12.759f)
                curveTo(1.5f, 14.705f, 2.87f, 16.438f, 4.848f, 16.729f)
                curveTo(5.725f, 16.858f, 6.609f, 16.963f, 7.5f, 17.045f)
                verticalLineTo(21.0f)
                curveTo(7.5f, 21.303f, 7.683f, 21.577f, 7.963f, 21.693f)
                curveTo(8.243f, 21.809f, 8.566f, 21.745f, 8.78f, 21.53f)
                lineTo(12.964f, 17.347f)
                curveTo(13.032f, 17.279f, 13.127f, 17.237f, 13.23f, 17.235f)
                curveTo(15.236f, 17.185f, 17.212f, 17.014f, 19.152f, 16.729f)
                curveTo(21.13f, 16.438f, 22.5f, 14.706f, 22.5f, 12.759f)
                verticalLineTo(6.741f)
                curveTo(22.5f, 4.794f, 21.13f, 3.062f, 19.152f, 2.771f)
                curveTo(16.817f, 2.428f, 14.429f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(8.25f, 8.625f)
                curveTo(7.629f, 8.625f, 7.125f, 9.129f, 7.125f, 9.75f)
                curveTo(7.125f, 10.371f, 7.629f, 10.875f, 8.25f, 10.875f)
                curveTo(8.871f, 10.875f, 9.375f, 10.371f, 9.375f, 9.75f)
                curveTo(9.375f, 9.129f, 8.871f, 8.625f, 8.25f, 8.625f)
                close()
                moveTo(10.875f, 9.75f)
                curveTo(10.875f, 9.129f, 11.379f, 8.625f, 12.0f, 8.625f)
                curveTo(12.621f, 8.625f, 13.125f, 9.129f, 13.125f, 9.75f)
                curveTo(13.125f, 10.371f, 12.621f, 10.875f, 12.0f, 10.875f)
                curveTo(11.379f, 10.875f, 10.875f, 10.371f, 10.875f, 9.75f)
                close()
                moveTo(15.75f, 8.625f)
                curveTo(15.129f, 8.625f, 14.625f, 9.129f, 14.625f, 9.75f)
                curveTo(14.625f, 10.371f, 15.129f, 10.875f, 15.75f, 10.875f)
                curveTo(16.371f, 10.875f, 16.875f, 10.371f, 16.875f, 9.75f)
                curveTo(16.875f, 9.129f, 16.371f, 8.625f, 15.75f, 8.625f)
                close()
            }
        }
        .build()
        return _chatBubbleLeftEllipsis!!
    }

private var _chatBubbleLeftEllipsis: ImageVector? = null
