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

public val BusinessGroup.DonutChartFill: ImageVector
    get() {
        if (_donutChartFill != null) {
            return _donutChartFill!!
        }
        _donutChartFill = Builder(name = "DonutChartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.049f)
                lineTo(11.0f, 5.071f)
                curveTo(7.608f, 5.556f, 5.0f, 8.474f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(13.572f, 19.0f, 15.024f, 18.482f, 16.192f, 17.606f)
                lineTo(18.329f, 19.743f)
                curveTo(16.605f, 21.154f, 14.401f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.815f, 5.947f, 2.551f, 11.0f, 2.049f)
                close()
                moveTo(21.951f, 13.0f)
                curveTo(21.751f, 15.011f, 20.955f, 16.847f, 19.743f, 18.328f)
                lineTo(17.606f, 16.192f)
                curveTo(18.293f, 15.276f, 18.76f, 14.186f, 18.929f, 13.0f)
                lineTo(21.951f, 13.0f)
                close()
                moveTo(13.001f, 2.049f)
                curveTo(17.725f, 2.519f, 21.482f, 6.276f, 21.951f, 11.0f)
                lineTo(18.929f, 11.0f)
                curveTo(18.49f, 7.935f, 16.066f, 5.51f, 13.001f, 5.071f)
                lineTo(13.001f, 2.049f)
                close()
            }
        }
        .build()
        return _donutChartFill!!
    }

private var _donutChartFill: ImageVector? = null
