package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.5f, 291.1f)
                curveTo(321.0f, 265.2f, 336.0f, 230.4f, 336.0f, 192.0f)
                curveTo(336.0f, 112.5f, 271.5f, 48.0f, 192.0f, 48.0f)
                reflectiveCurveTo(48.0f, 112.5f, 48.0f, 192.0f)
                curveToRelative(0.0f, 38.4f, 15.0f, 73.2f, 39.5f, 99.1f)
                curveToRelative(21.3f, 22.4f, 44.9f, 54.0f, 53.3f, 92.9f)
                lineToRelative(102.4f, 0.0f)
                curveToRelative(8.4f, -39.0f, 32.0f, -70.5f, 53.3f, -92.9f)
                close()
                moveTo(331.3f, 324.1f)
                curveTo(307.7f, 349.0f, 288.0f, 379.4f, 288.0f, 413.7f)
                lineToRelative(0.0f, 18.3f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                lineToRelative(0.0f, -18.3f)
                curveTo(96.0f, 379.4f, 76.3f, 349.0f, 52.7f, 324.1f)
                curveTo(20.0f, 289.7f, 0.0f, 243.2f, 0.0f, 192.0f)
                curveTo(0.0f, 86.0f, 86.0f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(384.0f, 86.0f, 384.0f, 192.0f)
                curveToRelative(0.0f, 51.2f, -20.0f, 97.7f, -52.7f, 132.1f)
                close()
                moveTo(144.0f, 184.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -48.6f, 39.4f, -88.0f, 88.0f, -88.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
