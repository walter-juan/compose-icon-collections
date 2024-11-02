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

public val Simpleicons.Deepl: ImageVector
    get() {
        if (_deepl != null) {
            return _deepl!!
        }
        _deepl = Builder(name = "Deepl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.907f, 4.94f)
                lineTo(12.685f, 0.186f)
                arcToRelative(1.358f, 1.358f, 0.0f, false, false, -1.371f, 0.0f)
                lineTo(3.093f, 4.957f)
                arcToRelative(1.377f, 1.377f, 0.0f, false, false, -0.686f, 1.182f)
                verticalLineToRelative(9.526f)
                arcToRelative(1.377f, 1.377f, 0.0f, false, false, 0.686f, 1.194f)
                lineToRelative(8.222f, 4.759f)
                lineToRelative(0.062f, 0.036f)
                lineToRelative(4.049f, 2.346f)
                lineToRelative(-0.011f, -2.061f)
                lineToRelative(0.007f, -1.145f)
                lineToRelative(0.004f, 0.019f)
                verticalLineToRelative(-0.385f)
                curveToRelative(0.0f, -0.23f, 0.119f, -0.434f, 0.296f, -0.56f)
                lineToRelative(0.264f, -0.151f)
                lineToRelative(0.126f, -0.07f)
                horizontalLineToRelative(-0.007f)
                lineToRelative(4.803f, -2.78f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, 0.686f, -1.196f)
                lineTo(21.593f, 6.135f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, -0.686f, -1.196f)
                moveToRelative(-9.853f, 9.689f)
                arcToRelative(1.428f, 1.428f, 0.0f, false, true, -0.4f, 1.384f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, -1.971f, 0.0f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, 0.0f, -2.063f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, 2.042f, 0.075f)
                lineToRelative(3.328f, -1.916f)
                lineToRelative(0.686f, 0.387f)
                close()
                moveTo(16.825f, 12.214f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, -1.971f, 0.0f)
                arcToRelative(1.426f, 1.426f, 0.0f, false, true, -0.37f, -1.478f)
                lineToRelative(-0.013f, 0.007f)
                lineToRelative(-3.753f, -2.172f)
                lineToRelative(-0.057f, 0.057f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, -1.971f, 0.0f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, 0.0f, -2.063f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, 1.972f, 0.0f)
                curveToRelative(0.394f, 0.377f, 0.524f, 0.918f, 0.39f, 1.407f)
                lineToRelative(3.781f, 2.201f)
                lineToRelative(0.019f, -0.019f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, 1.972f, 0.0f)
                arcToRelative(1.427f, 1.427f, 0.0f, false, true, 0.0f, 2.061f)
                close()
            }
        }
        .build()
        return _deepl!!
    }

private var _deepl: ImageVector? = null
