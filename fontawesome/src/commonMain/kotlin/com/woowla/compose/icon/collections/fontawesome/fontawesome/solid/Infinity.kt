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

public val SolidGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                curveToRelative(50.4f, 0.0f, 97.8f, 23.7f, 128.0f, 64.0f)
                lineToRelative(32.0f, 42.7f)
                lineToRelative(32.0f, -42.7f)
                curveToRelative(30.2f, -40.3f, 77.6f, -64.0f, 128.0f, -64.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, 71.6f, 160.0f, 160.0f)
                reflectiveCurveTo(568.4f, 416.0f, 480.0f, 416.0f)
                curveToRelative(-50.4f, 0.0f, -97.8f, -23.7f, -128.0f, -64.0f)
                lineToRelative(-32.0f, -42.7f)
                lineToRelative(-32.0f, 42.7f)
                curveToRelative(-30.2f, 40.3f, -77.6f, 64.0f, -128.0f, 64.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, -71.6f, -160.0f, -160.0f)
                close()
                moveTo(280.0f, 256.0f)
                lineToRelative(-43.2f, -57.6f)
                curveToRelative(-18.1f, -24.2f, -46.6f, -38.4f, -76.8f, -38.4f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(30.2f, 0.0f, 58.7f, -14.2f, 76.8f, -38.4f)
                lineTo(280.0f, 256.0f)
                close()
                moveTo(360.0f, 256.0f)
                lineToRelative(43.2f, 57.6f)
                curveToRelative(18.1f, 24.2f, 46.6f, 38.4f, 76.8f, 38.4f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-30.2f, 0.0f, -58.7f, 14.2f, -76.8f, 38.4f)
                lineTo(360.0f, 256.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
