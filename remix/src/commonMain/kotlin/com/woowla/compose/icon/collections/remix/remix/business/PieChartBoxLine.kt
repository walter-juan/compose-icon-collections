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

public val BusinessGroup.PieChartBoxLine: ImageVector
    get() {
        if (_pieChartBoxLine != null) {
            return _pieChartBoxLine!!
        }
        _pieChartBoxLine = Builder(name = "PieChartBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(16.9f, 13.0f)
                curveTo(16.437f, 15.282f, 14.419f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                curveTo(7.0f, 9.581f, 8.718f, 7.563f, 11.0f, 7.1f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.9f)
                close()
                moveTo(16.9f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.1f)
                curveTo(14.959f, 7.498f, 16.502f, 9.041f, 16.9f, 11.0f)
                close()
            }
        }
        .build()
        return _pieChartBoxLine!!
    }

private var _pieChartBoxLine: ImageVector? = null