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

public val Simpleicons.Autentique: ImageVector
    get() {
        if (_autentique != null) {
            return _autentique!!
        }
        _autentique = Builder(name = "Autentique", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.54f, 1.225f)
                lineToRelative(-0.27f, 1.66f)
                arcToRelative(10.57f, 10.57f, 0.0f, false, false, -6.114f, -2.32f)
                lineTo(0.0f, 11.99f)
                horizontalLineToRelative(12.156f)
                verticalLineTo(6.062f)
                curveToRelative(3.199f, 0.0f, 5.74f, 2.434f, 5.74f, 5.917f)
                curveToRelative(0.0f, 3.687f, -2.614f, 5.98f, -5.73f, 5.98f)
                curveToRelative(-2.594f, 0.0f, -4.648f, -1.557f, -5.429f, -3.898f)
                lineTo(0.0f, 11.984f)
                curveToRelative(0.0f, 6.43f, 4.591f, 11.45f, 11.543f, 11.45f)
                curveToRelative(1.666f, 0.0f, 4.259f, -0.383f, 6.706f, -2.325f)
                lineToRelative(0.29f, 1.64f)
                horizontalLineTo(24.0f)
                verticalLineTo(1.225f)
                close()
            }
        }
        .build()
        return _autentique!!
    }

private var _autentique: ImageVector? = null
