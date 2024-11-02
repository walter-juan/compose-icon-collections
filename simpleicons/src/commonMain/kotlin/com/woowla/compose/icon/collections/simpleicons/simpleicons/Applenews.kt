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

public val Simpleicons.Applenews: ImageVector
    get() {
        if (_applenews != null) {
            return _applenews!!
        }
        _applenews = Builder(name = "Applenews", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.94f)
                curveToRelative(2.726f, 4.673f, 6.394f, 8.385f, 11.039f, 11.058f)
                horizontalLineTo(1.416f)
                curveTo(0.634f, 23.998f, 0.0f, 23.364f, 0.0f, 22.582f)
                verticalLineToRelative(-9.642f)
                close()
                moveTo(0.0f, 1.414f)
                curveTo(0.0f, 0.634f, 0.632f, 0.002f, 1.412f, 0.002f)
                horizontalLineToRelative(4.808f)
                lineTo(24.0f, 17.758f)
                verticalLineToRelative(4.773f)
                curveToRelative(0.0f, 0.389f, -0.154f, 0.762f, -0.43f, 1.037f)
                arcToRelative(1.467f, 1.467f, 0.0f, false, true, -1.037f, 0.43f)
                horizontalLineToRelative(-4.774f)
                lineTo(0.0f, 6.242f)
                moveTo(12.963f, 0.002f)
                horizontalLineToRelative(9.618f)
                arcTo(1.419f, 1.419f, 0.0f, false, true, 24.0f, 1.421f)
                verticalLineToRelative(9.626f)
                curveTo(21.265f, 6.494f, 17.616f, 2.774f, 12.963f, 0.002f)
                close()
            }
        }
        .build()
        return _applenews!!
    }

private var _applenews: ImageVector? = null
