package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPaint: ImageVector
    get() {
        if (_bxPaint != null) {
            return _bxPaint!!
        }
        _bxPaint = Builder(name = "BxPaint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.061f, 22.0f)
                curveToRelative(1.523f, 0.0f, 2.84f, -0.543f, 3.91f, -1.613f)
                curveToRelative(1.123f, -1.123f, 1.707f, -2.854f, 1.551f, -4.494f)
                lineToRelative(8.564f, -8.564f)
                arcToRelative(3.123f, 3.123f, 0.0f, false, false, -0.002f, -4.414f)
                curveToRelative(-1.178f, -1.18f, -3.234f, -1.18f, -4.412f, 0.0f)
                lineToRelative(-8.884f, 8.884f)
                curveToRelative(-1.913f, 0.169f, -3.807f, 1.521f, -3.807f, 3.919f)
                curveToRelative(0.0f, 0.303f, 0.021f, 0.588f, 0.042f, 0.86f)
                curveToRelative(0.08f, 1.031f, 0.109f, 1.418f, -1.471f, 2.208f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.122f, 1.717f)
                curveTo(2.52f, 20.563f, 4.623f, 22.0f, 7.061f, 22.0f)
                curveToRelative(-0.001f, 0.0f, -0.001f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(18.086f, 4.328f)
                arcToRelative(1.144f, 1.144f, 0.0f, false, true, 1.586f, 0.002f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, true, 0.0f, 1.584f)
                lineTo(12.0f, 13.586f)
                lineTo(10.414f, 12.0f)
                lineToRelative(7.672f, -7.672f)
                close()
                moveTo(6.018f, 16.423f)
                curveToRelative(-0.018f, -0.224f, -0.037f, -0.458f, -0.037f, -0.706f)
                curveToRelative(0.0f, -1.545f, 1.445f, -1.953f, 2.21f, -1.953f)
                curveToRelative(0.356f, 0.0f, 0.699f, 0.073f, 0.964f, 0.206f)
                curveToRelative(0.945f, 0.475f, 1.26f, 1.293f, 1.357f, 1.896f)
                curveToRelative(0.177f, 1.09f, -0.217f, 2.368f, -0.956f, 3.107f)
                curveTo(8.865f, 19.664f, 8.049f, 20.0f, 7.061f, 20.0f)
                horizontalLineTo(7.06f)
                curveToRelative(-0.75f, 0.0f, -1.479f, -0.196f, -2.074f, -0.427f)
                curveToRelative(1.082f, -0.973f, 1.121f, -1.989f, 1.032f, -3.15f)
                close()
            }
        }
        .build()
        return _bxPaint!!
    }

private var _bxPaint: ImageVector? = null
