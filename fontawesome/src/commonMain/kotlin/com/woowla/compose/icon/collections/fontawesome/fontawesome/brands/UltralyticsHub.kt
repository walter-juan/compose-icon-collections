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

public val BrandsGroup.UltralyticsHub: ImageVector
    get() {
        if (_ultralyticsHub != null) {
            return _ultralyticsHub!!
        }
        _ultralyticsHub = Builder(name = "UltralyticsHub", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.4f, 16.0f)
                curveToRelative(60.9f, 0.0f, 110.4f, 49.5f, 110.4f, 110.4f)
                lineToRelative(0.0f, 24.9f)
                curveToRelative(4.8f, -0.7f, 9.7f, -1.0f, 14.6f, -1.0f)
                curveToRelative(88.1f, -0.2f, 165.1f, 49.0f, 205.4f, 121.2f)
                curveToRelative(-22.8f, -16.2f, -50.7f, -25.4f, -80.4f, -25.3f)
                curveToRelative(-77.1f, 0.2f, -139.5f, 62.6f, -139.6f, 139.4f)
                curveToRelative(-0.1f, 60.9f, -49.5f, 110.3f, -110.7f, 110.5f)
                curveToRelative(-60.6f, 0.2f, -110.2f, -49.5f, -110.2f, -110.5f)
                curveToRelative(0.2f, -2.6f, 0.0f, 0.0f, 0.1f, -3.2f)
                lineToRelative(0.0f, -256.0f)
                curveTo(20.1f, 65.5f, 69.5f, 16.0f, 130.4f, 16.0f)
                close()
                moveTo(380.3f, 496.0f)
                arcToRelative(110.4f, 110.4f, 0.0f, true, true, 0.0f, -220.9f)
                arcToRelative(110.4f, 110.4f, 0.0f, true, true, 0.0f, 220.9f)
                close()
            }
        }
        .build()
        return _ultralyticsHub!!
    }

private var _ultralyticsHub: ImageVector? = null
