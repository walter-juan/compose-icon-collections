package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.LineChartFill: ImageVector
    get() {
        if (_lineChartFill != null) {
            return _lineChartFill!!
        }
        _lineChartFill = Builder(name = "LineChartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.939f, 5.939f)
                lineTo(22.061f, 8.061f)
                lineTo(16.0f, 14.121f)
                lineTo(13.0f, 11.121f)
                lineTo(9.061f, 15.061f)
                lineTo(6.939f, 12.939f)
                lineTo(13.0f, 6.879f)
                lineTo(16.0f, 9.879f)
                lineTo(19.939f, 5.939f)
                close()
            }
        }
        .build()
        return _lineChartFill!!
    }

private var _lineChartFill: ImageVector? = null
