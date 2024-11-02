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

public val OutlineGroup.BarsArrowUp: ImageVector
    get() {
        if (_barsArrowUp != null) {
            return _barsArrowUp!!
        }
        _barsArrowUp = Builder(name = "BarsArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 4.5f)
                horizontalLineTo(17.25f)
                moveTo(3.0f, 9.0f)
                horizontalLineTo(12.75f)
                moveTo(3.0f, 13.5f)
                horizontalLineTo(8.25f)
                moveTo(13.5f, 12.75f)
                lineTo(17.25f, 9.0f)
                moveTo(17.25f, 9.0f)
                lineTo(21.0f, 12.75f)
                moveTo(17.25f, 9.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _barsArrowUp!!
    }

private var _barsArrowUp: ImageVector? = null
