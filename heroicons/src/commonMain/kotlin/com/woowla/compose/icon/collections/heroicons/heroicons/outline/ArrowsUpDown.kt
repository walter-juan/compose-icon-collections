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

public val OutlineGroup.ArrowsUpDown: ImageVector
    get() {
        if (_arrowsUpDown != null) {
            return _arrowsUpDown!!
        }
        _arrowsUpDown = Builder(name = "ArrowsUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.5f)
                lineTo(7.5f, 3.0f)
                moveTo(7.5f, 3.0f)
                lineTo(12.0f, 7.5f)
                moveTo(7.5f, 3.0f)
                verticalLineTo(16.5f)
                moveTo(21.0f, 16.5f)
                lineTo(16.5f, 21.0f)
                moveTo(16.5f, 21.0f)
                lineTo(12.0f, 16.5f)
                moveTo(16.5f, 21.0f)
                lineTo(16.5f, 7.5f)
            }
        }
        .build()
        return _arrowsUpDown!!
    }

private var _arrowsUpDown: ImageVector? = null
