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

public val BrandsGroup.Megaport: ImageVector
    get() {
        if (_megaport != null) {
            return _megaport!!
        }
        _megaport = Builder(name = "Megaport", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.5f, 209.6f)
                lineToRelative(0.0f, 66.2f)
                lineToRelative(33.5f, 33.5f)
                lineToRelative(33.3f, -33.3f)
                lineToRelative(0.0f, -66.4f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-33.4f, 33.4f)
                close()
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(401.1f, 422.4f)
                lineToRelative(-26.1f, 19.2f)
                lineToRelative(-26.0f, -19.2f)
                lineToRelative(0.0f, -65.5f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-33.4f, 33.4f)
                lineToRelative(0.0f, 65.5f)
                lineToRelative(-26.2f, 19.2f)
                lineToRelative(-26.1f, -19.2f)
                lineToRelative(0.0f, -65.5f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-33.5f, 33.4f)
                lineToRelative(0.0f, 65.5f)
                lineToRelative(-26.1f, 19.2f)
                lineToRelative(-26.1f, -19.2f)
                lineToRelative(0.0f, -87.0f)
                lineToRelative(59.5f, -59.5f)
                lineToRelative(0.0f, -87.9f)
                lineToRelative(59.5f, -59.5f)
                lineToRelative(0.0f, -75.6f)
                lineToRelative(26.1f, -19.2f)
                lineToRelative(26.1f, 19.2f)
                lineToRelative(0.0f, 75.6f)
                lineToRelative(59.5f, 59.5f)
                lineToRelative(0.0f, 87.6f)
                lineToRelative(59.7f, 59.7f)
                lineToRelative(0.0f, 87.1f)
                lineToRelative(-0.1f, 0.0f)
                close()
            }
        }
        .build()
        return _megaport!!
    }

private var _megaport: ImageVector? = null
