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

public val Octicons.Vscode32: ImageVector
    get() {
        if (_vscode32 != null) {
            return _vscode32!!
        }
        _vscode32 = Builder(name = "Vscode32", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.727f, 27.839f)
                arcToRelative(1.612f, 1.612f, 0.0f, false, true, -1.847f, -0.316f)
                lineTo(9.632f, 18.125f)
                lineToRelative(-4.463f, 3.406f)
                arcToRelative(1.078f, 1.078f, 0.0f, false, true, -1.383f, -0.062f)
                lineTo(2.354f, 20.16f)
                arcToRelative(1.093f, 1.093f, 0.0f, false, true, -0.001f, -1.61f)
                lineTo(6.224f, 15.0f)
                lineToRelative(-3.871f, -3.55f)
                arcToRelative(1.093f, 1.093f, 0.0f, false, true, 0.001f, -1.61f)
                lineToRelative(1.432f, -1.309f)
                arcToRelative(1.078f, 1.078f, 0.0f, false, true, 1.383f, -0.062f)
                lineToRelative(4.463f, 3.406f)
                lineTo(19.88f, 2.477f)
                arcToRelative(1.612f, 1.612f, 0.0f, false, true, 1.847f, -0.316f)
                lineTo(27.08f, 4.75f)
                curveToRelative(0.562f, 0.272f, 0.92f, 0.844f, 0.92f, 1.472f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(-6.496f)
                verticalLineTo(9.067f)
                lineTo(13.728f, 15.0f)
                lineToRelative(7.776f, 5.933f)
                verticalLineTo(16.0f)
                horizontalLineTo(28.0f)
                verticalLineToRelative(7.778f)
                curveToRelative(0.0f, 0.628f, -0.358f, 1.2f, -0.92f, 1.472f)
                lineToRelative(-5.353f, 2.589f)
                close()
            }
        }
        .build()
        return _vscode32!!
    }

private var _vscode32: ImageVector? = null
