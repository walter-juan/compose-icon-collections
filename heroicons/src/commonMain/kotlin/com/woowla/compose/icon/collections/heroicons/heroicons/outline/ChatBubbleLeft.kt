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

public val OutlineGroup.ChatBubbleLeft: ImageVector
    get() {
        if (_chatBubbleLeft != null) {
            return _chatBubbleLeft!!
        }
        _chatBubbleLeft = Builder(name = "ChatBubbleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 12.759f)
                curveTo(2.25f, 14.36f, 3.373f, 15.754f, 4.957f, 15.987f)
                curveTo(6.044f, 16.147f, 7.142f, 16.27f, 8.25f, 16.356f)
                verticalLineTo(21.0f)
                lineTo(12.326f, 16.924f)
                curveTo(12.602f, 16.648f, 12.974f, 16.492f, 13.363f, 16.481f)
                curveTo(15.287f, 16.427f, 17.182f, 16.261f, 19.042f, 15.987f)
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
        return _chatBubbleLeft!!
    }

private var _chatBubbleLeft: ImageVector? = null
