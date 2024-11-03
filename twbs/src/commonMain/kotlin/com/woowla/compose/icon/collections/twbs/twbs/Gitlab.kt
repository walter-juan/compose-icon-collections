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

public val Twbs.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.734f, 6.1f)
                lineToRelative(-0.022f, -0.058f)
                lineTo(13.534f, 0.358f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.563f, -0.356f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.328f, 0.122f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.193f, 0.294f)
                lineToRelative(-1.47f, 4.499f)
                horizontalLineTo(5.025f)
                lineToRelative(-1.47f, -4.5f)
                arcTo(0.572f, 0.572f, 0.0f, false, false, 2.47f, 0.358f)
                lineTo(0.289f, 6.04f)
                lineToRelative(-0.022f, 0.057f)
                arcTo(4.044f, 4.044f, 0.0f, false, false, 1.61f, 10.77f)
                lineToRelative(0.007f, 0.006f)
                lineToRelative(0.02f, 0.014f)
                lineToRelative(3.318f, 2.485f)
                lineToRelative(1.64f, 1.242f)
                lineToRelative(1.0f, 0.755f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, 0.814f, 0.0f)
                lineToRelative(1.0f, -0.755f)
                lineToRelative(1.64f, -1.242f)
                lineToRelative(3.338f, -2.5f)
                lineToRelative(0.009f, -0.007f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 1.34f, -4.668f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
