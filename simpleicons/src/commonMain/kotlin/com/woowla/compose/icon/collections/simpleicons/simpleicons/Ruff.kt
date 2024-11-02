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

public val Simpleicons.Ruff: ImageVector
    get() {
        if (_ruff != null) {
            return _ruff!!
        }
        _ruff = Builder(name = "Ruff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 0.0f)
                curveTo(1.338f, 0.0f, 0.0f, 1.338f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.662f, 1.338f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.662f, 0.0f, 3.0f, -1.338f, 3.0f, -3.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.662f, -1.338f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(7.2f, 7.2f)
                horizontalLineToRelative(8.641f)
                curveToRelative(0.53f, 0.0f, 0.959f, 0.43f, 0.959f, 0.959f)
                verticalLineToRelative(3.266f)
                curveToRelative(0.0f, 0.53f, -0.43f, 0.959f, -0.959f, 0.959f)
                horizontalLineToRelative(-0.961f)
                verticalLineToRelative(0.768f)
                horizontalLineToRelative(1.92f)
                lineTo(16.8f, 16.8f)
                horizontalLineToRelative(-4.416f)
                verticalLineToRelative(-2.88f)
                horizontalLineToRelative(-0.768f)
                verticalLineToRelative(2.88f)
                lineTo(7.2f, 16.8f)
                close()
                moveTo(10.848f, 10.848f)
                verticalLineToRelative(0.768f)
                horizontalLineToRelative(2.304f)
                verticalLineToRelative(-0.768f)
                close()
            }
        }
        .build()
        return _ruff!!
    }

private var _ruff: ImageVector? = null
