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

public val BusinessGroup.StackedChartLine: ImageVector
    get() {
        if (_stackedChartLine != null) {
            return _stackedChartLine!!
        }
        _stackedChartLine = Builder(name = "StackedChartLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(14.5f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(21.0f, 9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(11.5f, 18.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(5.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(11.5f, 14.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _stackedChartLine!!
    }

private var _stackedChartLine: ImageVector? = null
