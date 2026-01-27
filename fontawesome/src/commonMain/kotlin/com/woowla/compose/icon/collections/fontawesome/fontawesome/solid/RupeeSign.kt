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

public val SolidGroup.RupeeSign: ImageVector
    get() {
        if (_rupeeSign != null) {
            return _rupeeSign!!
        }
        _rupeeSign = Builder(name = "RupeeSign", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                curveToRelative(0.0f, 54.3f, -30.0f, 101.5f, -74.4f, 126.1f)
                lineToRelative(41.0f, 136.7f)
                curveToRelative(5.1f, 16.9f, -4.5f, 34.8f, -21.5f, 39.8f)
                reflectiveCurveToRelative(-34.8f, -4.5f, -39.8f, -21.5f)
                lineTo(120.1f, 319.8f)
                curveToRelative(-2.7f, 0.1f, -5.4f, 0.2f, -8.1f, 0.2f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveTo(0.0f, 465.7f, 0.0f, 448.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(64.0f, 256.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.8f, -80.0f, -80.0f, -80.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                close()
                moveTo(349.1f, 224.0f)
                lineToRelative(34.9f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-34.9f, 0.0f)
                curveToRelative(-7.2f, 0.0f, -13.1f, 5.9f, -13.1f, 13.1f)
                curveToRelative(0.0f, 5.7f, 3.7f, 10.7f, 9.1f, 12.5f)
                lineToRelative(49.4f, 15.9f)
                curveToRelative(31.9f, 10.3f, 53.5f, 39.9f, 53.5f, 73.4f)
                curveToRelative(0.0f, 42.6f, -34.5f, 77.1f, -77.1f, 77.1f)
                lineTo(320.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(50.9f, 0.0f)
                curveToRelative(7.2f, 0.0f, 13.1f, -5.9f, 13.1f, -13.1f)
                curveToRelative(0.0f, -5.7f, -3.7f, -10.7f, -9.1f, -12.5f)
                lineToRelative(-49.4f, -15.9f)
                curveToRelative(-31.9f, -10.3f, -53.5f, -39.9f, -53.5f, -73.4f)
                curveToRelative(0.0f, -42.6f, 34.5f, -77.1f, 77.1f, -77.1f)
                close()
            }
        }
        .build()
        return _rupeeSign!!
    }

private var _rupeeSign: ImageVector? = null
