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

public val SolidGroup.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.5f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 25.3f)
                curveToRelative(-108.0f, 11.9f, -192.0f, 103.5f, -192.0f, 214.7f)
                curveToRelative(0.0f, 119.3f, 96.7f, 216.0f, 216.0f, 216.0f)
                reflectiveCurveToRelative(216.0f, -96.7f, 216.0f, -216.0f)
                curveToRelative(0.0f, -39.8f, -10.8f, -77.1f, -29.6f, -109.2f)
                lineToRelative(28.2f, -28.2f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-23.4f, 23.4f)
                curveToRelative(-32.9f, -30.2f, -75.2f, -50.3f, -122.0f, -55.5f)
                lineToRelative(0.0f, -25.3f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-112.0f, 0.0f)
                close()
                moveTo(248.5f, 184.0f)
                lineToRelative(0.0f, 104.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -104.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
