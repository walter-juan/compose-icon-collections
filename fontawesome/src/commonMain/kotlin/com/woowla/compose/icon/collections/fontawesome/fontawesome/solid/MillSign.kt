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

public val SolidGroup.MillSign: ImageVector
    get() {
        if (_millSign != null) {
            return _millSign!!
        }
        _millSign = Builder(name = "MillSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.0f, -22.2f)
                curveToRelative(12.3f, 5.0f, 18.2f, 19.0f, 13.2f, 31.3f)
                lineToRelative(-29.0f, 71.3f)
                curveTo(338.8f, 85.1f, 384.0f, 133.3f, 384.0f, 192.0f)
                lineToRelative(0.0f, 208.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -208.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                curveToRelative(-6.4f, 0.0f, -12.5f, 1.2f, -18.0f, 3.5f)
                lineToRelative(-30.0f, 73.8f)
                lineToRelative(0.0f, 178.7f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -21.2f)
                lineToRelative(-57.8f, 142.2f)
                curveToRelative(-5.0f, 12.3f, -19.0f, 18.2f, -31.3f, 13.2f)
                reflectiveCurveToRelative(-18.2f, -19.0f, -13.2f, -31.3f)
                lineTo(160.0f, 251.3f)
                lineTo(160.0f, 192.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 208.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveTo(0.0f, 417.7f, 0.0f, 400.0f)
                lineTo(0.0f, 112.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                curveToRelative(10.9f, 0.0f, 20.5f, 5.4f, 26.3f, 13.7f)
                curveToRelative(16.0f, -8.7f, 34.3f, -13.7f, 53.7f, -13.7f)
                curveToRelative(31.3f, 0.0f, 59.7f, 12.9f, 80.0f, 33.6f)
                curveToRelative(9.6f, -9.8f, 20.9f, -17.8f, 33.5f, -23.5f)
                lineTo(265.8f, -9.0f)
                curveToRelative(5.0f, -12.3f, 19.0f, -18.2f, 31.3f, -13.2f)
                close()
            }
        }
        .build()
        return _millSign!!
    }

private var _millSign: ImageVector? = null
