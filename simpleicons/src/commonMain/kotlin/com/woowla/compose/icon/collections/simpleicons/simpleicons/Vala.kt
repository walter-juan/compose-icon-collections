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

public val Simpleicons.Vala: ImageVector
    get() {
        if (_vala != null) {
            return _vala!!
        }
        _vala = Builder(name = "Vala", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.384f, 23.999f)
                lineToRelative(-0.515f, -21.859f)
                quadToRelative(-2.25f, 0.844f, -3.515f, 2.64f)
                quadToRelative(-1.251f, 1.797f, -1.251f, 4.469f)
                quadToRelative(0.0f, 0.609f, 0.063f, 1.0f)
                quadToRelative(0.078f, 0.375f, 0.156f, 0.609f)
                quadToRelative(0.078f, 0.219f, 0.141f, 0.344f)
                quadToRelative(0.078f, 0.125f, 0.078f, 0.219f)
                quadToRelative(-0.828f, 0.0f, -1.468f, -0.156f)
                quadToRelative(-0.641f, -0.172f, -1.079f, -0.532f)
                quadToRelative(-0.422f, -0.359f, -0.656f, -0.953f)
                quadToRelative(-0.219f, -0.593f, -0.219f, -1.468f)
                quadToRelative(0.0f, -1.062f, 0.452f, -2.094f)
                quadToRelative(0.469f, -1.031f, 1.266f, -1.953f)
                quadToRelative(0.813f, -0.921f, 1.891f, -1.702f)
                quadToRelative(1.094f, -0.781f, 2.328f, -1.344f)
                quadTo(8.304f, 0.641f, 9.648f, 0.329f)
                quadTo(11.008f, 0.0f, 12.352f, 0.0f)
                quadToRelative(0.359f, 0.0f, 0.656f, 0.015f)
                quadToRelative(0.312f, 0.016f, 0.624f, 0.047f)
                lineToRelative(0.282f, 19.687f)
                lineTo(20.648f, 0.155f)
                horizontalLineToRelative(2.234f)
                lineTo(13.992f, 24.0f)
                horizontalLineTo(9.383f)
                close()
            }
        }
        .build()
        return _vala!!
    }

private var _vala: ImageVector? = null
