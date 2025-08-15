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

public val SolidGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 168.6f)
                lineToRelative(144.0f, -83.1f)
                curveToRelative(15.3f, -8.8f, 34.9f, -3.6f, 43.7f, 11.7f)
                reflectiveCurveToRelative(3.6f, 34.9f, -11.7f, 43.7f)
                lineTo(288.0f, 256.0f)
                lineTo(432.0f, 339.1f)
                curveToRelative(15.3f, 8.8f, 20.6f, 28.4f, 11.7f, 43.7f)
                reflectiveCurveToRelative(-28.4f, 20.6f, -43.7f, 11.7f)
                lineTo(256.0f, 311.4f)
                lineTo(256.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -168.6f)
                lineToRelative(-144.0f, 83.1f)
                curveToRelative(-15.3f, 8.8f, -34.9f, 3.6f, -43.7f, -11.7f)
                reflectiveCurveTo(0.7f, 348.0f, 16.0f, 339.1f)
                lineTo(160.0f, 256.0f)
                lineTo(16.0f, 172.9f)
                curveTo(0.7f, 164.0f, -4.5f, 144.5f, 4.3f, 129.1f)
                reflectiveCurveTo(32.7f, 108.6f, 48.0f, 117.4f)
                lineTo(192.0f, 200.6f)
                lineTo(192.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
