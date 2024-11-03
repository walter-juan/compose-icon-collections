package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 0.0f)
                lineTo(0.0f, 1.0f)
                lineToRelative(2.2f, 3.081f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.815f, 0.419f)
                horizontalLineToRelative(0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.708f, 0.293f)
                lineToRelative(2.675f, 2.675f)
                lineToRelative(-2.617f, 2.654f)
                arcTo(3.003f, 3.003f, 0.0f, false, false, 0.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 5.878f, -0.851f)
                lineToRelative(2.654f, -2.617f)
                lineToRelative(0.968f, 0.968f)
                lineToRelative(-0.305f, 0.914f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.242f, 1.023f)
                lineToRelative(3.27f, 3.27f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(1.586f, -1.586f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-3.27f, -3.27f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.023f, -0.242f)
                lineTo(10.5f, 9.5f)
                lineToRelative(-0.96f, -0.96f)
                lineToRelative(2.68f, -2.643f)
                arcTo(3.005f, 3.005f, 0.0f, false, false, 16.0f, 3.0f)
                quadToRelative(0.0f, -0.405f, -0.102f, -0.777f)
                lineToRelative(-2.14f, 2.141f)
                lineTo(12.0f, 4.0f)
                lineToRelative(-0.364f, -1.757f)
                lineTo(13.777f, 0.102f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.675f, 3.68f)
                lineTo(7.462f, 6.46f)
                lineTo(4.793f, 3.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-0.071f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.419f, -0.814f)
                close()
                moveTo(10.646f, 10.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(2.914f, 2.915f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.707f)
                lineToRelative(-2.915f, -2.914f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                moveTo(3.0f, 11.0f)
                lineToRelative(0.471f, 0.242f)
                lineToRelative(0.529f, 0.026f)
                lineToRelative(0.287f, 0.445f)
                lineToRelative(0.445f, 0.287f)
                lineToRelative(0.026f, 0.529f)
                lineTo(5.0f, 13.0f)
                lineToRelative(-0.242f, 0.471f)
                lineToRelative(-0.026f, 0.529f)
                lineToRelative(-0.445f, 0.287f)
                lineToRelative(-0.287f, 0.445f)
                lineToRelative(-0.529f, 0.026f)
                lineTo(3.0f, 15.0f)
                lineToRelative(-0.471f, -0.242f)
                lineTo(2.0f, 14.732f)
                lineToRelative(-0.287f, -0.445f)
                lineTo(1.268f, 14.0f)
                lineToRelative(-0.026f, -0.529f)
                lineTo(1.0f, 13.0f)
                lineToRelative(0.242f, -0.471f)
                lineToRelative(0.026f, -0.529f)
                lineToRelative(0.445f, -0.287f)
                lineToRelative(0.287f, -0.445f)
                lineToRelative(0.529f, -0.026f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
