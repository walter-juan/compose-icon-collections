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

public val SolidGroup.ChatBubbleBottomCenterText: ImageVector
    get() {
        if (_chatBubbleBottomCenterText != null) {
            return _chatBubbleBottomCenterText!!
        }
        _chatBubbleBottomCenterText = Builder(name = "ChatBubbleBottomCenterText", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.848f, 2.771f)
                curveTo(7.183f, 2.428f, 9.571f, 2.25f, 12.0f, 2.25f)
                curveTo(14.429f, 2.25f, 16.817f, 2.428f, 19.152f, 2.771f)
                curveTo(21.13f, 3.062f, 22.5f, 4.794f, 22.5f, 6.741f)
                verticalLineTo(12.759f)
                curveTo(22.5f, 14.706f, 21.13f, 16.438f, 19.152f, 16.729f)
                curveTo(18.005f, 16.898f, 16.846f, 17.026f, 15.676f, 17.114f)
                curveTo(15.551f, 17.123f, 15.443f, 17.188f, 15.379f, 17.284f)
                lineTo(12.624f, 21.416f)
                curveTo(12.485f, 21.625f, 12.251f, 21.75f, 12.0f, 21.75f)
                curveTo(11.749f, 21.75f, 11.515f, 21.625f, 11.376f, 21.416f)
                lineTo(8.621f, 17.284f)
                curveTo(8.557f, 17.187f, 8.449f, 17.123f, 8.324f, 17.113f)
                curveTo(7.154f, 17.026f, 5.995f, 16.897f, 4.848f, 16.729f)
                curveTo(2.87f, 16.438f, 1.5f, 14.705f, 1.5f, 12.759f)
                verticalLineTo(6.741f)
                curveTo(1.5f, 4.795f, 2.87f, 3.062f, 4.848f, 2.771f)
                close()
                moveTo(6.75f, 8.25f)
                curveTo(6.75f, 7.836f, 7.086f, 7.5f, 7.5f, 7.5f)
                horizontalLineTo(16.5f)
                curveTo(16.914f, 7.5f, 17.25f, 7.836f, 17.25f, 8.25f)
                curveTo(17.25f, 8.664f, 16.914f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 9.0f, 6.75f, 8.664f, 6.75f, 8.25f)
                close()
                moveTo(7.5f, 10.5f)
                curveTo(7.086f, 10.5f, 6.75f, 10.836f, 6.75f, 11.25f)
                curveTo(6.75f, 11.664f, 7.086f, 12.0f, 7.5f, 12.0f)
                horizontalLineTo(12.0f)
                curveTo(12.414f, 12.0f, 12.75f, 11.664f, 12.75f, 11.25f)
                curveTo(12.75f, 10.836f, 12.414f, 10.5f, 12.0f, 10.5f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _chatBubbleBottomCenterText!!
    }

private var _chatBubbleBottomCenterText: ImageVector? = null
