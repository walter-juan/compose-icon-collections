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

public val OutlineGroup.CursorArrowRays: ImageVector
    get() {
        if (_cursorArrowRays != null) {
            return _cursorArrowRays!!
        }
        _cursorArrowRays = Builder(name = "CursorArrowRays", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 2.25f)
                verticalLineTo(4.5f)
                moveTo(17.834f, 4.666f)
                lineTo(16.243f, 6.257f)
                moveTo(20.25f, 10.5f)
                horizontalLineTo(18.0f)
                moveTo(7.757f, 14.743f)
                lineTo(6.166f, 16.334f)
                moveTo(6.0f, 10.5f)
                horizontalLineTo(3.75f)
                moveTo(7.757f, 6.257f)
                lineTo(6.166f, 4.666f)
            }
        }
        .build()
        return _cursorArrowRays!!
    }

private var _cursorArrowRays: ImageVector? = null
