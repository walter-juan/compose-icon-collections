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

public val BrandsGroup.XTwitter: ImageVector
    get() {
        if (_xTwitter != null) {
            return _xTwitter!!
        }
        _xTwitter = Builder(name = "XTwitter", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(357.2f, 48.0f)
                lineTo(427.8f, 48.0f)
                lineTo(273.6f, 224.2f)
                lineTo(455.0f, 464.0f)
                lineTo(313.0f, 464.0f)
                lineTo(201.7f, 318.6f)
                lineTo(74.5f, 464.0f)
                lineTo(3.8f, 464.0f)
                lineTo(168.7f, 275.5f)
                lineTo(-5.2f, 48.0f)
                lineTo(140.4f, 48.0f)
                lineTo(240.9f, 180.9f)
                lineTo(357.2f, 48.0f)
                close()
                moveTo(332.4f, 421.8f)
                lineToRelative(39.1f, 0.0f)
                lineToRelative(-252.4f, -333.8f)
                lineToRelative(-42.0f, 0.0f)
                lineToRelative(255.3f, 333.8f)
                close()
            }
        }
        .build()
        return _xTwitter!!
    }

private var _xTwitter: ImageVector? = null
