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

public val Simpleicons.Heroicgameslauncher: ImageVector
    get() {
        if (_heroicgameslauncher != null) {
            return _heroicgameslauncher!!
        }
        _heroicgameslauncher = Builder(name = "Heroicgameslauncher", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                lineTo(11.997f, 0.0f)
                arcToRelative(0.891f, 0.891f, 0.0f, false, false, -0.36f, 0.075f)
                curveTo(8.964f, 1.253f, 6.29f, 2.434f, 3.618f, 3.613f)
                arcTo(0.893f, 0.893f, 0.0f, false, false, 3.1f, 4.619f)
                lineToRelative(3.146f, 14.646f)
                curveToRelative(0.043f, 0.197f, 0.15f, 0.375f, 0.307f, 0.504f)
                lineToRelative(4.88f, 4.027f)
                arcToRelative(0.895f, 0.895f, 0.0f, false, false, 1.131f, 0.006f)
                lineToRelative(5.0f, -4.031f)
                arcToRelative(0.895f, 0.895f, 0.0f, false, false, 0.315f, -0.516f)
                lineTo(20.9f, 4.614f)
                arcToRelative(0.895f, 0.895f, 0.0f, false, false, -0.515f, -1.0f)
                lineTo(12.358f, 0.074f)
                arcTo(0.892f, 0.892f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.999f, 0.35f)
                verticalLineToRelative(0.003f)
                curveToRelative(0.114f, 0.0f, 0.228f, 0.023f, 0.334f, 0.07f)
                lineToRelative(7.42f, 3.27f)
                arcToRelative(0.827f, 0.827f, 0.0f, false, true, 0.476f, 0.924f)
                lineToRelative(-2.793f, 13.535f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.289f, 0.478f)
                lineToRelative(-4.623f, 3.725f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, -1.045f, -0.006f)
                lineToRelative(-4.513f, -3.723f)
                arcToRelative(0.829f, 0.829f, 0.0f, false, true, -0.281f, -0.465f)
                lineTo(3.775f, 4.622f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.476f, -0.931f)
                lineTo(11.665f, 0.42f)
                arcToRelative(0.832f, 0.832f, 0.0f, false, true, 0.334f, -0.07f)
                close()
                moveTo(11.954f, 2.304f)
                lineTo(10.28f, 5.202f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(1.211f, 11.301f)
                lineToRelative(0.512f, 0.409f)
                lineToRelative(0.512f, -0.409f)
                lineToRelative(1.117f, -11.3f)
                close()
                moveTo(9.003f, 16.261f)
                lineToRelative(-0.584f, 1.068f)
                lineToRelative(0.584f, 1.07f)
                lineToRelative(2.295f, -0.38f)
                lineToRelative(0.47f, -0.69f)
                lineToRelative(-0.47f, -0.671f)
                close()
                moveTo(14.999f, 16.261f)
                lineTo(12.704f, 16.658f)
                lineTo(12.234f, 17.329f)
                lineTo(12.704f, 18.019f)
                lineTo(14.999f, 18.399f)
                lineTo(15.583f, 17.329f)
                close()
                moveTo(12.001f, 17.749f)
                lineTo(11.491f, 18.193f)
                lineTo(11.21f, 20.361f)
                lineTo(11.999f, 20.911f)
                lineTo(12.792f, 20.361f)
                lineTo(12.497f, 18.193f)
                close()
            }
        }
        .build()
        return _heroicgameslauncher!!
    }

private var _heroicgameslauncher: ImageVector? = null
