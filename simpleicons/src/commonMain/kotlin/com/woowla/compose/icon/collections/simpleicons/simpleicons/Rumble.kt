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

public val Simpleicons.Rumble: ImageVector
    get() {
        if (_rumble != null) {
            return _rumble!!
        }
        _rumble = Builder(name = "Rumble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.453f, 13.546f)
                curveToRelative(0.806f, -0.654f, 0.93f, -1.838f, 0.276f, -2.645f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, false, -0.276f, -0.276f)
                arcToRelative(21.213f, 21.213f, 0.0f, false, false, -4.312f, -2.776f)
                curveToRelative(-1.066f, -0.51f, -2.256f, 0.2f, -2.426f, 1.414f)
                arcToRelative(23.523f, 23.523f, 0.0f, false, false, -0.14f, 5.502f)
                curveToRelative(0.116f, 1.23f, 1.292f, 1.964f, 2.372f, 1.492f)
                arcToRelative(19.628f, 19.628f, 0.0f, false, false, 4.506f, -2.704f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(21.385f, 8.146f)
                curveToRelative(2.033f, 2.228f, 2.04f, 5.637f, 0.014f, 7.872f)
                arcTo(26.149f, 26.149f, 0.0f, false, true, 8.295f, 23.846f)
                curveToRelative(-2.685f, 0.671f, -5.417f, -0.914f, -6.166f, -3.578f)
                curveToRelative(-1.524f, -5.2f, -1.3f, -11.08f, 0.17f, -16.305f)
                curveToRelative(0.772f, -2.744f, 3.352f, -4.466f, 6.01f, -3.832f)
                curveToRelative(4.924f, 1.174f, 9.544f, 4.196f, 13.076f, 8.012f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _rumble!!
    }

private var _rumble: ImageVector? = null
