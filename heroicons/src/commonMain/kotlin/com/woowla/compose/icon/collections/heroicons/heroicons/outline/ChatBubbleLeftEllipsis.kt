package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.ChatBubbleLeftEllipsis: ImageVector
    get() {
        if (_chatBubbleLeftEllipsis != null) {
            return _chatBubbleLeftEllipsis!!
        }
        _chatBubbleLeftEllipsis = Builder(name = "ChatBubbleLeftEllipsis", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.625f, 9.75f)
                curveTo(8.625f, 9.957f, 8.457f, 10.125f, 8.25f, 10.125f)
                curveTo(8.043f, 10.125f, 7.875f, 9.957f, 7.875f, 9.75f)
                curveTo(7.875f, 9.543f, 8.043f, 9.375f, 8.25f, 9.375f)
                curveTo(8.457f, 9.375f, 8.625f, 9.543f, 8.625f, 9.75f)
                close()
                moveTo(8.625f, 9.75f)
                horizontalLineTo(8.25f)
                moveTo(12.375f, 9.75f)
                curveTo(12.375f, 9.957f, 12.207f, 10.125f, 12.0f, 10.125f)
                curveTo(11.793f, 10.125f, 11.625f, 9.957f, 11.625f, 9.75f)
                curveTo(11.625f, 9.543f, 11.793f, 9.375f, 12.0f, 9.375f)
                curveTo(12.207f, 9.375f, 12.375f, 9.543f, 12.375f, 9.75f)
                close()
                moveTo(12.375f, 9.75f)
                horizontalLineTo(12.0f)
                moveTo(16.125f, 9.75f)
                curveTo(16.125f, 9.957f, 15.957f, 10.125f, 15.75f, 10.125f)
                curveTo(15.543f, 10.125f, 15.375f, 9.957f, 15.375f, 9.75f)
                curveTo(15.375f, 9.543f, 15.543f, 9.375f, 15.75f, 9.375f)
                curveTo(15.957f, 9.375f, 16.125f, 9.543f, 16.125f, 9.75f)
                close()
                moveTo(16.125f, 9.75f)
                horizontalLineTo(15.75f)
                moveTo(2.25f, 12.759f)
                curveTo(2.25f, 14.36f, 3.373f, 15.754f, 4.957f, 15.987f)
                curveTo(6.044f, 16.147f, 7.142f, 16.27f, 8.25f, 16.356f)
                verticalLineTo(21.0f)
                lineTo(12.434f, 16.816f)
                curveTo(12.64f, 16.61f, 12.919f, 16.492f, 13.212f, 16.485f)
                curveTo(15.187f, 16.436f, 17.133f, 16.268f, 19.042f, 15.987f)
                curveTo(20.627f, 15.754f, 21.75f, 14.361f, 21.75f, 12.759f)
                verticalLineTo(6.741f)
                curveTo(21.75f, 5.139f, 20.627f, 3.746f, 19.042f, 3.513f)
                curveTo(16.744f, 3.175f, 14.393f, 3.0f, 12.0f, 3.0f)
                curveTo(9.608f, 3.0f, 7.256f, 3.175f, 4.957f, 3.513f)
                curveTo(3.373f, 3.746f, 2.25f, 5.14f, 2.25f, 6.741f)
                verticalLineTo(12.759f)
                close()
            }
        }
        .build()
        return _chatBubbleLeftEllipsis!!
    }

private var _chatBubbleLeftEllipsis: ImageVector? = null
