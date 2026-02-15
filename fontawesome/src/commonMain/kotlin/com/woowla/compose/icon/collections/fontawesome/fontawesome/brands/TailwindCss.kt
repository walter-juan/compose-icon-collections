package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.TailwindCss: ImageVector
    get() {
        if (_tailwindCss != null) {
            return _tailwindCss!!
        }
        _tailwindCss = Builder(name = "TailwindCss", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 64.0f)
                curveToRelative(-85.3f, 0.0f, -138.7f, 42.7f, -160.0f, 128.0f)
                curveToRelative(32.0f, -42.7f, 69.3f, -58.7f, 112.0f, -48.0f)
                curveToRelative(24.3f, 6.1f, 41.7f, 23.8f, 61.0f, 43.3f)
                curveToRelative(31.4f, 31.8f, 67.7f, 68.7f, 147.0f, 68.7f)
                curveToRelative(85.3f, 0.0f, 138.7f, -42.7f, 160.0f, -128.0f)
                curveToRelative(-32.0f, 42.7f, -69.3f, 58.7f, -112.0f, 48.0f)
                curveToRelative(-24.3f, -6.1f, -41.7f, -23.8f, -61.0f, -43.3f)
                curveToRelative(-31.4f, -31.8f, -67.7f, -68.7f, -147.0f, -68.7f)
                close()
                moveTo(160.0f, 256.0f)
                curveToRelative(-85.3f, 0.0f, -138.7f, 42.7f, -160.0f, 128.0f)
                curveToRelative(32.0f, -42.7f, 69.3f, -58.7f, 112.0f, -48.0f)
                curveToRelative(24.3f, 6.1f, 41.7f, 23.8f, 61.0f, 43.3f)
                curveToRelative(31.4f, 31.8f, 67.7f, 68.7f, 147.0f, 68.7f)
                curveToRelative(85.3f, 0.0f, 138.7f, -42.7f, 160.0f, -128.0f)
                curveToRelative(-32.0f, 42.7f, -69.3f, 58.7f, -112.0f, 48.0f)
                curveToRelative(-24.3f, -6.1f, -41.7f, -23.8f, -61.0f, -43.3f)
                curveToRelative(-31.4f, -31.8f, -67.7f, -68.7f, -147.0f, -68.7f)
                close()
            }
        }
        .build()
        return _tailwindCss!!
    }

private var _tailwindCss: ImageVector? = null
