package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlSpotify: ImageVector
    get() {
        if (_bxlSpotify != null) {
            return _bxlSpotify!!
        }
        _bxlSpotify = Builder(name = "BxlSpotify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 2.019f)
                curveToRelative(-5.495f, 0.0f, -9.991f, 4.496f, -9.991f, 9.991f)
                curveToRelative(0.0f, 5.494f, 4.496f, 9.99f, 9.991f, 9.99f)
                curveToRelative(5.494f, 0.0f, 9.99f, -4.496f, 9.99f, -9.99f)
                curveToRelative(0.0f, -5.495f, -4.446f, -9.991f, -9.99f, -9.991f)
                close()
                moveTo(16.605f, 16.455f)
                curveToRelative(-0.199f, 0.299f, -0.549f, 0.4f, -0.85f, 0.201f)
                curveToRelative(-2.349f, -1.45f, -5.296f, -1.75f, -8.793f, -0.951f)
                curveToRelative(-0.348f, 0.102f, -0.648f, -0.148f, -0.748f, -0.449f)
                curveToRelative(-0.101f, -0.35f, 0.149f, -0.648f, 0.45f, -0.749f)
                curveToRelative(3.795f, -0.85f, 7.093f, -0.499f, 9.69f, 1.1f)
                curveToRelative(0.35f, 0.149f, 0.4f, 0.548f, 0.251f, 0.848f)
                close()
                moveTo(17.805f, 13.708f)
                curveToRelative(-0.251f, 0.349f, -0.7f, 0.499f, -1.051f, 0.249f)
                curveToRelative(-2.697f, -1.646f, -6.792f, -2.148f, -9.939f, -1.148f)
                curveToRelative(-0.398f, 0.101f, -0.85f, -0.1f, -0.949f, -0.498f)
                curveToRelative(-0.101f, -0.402f, 0.1f, -0.852f, 0.499f, -0.952f)
                curveToRelative(3.646f, -1.098f, 8.143f, -0.548f, 11.239f, 1.351f)
                curveToRelative(0.3f, 0.149f, 0.45f, 0.648f, 0.201f, 0.998f)
                close()
                moveTo(17.904f, 10.909f)
                curveToRelative(-3.197f, -1.897f, -8.542f, -2.097f, -11.59f, -1.146f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, true, -1.148f, -0.6f)
                arcToRelative(0.937f, 0.937f, 0.0f, false, true, 0.599f, -1.151f)
                curveToRelative(3.547f, -1.049f, 9.392f, -0.85f, 13.089f, 1.351f)
                curveToRelative(0.449f, 0.249f, 0.599f, 0.849f, 0.349f, 1.298f)
                curveToRelative(-0.25f, 0.35f, -0.849f, 0.498f, -1.299f, 0.248f)
                close()
            }
        }
        .build()
        return _bxlSpotify!!
    }

private var _bxlSpotify: ImageVector? = null
