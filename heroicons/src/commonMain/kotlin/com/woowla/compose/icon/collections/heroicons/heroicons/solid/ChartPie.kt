package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 13.5f)
                curveTo(2.25f, 8.944f, 5.944f, 5.25f, 10.5f, 5.25f)
                curveTo(10.914f, 5.25f, 11.25f, 5.586f, 11.25f, 6.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(18.0f)
                curveTo(18.414f, 12.75f, 18.75f, 13.086f, 18.75f, 13.5f)
                curveTo(18.75f, 18.056f, 15.056f, 21.75f, 10.5f, 21.75f)
                curveTo(5.944f, 21.75f, 2.25f, 18.056f, 2.25f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.75f, 3.0f)
                curveTo(12.75f, 2.586f, 13.086f, 2.25f, 13.5f, 2.25f)
                curveTo(18.056f, 2.25f, 21.75f, 5.944f, 21.75f, 10.5f)
                curveTo(21.75f, 10.914f, 21.414f, 11.25f, 21.0f, 11.25f)
                horizontalLineTo(13.5f)
                curveTo(13.086f, 11.25f, 12.75f, 10.914f, 12.75f, 10.5f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
