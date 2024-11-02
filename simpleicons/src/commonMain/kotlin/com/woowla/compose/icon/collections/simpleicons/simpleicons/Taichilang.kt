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

public val Simpleicons.Taichilang: ImageVector
    get() {
        if (_taichilang != null) {
            return _taichilang!!
        }
        _taichilang = Builder(name = "Taichilang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.526f, 4.678f)
                curveToRelative(-0.02f, 1.605f, -0.817f, 2.896f, -2.211f, 3.854f)
                curveToRelative(-1.218f, 0.837f, -2.47f, 1.627f, -3.632f, 2.54f)
                curveToRelative(-1.898f, 1.495f, -3.139f, 3.434f, -3.178f, 5.926f)
                curveToRelative(-0.041f, 2.711f, 1.175f, 4.798f, 3.434f, 6.274f)
                curveToRelative(0.041f, 0.028f, 0.089f, 0.05f, 0.13f, 0.076f)
                curveToRelative(0.2f, 0.123f, 0.364f, 0.306f, 0.22f, 0.524f)
                curveToRelative(-0.07f, 0.103f, -0.327f, 0.154f, -0.473f, 0.115f)
                curveToRelative(-1.217f, -0.298f, -2.386f, -0.731f, -3.456f, -1.395f)
                curveToRelative(-3.462f, -2.149f, -5.484f, -5.262f, -5.952f, -9.318f)
                curveTo(-0.254f, 7.468f, 3.193f, 2.09f, 8.683f, 0.354f)
                curveToRelative(1.356f, -0.431f, 2.722f, -0.527f, 4.073f, 0.042f)
                curveToRelative(1.722f, 0.72f, 2.826f, 2.381f, 2.77f, 4.282f)
                close()
                moveTo(23.672f, 13.943f)
                curveToRelative(-0.028f, 1.07f, -0.328f, 2.269f, -1.444f, 3.112f)
                curveToRelative(-1.3f, 0.98f, -2.976f, 0.916f, -3.998f, -0.148f)
                arcToRelative(2.836f, 2.836f, 0.0f, false, true, -0.644f, -1.081f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, true, -0.12f, -1.255f)
                arcToRelative(2.879f, 2.879f, 0.0f, false, true, 0.433f, -1.186f)
                arcToRelative(2.844f, 2.844f, 0.0f, false, true, 0.898f, -0.879f)
                curveToRelative(0.139f, -0.087f, 0.281f, -0.171f, 0.422f, -0.252f)
                curveToRelative(1.167f, -0.658f, 1.692f, -1.689f, 1.731f, -3.005f)
                arcToRelative(1.955f, 1.955f, 0.0f, false, true, 0.09f, -0.38f)
                curveToRelative(0.131f, 0.056f, 0.28f, 0.084f, 0.388f, 0.171f)
                curveToRelative(1.434f, 1.126f, 2.245f, 2.815f, 2.245f, 4.904f)
                close()
            }
        }
        .build()
        return _taichilang!!
    }

private var _taichilang: ImageVector? = null
