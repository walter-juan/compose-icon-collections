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

public val OutlineGroup.ChatBubbleBottomCenter: ImageVector
    get() {
        if (_chatBubbleBottomCenter != null) {
            return _chatBubbleBottomCenter!!
        }
        _chatBubbleBottomCenter = Builder(name = "ChatBubbleBottomCenter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 12.759f)
                curveTo(2.25f, 14.36f, 3.373f, 15.754f, 4.957f, 15.987f)
                curveTo(6.025f, 16.144f, 7.105f, 16.266f, 8.195f, 16.351f)
                curveTo(8.661f, 16.388f, 9.088f, 16.632f, 9.348f, 17.022f)
                lineTo(12.0f, 21.0f)
                lineTo(14.652f, 17.022f)
                curveTo(14.912f, 16.632f, 15.339f, 16.388f, 15.805f, 16.351f)
                curveTo(16.895f, 16.266f, 17.975f, 16.144f, 19.042f, 15.987f)
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
        return _chatBubbleBottomCenter!!
    }

private var _chatBubbleBottomCenter: ImageVector? = null
