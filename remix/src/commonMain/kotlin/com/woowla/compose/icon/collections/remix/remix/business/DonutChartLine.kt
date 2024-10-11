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

public val BusinessGroup.DonutChartLine: ImageVector
    get() {
        if (_donutChartLine != null) {
            return _donutChartLine!!
        }
        _donutChartLine = Builder(name = "DonutChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.049f)
                lineTo(11.0f, 4.062f)
                curveTo(7.054f, 4.554f, 4.0f, 7.92f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(13.849f, 20.0f, 15.551f, 19.373f, 16.906f, 18.32f)
                lineTo(18.329f, 19.743f)
                curveTo(16.605f, 21.154f, 14.401f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.815f, 5.947f, 2.551f, 11.0f, 2.049f)
                close()
                moveTo(21.951f, 13.0f)
                curveTo(21.751f, 15.011f, 20.955f, 16.847f, 19.743f, 18.328f)
                lineTo(18.32f, 16.906f)
                curveTo(19.18f, 15.799f, 19.756f, 14.461f, 19.938f, 13.0f)
                lineTo(21.951f, 13.0f)
                close()
                moveTo(13.001f, 2.049f)
                curveTo(17.725f, 2.519f, 21.482f, 6.276f, 21.951f, 11.0f)
                lineTo(19.938f, 11.0f)
                curveTo(19.487f, 7.382f, 16.619f, 4.514f, 13.001f, 4.062f)
                lineTo(13.001f, 2.049f)
                close()
            }
        }
        .build()
        return _donutChartLine!!
    }

private var _donutChartLine: ImageVector? = null
