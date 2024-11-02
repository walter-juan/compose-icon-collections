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

public val OutlineGroup.ChatBubbleLeftRight: ImageVector
    get() {
        if (_chatBubbleLeftRight != null) {
            return _chatBubbleLeftRight!!
        }
        _chatBubbleLeftRight = Builder(name = "ChatBubbleLeftRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 8.511f)
                curveTo(21.134f, 8.795f, 21.75f, 9.639f, 21.75f, 10.608f)
                verticalLineTo(14.894f)
                curveTo(21.75f, 16.03f, 20.903f, 16.994f, 19.77f, 17.087f)
                curveTo(19.431f, 17.114f, 19.091f, 17.139f, 18.75f, 17.159f)
                verticalLineTo(20.25f)
                lineTo(15.75f, 17.25f)
                curveTo(14.396f, 17.25f, 13.056f, 17.195f, 11.73f, 17.087f)
                curveTo(11.432f, 17.062f, 11.153f, 16.978f, 10.905f, 16.845f)
                moveTo(20.25f, 8.511f)
                curveTo(20.099f, 8.462f, 19.939f, 8.43f, 19.774f, 8.416f)
                curveTo(18.447f, 8.306f, 17.105f, 8.25f, 15.75f, 8.25f)
                curveTo(14.395f, 8.25f, 13.053f, 8.306f, 11.726f, 8.416f)
                curveTo(10.595f, 8.51f, 9.75f, 9.473f, 9.75f, 10.608f)
                verticalLineTo(14.894f)
                curveTo(9.75f, 15.731f, 10.21f, 16.475f, 10.905f, 16.845f)
                moveTo(20.25f, 8.511f)
                verticalLineTo(6.637f)
                curveTo(20.25f, 5.016f, 19.098f, 3.611f, 17.49f, 3.402f)
                curveTo(15.448f, 3.137f, 13.365f, 3.0f, 11.25f, 3.0f)
                curveTo(9.135f, 3.0f, 7.052f, 3.137f, 5.01f, 3.402f)
                curveTo(3.402f, 3.611f, 2.25f, 5.016f, 2.25f, 6.637f)
                verticalLineTo(12.863f)
                curveTo(2.25f, 14.484f, 3.402f, 15.889f, 5.01f, 16.098f)
                curveTo(5.587f, 16.173f, 6.167f, 16.238f, 6.75f, 16.292f)
                verticalLineTo(21.0f)
                lineTo(10.905f, 16.845f)
            }
        }
        .build()
        return _chatBubbleLeftRight!!
    }

private var _chatBubbleLeftRight: ImageVector? = null
