package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Vscode48: ImageVector
    get() {
        if (_vscode48 != null) {
            return _vscode48!!
        }
        _vscode48 = Builder(name = "Vscode48", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.59f, 41.758f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, -2.77f, -0.474f)
                lineTo(14.448f, 27.188f)
                lineToRelative(-6.695f, 5.109f)
                arcToRelative(1.618f, 1.618f, 0.0f, false, true, -2.074f, -0.093f)
                lineToRelative(-2.147f, -1.963f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, true, -0.002f, -2.416f)
                lineTo(9.336f, 22.5f)
                lineTo(3.53f, 17.175f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, true, 0.002f, -2.416f)
                lineToRelative(2.147f, -1.963f)
                arcToRelative(1.618f, 1.618f, 0.0f, false, true, 2.074f, -0.093f)
                lineToRelative(6.695f, 5.109f)
                lineTo(29.82f, 3.716f)
                arcToRelative(2.419f, 2.419f, 0.0f, false, true, 2.77f, -0.475f)
                lineToRelative(8.03f, 3.884f)
                arcTo(2.451f, 2.451f, 0.0f, false, true, 42.0f, 9.333f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-9.744f)
                verticalLineTo(13.601f)
                lineTo(20.593f, 22.5f)
                lineToRelative(11.663f, 8.899f)
                verticalLineTo(24.0f)
                horizontalLineTo(42.0f)
                verticalLineToRelative(11.667f)
                curveToRelative(0.0f, 0.941f, -0.537f, 1.8f, -1.38f, 2.208f)
                lineToRelative(-8.03f, 3.883f)
                close()
            }
        }
        .build()
        return _vscode48!!
    }

private var _vscode48: ImageVector? = null
