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

public val Simpleicons.Deutschewelle: ImageVector
    get() {
        if (_deutschewelle != null) {
            return _deutschewelle!!
        }
        _deutschewelle = Builder(name = "Deutschewelle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.143f, 5.182f)
                arcTo(6.854f, 6.854f, 0.0f, false, false, 12.0f, 7.493f)
                arcToRelative(6.855f, 6.855f, 0.0f, false, false, -5.143f, -2.311f)
                curveTo(3.07f, 5.182f, 0.0f, 8.234f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.766f, 3.07f, 6.818f, 6.857f, 6.818f)
                arcTo(6.855f, 6.855f, 0.0f, false, false, 12.0f, 16.507f)
                arcToRelative(6.854f, 6.854f, 0.0f, false, false, 5.143f, 2.311f)
                curveTo(20.929f, 18.818f, 24.0f, 15.766f, 24.0f, 12.0f)
                curveToRelative(0.0f, -3.766f, -3.07f, -6.818f, -6.857f, -6.818f)
                close()
                moveTo(11.103f, 15.232f)
                arcToRelative(5.349f, 5.349f, 0.0f, false, true, -4.246f, 2.086f)
                curveToRelative(-2.954f, 0.0f, -5.348f, -2.38f, -5.348f, -5.318f)
                curveToRelative(0.0f, -2.937f, 2.394f, -5.318f, 5.348f, -5.318f)
                curveToRelative(1.731f, 0.0f, 3.27f, 0.818f, 4.247f, 2.087f)
                arcTo(5.274f, 5.274f, 0.0f, false, true, 12.206f, 12.0f)
                arcToRelative(5.274f, 5.274f, 0.0f, false, true, -1.102f, 3.231f)
                close()
                moveTo(19.983f, 14.591f)
                horizontalLineToRelative(-1.608f)
                lineToRelative(-1.049f, -2.549f)
                lineToRelative(-1.025f, 2.549f)
                horizontalLineToRelative(-1.605f)
                lineToRelative(-1.661f, -5.182f)
                horizontalLineToRelative(1.833f)
                lineToRelative(0.779f, 2.602f)
                lineToRelative(0.972f, -2.602f)
                horizontalLineToRelative(1.434f)
                lineToRelative(0.973f, 2.602f)
                lineToRelative(0.778f, -2.602f)
                horizontalLineToRelative(1.841f)
                close()
                moveTo(7.058f, 9.273f)
                lineTo(4.083f, 9.273f)
                verticalLineToRelative(5.454f)
                horizontalLineToRelative(2.975f)
                curveToRelative(1.534f, 0.0f, 3.107f, -0.878f, 3.107f, -2.727f)
                curveToRelative(0.0f, -1.768f, -1.434f, -2.727f, -3.107f, -2.727f)
                close()
                moveTo(6.897f, 13.147f)
                lineTo(5.729f, 13.147f)
                verticalLineToRelative(-2.318f)
                horizontalLineToRelative(1.168f)
                curveToRelative(1.062f, 0.0f, 1.44f, 0.59f, 1.44f, 1.159f)
                curveToRelative(0.001f, 0.561f, -0.375f, 1.159f, -1.44f, 1.159f)
                close()
            }
        }
        .build()
        return _deutschewelle!!
    }

private var _deutschewelle: ImageVector? = null
