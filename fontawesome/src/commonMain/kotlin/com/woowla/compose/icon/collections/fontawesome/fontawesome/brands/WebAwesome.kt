package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.WebAwesome: ImageVector
    get() {
        if (_webAwesome != null) {
            return _webAwesome!!
        }
        _webAwesome = Builder(name = "WebAwesome", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.2f, 52.0f)
                curveToRelative(0.0f, 20.9f, -12.4f, 39.0f, -30.2f, 47.2f)
                lineTo(448.0f, 192.0f)
                lineToRelative(104.4f, -20.9f)
                curveToRelative(-5.3f, -7.7f, -8.4f, -17.1f, -8.4f, -27.1f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 26.0f, -20.6f, 47.1f, -46.4f, 48.0f)
                lineTo(481.0f, 442.3f)
                curveToRelative(-10.3f, 23.0f, -33.2f, 37.7f, -58.4f, 37.7f)
                lineToRelative(-205.2f, 0.0f)
                curveToRelative(-25.2f, 0.0f, -48.0f, -14.8f, -58.4f, -37.7f)
                lineTo(46.4f, 192.0f)
                curveTo(20.6f, 191.1f, 0.0f, 170.0f, 0.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 10.1f, -3.1f, 19.4f, -8.4f, 27.1f)
                lineTo(192.0f, 192.0f)
                lineTo(298.1f, 99.1f)
                curveToRelative(-17.7f, -8.3f, -30.0f, -26.3f, -30.0f, -47.1f)
                curveToRelative(0.0f, -28.7f, 23.3f, -52.0f, 52.0f, -52.0f)
                reflectiveCurveToRelative(52.0f, 23.3f, 52.0f, 52.0f)
                close()
            }
        }
        .build()
        return _webAwesome!!
    }

private var _webAwesome: ImageVector? = null
