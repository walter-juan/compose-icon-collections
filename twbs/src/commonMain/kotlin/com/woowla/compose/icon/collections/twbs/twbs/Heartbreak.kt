package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Heartbreak: ImageVector
    get() {
        if (_heartbreak != null) {
            return _heartbreak!!
        }
        _heartbreak = Builder(name = "Heartbreak", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.867f, 14.41f)
                curveToRelative(13.308f, -9.322f, 4.79f, -16.563f, 0.064f, -13.824f)
                lineTo(7.0f, 3.0f)
                lineToRelative(1.5f, 4.0f)
                lineToRelative(-2.0f, 3.0f)
                lineTo(8.0f, 15.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.867f, -0.59f)
                moveToRelative(-0.303f, -1.01f)
                lineToRelative(-0.971f, -3.237f)
                lineToRelative(1.74f, -2.608f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.103f, -0.906f)
                lineToRelative(-1.3f, -3.468f)
                lineToRelative(1.45f, -1.813f)
                curveToRelative(1.861f, -0.948f, 4.446f, 0.002f, 5.197f, 2.11f)
                curveToRelative(0.691f, 1.94f, -0.055f, 5.521f, -6.219f, 9.922f)
                moveToRelative(-1.25f, 1.137f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -1.522f, -1.116f)
                curveTo(-5.077f, 4.97f, 1.842f, -1.472f, 6.454f, 0.293f)
                curveToRelative(0.314f, 0.12f, 0.618f, 0.279f, 0.904f, 0.477f)
                lineTo(5.5f, 3.0f)
                lineTo(7.0f, 7.0f)
                lineToRelative(-1.5f, 3.0f)
                close()
                moveTo(5.014f, 11.477f)
                lineTo(4.572f, 10.371f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.034f, -0.818f)
                lineToRelative(1.305f, -2.61f)
                lineTo(4.564f, 3.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.168f, -0.991f)
                lineToRelative(1.032f, -1.24f)
                curveToRelative(-1.688f, -0.449f, -3.7f, 0.398f, -4.456f, 2.128f)
                curveToRelative(-0.711f, 1.627f, -0.413f, 4.55f, 3.706f, 8.229f)
                close()
            }
        }
        .build()
        return _heartbreak!!
    }

private var _heartbreak: ImageVector? = null
