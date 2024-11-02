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

public val Simpleicons.Talos: ImageVector
    get() {
        if (_talos != null) {
            return _talos!!
        }
        _talos = Builder(name = "Talos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.678f, 11.98f)
                curveToRelative(0.0f, -2.664f, -1.13f, -6.896f, -2.867f, -10.804f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.585f, 0.917f)
                curveToRelative(1.608f, 3.668f, 2.647f, 7.553f, 2.647f, 9.886f)
                curveToRelative(0.0f, 2.254f, -1.08f, 6.145f, -2.735f, 9.865f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.576f, 0.93f)
                curveToRelative(1.79f, -3.976f, 2.964f, -8.229f, 2.964f, -10.795f)
                moveToRelative(6.442f, 0.0f)
                curveToRelative(0.0f, -2.336f, 1.042f, -6.22f, 2.646f, -9.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.608f, -0.922f)
                curveToRelative(-1.756f, 3.957f, -2.843f, 8.166f, -2.843f, 10.816f)
                curveToRelative(0.0f, 2.564f, 1.177f, 6.819f, 2.965f, 10.797f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.575f, -0.931f)
                curveToRelative(-1.655f, -3.723f, -2.735f, -7.616f, -2.735f, -9.87f)
                moveToRelative(5.45f, 6.525f)
                lineToRelative(0.31f, 0.307f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.936f, -1.612f)
                curveToRelative(-1.866f, -1.893f, -3.457f, -3.938f, -3.47f, -5.233f)
                curveToRelative(-0.012f, -1.264f, 1.57f, -3.308f, 3.446f, -5.222f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.945f, -1.603f)
                lineToRelative(-0.259f, 0.258f)
                curveToRelative(-2.739f, 2.766f, -4.063f, 4.92f, -4.047f, 6.583f)
                curveToRelative(0.016f, 1.662f, 1.332f, 3.81f, 4.028f, 6.522f)
                moveTo(2.411f, 5.405f)
                lineToRelative(-0.26f, -0.259f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.946f, 1.608f)
                curveToRelative(3.123f, 3.173f, 3.452f, 4.704f, 3.448f, 5.217f)
                curveToRelative(-0.012f, 1.3f, -1.603f, 3.34f, -3.47f, 5.229f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.939f, 1.608f)
                curveToRelative(0.106f, -0.106f, 0.207f, -0.204f, 0.31f, -0.308f)
                curveToRelative(2.694f, -2.711f, 4.01f, -4.842f, 4.026f, -6.516f)
                reflectiveCurveToRelative(-1.308f, -3.809f, -4.047f, -6.58f)
                moveTo(12.002f, 24.0f)
                curveToRelative(0.303f, 0.0f, 0.602f, -0.016f, 0.898f, -0.037f)
                verticalLineTo(0.037f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                curveToRelative(-0.304f, 0.0f, -0.605f, 0.015f, -0.905f, 0.037f)
                verticalLineToRelative(23.925f)
                quadToRelative(0.448f, 0.035f, 0.903f, 0.038f)
                close()
            }
        }
        .build()
        return _talos!!
    }

private var _talos: ImageVector? = null
