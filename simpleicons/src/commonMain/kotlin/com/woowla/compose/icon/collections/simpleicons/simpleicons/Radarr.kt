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

public val Simpleicons.Radarr: ImageVector
    get() {
        if (_radarr != null) {
            return _radarr!!
        }
        _radarr = Builder(name = "Radarr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.274f, 0.0f)
                curveTo(3.189f, 0.039f, 1.19f, 1.547f, 1.19f, 4.705f)
                lineToRelative(0.184f, 14.518f)
                curveToRelative(0.0f, 1.47f, 1.103f, 2.205f, 2.573f, 2.021f)
                lineTo(3.764f, 3.786f)
                curveToRelative(0.0f, -1.654f, 0.919f, -1.838f, 2.022f, -1.103f)
                lineToRelative(14.7f, 8.27f)
                curveToRelative(1.103f, 0.734f, 1.655f, 1.47f, 1.838f, 2.756f)
                curveToRelative(0.92f, -1.654f, 0.552f, -4.043f, -1.286f, -5.33f)
                lineTo(7.991f, 0.846f)
                arcTo(4.559f, 4.559f, 0.0f, false, false, 5.274f, 0.001f)
                close()
                moveTo(7.256f, 6.91f)
                lineTo(7.072f, 17.017f)
                lineTo(16.076f, 11.871f)
                close()
                moveTo(20.854f, 12.974f)
                lineTo(5.786f, 21.794f)
                curveToRelative(-0.92f, 0.552f, -2.022f, 0.736f, -3.124f, 0.368f)
                curveToRelative(0.918f, 1.47f, 3.307f, 2.389f, 5.145f, 1.47f)
                lineToRelative(12.68f, -7.35f)
                curveToRelative(1.102f, -0.736f, 1.286f, -2.022f, 0.367f, -3.308f)
                close()
            }
        }
        .build()
        return _radarr!!
    }

private var _radarr: ImageVector? = null
