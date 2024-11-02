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

public val OutlineGroup.ChatBubbleOvalLeft: ImageVector
    get() {
        if (_chatBubbleOvalLeft != null) {
            return _chatBubbleOvalLeft!!
        }
        _chatBubbleOvalLeft = Builder(name = "ChatBubbleOvalLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.25f)
                curveTo(16.971f, 20.25f, 21.0f, 16.556f, 21.0f, 12.0f)
                curveTo(21.0f, 7.444f, 16.971f, 3.75f, 12.0f, 3.75f)
                curveTo(7.029f, 3.75f, 3.0f, 7.444f, 3.0f, 12.0f)
                curveTo(3.0f, 14.104f, 3.859f, 16.023f, 5.273f, 17.481f)
                curveTo(5.705f, 17.927f, 6.014f, 18.519f, 5.859f, 19.121f)
                curveTo(5.688f, 19.788f, 5.368f, 20.396f, 4.936f, 20.906f)
                curveTo(5.092f, 20.934f, 5.25f, 20.956f, 5.41f, 20.971f)
                curveTo(5.604f, 20.99f, 5.801f, 21.0f, 6.0f, 21.0f)
                curveTo(7.282f, 21.0f, 8.47f, 20.598f, 9.445f, 19.913f)
                curveTo(10.255f, 20.132f, 11.113f, 20.25f, 12.0f, 20.25f)
                close()
            }
        }
        .build()
        return _chatBubbleOvalLeft!!
    }

private var _chatBubbleOvalLeft: ImageVector? = null
