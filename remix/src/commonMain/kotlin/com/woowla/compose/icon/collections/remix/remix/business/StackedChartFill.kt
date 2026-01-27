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

public val BusinessGroup.StackedChartFill: ImageVector
    get() {
        if (_stackedChartFill != null) {
            return _stackedChartFill!!
        }
        _stackedChartFill = Builder(name = "StackedChartFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(14.5f, 21.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(21.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(14.5f, 14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _stackedChartFill!!
    }

private var _stackedChartFill: ImageVector? = null
