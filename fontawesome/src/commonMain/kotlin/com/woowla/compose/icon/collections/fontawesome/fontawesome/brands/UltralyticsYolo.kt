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

public val BrandsGroup.UltralyticsYolo: ImageVector
    get() {
        if (_ultralyticsYolo != null) {
            return _ultralyticsYolo!!
        }
        _ultralyticsYolo = Builder(name = "UltralyticsYolo", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(383.5f, 10.8f)
                curveToRelative(61.8f, -0.2f, 112.3f, 50.6f, 112.3f, 112.9f)
                curveToRelative(-0.2f, 2.7f, 0.0f, 0.0f, -0.1f, 3.3f)
                lineToRelative(0.3f, 0.3f)
                curveToRelative(-1.5f, 89.9f, -53.0f, 168.4f, -127.4f, 208.5f)
                lineToRelative(0.0f, 52.8f)
                curveToRelative(0.0f, 62.6f, -51.1f, 113.5f, -113.7f, 112.9f)
                curveToRelative(-62.0f, -0.6f, -111.4f, -52.2f, -111.4f, -114.3f)
                lineToRelative(0.0f, -51.2f)
                curveToRelative(-40.7f, -21.9f, -74.5f, -55.2f, -97.0f, -95.6f)
                curveToRelative(23.2f, 16.5f, 51.7f, 26.0f, 82.0f, 25.9f)
                curveToRelative(78.6f, -0.2f, 142.2f, -64.0f, 142.3f, -142.5f)
                curveToRelative(0.1f, -62.3f, 50.5f, -112.7f, 112.9f, -112.9f)
                close()
                moveTo(128.5f, 236.6f)
                arcToRelative(112.9f, 112.9f, 0.0f, true, true, 0.0f, -225.8f)
                arcToRelative(112.9f, 112.9f, 0.0f, true, true, 0.0f, 225.8f)
                close()
            }
        }
        .build()
        return _ultralyticsYolo!!
    }

private var _ultralyticsYolo: ImageVector? = null
