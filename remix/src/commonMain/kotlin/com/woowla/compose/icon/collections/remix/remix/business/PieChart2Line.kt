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

public val BusinessGroup.PieChart2Line: ImageVector
    get() {
        if (_pieChart2Line != null) {
            return _pieChart2Line!!
        }
        _pieChart2Line = Builder(name = "PieChart2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.5f)
                curveTo(18.351f, 0.5f, 23.5f, 5.649f, 23.5f, 12.0f)
                curveTo(23.5f, 12.337f, 23.486f, 12.67f, 23.457f, 13.0f)
                horizontalLineTo(21.951f)
                curveTo(21.449f, 18.053f, 17.185f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.815f, 5.947f, 2.551f, 11.0f, 2.049f)
                verticalLineTo(0.543f)
                curveTo(11.33f, 0.514f, 11.663f, 0.5f, 12.0f, 0.5f)
                close()
                moveTo(11.0f, 4.062f)
                curveTo(7.054f, 4.554f, 4.0f, 7.92f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.08f, 20.0f, 19.446f, 16.946f, 19.938f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.062f)
                close()
                moveTo(13.0f, 2.552f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.448f)
                curveTo(20.983f, 6.552f, 17.448f, 3.017f, 13.0f, 2.552f)
                close()
            }
        }
        .build()
        return _pieChart2Line!!
    }

private var _pieChart2Line: ImageVector? = null
