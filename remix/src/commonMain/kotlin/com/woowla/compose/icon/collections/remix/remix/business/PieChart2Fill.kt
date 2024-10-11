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

public val BusinessGroup.PieChart2Fill: ImageVector
    get() {
        if (_pieChart2Fill != null) {
            return _pieChart2Fill!!
        }
        _pieChart2Fill = Builder(name = "PieChart2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.049f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.951f)
                curveTo(21.449f, 18.053f, 17.185f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.815f, 5.947f, 2.551f, 11.0f, 2.049f)
                close()
                moveTo(13.0f, 0.543f)
                curveTo(18.553f, 1.021f, 22.979f, 5.446f, 23.457f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.543f)
                close()
            }
        }
        .build()
        return _pieChart2Fill!!
    }

private var _pieChart2Fill: ImageVector? = null
