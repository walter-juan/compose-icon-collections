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

public val Simpleicons.Buysellads: ImageVector
    get() {
        if (_buysellads != null) {
            return _buysellads!!
        }
        _buysellads = Builder(name = "Buysellads", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.4f)
                horizontalLineToRelative(-2.685f)
                lineToRelative(-0.716f, -2.704f)
                lineToRelative(-3.3f, 2.704f)
                horizontalLineToRelative(-2.675f)
                lineToRelative(2.796f, -8.821f)
                horizontalLineToRelative(3.784f)
                close()
                moveTo(18.045f, 13.615f)
                horizontalLineToRelative(2.544f)
                lineToRelative(-1.272f, -4.744f)
                close()
                moveTo(5.581f, 11.849f)
                curveToRelative(0.939f, 0.151f, 1.676f, 1.049f, 1.676f, 2.149f)
                curveToRelative(0.0f, 1.282f, -0.677f, 2.392f, -2.403f, 2.392f)
                lineTo(0.0f, 16.39f)
                lineTo(0.0f, 7.579f)
                horizontalLineToRelative(4.32f)
                curveToRelative(1.736f, 0.0f, 2.573f, 1.141f, 2.573f, 2.251f)
                curveToRelative(0.0f, 1.09f, -0.474f, 1.837f, -1.312f, 2.019f)
                moveToRelative(-3.502f, 2.634f)
                lineToRelative(1.988f, -0.01f)
                curveToRelative(0.535f, 0.0f, 0.868f, -0.313f, 0.868f, -0.788f)
                curveToRelative(0.0f, -0.434f, -0.313f, -0.787f, -0.868f, -0.787f)
                lineTo(2.079f, 12.898f)
                close()
                moveTo(2.079f, 9.497f)
                verticalLineToRelative(1.463f)
                horizontalLineToRelative(1.726f)
                curveToRelative(0.464f, 0.0f, 0.777f, -0.302f, 0.777f, -0.736f)
                curveToRelative(0.0f, -0.424f, -0.313f, -0.727f, -0.777f, -0.727f)
                close()
                moveTo(10.032f, 9.951f)
                curveToRelative(0.0f, 1.302f, 4.582f, 0.202f, 4.592f, 3.714f)
                curveToRelative(0.0f, 1.756f, -1.171f, 2.967f, -3.512f, 2.967f)
                curveToRelative(-1.413f, 0.0f, -2.604f, -0.333f, -3.492f, -0.938f)
                lineToRelative(0.888f, -1.938f)
                curveToRelative(0.676f, 0.525f, 1.524f, 0.898f, 2.675f, 0.898f)
                curveToRelative(0.777f, 0.0f, 1.15f, -0.302f, 1.15f, -0.716f)
                curveToRelative(0.0f, -1.443f, -4.622f, -0.051f, -4.612f, -3.795f)
                curveToRelative(0.01f, -1.463f, 1.312f, -2.775f, 3.552f, -2.775f)
                curveToRelative(1.272f, 0.0f, 2.523f, 0.242f, 3.502f, 0.867f)
                lineToRelative(-0.837f, 1.928f)
                curveToRelative(-0.919f, -0.615f, -1.867f, -0.908f, -2.735f, -0.888f)
                curveToRelative(-0.656f, 0.02f, -1.171f, 0.212f, -1.171f, 0.676f)
            }
        }
        .build()
        return _buysellads!!
    }

private var _buysellads: ImageVector? = null
