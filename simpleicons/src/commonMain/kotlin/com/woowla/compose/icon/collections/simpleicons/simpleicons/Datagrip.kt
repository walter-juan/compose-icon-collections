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

public val Simpleicons.Datagrip: ImageVector
    get() {
        if (_datagrip != null) {
            return _datagrip!!
        }
        _datagrip = Builder(name = "Datagrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(17.18f, 2.948f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, 3.905f, 1.364f)
                lineTo(19.708f, 5.972f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, false, -2.596f, -1.009f)
                curveToRelative(-1.6f, 0.0f, -2.855f, 1.408f, -2.855f, 3.096f)
                verticalLineToRelative(0.028f)
                curveToRelative(0.0f, 1.816f, 1.252f, 3.152f, 3.012f, 3.152f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, 2.064f, -0.592f)
                lineTo(19.332f, 9.223f)
                horizontalLineToRelative(-2.2f)
                lineTo(17.132f, 7.336f)
                horizontalLineToRelative(4.316f)
                verticalLineToRelative(4.316f)
                arcToRelative(6.436f, 6.436f, 0.0f, false, true, -4.244f, 1.576f)
                curveToRelative(-3.096f, 0.0f, -5.224f, -2.18f, -5.224f, -5.112f)
                verticalLineToRelative(-0.028f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 5.2f, -5.14f)
                close()
                moveTo(2.436f, 3.119f)
                horizontalLineToRelative(3.876f)
                curveToRelative(3.12f, 0.0f, 5.28f, 2.144f, 5.28f, 4.94f)
                verticalLineToRelative(0.028f)
                curveToRelative(0.0f, 2.8f, -2.161f, 4.968f, -5.28f, 4.968f)
                lineTo(2.436f, 13.055f)
                close()
                moveTo(6.511f, 5.088f)
                arcToRelative(2.852f, 2.852f, 0.0f, false, false, -0.199f, 0.003f)
                lineTo(4.62f, 5.091f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.691f)
                arcTo(2.832f, 2.832f, 0.0f, false, false, 9.304f, 8.123f)
                verticalLineToRelative(-0.036f)
                arcToRelative(2.852f, 2.852f, 0.0f, false, false, -2.793f, -2.999f)
                close()
                moveTo(2.208f, 19.495f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _datagrip!!
    }

private var _datagrip: ImageVector? = null
