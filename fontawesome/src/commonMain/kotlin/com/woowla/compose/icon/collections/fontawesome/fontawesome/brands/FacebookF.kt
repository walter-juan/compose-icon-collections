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

public val BrandsGroup.FacebookF: ImageVector
    get() {
        if (_facebookF != null) {
            return _facebookF!!
        }
        _facebookF = Builder(name = "FacebookF", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 299.3f)
                lineToRelative(0.0f, 212.7f)
                lineToRelative(116.0f, 0.0f)
                lineToRelative(0.0f, -212.7f)
                lineToRelative(86.5f, 0.0f)
                lineToRelative(18.0f, -97.8f)
                lineToRelative(-104.5f, 0.0f)
                lineToRelative(0.0f, -34.6f)
                curveToRelative(0.0f, -51.7f, 20.3f, -71.5f, 72.7f, -71.5f)
                curveToRelative(16.3f, 0.0f, 29.4f, 0.4f, 37.0f, 1.2f)
                lineToRelative(0.0f, -88.7f)
                curveTo(291.4f, 4.0f, 256.4f, 0.0f, 236.2f, 0.0f)
                curveTo(129.3f, 0.0f, 80.0f, 50.5f, 80.0f, 159.4f)
                lineToRelative(0.0f, 42.1f)
                lineToRelative(-66.0f, 0.0f)
                lineToRelative(0.0f, 97.8f)
                lineToRelative(66.0f, 0.0f)
                close()
            }
        }
        .build()
        return _facebookF!!
    }

private var _facebookF: ImageVector? = null
