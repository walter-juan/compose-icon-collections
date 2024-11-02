package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 6.0f)
                curveTo(6.358f, 6.0f, 3.0f, 9.358f, 3.0f, 13.5f)
                curveTo(3.0f, 17.642f, 6.358f, 21.0f, 10.5f, 21.0f)
                curveTo(14.642f, 21.0f, 18.0f, 17.642f, 18.0f, 13.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 10.5f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 6.358f, 17.642f, 3.0f, 13.5f, 3.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
