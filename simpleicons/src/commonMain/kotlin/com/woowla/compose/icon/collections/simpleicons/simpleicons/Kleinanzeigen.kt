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

public val Simpleicons.Kleinanzeigen: ImageVector
    get() {
        if (_kleinanzeigen != null) {
            return _kleinanzeigen!!
        }
        _kleinanzeigen = Builder(name = "Kleinanzeigen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.064f, 24.0f)
                curveToRelative(-3.234f, 0.0f, -4.816f, -2.245f, -5.137f, -2.71f)
                curveToRelative(-0.955f, 0.935f, -2.396f, 2.71f, -4.991f, 2.71f)
                curveToRelative(-2.998f, 0.0f, -5.524f, -2.254f, -5.524f, -5.908f)
                lineTo(1.412f, 5.907f)
                curveTo(1.412f, 2.245f, 3.942f, 0.0f, 6.936f, 0.0f)
                curveToRelative(2.993f, 0.0f, 5.524f, 2.385f, 5.524f, 5.852f)
                arcToRelative(5.512f, 5.512f, 0.0f, false, true, 1.842f, -0.314f)
                curveToRelative(3.083f, 0.0f, 5.524f, 2.515f, 5.524f, 5.538f)
                curveToRelative(0.0f, 0.848f, -0.161f, 1.602f, -0.513f, 2.324f)
                arcToRelative(5.539f, 5.539f, 0.0f, false, true, 3.275f, 5.062f)
                curveToRelative(0.0f, 3.053f, -2.478f, 5.538f, -5.524f, 5.538f)
                close()
                moveTo(13.262f, 19.952f)
                curveToRelative(0.795f, 1.383f, 2.132f, 2.202f, 3.802f, 2.202f)
                arcToRelative(3.692f, 3.692f, 0.0f, false, false, 3.683f, -3.692f)
                arcToRelative(3.689f, 3.689f, 0.0f, false, false, -2.518f, -3.505f)
                lineToRelative(-4.967f, 4.995f)
                close()
                moveTo(6.936f, 1.846f)
                curveToRelative(-1.832f, 0.0f, -3.683f, 1.256f, -3.683f, 4.061f)
                verticalLineToRelative(12.185f)
                curveToRelative(0.0f, 2.806f, 1.85f, 4.062f, 3.683f, 4.062f)
                curveToRelative(1.456f, 0.0f, 2.26f, -0.736f, 3.557f, -2.037f)
                lineToRelative(0.575f, -0.576f)
                curveToRelative(-0.297f, -0.886f, -0.45f, -1.869f, -0.45f, -2.926f)
                lineTo(10.618f, 5.908f)
                curveToRelative(0.0f, -2.806f, -1.849f, -4.062f, -3.682f, -4.062f)
                close()
                moveTo(12.46f, 7.877f)
                verticalLineToRelative(8.738f)
                curveToRelative(0.0f, 0.495f, 0.042f, 0.966f, 0.12f, 1.409f)
                lineToRelative(4.003f, -4.013f)
                curveToRelative(1.163f, -1.165f, 1.402f, -2.016f, 1.402f, -2.934f)
                curveToRelative(0.0f, -1.962f, -1.573f, -3.692f, -3.683f, -3.692f)
                curveToRelative(-0.657f, 0.0f, -1.285f, 0.169f, -1.842f, 0.493f)
                close()
            }
        }
        .build()
        return _kleinanzeigen!!
    }

private var _kleinanzeigen: ImageVector? = null
