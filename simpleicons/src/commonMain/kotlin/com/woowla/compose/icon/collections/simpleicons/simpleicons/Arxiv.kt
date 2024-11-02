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

public val Simpleicons.Arxiv: ImageVector
    get() {
        if (_arxiv != null) {
            return _arxiv!!
        }
        _arxiv = Builder(name = "Arxiv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.842f, 0.0f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -0.922f, 0.608f)
                curveToRelative(-0.154f, 0.369f, -0.044f, 0.627f, 0.294f, 1.111f)
                lineToRelative(6.918f, 8.36f)
                lineToRelative(-1.022f, 1.106f)
                arcToRelative(1.039f, 1.039f, 0.0f, false, false, 0.003f, 1.423f)
                lineToRelative(1.229f, 1.314f)
                lineToRelative(-5.439f, 6.444f)
                curveToRelative(-0.28f, 0.299f, -0.454f, 0.823f, -0.297f, 1.199f)
                arcToRelative(1.025f, 1.025f, 0.0f, false, false, 0.959f, 0.635f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, false, 0.689f, -0.34f)
                lineToRelative(5.783f, -6.126f)
                lineToRelative(7.49f, 8.005f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, false, 0.683f, 0.26f)
                arcToRelative(0.957f, 0.957f, 0.0f, false, false, 0.878f, -0.614f)
                curveToRelative(0.158f, -0.377f, -0.017f, -0.75f, -0.306f, -1.141f)
                lineToRelative(-7.052f, -8.342f)
                lineToRelative(1.063f, -1.13f)
                arcToRelative(0.963f, 0.963f, 0.0f, false, false, 0.009f, -1.316f)
                lineTo(4.634f, 0.464f)
                reflectiveCurveToRelative(-0.373f, -0.454f, -0.768f, -0.463f)
                close()
                moveTo(3.842f, 0.272f)
                horizontalLineToRelative(0.017f)
                curveToRelative(0.218f, 0.005f, 0.487f, 0.271f, 0.564f, 0.364f)
                lineToRelative(0.005f, 0.006f)
                lineToRelative(0.005f, 0.005f)
                lineToRelative(10.169f, 10.991f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, true, -0.007f, 0.945f)
                lineToRelative(-1.067f, 1.133f)
                lineToRelative(-1.498f, -1.772f)
                lineToRelative(-8.599f, -10.39f)
                curveToRelative(-0.329f, -0.472f, -0.352f, -0.618f, -0.259f, -0.841f)
                arcToRelative(0.731f, 0.731f, 0.0f, false, true, 0.67f, -0.44f)
                close()
                moveTo(18.183f, 1.842f)
                arcToRelative(0.877f, 0.877f, 0.0f, false, false, -0.655f, 0.242f)
                lineToRelative(-5.696f, 6.158f)
                lineToRelative(1.694f, 1.832f)
                lineToRelative(5.309f, -6.514f)
                curveToRelative(0.325f, -0.433f, 0.479f, -0.66f, 0.325f, -1.029f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, false, -0.976f, -0.689f)
                close()
                moveTo(10.528f, 14.124f)
                lineTo(11.846f, 15.538f)
                lineTo(6.06f, 21.667f)
                arcToRelative(0.649f, 0.649f, 0.0f, false, true, -0.496f, 0.26f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.706f, -0.467f)
                curveToRelative(-0.112f, -0.268f, 0.036f, -0.686f, 0.244f, -0.908f)
                lineToRelative(0.005f, -0.005f)
                lineToRelative(0.005f, -0.005f)
                close()
            }
        }
        .build()
        return _arxiv!!
    }

private var _arxiv: ImageVector? = null
