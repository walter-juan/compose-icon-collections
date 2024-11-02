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

public val OutlineGroup.PresentationChartBar: ImageVector
    get() {
        if (_presentationChartBar != null) {
            return _presentationChartBar!!
        }
        _presentationChartBar = Builder(name = "PresentationChartBar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 3.0f)
                verticalLineTo(14.25f)
                curveTo(3.75f, 15.493f, 4.757f, 16.5f, 6.0f, 16.5f)
                horizontalLineTo(8.25f)
                moveTo(3.75f, 3.0f)
                horizontalLineTo(2.25f)
                moveTo(3.75f, 3.0f)
                horizontalLineTo(20.25f)
                moveTo(20.25f, 3.0f)
                horizontalLineTo(21.75f)
                moveTo(20.25f, 3.0f)
                verticalLineTo(14.25f)
                curveTo(20.25f, 15.493f, 19.243f, 16.5f, 18.0f, 16.5f)
                horizontalLineTo(15.75f)
                moveTo(8.25f, 16.5f)
                horizontalLineTo(15.75f)
                moveTo(8.25f, 16.5f)
                lineTo(7.25f, 19.5f)
                moveTo(15.75f, 16.5f)
                lineTo(16.75f, 19.5f)
                moveTo(16.75f, 19.5f)
                lineTo(17.25f, 21.0f)
                moveTo(16.75f, 19.5f)
                horizontalLineTo(7.25f)
                moveTo(7.25f, 19.5f)
                lineTo(6.75f, 21.0f)
                moveTo(9.0f, 11.25f)
                verticalLineTo(12.75f)
                moveTo(12.0f, 9.0f)
                verticalLineTo(12.75f)
                moveTo(15.0f, 6.75f)
                verticalLineTo(12.75f)
            }
        }
        .build()
        return _presentationChartBar!!
    }

private var _presentationChartBar: ImageVector? = null
