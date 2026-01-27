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

public val BrandsGroup.Markdown: ImageVector
    get() {
        if (_markdown != null) {
            return _markdown!!
        }
        _markdown = Builder(name = "Markdown", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(593.8f, 59.1f)
                lineToRelative(-547.6f, 0.0f)
                curveTo(20.7f, 59.1f, 0.0f, 79.8f, 0.0f, 105.2f)
                lineTo(0.0f, 406.7f)
                curveToRelative(0.0f, 25.5f, 20.7f, 46.2f, 46.2f, 46.2f)
                lineToRelative(547.7f, 0.0f)
                curveToRelative(25.5f, 0.0f, 46.2f, -20.7f, 46.1f, -46.1f)
                lineToRelative(0.0f, -301.6f)
                curveToRelative(0.0f, -25.4f, -20.7f, -46.1f, -46.2f, -46.1f)
                close()
                moveTo(338.5f, 360.6f)
                lineToRelative(-61.5f, 0.0f)
                lineToRelative(0.0f, -120.0f)
                lineToRelative(-61.5f, 76.9f)
                lineToRelative(-61.5f, -76.9f)
                lineToRelative(0.0f, 120.0f)
                lineToRelative(-61.7f, 0.0f)
                lineToRelative(0.0f, -209.2f)
                lineToRelative(61.5f, 0.0f)
                lineToRelative(61.5f, 76.9f)
                lineToRelative(61.5f, -76.9f)
                lineToRelative(61.5f, 0.0f)
                lineToRelative(0.0f, 209.2f)
                lineToRelative(0.2f, 0.0f)
                close()
                moveTo(473.8f, 363.7f)
                lineToRelative(-92.3f, -107.7f)
                lineToRelative(61.5f, 0.0f)
                lineToRelative(0.0f, -104.6f)
                lineToRelative(61.5f, 0.0f)
                lineToRelative(0.0f, 104.6f)
                lineToRelative(61.5f, 0.0f)
                lineToRelative(-92.2f, 107.7f)
                close()
            }
        }
        .build()
        return _markdown!!
    }

private var _markdown: ImageVector? = null
