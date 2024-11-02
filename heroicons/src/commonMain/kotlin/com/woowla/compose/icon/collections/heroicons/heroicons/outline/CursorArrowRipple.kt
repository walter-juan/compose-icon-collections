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

public val OutlineGroup.CursorArrowRipple: ImageVector
    get() {
        if (_cursorArrowRipple != null) {
            return _cursorArrowRipple!!
        }
        _cursorArrowRipple = Builder(name = "CursorArrowRipple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.042f, 21.672f)
                lineTo(13.684f, 16.601f)
                moveTo(13.684f, 16.601f)
                lineTo(11.174f, 18.826f)
                lineTo(11.743f, 9.356f)
                lineTo(16.97f, 17.273f)
                lineTo(13.684f, 16.601f)
                close()
                moveTo(6.166f, 16.334f)
                curveTo(2.945f, 13.112f, 2.945f, 7.888f, 6.166f, 4.666f)
                curveTo(9.388f, 1.445f, 14.612f, 1.445f, 17.834f, 4.666f)
                curveTo(19.444f, 6.277f, 20.25f, 8.389f, 20.25f, 10.5f)
                moveTo(8.288f, 14.212f)
                curveTo(6.237f, 12.162f, 6.237f, 8.838f, 8.288f, 6.788f)
                curveTo(10.338f, 4.737f, 13.662f, 4.737f, 15.712f, 6.788f)
                curveTo(16.737f, 7.813f, 17.25f, 9.156f, 17.25f, 10.5f)
            }
        }
        .build()
        return _cursorArrowRipple!!
    }

private var _cursorArrowRipple: ImageVector? = null
