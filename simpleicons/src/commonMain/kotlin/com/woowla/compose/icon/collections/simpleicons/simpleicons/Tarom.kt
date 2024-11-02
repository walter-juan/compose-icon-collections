package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Tarom: ImageVector
    get() {
        if (_tarom != null) {
            return _tarom!!
        }
        _tarom = Builder(name = "Tarom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.054f, 0.0f)
                curveTo(5.424f, 0.0f, 0.028f, 5.37f, 0.0f, 11.973f)
                curveTo(0.0f, 18.603f, 5.424f, 24.0f, 12.054f, 24.0f)
                curveTo(18.657f, 24.0f, 24.0f, 18.603f, 24.0f, 11.973f)
                curveTo(24.0f, 5.398f, 18.657f, 0.0f, 12.054f, 0.0f)
                close()
                moveTo(12.054f, 0.877f)
                curveToRelative(2.603f, 0.0f, 5.068f, 0.96f, 6.986f, 2.52f)
                lineTo(7.178f, 15.123f)
                arcToRelative(21.416f, 21.416f, 0.0f, false, true, -0.75f, -0.101f)
                curveToRelative(-0.55f, -0.082f, -0.988f, -0.147f, -1.552f, -0.089f)
                curveToRelative(-0.904f, 0.082f, -2.135f, 0.876f, -2.902f, 1.725f)
                arcToRelative(11.18f, 11.18f, 0.0f, false, true, -1.015f, -4.711f)
                curveTo(0.959f, 5.864f, 5.917f, 0.877f, 12.054f, 0.877f)
                close()
                moveTo(19.424f, 3.753f)
                curveToRelative(2.247f, 2.054f, 3.672f, 4.987f, 3.672f, 8.22f)
                curveToRelative(0.0f, 2.137f, -0.549f, 4.055f, -1.59f, 5.753f)
                lineToRelative(-10.218f, -1.862f)
                close()
                moveTo(4.876f, 16.738f)
                curveToRelative(0.795f, 0.028f, 1.644f, 0.084f, 2.521f, 0.33f)
                lineToRelative(9.534f, 4.712f)
                lineToRelative(-5.15f, -4.219f)
                lineToRelative(9.479f, 0.547f)
                curveToRelative(-2.0f, 3.014f, -5.398f, 4.96f, -9.179f, 4.96f)
                curveToRelative(-4.328f, 0.0f, -8.082f, -2.465f, -9.945f, -6.054f)
                curveToRelative(0.96f, -0.164f, 1.809f, -0.303f, 2.74f, -0.276f)
                close()
            }
        }
        .build()
        return _tarom!!
    }

private var _tarom: ImageVector? = null
