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

public val Simpleicons.Bat: ImageVector
    get() {
        if (_bat != null) {
            return _bat!!
        }
        _bat = Builder(name = "Bat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.326f, 5.871f)
                arcToRelative(0.165f, 0.165f, 0.0f, false, false, -0.083f, 0.023f)
                lineTo(0.163f, 10.629f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, false, 0.0f, 0.568f)
                curveToRelative(0.73f, 0.427f, 1.586f, 0.928f, 2.964f, 1.736f)
                lineToRelative(0.0f, -0.0f)
                curveToRelative(0.177f, 0.104f, 0.364f, 0.213f, 0.667f, 0.391f)
                curveToRelative(0.306f, 0.179f, 1.555f, 0.929f, 1.898f, 1.135f)
                arcToRelative(0.172f, 0.172f, 0.0f, false, false, 0.176f, 0.001f)
                lineToRelative(3.245f, -1.892f)
                arcToRelative(0.145f, 0.145f, 0.0f, false, false, 0.072f, -0.126f)
                arcToRelative(0.146f, 0.146f, 0.0f, false, false, -0.072f, -0.126f)
                curveToRelative(-0.412f, -0.238f, -1.294f, -0.748f, -1.625f, -0.942f)
                lineToRelative(-0.793f, -0.465f)
                curveToRelative(0.423f, -0.246f, 1.222f, -0.706f, 1.521f, -0.881f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, false, 0.277f, -0.482f)
                verticalLineTo(6.037f)
                arcToRelative(0.166f, 0.166f, 0.0f, false, false, -0.166f, -0.166f)
                moveToRelative(7.349f, 0.0f)
                arcToRelative(0.165f, 0.165f, 0.0f, false, false, -0.166f, 0.166f)
                verticalLineToRelative(3.509f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, false, 0.276f, 0.482f)
                curveToRelative(0.296f, 0.172f, 1.245f, 0.728f, 1.515f, 0.885f)
                lineToRelative(-3.164f, 1.856f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, true, -0.371f, -0.212f)
                verticalLineTo(8.274f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, -0.092f, -0.163f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, -0.186f, -0.006f)
                curveToRelative(-0.121f, 0.063f, -1.095f, 0.533f, -1.539f, 0.746f)
                curveToRelative(-0.635f, -0.292f, -1.249f, -0.577f, -1.433f, -0.672f)
                curveToRelative(-0.059f, -0.031f, -0.126f, -0.021f, -0.186f, 0.006f)
                curveToRelative(-0.05f, 0.023f, -0.091f, 0.096f, -0.091f, 0.163f)
                verticalLineToRelative(4.208f)
                curveToRelative(0.0f, 0.088f, 0.011f, 0.381f, -0.304f, 0.562f)
                lineTo(6.638f, 15.023f)
                lineToRelative(5.363f, 3.105f)
                reflectiveCurveToRelative(9.555f, -5.596f, 11.836f, -6.932f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, false, 0.0f, -0.568f)
                lineToRelative(-2.815f, -1.649f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(-0.214f, -0.125f)
                lineToRelative(-0.002f, -0.001f)
                lineToRelative(-5.049f, -2.959f)
                arcToRelative(0.165f, 0.165f, 0.0f, false, false, -0.083f, -0.023f)
                close()
            }
        }
        .build()
        return _bat!!
    }

private var _bat: ImageVector? = null
