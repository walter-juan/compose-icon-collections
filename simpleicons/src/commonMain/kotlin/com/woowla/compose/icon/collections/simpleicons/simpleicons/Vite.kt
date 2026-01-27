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

public val Simpleicons.Vite: ImageVector
    get() {
        if (_vite != null) {
            return _vite!!
        }
        _vite = Builder(name = "Vite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.056f, 23.238f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -1.02f, -0.355f)
                verticalLineToRelative(-5.202f)
                curveToRelative(0.0f, -0.63f, -0.512f, -1.143f, -1.144f, -1.143f)
                horizontalLineTo(5.148f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.464f, -0.903f)
                lineToRelative(3.777f, -5.29f)
                curveToRelative(0.54f, -0.753f, 0.0f, -1.804f, -0.93f, -1.804f)
                horizontalLineTo(0.57f)
                arcToRelative(0.574f, 0.574f, 0.0f, false, true, -0.543f, -0.746f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.08f, -0.157f)
                lineTo(5.008f, 0.78f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 0.467f, -0.24f)
                horizontalLineToRelative(14.589f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 0.466f, 0.903f)
                lineToRelative(-3.778f, 5.29f)
                curveToRelative(-0.54f, 0.755f, 0.0f, 1.806f, 0.93f, 1.806f)
                horizontalLineToRelative(5.745f)
                curveToRelative(0.238f, 0.0f, 0.424f, 0.138f, 0.513f, 0.322f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.063f, 0.603f)
                close()
            }
        }
        .build()
        return _vite!!
    }

private var _vite: ImageVector? = null
