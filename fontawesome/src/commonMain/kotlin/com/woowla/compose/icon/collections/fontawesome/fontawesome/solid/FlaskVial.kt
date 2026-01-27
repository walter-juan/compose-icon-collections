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

public val SolidGroup.FlaskVial: ImageVector
    get() {
        if (_flaskVial != null) {
            return _flaskVial!!
        }
        _flaskVial = Builder(name = "FlaskVial", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.6f, 411.5f)
                curveToRelative(-3.1f, 7.3f, -5.4f, 14.9f, -6.8f, 22.6f)
                curveToRelative(-14.5f, 8.8f, -31.5f, 13.9f, -49.8f, 13.9f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(32.0f, 64.0f)
                curveTo(14.3f, 64.0f, 0.0f, 49.7f, 0.0f, 32.0f)
                reflectiveCurveTo(14.3f, 0.0f, 32.0f, 0.0f)
                lineTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 255.6f)
                lineToRelative(-39.4f, 91.9f)
                close()
                moveTo(96.0f, 64.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(352.0f, 0.0f)
                lineTo(512.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 153.4f)
                lineToRelative(91.3f, 213.0f)
                curveToRelative(2.3f, 5.4f, 3.8f, 11.1f, 4.4f, 17.0f)
                lineToRelative(0.3f, 0.6f)
                lineToRelative(-0.3f, 0.0f)
                curveToRelative(0.2f, 1.8f, 0.3f, 3.6f, 0.3f, 5.4f)
                curveToRelative(0.0f, 32.3f, -26.2f, 58.6f, -58.6f, 58.6f)
                lineToRelative(-266.9f, 0.0f)
                curveToRelative(-32.3f, 0.0f, -58.6f, -26.2f, -58.6f, -58.6f)
                curveToRelative(0.0f, -1.8f, 0.1f, -3.6f, 0.3f, -5.4f)
                lineToRelative(-0.3f, 0.0f)
                lineToRelative(0.3f, -0.6f)
                curveToRelative(0.6f, -5.8f, 2.1f, -11.6f, 4.4f, -17.0f)
                lineTo(320.0f, 217.4f)
                lineTo(320.0f, 64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveTo(302.3f, 0.0f, 320.0f, 0.0f)
                lineToRelative(32.0f, 0.0f)
                close()
                moveTo(453.2f, 242.6f)
                curveToRelative(-3.4f, -8.0f, -5.2f, -16.5f, -5.2f, -25.2f)
                lineToRelative(0.0f, -153.4f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 153.4f)
                curveToRelative(0.0f, 8.7f, -1.8f, 17.2f, -5.2f, 25.2f)
                lineToRelative(-33.2f, 77.4f)
                lineToRelative(140.7f, 0.0f)
                lineToRelative(-33.2f, -77.4f)
                close()
            }
        }
        .build()
        return _flaskVial!!
    }

private var _flaskVial: ImageVector? = null
