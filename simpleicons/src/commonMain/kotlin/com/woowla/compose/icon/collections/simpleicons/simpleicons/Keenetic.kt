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

public val Simpleicons.Keenetic: ImageVector
    get() {
        if (_keenetic != null) {
            return _keenetic!!
        }
        _keenetic = Builder(name = "Keenetic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.718f, 10.188f)
                lineTo(24.0f, 2.376f)
                horizontalLineToRelative(-6.588f)
                lineTo(9.788f, 9.812f)
                horizontalLineTo(4.33f)
                verticalLineTo(2.376f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(19.248f)
                horizontalLineToRelative(4.33f)
                verticalLineTo(14.14f)
                horizontalLineToRelative(7.623f)
                curveToRelative(3.2f, 0.0f, 5.412f, 0.706f, 6.588f, 2.07f)
                curveToRelative(0.706f, 0.8f, 1.035f, 1.883f, 1.035f, 3.248f)
                verticalLineToRelative(2.165f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(-2.165f)
                curveToRelative(0.0f, -2.353f, -0.706f, -4.424f, -2.07f, -6.024f)
                curveToRelative(-1.46f, -1.647f, -3.483f, -2.776f, -6.118f, -3.247f)
            }
        }
        .build()
        return _keenetic!!
    }

private var _keenetic: ImageVector? = null
