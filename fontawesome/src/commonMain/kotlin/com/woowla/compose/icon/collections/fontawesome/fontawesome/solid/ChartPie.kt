package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.4f, 240.0f)
                lineToRelative(-176.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -176.0f)
                curveToRelative(0.0f, -17.7f, 14.4f, -32.2f, 31.9f, -29.9f)
                curveToRelative(107.0f, 14.2f, 191.8f, 99.0f, 206.0f, 206.0f)
                curveToRelative(2.3f, 17.5f, -12.2f, 31.9f, -29.9f, 31.9f)
                close()
                moveTo(222.6f, 37.2f)
                curveToRelative(18.1f, -3.8f, 33.8f, 11.0f, 33.8f, 29.5f)
                lineToRelative(0.0f, 197.3f)
                curveToRelative(0.0f, 5.6f, 2.0f, 11.0f, 5.5f, 15.3f)
                lineTo(394.0f, 438.7f)
                curveToRelative(11.7f, 14.1f, 9.2f, 35.4f, -6.9f, 44.1f)
                curveToRelative(-34.1f, 18.6f, -73.2f, 29.2f, -114.7f, 29.2f)
                curveToRelative(-132.5f, 0.0f, -240.0f, -107.5f, -240.0f, -240.0f)
                curveToRelative(0.0f, -115.5f, 81.5f, -211.9f, 190.2f, -234.8f)
                close()
                moveTo(477.8f, 288.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(18.5f, 0.0f, 33.3f, 15.7f, 29.5f, 33.8f)
                curveToRelative(-10.2f, 48.4f, -35.0f, 91.4f, -69.6f, 124.2f)
                curveToRelative(-12.3f, 11.7f, -31.6f, 9.2f, -42.4f, -3.9f)
                lineTo(374.9f, 340.4f)
                curveToRelative(-17.3f, -20.9f, -2.4f, -52.4f, 24.6f, -52.4f)
                lineToRelative(78.2f, 0.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
