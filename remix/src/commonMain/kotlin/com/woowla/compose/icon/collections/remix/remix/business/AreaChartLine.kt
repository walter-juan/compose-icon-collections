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

public val BusinessGroup.AreaChartLine: ImageVector
    get() {
        if (_areaChartLine != null) {
            return _areaChartLine!!
        }
        _areaChartLine = Builder(name = "AreaChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.116f, 5.876f)
                lineTo(21.0f, 3.523f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.323f)
                lineTo(9.117f, 1.876f)
                lineTo(15.116f, 5.876f)
                close()
                moveTo(5.0f, 14.565f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.477f)
                lineTo(15.031f, 14.064f)
                lineTo(9.12f, 12.094f)
                lineTo(5.0f, 14.565f)
                close()
                moveTo(5.0f, 5.677f)
                verticalLineTo(12.233f)
                lineTo(8.88f, 9.906f)
                lineTo(14.968f, 11.936f)
                lineTo(19.0f, 10.322f)
                verticalLineTo(6.477f)
                lineTo(14.883f, 8.124f)
                lineTo(8.883f, 4.123f)
                lineTo(5.0f, 5.677f)
                close()
            }
        }
        .build()
        return _areaChartLine!!
    }

private var _areaChartLine: ImageVector? = null
