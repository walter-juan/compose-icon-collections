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

public val SolidGroup.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.3f, 192.0f)
                curveTo(100.8f, 99.5f, 186.5f, 32.0f, 288.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-65.6f, 0.0f, -122.0f, 39.5f, -146.7f, 96.0f)
                lineTo(272.0f, 192.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-143.2f, 0.0f)
                curveToRelative(-0.5f, 5.3f, -0.8f, 10.6f, -0.8f, 16.0f)
                reflectiveCurveToRelative(0.3f, 10.7f, 0.8f, 16.0f)
                lineTo(272.0f, 272.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-130.7f, 0.0f)
                curveToRelative(24.7f, 56.5f, 81.1f, 96.0f, 146.7f, 96.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-101.5f, 0.0f, -187.2f, -67.5f, -214.7f, -160.0f)
                lineTo(40.0f, 320.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(24.6f, 0.0f)
                curveToRelative(-0.7f, -10.5f, -0.7f, -21.5f, 0.0f, -32.0f)
                lineTo(40.0f, 240.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(33.3f, 0.0f)
                close()
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
