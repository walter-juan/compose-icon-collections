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

public val Octicons.PencilAi24: ImageVector
    get() {
        if (_pencilAi24 != null) {
            return _pencilAi24!!
        }
        _pencilAi24 = Builder(name = "PencilAi24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.263f, 2.177f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 2.474f, 0.0f)
                lineToRelative(2.586f, 2.586f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 0.0f, 2.474f)
                lineTo(19.53f, 10.03f)
                lineToRelative(-0.012f, 0.012f)
                lineTo(8.69f, 20.378f)
                arcToRelative(1.753f, 1.753f, 0.0f, false, true, -0.699f, 0.409f)
                lineToRelative(-5.523f, 1.681f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.935f, -0.936f)
                lineToRelative(1.673f, -5.499f)
                curveToRelative(0.088f, -0.288f, 0.248f, -0.549f, 0.466f, -0.757f)
                lineTo(14.476f, 4.964f)
                close()
                moveTo(14.988f, 6.548f)
                lineTo(4.708f, 16.361f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, false, -0.067f, 0.108f)
                lineToRelative(-1.264f, 4.154f)
                lineToRelative(4.177f, -1.271f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.1f, -0.059f)
                lineToRelative(10.273f, -9.805f)
                close()
                moveTo(19.0f, 8.439f)
                lineToRelative(2.263f, -2.262f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, 0.0f, -0.354f)
                lineToRelative(-2.586f, -2.586f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.354f, 0.0f)
                lineTo(16.061f, 5.5f)
                close()
                moveTo(18.707f, 14.802f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, true, 0.587f, 0.0f)
                lineToRelative(0.298f, 0.815f)
                arcToRelative(4.685f, 4.685f, 0.0f, false, false, 2.791f, 2.791f)
                lineToRelative(0.815f, 0.298f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, true, 0.0f, 0.587f)
                lineToRelative(-0.815f, 0.299f)
                arcToRelative(4.686f, 4.686f, 0.0f, false, false, -2.791f, 2.79f)
                lineToRelative(-0.298f, 0.816f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, true, -0.587f, 0.0f)
                lineToRelative(-0.299f, -0.816f)
                arcToRelative(4.687f, 4.687f, 0.0f, false, false, -2.79f, -2.79f)
                lineToRelative(-0.816f, -0.299f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, true, 0.0f, -0.587f)
                lineToRelative(0.816f, -0.298f)
                arcToRelative(4.686f, 4.686f, 0.0f, false, false, 2.79f, -2.791f)
                lineToRelative(0.299f, -0.815f)
                close()
            }
        }
        .build()
        return _pencilAi24!!
    }

private var _pencilAi24: ImageVector? = null
