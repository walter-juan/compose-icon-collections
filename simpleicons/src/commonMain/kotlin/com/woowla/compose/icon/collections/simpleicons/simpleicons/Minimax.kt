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

public val Simpleicons.Minimax: ImageVector
    get() {
        if (_minimax != null) {
            return _minimax!!
        }
        _minimax = Builder(name = "Minimax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.43f, 3.92f)
                arcToRelative(0.86f, 0.86f, 0.0f, true, false, -1.718f, 0.0f)
                verticalLineToRelative(14.236f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, -3.997f, 0.0f)
                lineTo(5.715f, 9.022f)
                arcToRelative(0.86f, 0.86f, 0.0f, true, false, -1.718f, 0.0f)
                verticalLineToRelative(3.87f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, -3.997f, 0.0f)
                lineTo(0.0f, 11.49f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 1.139f, 0.0f)
                verticalLineToRelative(1.404f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, false, 1.719f, 0.0f)
                lineTo(2.858f, 9.022f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, 3.997f, 0.0f)
                verticalLineToRelative(9.134f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, false, 1.719f, 0.0f)
                lineTo(8.574f, 3.92f)
                arcToRelative(1.998f, 1.998f, 0.0f, true, true, 3.996f, 0.0f)
                verticalLineToRelative(11.788f)
                arcToRelative(0.57f, 0.57f, 0.0f, true, true, -1.139f, 0.0f)
                close()
                moveTo(22.002f, 7.025f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.999f, 1.997f)
                verticalLineToRelative(7.63f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -1.718f, 0.0f)
                lineTo(18.285f, 3.923f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, -3.997f, 0.0f)
                verticalLineToRelative(16.16f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -1.719f, 0.0f)
                lineTo(12.569f, 18.08f)
                arcToRelative(0.57f, 0.57f, 0.0f, true, false, -1.138f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, false, 3.996f, 0.0f)
                lineTo(15.427f, 3.92f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, 1.719f, 0.0f)
                verticalLineToRelative(12.73f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, 3.996f, 0.0f)
                lineTo(21.142f, 9.023f)
                arcToRelative(0.86f, 0.86f, 0.0f, true, true, 1.72f, 0.0f)
                verticalLineToRelative(6.686f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 1.138f, 0.0f)
                lineTo(24.0f, 9.022f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.998f, -1.997f)
            }
        }
        .build()
        return _minimax!!
    }

private var _minimax: ImageVector? = null
