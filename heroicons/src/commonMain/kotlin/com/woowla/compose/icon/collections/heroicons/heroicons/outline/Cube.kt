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

public val OutlineGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.5f)
                lineTo(12.0f, 2.25f)
                lineTo(3.0f, 7.5f)
                moveTo(21.0f, 7.5f)
                lineTo(12.0f, 12.75f)
                moveTo(21.0f, 7.5f)
                verticalLineTo(16.5f)
                lineTo(12.0f, 21.75f)
                moveTo(3.0f, 7.5f)
                lineTo(12.0f, 12.75f)
                moveTo(3.0f, 7.5f)
                verticalLineTo(16.5f)
                lineTo(12.0f, 21.75f)
                moveTo(12.0f, 12.75f)
                verticalLineTo(21.75f)
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
