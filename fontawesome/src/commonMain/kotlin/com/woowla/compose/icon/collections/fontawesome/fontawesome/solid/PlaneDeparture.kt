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

public val SolidGroup.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 143.9f)
                lineTo(172.7f, 40.2f)
                curveToRelative(-8.0f, -4.1f, -17.3f, -4.8f, -25.7f, -1.7f)
                lineToRelative(-41.1f, 15.0f)
                curveToRelative(-10.3f, 3.7f, -13.8f, 16.4f, -7.1f, 25.0f)
                lineTo(200.3f, 206.4f)
                lineTo(100.1f, 242.8f)
                lineTo(40.0f, 206.2f)
                curveToRelative(-6.2f, -3.8f, -13.8f, -4.5f, -20.7f, -2.1f)
                lineTo(3.0f, 210.1f)
                curveToRelative(-9.4f, 3.4f, -13.4f, 14.5f, -8.3f, 23.1f)
                lineToRelative(53.6f, 91.8f)
                curveToRelative(15.6f, 26.7f, 48.1f, 38.4f, 77.1f, 27.8f)
                lineToRelative(12.9f, -4.7f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(398.4f, -145.0f)
                curveToRelative(29.1f, -10.6f, 44.0f, -42.7f, 33.5f, -71.8f)
                reflectiveCurveToRelative(-42.7f, -44.0f, -71.8f, -33.5f)
                lineTo(372.0f, 143.9f)
                close()
                moveTo(32.2f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(512.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
