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

public val Octicons.Sparkle16: ImageVector
    get() {
        if (_sparkle16 != null) {
            return _sparkle16!!
        }
        _sparkle16 = Builder(name = "Sparkle16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.198f, 0.57f)
                curveToRelative(0.275f, -0.752f, 1.34f, -0.752f, 1.615f, 0.0f)
                lineToRelative(0.849f, 2.317f)
                arcToRelative(5.819f, 5.819f, 0.0f, false, false, 3.462f, 3.463f)
                lineToRelative(2.317f, 0.848f)
                curveToRelative(0.753f, 0.275f, 0.753f, 1.34f, 0.0f, 1.615f)
                lineToRelative(-2.317f, 0.849f)
                arcToRelative(5.815f, 5.815f, 0.0f, false, false, -3.462f, 3.462f)
                lineToRelative(-0.849f, 2.317f)
                curveToRelative(-0.275f, 0.753f, -1.34f, 0.753f, -1.615f, 0.0f)
                lineToRelative(-0.848f, -2.317f)
                arcToRelative(5.819f, 5.819f, 0.0f, false, false, -3.463f, -3.462f)
                lineTo(0.57f, 8.813f)
                curveToRelative(-0.752f, -0.275f, -0.752f, -1.34f, 0.0f, -1.615f)
                lineToRelative(2.317f, -0.848f)
                arcTo(5.823f, 5.823f, 0.0f, false, false, 6.35f, 2.887f)
                lineTo(7.198f, 0.57f)
                close()
                moveTo(7.76f, 3.403f)
                arcTo(7.323f, 7.323f, 0.0f, false, true, 3.403f, 7.76f)
                lineToRelative(-0.673f, 0.246f)
                lineToRelative(0.673f, 0.246f)
                arcToRelative(7.324f, 7.324f, 0.0f, false, true, 4.357f, 4.356f)
                lineToRelative(0.246f, 0.673f)
                lineToRelative(0.246f, -0.673f)
                arcToRelative(7.322f, 7.322f, 0.0f, false, true, 4.356f, -4.356f)
                lineToRelative(0.673f, -0.246f)
                lineToRelative(-0.673f, -0.246f)
                arcToRelative(7.324f, 7.324f, 0.0f, false, true, -4.356f, -4.357f)
                lineToRelative(-0.246f, -0.673f)
                lineToRelative(-0.246f, 0.673f)
                close()
            }
        }
        .build()
        return _sparkle16!!
    }

private var _sparkle16: ImageVector? = null
