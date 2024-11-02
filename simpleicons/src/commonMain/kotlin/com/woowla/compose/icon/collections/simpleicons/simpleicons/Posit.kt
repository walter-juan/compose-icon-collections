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

public val Simpleicons.Posit: ImageVector
    get() {
        if (_posit != null) {
            return _posit!!
        }
        _posit = Builder(name = "Posit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.953f)
                verticalLineToRelative(6.393f)
                lineToRelative(4.852f, 2.066f)
                lineToRelative(-3.27f, 1.447f)
                verticalLineToRelative(2.283f)
                lineToRelative(3.215f, 1.432f)
                lineTo(0.0f, 16.615f)
                verticalLineToRelative(6.432f)
                lineToRelative(11.918f, -5.256f)
                lineToRelative(0.082f, -0.035f)
                lineToRelative(0.082f, 0.035f)
                lineTo(24.0f, 23.047f)
                verticalLineToRelative(-6.432f)
                lineToRelative(-4.797f, -2.04f)
                lineToRelative(3.215f, -1.433f)
                verticalLineToRelative(-2.283f)
                lineToRelative(-3.27f, -1.447f)
                lineTo(24.0f, 7.346f)
                lineTo(24.0f, 0.953f)
                lineTo(12.0f, 6.25f)
                close()
                moveTo(0.879f, 2.305f)
                lineTo(10.918f, 6.736f)
                lineTo(5.958f, 8.926f)
                lineTo(0.879f, 6.763f)
                close()
                moveTo(23.121f, 2.305f)
                verticalLineToRelative(4.458f)
                lineToRelative(-5.066f, 2.162f)
                lineToRelative(-4.973f, -2.19f)
                lineToRelative(10.04f, -4.431f)
                close()
                moveTo(12.0f, 7.209f)
                lineToRelative(4.945f, 2.19f)
                lineToRelative(-4.95f, 2.107f)
                lineToRelative(-4.94f, -2.108f)
                close()
                moveTo(5.959f, 9.885f)
                lineToRelative(4.926f, 2.093f)
                lineToRelative(-0.006f, 0.002f)
                lineToRelative(0.006f, 0.002f)
                lineToRelative(-4.979f, 2.12f)
                lineToRelative(-3.446f, -1.529f)
                verticalLineToRelative(-1.148f)
                lineToRelative(3.5f, -1.541f)
                close()
                moveTo(18.041f, 9.885f)
                lineTo(21.555f, 11.425f)
                verticalLineToRelative(1.15f)
                lineToRelative(-3.448f, 1.526f)
                lineToRelative(-1.107f, 0.487f)
                lineToRelative(-4.994f, 2.21f)
                lineTo(7.0f, 14.589f)
                lineToRelative(4.994f, -2.133f)
                lineTo(17.0f, 14.588f)
                lineToRelative(1.094f, -0.487f)
                lineToRelative(-4.973f, -2.12f)
                close()
                moveTo(5.906f, 15.06f)
                lineToRelative(5.012f, 2.215f)
                lineToRelative(-0.066f, 0.03f)
                lineToRelative(-9.973f, 4.404f)
                verticalLineToRelative(-4.512f)
                close()
                moveTo(18.107f, 15.06f)
                lineTo(23.121f, 17.197f)
                verticalLineToRelative(4.512f)
                lineToRelative(-9.959f, -4.404f)
                lineToRelative(-0.066f, -0.03f)
                close()
            }
        }
        .build()
        return _posit!!
    }

private var _posit: ImageVector? = null
