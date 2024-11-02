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

public val Simpleicons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.6f, 9.593f)
                lineToRelative(-0.034f, -0.086f)
                lineTo(20.3f, 0.981f)
                arcToRelative(0.851f, 0.851f, 0.0f, false, false, -0.336f, -0.405f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, false, -1.0f, 0.054f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, false, -0.29f, 0.44f)
                lineToRelative(-2.205f, 6.748f)
                horizontalLineTo(7.537f)
                lineToRelative(-2.206f, -6.748f)
                arcToRelative(0.857f, 0.857f, 0.0f, false, false, -0.29f, -0.441f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, false, -1.0f, -0.054f)
                arcToRelative(0.859f, 0.859f, 0.0f, false, false, -0.336f, 0.405f)
                lineTo(0.433f, 9.502f)
                lineToRelative(-0.032f, 0.086f)
                arcToRelative(6.066f, 6.066f, 0.0f, false, false, 2.012f, 7.01f)
                lineToRelative(0.011f, 0.009f)
                lineToRelative(0.03f, 0.021f)
                lineToRelative(4.976f, 3.726f)
                lineToRelative(2.462f, 1.863f)
                lineToRelative(1.5f, 1.132f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, 1.22f, 0.0f)
                lineToRelative(1.5f, -1.132f)
                lineToRelative(2.462f, -1.863f)
                lineToRelative(5.006f, -3.749f)
                lineToRelative(0.013f, -0.01f)
                arcToRelative(6.068f, 6.068f, 0.0f, false, false, 2.009f, -7.003f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
