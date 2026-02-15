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

public val BrandsGroup.VenmoV: ImageVector
    get() {
        if (_venmoV != null) {
            return _venmoV!!
        }
        _venmoV = Builder(name = "VenmoV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.5f, 14.8f)
                curveToRelative(17.4f, 28.7f, 25.3f, 58.2f, 25.3f, 95.5f)
                curveToRelative(0.0f, 119.0f, -101.9f, 273.5f, -184.7f, 382.1f)
                lineToRelative(-188.9f, 0.0f)
                lineToRelative(-75.8f, -451.5f)
                lineToRelative(165.4f, -15.7f)
                lineToRelative(40.1f, 321.3f)
                curveToRelative(37.4f, -60.8f, 83.6f, -156.3f, 83.6f, -221.4f)
                curveToRelative(0.0f, -35.6f, -6.1f, -59.9f, -15.7f, -79.9f)
                lineTo(466.5f, 14.8f)
                close()
            }
        }
        .build()
        return _venmoV!!
    }

private var _venmoV: ImageVector? = null
