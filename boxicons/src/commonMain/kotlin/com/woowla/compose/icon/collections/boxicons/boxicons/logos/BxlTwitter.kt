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

public val LogosGroup.BxlTwitter: ImageVector
    get() {
        if (_bxlTwitter != null) {
            return _bxlTwitter!!
        }
        _bxlTwitter = Builder(name = "BxlTwitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.633f, 7.997f)
                curveToRelative(0.013f, 0.175f, 0.013f, 0.349f, 0.013f, 0.523f)
                curveToRelative(0.0f, 5.325f, -4.053f, 11.461f, -11.46f, 11.461f)
                curveToRelative(-2.282f, 0.0f, -4.402f, -0.661f, -6.186f, -1.809f)
                curveToRelative(0.324f, 0.037f, 0.636f, 0.05f, 0.973f, 0.05f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, 5.001f, -1.721f)
                arcToRelative(4.036f, 4.036f, 0.0f, false, true, -3.767f, -2.793f)
                curveToRelative(0.249f, 0.037f, 0.499f, 0.062f, 0.761f, 0.062f)
                curveToRelative(0.361f, 0.0f, 0.724f, -0.05f, 1.061f, -0.137f)
                arcToRelative(4.027f, 4.027f, 0.0f, false, true, -3.23f, -3.953f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0.537f, 0.299f, 1.16f, 0.486f, 1.82f, 0.511f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, true, -1.796f, -3.354f)
                curveToRelative(0.0f, -0.748f, 0.199f, -1.434f, 0.548f, -2.032f)
                arcToRelative(11.457f, 11.457f, 0.0f, false, false, 8.306f, 4.215f)
                curveToRelative(-0.062f, -0.3f, -0.1f, -0.611f, -0.1f, -0.923f)
                arcToRelative(4.026f, 4.026f, 0.0f, false, true, 4.028f, -4.028f)
                curveToRelative(1.16f, 0.0f, 2.207f, 0.486f, 2.943f, 1.272f)
                arcToRelative(7.957f, 7.957f, 0.0f, false, false, 2.556f, -0.973f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, -1.771f, 2.22f)
                arcToRelative(8.073f, 8.073f, 0.0f, false, false, 2.319f, -0.624f)
                arcToRelative(8.645f, 8.645f, 0.0f, false, true, -2.019f, 2.083f)
                close()
            }
        }
        .build()
        return _bxlTwitter!!
    }

private var _bxlTwitter: ImageVector? = null
