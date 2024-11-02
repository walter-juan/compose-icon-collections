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

public val Simpleicons.Organicmaps: ImageVector
    get() {
        if (_organicmaps != null) {
            return _organicmaps!!
        }
        _organicmaps = Builder(name = "Organicmaps", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.995f, 3.972f)
                curveToRelative(0.573f, 1.524f, -2.494f, 5.231f, -5.419f, 6.182f)
                curveToRelative(-5.29f, -1.832f, -5.462f, 1.245f, -9.791f, 4.168f)
                curveToRelative(5.118f, 3.539f, 10.479f, 0.783f, 10.379f, -2.699f)
                curveToRelative(-4.028f, 2.308f, -6.551f, 2.559f, -7.999f, 2.49f)
                curveToRelative(4.874f, -0.965f, 10.135f, -3.958f, 11.238f, -5.217f)
                curveToRelative(0.001f, 0.056f, 0.002f, 0.112f, 0.002f, 0.168f)
                curveTo(21.404f, 15.077f, 12.114f, 24.0f, 12.114f, 24.0f)
                reflectiveCurveToRelative(-4.863f, -4.656f, -7.552f, -9.519f)
                curveToRelative(-0.376f, -0.005f, -2.638f, 0.817f, -3.472f, -0.285f)
                curveToRelative(-0.932f, -1.231f, 2.523f, -5.357f, 5.519f, -6.587f)
                curveToRelative(5.361f, 2.434f, 8.3f, -3.874f, 9.978f, -4.224f)
                curveTo(11.584f, 0.419f, 6.638f, 1.636f, 6.079f, 6.042f)
                curveToRelative(2.781f, -1.58f, 6.193f, -2.476f, 7.77f, -2.406f)
                curveToRelative(-4.43f, 0.905f, -9.505f, 4.182f, -11.024f, 5.427f)
                curveTo(2.825f, 4.058f, 6.984f, 0.0f, 12.114f, 0.0f)
                curveToRelative(3.034f, 0.0f, 5.728f, 1.419f, 7.423f, 3.614f)
                curveToRelative(0.0f, 0.0f, 3.027f, -0.985f, 3.457f, 0.358f)
                close()
                moveTo(21.934f, 4.419f)
                curveToRelative(-0.398f, -0.542f, -1.786f, 0.091f, -1.786f, 0.091f)
                curveToRelative(0.194f, 0.326f, 0.368f, 0.664f, 0.52f, 1.014f)
                arcToRelative(8.86f, 8.86f, 0.0f, false, true, 0.394f, 1.096f)
                reflectiveCurveToRelative(1.416f, -1.46f, 0.872f, -2.201f)
                close()
                moveTo(2.12f, 13.684f)
                curveToRelative(0.431f, 0.586f, 1.93f, -0.098f, 1.93f, -0.098f)
                arcToRelative(9.66f, 9.66f, 0.0f, false, true, -0.563f, -1.096f)
                arcToRelative(9.575f, 9.575f, 0.0f, false, true, -0.425f, -1.185f)
                reflectiveCurveToRelative(-1.531f, 1.578f, -0.942f, 2.379f)
                close()
            }
        }
        .build()
        return _organicmaps!!
    }

private var _organicmaps: ImageVector? = null
