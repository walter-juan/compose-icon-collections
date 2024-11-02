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

public val OutlineGroup.Bars4: ImageVector
    get() {
        if (_bars4 != null) {
            return _bars4!!
        }
        _bars4 = Builder(name = "Bars4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 5.25f)
                horizontalLineTo(20.25f)
                moveTo(3.75f, 9.75f)
                horizontalLineTo(20.25f)
                moveTo(3.75f, 14.25f)
                horizontalLineTo(20.25f)
                moveTo(3.75f, 18.75f)
                horizontalLineTo(20.25f)
            }
        }
        .build()
        return _bars4!!
    }

private var _bars4: ImageVector? = null
