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

public val BrandsGroup.Webflow: ImageVector
    get() {
        if (_webflow != null) {
            return _webflow!!
        }
        _webflow = Builder(name = "Webflow", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 64.0f)
                lineToRelative(-204.2f, 399.2f)
                lineToRelative(-191.8f, 0.0f)
                lineToRelative(85.5f, -165.5f)
                lineToRelative(-3.8f, 0.0f)
                curveTo(255.1f, 389.3f, 149.9f, 449.5f, 0.0f, 463.2f)
                lineTo(0.0f, 300.1f)
                reflectiveCurveToRelative(95.9f, -5.7f, 152.3f, -64.9f)
                lineToRelative(-152.3f, 0.0f)
                lineToRelative(0.0f, -171.2f)
                lineToRelative(171.1f, 0.0f)
                lineToRelative(0.0f, 140.8f)
                lineToRelative(3.8f, 0.0f)
                lineToRelative(70.0f, -140.8f)
                lineToRelative(129.4f, 0.0f)
                lineToRelative(0.0f, 139.9f)
                lineToRelative(3.8f, 0.0f)
                lineToRelative(72.6f, -139.9f)
                lineToRelative(189.3f, 0.0f)
                close()
            }
        }
        .build()
        return _webflow!!
    }

private var _webflow: ImageVector? = null
