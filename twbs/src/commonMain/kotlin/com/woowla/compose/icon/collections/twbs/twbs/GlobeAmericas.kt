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

public val Twbs.GlobeAmericas: ImageVector
    get() {
        if (_globeAmericas != null) {
            return _globeAmericas!!
        }
        _globeAmericas = Builder(name = "GlobeAmericas", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f)
                moveTo(2.04f, 4.326f)
                curveToRelative(0.325f, 1.329f, 2.532f, 2.54f, 3.717f, 3.19f)
                curveToRelative(0.48f, 0.263f, 0.793f, 0.434f, 0.743f, 0.484f)
                quadToRelative(-0.121f, 0.12f, -0.242f, 0.234f)
                curveToRelative(-0.416f, 0.396f, -0.787f, 0.749f, -0.758f, 1.266f)
                curveToRelative(0.035f, 0.634f, 0.618f, 0.824f, 1.214f, 1.017f)
                curveToRelative(0.577f, 0.188f, 1.168f, 0.38f, 1.286f, 0.983f)
                curveToRelative(0.082f, 0.417f, -0.075f, 0.988f, -0.22f, 1.52f)
                curveToRelative(-0.215f, 0.782f, -0.406f, 1.48f, 0.22f, 1.48f)
                curveToRelative(1.5f, -0.5f, 3.798f, -3.186f, 4.0f, -5.0f)
                curveToRelative(0.138f, -1.243f, -2.0f, -2.0f, -3.5f, -2.5f)
                curveToRelative(-0.478f, -0.16f, -0.755f, 0.081f, -0.99f, 0.284f)
                curveToRelative(-0.172f, 0.15f, -0.322f, 0.279f, -0.51f, 0.216f)
                curveToRelative(-0.445f, -0.148f, -2.5f, -2.0f, -1.5f, -2.5f)
                curveToRelative(0.78f, -0.39f, 0.952f, -0.171f, 1.227f, 0.182f)
                curveToRelative(0.078f, 0.099f, 0.163f, 0.208f, 0.273f, 0.318f)
                curveToRelative(0.609f, 0.304f, 0.662f, -0.132f, 0.723f, -0.633f)
                curveToRelative(0.039f, -0.322f, 0.081f, -0.671f, 0.277f, -0.867f)
                curveToRelative(0.434f, -0.434f, 1.265f, -0.791f, 2.028f, -1.12f)
                curveToRelative(0.712f, -0.306f, 1.365f, -0.587f, 1.579f, -0.88f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 2.04f, 4.327f)
                close()
            }
        }
        .build()
        return _globeAmericas!!
    }

private var _globeAmericas: ImageVector? = null
