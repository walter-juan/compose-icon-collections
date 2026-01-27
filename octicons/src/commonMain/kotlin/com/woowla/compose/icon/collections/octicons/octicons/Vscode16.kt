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

public val Octicons.Vscode16: ImageVector
    get() {
        if (_vscode16 != null) {
            return _vscode16!!
        }
        _vscode16 = Builder(name = "Vscode16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.863f, 13.919f)
                arcToRelative(0.796f, 0.796f, 0.0f, false, true, -0.644f, 0.025f)
                arcToRelative(0.795f, 0.795f, 0.0f, false, true, -0.279f, -0.183f)
                lineTo(4.816f, 9.063f)
                lineToRelative(-2.232f, 1.703f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.691f, -0.031f)
                lineToRelative(-0.716f, -0.655f)
                arcToRelative(0.546f, 0.546f, 0.0f, false, true, 0.0f, -0.805f)
                lineTo(3.112f, 7.5f)
                lineTo(1.177f, 5.725f)
                arcToRelative(0.546f, 0.546f, 0.0f, false, true, 0.0f, -0.805f)
                lineToRelative(0.716f, -0.655f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.691f, -0.031f)
                lineToRelative(2.232f, 1.703f)
                lineTo(9.94f, 1.239f)
                arcToRelative(0.805f, 0.805f, 0.0f, false, true, 0.923f, -0.159f)
                lineToRelative(2.677f, 1.295f)
                curveToRelative(0.281f, 0.136f, 0.46f, 0.422f, 0.46f, 0.736f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.248f)
                verticalLineTo(4.534f)
                lineTo(6.864f, 7.5f)
                lineToRelative(3.888f, 2.966f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(3.889f)
                curveToRelative(0.0f, 0.314f, -0.179f, 0.6f, -0.46f, 0.736f)
                lineToRelative(-2.677f, 1.294f)
                close()
            }
        }
        .build()
        return _vscode16!!
    }

private var _vscode16: ImageVector? = null
