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

public val BrandsGroup.DartLang: ImageVector
    get() {
        if (_dartLang != null) {
            return _dartLang!!
        }
        _dartLang = Builder(name = "DartLang", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.6f, 78.9f)
                curveToRelative(-2.8f, -0.1f, -5.6f, -0.2f, -8.5f, -0.2f)
                lineToRelative(-264.1f, 0.0f)
                lineToRelative(143.2f, -72.0f)
                curveTo(256.6f, 2.3f, 268.0f, 0.0f, 279.6f, 0.0f)
                curveToRelative(13.5f, 0.0f, 29.4f, 9.2f, 37.0f, 16.8f)
                lineToRelative(62.0f, 62.0f)
                close()
                moveTo(107.3f, 96.5f)
                lineToRelative(262.8f, 0.0f)
                curveToRelative(16.0f, 0.0f, 25.4f, 1.4f, 35.4f, 9.3f)
                lineTo(512.0f, 212.2f)
                lineTo(512.0f, 421.0f)
                lineToRelative(-79.3f, 0.7f)
                lineTo(107.3f, 96.5f)
                close()
                moveTo(96.5f, 373.0f)
                lineToRelative(0.0f, -262.2f)
                lineTo(420.3f, 434.6f)
                lineToRelative(0.7f, 77.4f)
                lineToRelative(-212.2f, 0.0f)
                lineToRelative(-98.1f, -98.2f)
                lineToRelative(0.0f, 0.0f)
                curveTo(99.4f, 402.5f, 96.5f, 398.5f, 96.5f, 373.0f)
                close()
                moveTo(78.7f, 105.3f)
                lineToRelative(0.0f, 267.7f)
                curveToRelative(0.0f, 3.3f, 0.1f, 6.3f, 0.2f, 9.1f)
                lineToRelative(-62.0f, -62.0f)
                curveTo(6.5f, 309.3f, 0.0f, 294.3f, 0.0f, 279.6f)
                curveToRelative(0.0f, -6.8f, 3.9f, -17.5f, 6.7f, -23.6f)
                lineToRelative(72.0f, -150.7f)
                close()
            }
        }
        .build()
        return _dartLang!!
    }

private var _dartLang: ImageVector? = null
