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

public val SolidGroup.TrafficLight: ImageVector
    get() {
        if (_trafficLight != null) {
            return _trafficLight!!
        }
        _trafficLight = Builder(name = "TrafficLight", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, -32.0f)
                curveTo(28.7f, -32.0f, 0.0f, -3.3f, 0.0f, 32.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 88.4f, 71.6f, 160.0f, 160.0f, 160.0f)
                reflectiveCurveToRelative(160.0f, -71.6f, 160.0f, -160.0f)
                lineToRelative(0.0f, -352.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, -32.0f)
                close()
                moveTo(160.0f, 360.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                reflectiveCurveToRelative(-25.1f, 56.0f, -56.0f, 56.0f)
                reflectiveCurveToRelative(-56.0f, -25.1f, -56.0f, -56.0f)
                reflectiveCurveToRelative(25.1f, -56.0f, 56.0f, -56.0f)
                close()
                moveTo(216.0f, 256.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                close()
                moveTo(160.0f, 152.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                close()
            }
        }
        .build()
        return _trafficLight!!
    }

private var _trafficLight: ImageVector? = null
