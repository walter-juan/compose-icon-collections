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

public val Simpleicons.Tether: ImageVector
    get() {
        if (_tether != null) {
            return _tether!!
        }
        _tether = Builder(name = "Tether", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.754f, 10.518f)
                curveToRelative(0.0f, 0.625f, -2.238f, 1.148f, -5.238f, 1.281f)
                lineToRelative(0.003f, 0.001f)
                curveToRelative(-0.085f, 0.006f, -0.523f, 0.032f, -1.501f, 0.032f)
                curveToRelative(-0.778f, 0.0f, -1.33f, -0.023f, -1.524f, -0.032f)
                curveToRelative(-3.006f, -0.132f, -5.249f, -0.655f, -5.249f, -1.282f)
                reflectiveCurveToRelative(2.244f, -1.149f, 5.249f, -1.283f)
                verticalLineToRelative(2.044f)
                curveToRelative(0.197f, 0.014f, 0.759f, 0.047f, 1.537f, 0.047f)
                curveToRelative(0.933f, 0.0f, 1.401f, -0.039f, 1.485f, -0.047f)
                lineTo(13.516f, 9.236f)
                curveToRelative(2.999f, 0.134f, 5.238f, 0.657f, 5.238f, 1.282f)
                close()
                moveTo(23.944f, 11.064f)
                lineTo(12.125f, 22.389f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, -0.25f, 0.0f)
                lineTo(0.056f, 11.064f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, -0.038f, -0.208f)
                lineToRelative(4.376f, -9.192f)
                arcToRelative(0.177f, 0.177f, 0.0f, false, true, 0.163f, -0.103f)
                horizontalLineToRelative(14.888f)
                arcToRelative(0.177f, 0.177f, 0.0f, false, true, 0.161f, 0.103f)
                lineToRelative(4.376f, 9.192f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, -0.038f, 0.208f)
                close()
                moveTo(19.466f, 10.66f)
                curveToRelative(0.0f, -0.807f, -2.552f, -1.48f, -5.947f, -1.637f)
                lineTo(13.518f, 7.195f)
                horizontalLineToRelative(4.186f)
                lineTo(17.704f, 4.405f)
                lineTo(6.308f, 4.405f)
                lineTo(6.308f, 7.195f)
                horizontalLineToRelative(4.185f)
                verticalLineToRelative(1.829f)
                curveToRelative(-3.402f, 0.156f, -5.96f, 0.83f, -5.96f, 1.638f)
                curveToRelative(0.0f, 0.808f, 2.558f, 1.481f, 5.96f, 1.638f)
                verticalLineToRelative(5.862f)
                horizontalLineToRelative(3.025f)
                verticalLineToRelative(-5.864f)
                curveToRelative(3.394f, -0.156f, 5.948f, -0.83f, 5.948f, -1.636f)
                close()
            }
        }
        .build()
        return _tether!!
    }

private var _tether: ImageVector? = null
