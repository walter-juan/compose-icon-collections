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

public val Simpleicons.Paperlessngx: ImageVector
    get() {
        if (_paperlessngx != null) {
            return _paperlessngx!!
        }
        _paperlessngx = Builder(name = "Paperlessngx", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.338f, 23.028f)
                curveToRelative(-0.117f, -0.56f, -0.353f, -1.678f, -0.382f, -1.678f)
                curveToRelative(-4.977f, -2.975f, -4.388f, -8.128f, -2.739f, -11.073f)
                curveToRelative(0.353f, 3.71f, 6.92f, 6.273f, 3.092f, 10.808f)
                curveToRelative(-0.03f, 0.059f, 0.177f, 0.765f, 0.353f, 1.413f)
                curveToRelative(0.766f, -1.296f, 1.915f, -2.856f, 1.856f, -3.004f)
                curveTo(3.806f, 8.01f, 18.53f, 7.126f, 21.592f, 0.0f)
                curveToRelative(1.385f, 6.89f, -0.706f, 17.55f, -12.544f, 20.26f)
                curveToRelative(-0.06f, 0.03f, -2.15f, 3.71f, -2.238f, 3.74f)
                curveToRelative(0.0f, -0.059f, -0.884f, -0.03f, -0.766f, -0.324f)
                curveToRelative(0.059f, -0.177f, 0.177f, -0.412f, 0.294f, -0.648f)
                close()
                moveTo(6.191f, 20.26f)
                curveToRelative(1.502f, -1.737f, -0.265f, -4.712f, -1.325f, -5.683f)
                curveToRelative(1.796f, 3.092f, 1.679f, 4.888f, 1.325f, 5.683f)
                close()
            }
        }
        .build()
        return _paperlessngx!!
    }

private var _paperlessngx: ImageVector? = null
