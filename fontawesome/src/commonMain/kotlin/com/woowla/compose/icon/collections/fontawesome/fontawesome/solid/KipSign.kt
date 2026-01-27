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

public val SolidGroup.KipSign: ImageVector
    get() {
        if (_kipSign != null) {
            return _kipSign!!
        }
        _kipSign = Builder(name = "KipSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.8f, 88.3f)
                curveToRelative(13.4f, -11.5f, 15.0f, -31.7f, 3.5f, -45.1f)
                reflectiveCurveToRelative(-31.7f, -15.0f, -45.1f, -3.5f)
                lineTo(128.0f, 186.4f)
                lineTo(128.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(64.0f, 46.3f, 64.0f, 64.0f)
                lineToRelative(0.0f, 168.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 168.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -122.4f)
                lineToRelative(171.2f, 146.7f)
                curveToRelative(13.4f, 11.5f, 33.6f, 9.9f, 45.1f, -3.5f)
                reflectiveCurveToRelative(9.9f, -33.6f, -3.5f, -45.1f)
                lineTo(173.2f, 280.0f)
                lineTo(352.0f, 280.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(173.2f, 232.0f)
                lineTo(340.8f, 88.3f)
                close()
            }
        }
        .build()
        return _kipSign!!
    }

private var _kipSign: ImageVector? = null
