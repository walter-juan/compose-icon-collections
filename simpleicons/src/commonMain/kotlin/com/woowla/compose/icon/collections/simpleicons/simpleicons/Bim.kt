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

public val Simpleicons.Bim: ImageVector
    get() {
        if (_bim != null) {
            return _bim!!
        }
        _bim = Builder(name = "Bim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.327f, 6.301f)
                curveToRelative(-1.838f, 0.0f, -3.327f, 1.491f, -3.327f, 3.328f)
                verticalLineToRelative(4.742f)
                curveToRelative(0.0f, 1.837f, 1.489f, 3.326f, 3.326f, 3.326f)
                horizontalLineToRelative(17.347f)
                curveToRelative(1.838f, 0.0f, 3.326f, -1.489f, 3.326f, -3.326f)
                lineTo(24.0f, 9.63f)
                curveToRelative(0.0f, -1.837f, -1.489f, -3.328f, -3.326f, -3.328f)
                lineTo(12.353f, 6.301f)
                lineTo(11.06f, 8.192f)
                lineTo(9.786f, 6.301f)
                close()
                moveTo(4.901f, 8.491f)
                curveToRelative(0.814f, -0.009f, 1.57f, 0.07f, 2.01f, 0.242f)
                curveToRelative(0.798f, 0.302f, 1.254f, 0.96f, 1.293f, 1.807f)
                curveToRelative(0.029f, 0.612f, -0.296f, 1.162f, -0.791f, 1.58f)
                curveToRelative(0.561f, 0.331f, 0.978f, 0.827f, 0.965f, 1.539f)
                curveToRelative(-0.026f, 1.26f, -1.207f, 2.039f, -3.336f, 1.99f)
                curveToRelative(-1.147f, -0.027f, -1.705f, -0.029f, -2.369f, -0.174f)
                lineTo(2.672f, 8.639f)
                curveToRelative(1.16f, -0.156f, 1.288f, -0.14f, 2.229f, -0.148f)
                close()
                moveTo(14.424f, 8.602f)
                horizontalLineToRelative(1.99f)
                lineToRelative(1.283f, 3.225f)
                lineToRelative(1.273f, -3.225f)
                horizontalLineToRelative(2.051f)
                lineToRelative(0.551f, 6.867f)
                horizontalLineToRelative(-1.971f)
                lineToRelative(-0.145f, -3.912f)
                lineToRelative(-1.772f, 3.899f)
                lineToRelative(-1.647f, -3.885f)
                lineToRelative(-0.342f, 3.899f)
                horizontalLineToRelative(-2.016f)
                close()
                moveTo(9.95f, 8.626f)
                horizontalLineToRelative(2.09f)
                verticalLineToRelative(6.867f)
                horizontalLineToRelative(-2.09f)
                close()
                moveTo(4.716f, 10.056f)
                verticalLineToRelative(1.453f)
                horizontalLineToRelative(0.809f)
                arcToRelative(0.726f, 0.726f, 0.0f, false, false, 0.727f, -0.727f)
                curveToRelative(0.0f, -0.401f, -0.296f, -0.727f, -0.727f, -0.727f)
                close()
                moveTo(4.716f, 12.843f)
                verticalLineToRelative(1.197f)
                horizontalLineToRelative(0.779f)
                curveToRelative(0.41f, 0.023f, 0.958f, -0.15f, 0.963f, -0.586f)
                curveToRelative(-0.024f, -0.492f, -0.524f, -0.637f, -0.934f, -0.611f)
                close()
            }
        }
        .build()
        return _bim!!
    }

private var _bim: ImageVector? = null
