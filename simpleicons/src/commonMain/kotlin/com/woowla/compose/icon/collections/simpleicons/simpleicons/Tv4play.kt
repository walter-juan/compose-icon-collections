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

public val Simpleicons.Tv4play: ImageVector
    get() {
        if (_tv4play != null) {
            return _tv4play!!
        }
        _tv4play = Builder(name = "Tv4play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.374f, 15.93f)
                lineTo(10.374f, 3.718f)
                curveToRelative(0.0f, -0.209f, -0.279f, -0.307f, -0.402f, -0.12f)
                lineTo(0.037f, 18.289f)
                arcToRelative(0.199f, 0.199f, 0.0f, false, false, -0.006f, 0.223f)
                curveToRelative(0.036f, 0.072f, 0.108f, 0.12f, 0.192f, 0.12f)
                horizontalLineToRelative(7.331f)
                verticalLineToRelative(1.656f)
                curveToRelative(0.0f, 0.113f, 0.102f, 0.215f, 0.222f, 0.215f)
                horizontalLineToRelative(2.376f)
                curveToRelative(0.12f, 0.0f, 0.222f, -0.102f, 0.222f, -0.215f)
                verticalLineToRelative(-1.656f)
                horizontalLineToRelative(1.435f)
                curveToRelative(0.12f, 0.0f, 0.222f, -0.096f, 0.222f, -0.222f)
                verticalLineToRelative(-2.257f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, -0.224f, -0.222f)
                close()
                moveTo(7.548f, 15.938f)
                lineTo(4.795f, 15.938f)
                lineToRelative(2.753f, -4.073f)
                close()
                moveTo(23.861f, 12.194f)
                lineTo(16.704f, 8.06f)
                curveToRelative(-0.078f, -0.049f, -0.169f, 0.035f, -0.132f, 0.12f)
                arcToRelative(10.53f, 10.53f, 0.0f, false, true, 0.894f, 4.26f)
                curveToRelative(0.0f, 1.512f, -0.317f, 2.952f, -0.888f, 4.248f)
                curveToRelative(-0.036f, 0.083f, 0.053f, 0.161f, 0.131f, 0.12f)
                lineToRelative(7.152f, -4.127f)
                arcToRelative(0.283f, 0.283f, 0.0f, false, false, 0.0f, -0.487f)
                close()
            }
        }
        .build()
        return _tv4play!!
    }

private var _tv4play: ImageVector? = null
