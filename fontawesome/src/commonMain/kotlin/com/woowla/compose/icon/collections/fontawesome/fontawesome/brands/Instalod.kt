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

public val BrandsGroup.Instalod: ImageVector
    get() {
        if (_instalod != null) {
            return _instalod!!
        }
        _instalod = Builder(name = "Instalod", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.6f, 480.0f)
                lineToRelative(233.7f, 0.0f)
                lineToRelative(115.4f, -204.2f)
                lineToRelative(-298.3f, 57.4f)
                lineToRelative(-50.8f, 146.8f)
                close()
                moveTo(505.0f, 240.1f)
                lineTo(387.4f, 32.0f)
                lineTo(155.9f, 32.0f)
                lineTo(360.5f, 267.9f)
                lineTo(505.0f, 240.1f)
                close()
                moveTo(124.6f, 48.8f)
                lineTo(7.5f, 256.0f)
                lineTo(123.5f, 461.2f)
                lineTo(225.9f, 165.6f)
                lineTo(124.6f, 48.8f)
                close()
            }
        }
        .build()
        return _instalod!!
    }

private var _instalod: ImageVector? = null
