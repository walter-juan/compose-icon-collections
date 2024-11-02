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

public val Simpleicons.O2: ImageVector
    get() {
        if (_o2 != null) {
            return _o2!!
        }
        _o2 = Builder(name = "O2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.473f, 0.191f)
                curveTo(3.827f, 0.191f, 0.0f, 4.271f, 0.0f, 9.917f)
                curveToRelative(0.0f, 5.317f, 3.86f, 9.726f, 9.472f, 9.726f)
                curveToRelative(5.61f, 0.0f, 9.433f, -4.409f, 9.433f, -9.726f)
                curveTo(18.905f, 4.27f, 15.116f, 0.19f, 9.473f, 0.19f)
                close()
                moveTo(9.471f, 2.961f)
                curveToRelative(3.677f, 0.0f, 5.79f, 3.422f, 5.79f, 6.956f)
                curveToRelative(0.0f, 3.314f, -1.785f, 6.956f, -5.79f, 6.956f)
                curveToRelative(-4.007f, 0.0f, -5.827f, -3.642f, -5.827f, -6.956f)
                curveToRelative(0.0f, -3.534f, 2.148f, -6.956f, 5.827f, -6.956f)
                close()
                moveTo(21.161f, 15.441f)
                arcToRelative(5.47f, 5.47f, 0.0f, false, false, -2.44f, 0.588f)
                lineToRelative(0.13f, 1.367f)
                curveToRelative(0.543f, -0.353f, 1.204f, -0.66f, 1.9f, -0.66f)
                curveToRelative(0.695f, 0.0f, 1.34f, 0.355f, 1.34f, 1.11f)
                curveToRelative(0.0f, 1.509f, -2.791f, 3.84f, -3.558f, 4.584f)
                verticalLineToRelative(1.38f)
                lineTo(24.0f, 23.81f)
                verticalLineToRelative(-1.298f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(1.344f, -1.32f, 3.1f, -2.924f, 3.1f, -4.668f)
                curveToRelative(0.0f, -1.614f, -1.013f, -2.403f, -2.58f, -2.403f)
                close()
            }
        }
        .build()
        return _o2!!
    }

private var _o2: ImageVector? = null
