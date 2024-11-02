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

public val Simpleicons.Immich: ImageVector
    get() {
        if (_immich != null) {
            return _immich!!
        }
        _immich = Builder(name = "Immich", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.986f, 0.269f)
                curveToRelative(-2.409f, 0.0f, -5.207f, 1.091f, -5.207f, 3.895f)
                verticalLineToRelative(0.152f)
                curveToRelative(1.343f, 0.597f, 2.935f, 1.663f, 4.412f, 2.971f)
                curveToRelative(1.571f, 1.391f, 2.837f, 2.882f, 3.652f, 4.287f)
                curveToRelative(1.4f, -2.503f, 2.336f, -5.478f, 2.348f, -7.373f)
                verticalLineTo(4.164f)
                curveToRelative(0.0f, -2.803f, -2.796f, -3.895f, -5.205f, -3.895f)
                moveToRelative(7.512f, 4.49f)
                curveToRelative(-0.378f, -0.008f, -0.775f, 0.05f, -1.191f, 0.185f)
                curveToRelative(-0.037f, 0.012f, -0.086f, 0.028f, -0.145f, 0.047f)
                curveToRelative(-0.153f, 1.461f, -0.676f, 3.304f, -1.463f, 5.113f)
                curveToRelative(-0.837f, 1.924f, -1.863f, 3.59f, -2.947f, 4.799f)
                curveToRelative(2.813f, 0.558f, 5.931f, 0.527f, 7.736f, -0.047f)
                curveToRelative(0.013f, -0.004f, 0.025f, -0.007f, 0.035f, -0.01f)
                curveToRelative(2.667f, -0.867f, 2.84f, -3.864f, 2.096f, -6.154f)
                curveToRelative(-0.628f, -1.933f, -2.081f, -3.89f, -4.121f, -3.934f)
                moveToRelative(-14.996f, 0.039f)
                curveTo(2.462f, 4.842f, 1.009f, 6.797f, 0.381f, 8.731f)
                curveToRelative(-0.744f, 2.291f, -0.571f, 5.288f, 2.096f, 6.154f)
                lineToRelative(0.145f, 0.047f)
                curveToRelative(0.982f, -1.093f, 2.487f, -2.276f, 4.188f, -3.277f)
                curveToRelative(1.809f, -1.065f, 3.619f, -1.808f, 5.207f, -2.148f)
                curveToRelative(-1.948f, -2.105f, -4.488f, -3.913f, -6.287f, -4.51f)
                lineToRelative(-0.035f, -0.012f)
                curveToRelative(-0.417f, -0.135f, -0.814f, -0.194f, -1.191f, -0.186f)
                moveToRelative(4.672f, 6.758f)
                curveToRelative(-2.604f, 1.202f, -5.109f, 3.06f, -6.232f, 4.586f)
                lineToRelative(-0.022f, 0.029f)
                curveToRelative(-1.648f, 2.268f, -0.027f, 4.795f, 1.922f, 6.211f)
                curveToRelative(1.949f, 1.416f, 4.852f, 2.177f, 6.5f, -0.092f)
                curveToRelative(0.023f, -0.031f, 0.054f, -0.071f, 0.09f, -0.121f)
                curveToRelative(-0.736f, -1.272f, -1.396f, -3.072f, -1.822f, -4.998f)
                curveToRelative(-0.453f, -2.049f, -0.602f, -4.0f, -0.436f, -5.615f)
                moveToRelative(1.072f, 3.338f)
                curveToRelative(0.339f, 2.848f, 1.332f, 5.804f, 2.435f, 7.344f)
                lineToRelative(0.022f, 0.029f)
                curveToRelative(1.648f, 2.268f, 4.551f, 1.508f, 6.5f, 0.092f)
                curveToRelative(1.949f, -1.416f, 3.57f, -3.943f, 1.922f, -6.211f)
                curveToRelative(-0.023f, -0.031f, -0.052f, -0.073f, -0.088f, -0.123f)
                curveToRelative(-1.437f, 0.307f, -3.352f, 0.379f, -5.316f, 0.189f)
                curveToRelative(-2.089f, -0.202f, -3.99f, -0.662f, -5.475f, -1.32f)
            }
        }
        .build()
        return _immich!!
    }

private var _immich: ImageVector? = null
