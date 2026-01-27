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

public val BrandsGroup.Patreon: ImageVector
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = Builder(name = "Patreon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.0f, 153.8f)
                curveToRelative(-0.1f, -65.4f, -51.0f, -119.0f, -110.7f, -138.3f)
                curveToRelative(-74.2f, -24.0f, -172.0f, -20.5f, -242.9f, 12.9f)
                curveToRelative(-85.8f, 40.5f, -112.8f, 129.3f, -113.8f, 217.8f)
                curveToRelative(-0.8f, 72.8f, 6.4f, 264.4f, 114.6f, 265.8f)
                curveToRelative(80.3f, 1.0f, 92.3f, -102.5f, 129.5f, -152.3f)
                curveToRelative(26.4f, -35.5f, 60.5f, -45.5f, 102.4f, -55.9f)
                curveToRelative(72.0f, -17.8f, 121.1f, -74.7f, 121.0f, -150.0f)
                lineToRelative(-0.1f, 0.0f)
                close()
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: ImageVector? = null
