package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Minimize24: ImageVector
    get() {
        if (_minimize24 != null) {
            return _minimize24!!
        }
        _minimize24 = Builder(name = "Minimize24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.25f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 0.149f, 0.015f)
                curveToRelative(0.013f, 0.002f, 0.026f, 0.008f, 0.039f, 0.011f)
                curveToRelative(0.033f, 0.009f, 0.066f, 0.017f, 0.098f, 0.031f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 0.363f, 0.323f)
                curveToRelative(0.015f, 0.027f, 0.031f, 0.054f, 0.043f, 0.083f)
                arcToRelative(0.731f, 0.731f, 0.0f, false, true, 0.058f, 0.287f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-4.189f)
                lineTo(3.53f, 21.53f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(5.72f, -5.72f)
                horizontalLineTo(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(20.47f, 2.47f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-5.719f, 5.72f)
                horizontalLineTo(20.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.731f, 0.731f, 0.0f, false, true, -0.133f, -0.013f)
                curveToRelative(-0.005f, -0.001f, -0.011f, -0.001f, -0.016f, -0.003f)
                curveToRelative(-0.014f, -0.002f, -0.026f, -0.008f, -0.039f, -0.011f)
                curveToRelative(-0.034f, -0.009f, -0.067f, -0.017f, -0.099f, -0.031f)
                curveToRelative(-0.029f, -0.012f, -0.056f, -0.028f, -0.083f, -0.043f)
                arcToRelative(0.731f, 0.731f, 0.0f, false, true, -0.38f, -0.649f)
                verticalLineTo(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.19f)
                lineToRelative(5.72f, -5.72f)
                close()
            }
        }
        .build()
        return _minimize24!!
    }

private var _minimize24: ImageVector? = null
