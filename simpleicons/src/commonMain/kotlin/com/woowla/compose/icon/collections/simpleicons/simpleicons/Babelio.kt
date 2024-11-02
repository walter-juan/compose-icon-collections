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

public val Simpleicons.Babelio: ImageVector
    get() {
        if (_babelio != null) {
            return _babelio!!
        }
        _babelio = Builder(name = "Babelio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.283f, 0.0f)
                arcToRelative(13.994f, 13.994f, 0.0f, false, true, -6.566f, 7.588f)
                verticalLineToRelative(4.691f)
                arcToRelative(20.538f, 20.538f, 0.0f, false, false, 6.566f, -3.676f)
                close()
                moveTo(18.566f, 7.7f)
                arcToRelative(22.121f, 22.121f, 0.0f, false, true, -13.132f, 7.03f)
                verticalLineToRelative(4.213f)
                arcToRelative(35.545f, 35.545f, 0.0f, false, false, 3.836f, -0.564f)
                arcToRelative(35.118f, 35.118f, 0.0f, false, false, 9.296f, -3.322f)
                close()
                moveTo(21.848f, 15.031f)
                arcToRelative(36.747f, 36.747f, 0.0f, false, true, -19.696f, 5.686f)
                lineTo(2.152f, 24.0f)
                horizontalLineToRelative(19.696f)
                close()
            }
        }
        .build()
        return _babelio!!
    }

private var _babelio: ImageVector? = null
