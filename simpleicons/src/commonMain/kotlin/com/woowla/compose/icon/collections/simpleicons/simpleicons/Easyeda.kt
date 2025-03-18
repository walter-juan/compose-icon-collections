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

public val Simpleicons.Easyeda: ImageVector
    get() {
        if (_easyeda != null) {
            return _easyeda!!
        }
        _easyeda = Builder(name = "Easyeda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.754f, 15.36f)
                curveToRelative(0.96f, 0.0f, 1.75f, 0.788f, 1.75f, 1.749f)
                curveToRelative(0.0f, 0.96f, -0.79f, 1.749f, -1.75f, 1.749f)
                reflectiveCurveToRelative(-1.75f, -0.79f, -1.75f, -1.75f)
                reflectiveCurveToRelative(0.79f, -1.748f, 1.75f, -1.748f)
                moveToRelative(12.591f, -7.34f)
                arcToRelative(7.683f, 7.683f, 0.0f, false, false, -10.018f, -4.389f)
                curveToRelative(-0.618f, 0.24f, -1.2f, 0.549f, -1.75f, 0.96f)
                arcTo(6.889f, 6.889f, 0.0f, false, false, 7.0f, 6.17f)
                curveToRelative(-0.24f, -0.034f, -0.515f, -0.034f, -0.755f, -0.034f)
                curveTo(2.78f, 6.1f, 0.0f, 8.912f, 0.0f, 12.342f)
                curveToRelative(0.0f, 2.675f, 1.715f, 5.041f, 4.151f, 5.898f)
                curveToRelative(0.48f, 1.544f, 1.922f, 2.675f, 3.603f, 2.675f)
                arcToRelative(3.762f, 3.762f, 0.0f, false, false, 3.774f, -3.772f)
                curveToRelative(0.0f, -0.172f, 0.0f, -0.309f, -0.034f, -0.48f)
                lineToRelative(5.317f, -2.675f)
                lineToRelative(0.515f, -0.272f)
                lineToRelative(-1.03f, -2.229f)
                lineToRelative(-0.582f, 0.272f)
                lineToRelative(-5.318f, 2.675f)
                arcToRelative(3.708f, 3.708f, 0.0f, false, false, -2.642f, -1.098f)
                curveToRelative(-1.51f, 0.0f, -2.813f, 0.892f, -3.431f, 2.195f)
                curveToRelative(-1.407f, -0.823f, -2.127f, -2.503f, -1.716f, -4.15f)
                arcToRelative(3.718f, 3.718f, 0.0f, false, true, 4.53f, -2.674f)
                curveToRelative(0.377f, 0.102f, 0.72f, 0.24f, 1.029f, 0.445f)
                curveToRelative(0.892f, -2.743f, 3.876f, -4.218f, 6.587f, -3.326f)
                curveToRelative(1.921f, 0.651f, 3.328f, 2.366f, 3.534f, 4.39f)
                horizontalLineToRelative(0.274f)
                arcToRelative(2.913f, 2.913f, 0.0f, false, true, 2.916f, 2.915f)
                arcToRelative(2.941f, 2.941f, 0.0f, false, true, -2.676f, 2.915f)
                horizontalLineToRelative(-2.127f)
                verticalLineToRelative(2.503f)
                horizontalLineTo(19.042f)
                curveToRelative(2.984f, -0.24f, 5.18f, -2.88f, 4.94f, -5.864f)
                arcToRelative(4.854f, 4.854f, 0.0f, false, false, -1.51f, -3.361f)
                curveTo(21.89f, 8.74f, 21.17f, 8.26f, 20.345f, 8.02f)
                close()
            }
        }
        .build()
        return _easyeda!!
    }

private var _easyeda: ImageVector? = null
