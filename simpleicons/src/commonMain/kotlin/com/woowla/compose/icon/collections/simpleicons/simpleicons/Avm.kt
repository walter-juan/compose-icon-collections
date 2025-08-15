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

public val Simpleicons.Avm: ImageVector
    get() {
        if (_avm != null) {
            return _avm!!
        }
        _avm = Builder(name = "Avm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.501f, 11.786f)
                lineToRelative(-0.003f, -4.823f)
                lineToRelative(-10.9f, 11.925f)
                horizontalLineToRelative(3.172f)
                lineToRelative(5.481f, -6.07f)
                verticalLineToRelative(4.864f)
                lineToRelative(4.321f, -4.783f)
                verticalLineToRelative(3.657f)
                lineTo(24.0f, 16.556f)
                lineTo(24.0f, 6.86f)
                close()
                moveTo(16.858f, 5.111f)
                lineTo(11.591f, 10.981f)
                lineTo(11.591f, 7.443f)
                lineTo(9.345f, 7.443f)
                verticalLineToRelative(9.38f)
                lineTo(20.049f, 5.111f)
                close()
                moveTo(0.0f, 16.556f)
                horizontalLineToRelative(3.148f)
                lineToRelative(2.924f, -3.25f)
                verticalLineToRelative(3.25f)
                lineTo(8.41f, 16.556f)
                verticalLineToRelative(-9.21f)
                close()
            }
        }
        .build()
        return _avm!!
    }

private var _avm: ImageVector? = null
