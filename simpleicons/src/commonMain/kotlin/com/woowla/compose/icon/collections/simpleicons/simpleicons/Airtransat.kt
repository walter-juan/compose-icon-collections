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

public val Simpleicons.Airtransat: ImageVector
    get() {
        if (_airtransat != null) {
            return _airtransat!!
        }
        _airtransat = Builder(name = "Airtransat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.611f, 0.0f)
                curveToRelative(-2.931f, 0.916f, -5.68f, 3.434f, -8.474f, 6.137f)
                curveTo(5.564f, 6.32f, 1.672f, 7.74f, 1.26f, 7.969f)
                curveToRelative(4.122f, 2.152f, 5.129f, 3.115f, 5.129f, 3.115f)
                reflectiveCurveToRelative(-1.374f, 3.938f, -1.649f, 6.457f)
                curveToRelative(0.916f, -2.244f, 2.702f, -5.312f, 3.801f, -6.777f)
                curveToRelative(-1.511f, -1.237f, -4.35f, -2.565f, -4.35f, -2.565f)
                reflectiveCurveToRelative(2.244f, -0.962f, 6.733f, -1.191f)
                curveToRelative(0.0f, 0.0f, 1.878f, -3.619f, 6.687f, -7.008f)
                close()
                moveTo(15.367f, 3.344f)
                curveToRelative(-0.412f, 0.87f, -1.146f, 2.793f, -1.283f, 4.213f)
                curveToRelative(3.16f, 0.229f, 5.312f, 0.963f, 5.312f, 0.963f)
                reflectiveCurveToRelative(-3.205f, 1.19f, -4.992f, 2.609f)
                curveToRelative(0.32f, 0.779f, 1.055f, 3.07f, 1.467f, 4.855f)
                curveToRelative(-0.687f, -0.64f, -2.748f, -2.336f, -4.26f, -3.252f)
                curveTo(9.596f, 13.511f, 4.1f, 18.962f, 1.031f, 24.0f)
                curveToRelative(1.328f, -1.374f, 5.267f, -5.817f, 10.58f, -9.023f)
                curveToRelative(1.1f, 0.64f, 6.137f, 3.939f, 6.137f, 3.939f)
                reflectiveCurveToRelative(-1.1f, -5.862f, -1.512f, -7.236f)
                curveToRelative(1.558f, -1.054f, 4.214f, -2.52f, 6.733f, -3.3f)
                curveToRelative(-3.527f, -1.419f, -7.832f, -1.784f, -7.832f, -1.784f)
                reflectiveCurveToRelative(-0.09f, -1.1f, 0.23f, -3.252f)
                close()
            }
        }
        .build()
        return _airtransat!!
    }

private var _airtransat: ImageVector? = null
