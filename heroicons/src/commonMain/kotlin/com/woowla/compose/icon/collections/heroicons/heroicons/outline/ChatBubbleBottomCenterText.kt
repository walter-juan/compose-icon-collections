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

public val OutlineGroup.ChatBubbleBottomCenterText: ImageVector
    get() {
        if (_chatBubbleBottomCenterText != null) {
            return _chatBubbleBottomCenterText!!
        }
        _chatBubbleBottomCenterText = Builder(name = "ChatBubbleBottomCenterText", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 8.25f)
                horizontalLineTo(16.5f)
                moveTo(7.5f, 11.25f)
                horizontalLineTo(12.0f)
                moveTo(2.25f, 12.759f)
                curveTo(2.25f, 14.36f, 3.373f, 15.754f, 4.957f, 15.987f)
                curveTo(6.086f, 16.153f, 7.227f, 16.28f, 8.38f, 16.365f)
                curveTo(8.73f, 16.392f, 9.05f, 16.575f, 9.245f, 16.867f)
                lineTo(12.0f, 21.0f)
                lineTo(14.755f, 16.868f)
                curveTo(14.95f, 16.575f, 15.27f, 16.392f, 15.62f, 16.366f)
                curveTo(16.773f, 16.28f, 17.914f, 16.153f, 19.042f, 15.987f)
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
        return _chatBubbleBottomCenterText!!
    }

private var _chatBubbleBottomCenterText: ImageVector? = null
