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

public val BusinessGroup.PieChartLine: ImageVector
    get() {
        if (_pieChartLine != null) {
            return _pieChartLine!!
        }
        _pieChartLine = Builder(name = "PieChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.458f)
                verticalLineTo(4.582f)
                curveTo(6.068f, 5.768f, 4.0f, 8.643f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(15.357f, 20.0f, 18.232f, 17.932f, 19.419f, 15.0f)
                horizontalLineTo(21.542f)
                curveTo(20.268f, 19.057f, 16.478f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 7.522f, 4.943f, 3.732f, 9.0f, 2.458f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.337f, 21.983f, 12.671f, 21.951f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.049f)
                curveTo(11.329f, 2.017f, 11.663f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 4.062f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.487f, 7.381f, 16.619f, 4.513f, 13.0f, 4.062f)
                close()
            }
        }
        .build()
        return _pieChartLine!!
    }

private var _pieChartLine: ImageVector? = null
