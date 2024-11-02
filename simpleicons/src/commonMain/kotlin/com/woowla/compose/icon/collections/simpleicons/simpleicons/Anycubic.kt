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

public val Simpleicons.Anycubic: ImageVector
    get() {
        if (_anycubic != null) {
            return _anycubic!!
        }
        _anycubic = Builder(name = "Anycubic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.762f, 0.534f)
                lineToRelative(8.728f, 3.481f)
                lineToRelative(8.469f, 7.449f)
                lineToRelative(-6.494f, -0.631f)
                lineTo(6.762f, 0.534f)
                close()
                moveTo(17.482f, 10.997f)
                lineTo(24.0f, 11.578f)
                lineTo(16.174f, 20.327f)
                lineTo(7.525f, 23.466f)
                lineTo(17.482f, 10.997f)
                close()
                moveTo(6.592f, 0.601f)
                lineToRelative(10.699f, 10.331f)
                lineTo(7.355f, 23.44f)
                lineTo(0.0f, 12.465f)
                lineTo(6.592f, 0.601f)
                close()
            }
        }
        .build()
        return _anycubic!!
    }

private var _anycubic: ImageVector? = null
