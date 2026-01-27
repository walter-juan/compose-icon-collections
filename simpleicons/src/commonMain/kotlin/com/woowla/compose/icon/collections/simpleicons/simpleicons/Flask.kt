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

public val Simpleicons.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.773f, 2.878f)
                curveToRelative(-0.013f, 1.434f, 0.322f, 4.624f, 0.445f, 5.734f)
                lineToRelative(-8.558f, 3.83f)
                curveToRelative(-0.56f, -0.959f, -0.98f, -2.304f, -1.237f, -3.38f)
                lineToRelative(-0.06f, 0.027f)
                curveToRelative(-0.205f, 0.09f, -0.406f, 0.053f, -0.494f, -0.088f)
                lineToRelative(-0.011f, -0.018f)
                lineToRelative(-0.82f, -1.506f)
                curveToRelative(-0.058f, -0.105f, -0.05f, -0.252f, 0.024f, -0.392f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, true, 0.358f, -0.331f)
                lineToRelative(9.824f, -4.207f)
                curveToRelative(0.146f, -0.064f, 0.299f, -0.063f, 0.4f, 0.004f)
                curveToRelative(0.106f, 0.062f, 0.127f, 0.128f, 0.13f, 0.327f)
                close()
                moveTo(11.453f, 9.878f)
                curveToRelative(0.523f, 1.97f, 0.675f, 2.412f, 0.832f, 2.818f)
                lineToRelative(-7.263f, 3.7f)
                arcToRelative(19.35f, 19.35f, 0.0f, false, true, -1.81f, -2.83f)
                lineToRelative(8.24f, -3.689f)
                close()
                moveTo(23.885f, 18.664f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.283f, 0.402f, -0.047f, 0.657f, -0.153f, 0.698f)
                lineToRelative(-0.947f, 0.37f)
                curveToRelative(0.037f, 0.125f, 0.035f, 0.319f, -0.217f, 0.414f)
                lineToRelative(-0.736f, 0.287f)
                curveToRelative(-0.229f, 0.09f, -0.398f, -0.059f, -0.42f, -0.2f)
                lineToRelative(-0.025f, -0.125f)
                curveToRelative(-4.427f, 1.784f, -7.94f, 1.685f, -10.696f, 0.647f)
                curveToRelative(-1.981f, -0.745f, -3.576f, -1.983f, -4.846f, -3.379f)
                lineToRelative(6.948f, -3.54f)
                curveToRelative(0.721f, 1.431f, 1.586f, 2.454f, 2.509f, 3.178f)
                curveToRelative(2.086f, 1.638f, 4.415f, 1.712f, 5.793f, 1.563f)
                lineToRelative(-0.047f, -0.233f)
                curveToRelative(-0.015f, -0.077f, 0.007f, -0.135f, 0.086f, -0.165f)
                lineToRelative(0.734f, -0.288f)
                arcToRelative(0.302f, 0.302f, 0.0f, false, true, 0.342f, 0.086f)
                lineToRelative(0.748f, -0.288f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, 0.341f, 0.086f)
                lineToRelative(0.583f, 0.89f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
