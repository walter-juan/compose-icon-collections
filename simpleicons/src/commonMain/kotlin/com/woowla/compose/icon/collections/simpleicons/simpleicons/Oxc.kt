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

public val Simpleicons.Oxc: ImageVector
    get() {
        if (_oxc != null) {
            return _oxc!!
        }
        _oxc = Builder(name = "Oxc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.463f, 3.923f)
                curveToRelative(0.0f, 0.637f, 0.517f, 1.154f, 1.154f, 1.154f)
                horizontalLineToRelative(4.376f)
                curveToRelative(0.515f, 0.0f, 0.772f, 0.62f, 0.408f, 0.984f)
                lineToRelative(-5.6f, 5.601f)
                curveToRelative(-0.217f, 0.216f, -0.34f, 0.51f, -0.34f, 0.816f)
                verticalLineToRelative(1.915f)
                curveToRelative(0.0f, 0.797f, 0.79f, 1.35f, 1.49f, 0.97f)
                curveToRelative(0.71f, -0.386f, 1.371f, -0.853f, 1.972f, -1.392f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.828f, 0.012f)
                lineToRelative(4.08f, 4.08f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.007f, 0.808f)
                arcTo(17.25f, 17.25f, 0.0f, false, true, 12.0f, 23.54f)
                arcTo(17.25f, 17.25f, 0.0f, false, true, 0.176f, 18.872f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.006f, -0.81f)
                lineToRelative(4.08f, -4.078f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, 0.827f, -0.012f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, 1.973f, 1.39f)
                curveToRelative(0.7f, 0.38f, 1.488f, -0.171f, 1.488f, -0.968f)
                verticalLineToRelative(-1.915f)
                curveToRelative(0.0f, -0.307f, -0.122f, -0.6f, -0.339f, -0.816f)
                lineTo(2.6f, 6.061f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, 0.408f, -0.984f)
                horizontalLineToRelative(4.376f)
                curveToRelative(0.637f, 0.0f, 1.154f, -0.517f, 1.154f, -1.154f)
                verticalLineTo(1.038f)
                curveToRelative(0.0f, -0.32f, 0.258f, -0.577f, 0.577f, -0.577f)
                horizontalLineToRelative(5.77f)
                curveToRelative(0.318f, 0.0f, 0.576f, 0.258f, 0.576f, 0.577f)
                verticalLineToRelative(2.885f)
                close()
            }
        }
        .build()
        return _oxc!!
    }

private var _oxc: ImageVector? = null
