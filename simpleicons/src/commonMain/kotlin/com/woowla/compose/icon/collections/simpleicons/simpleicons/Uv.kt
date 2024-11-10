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

public val Simpleicons.Uv: ImageVector
    get() {
        if (_uv != null) {
            return _uv!!
        }
        _uv = Builder(name = "Uv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.106f)
                lineToRelative(0.05f, 11.95f)
                lineToRelative(0.04f, 9.56f)
                curveToRelative(0.005f, 1.32f, 1.08f, 2.385f, 2.4f, 2.38f)
                lineToRelative(9.56f, -0.04f)
                lineToRelative(5.975f, -0.025f)
                lineToRelative(0.608f, -0.003f)
                curveToRelative(1.316f, -0.006f, 2.38f, -1.096f, 2.38f, -2.412f)
                horizontalLineToRelative(1.095f)
                verticalLineToRelative(2.389f)
                lineTo(24.0f, 23.904f)
                lineTo(23.899f, 0.005f)
                lineTo(12.906f, 0.051f)
                lineToRelative(0.046f, 9.524f)
                verticalLineToRelative(5.964f)
                horizontalLineToRelative(-1.958f)
                lineTo(11.04f, 9.584f)
                lineTo(10.994f, 0.059f)
                close()
            }
        }
        .build()
        return _uv!!
    }

private var _uv: ImageVector? = null
