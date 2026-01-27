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

public val BrandsGroup.Mixcloud: ImageVector
    get() {
        if (_mixcloud != null) {
            return _mixcloud!!
        }
        _mixcloud = Builder(name = "Mixcloud", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.0f, 346.6f)
                lineToRelative(-33.2f, 0.0f)
                lineToRelative(0.0f, -151.5f)
                lineToRelative(6.2f, -21.6f)
                lineToRelative(-10.7f, 0.0f)
                lineToRelative(-38.1f, 173.1f)
                lineToRelative(-61.0f, 0.0f)
                lineToRelative(-38.4f, -173.1f)
                lineToRelative(-10.5f, 0.0f)
                lineToRelative(5.9f, 21.6f)
                lineToRelative(0.0f, 151.5f)
                lineToRelative(-33.2f, 0.0f)
                lineToRelative(0.0f, -181.6f)
                lineToRelative(65.7f, 0.0f)
                lineToRelative(36.6f, 173.1f)
                lineToRelative(8.5f, 0.0f)
                lineToRelative(36.6f, -173.1f)
                lineToRelative(65.7f, 0.0f)
                lineToRelative(0.0f, 181.6f)
                close()
                moveTo(544.5f, 283.6f)
                lineToRelative(-86.0f, 62.1f)
                lineToRelative(0.0f, -38.1f)
                lineToRelative(72.9f, -51.8f)
                lineToRelative(-72.9f, -51.8f)
                lineToRelative(0.0f, -38.1f)
                lineToRelative(86.0f, 62.3f)
                lineToRelative(9.3f, 0.0f)
                lineToRelative(86.3f, -62.3f)
                lineToRelative(0.0f, 38.1f)
                lineToRelative(-73.1f, 51.8f)
                lineToRelative(73.1f, 51.8f)
                lineToRelative(0.0f, 38.1f)
                lineToRelative(-86.3f, -62.1f)
                lineToRelative(-9.3f, 0.0f)
                close()
                moveTo(430.2f, 272.3f)
                lineToRelative(-182.0f, 0.0f)
                lineToRelative(0.0f, -33.1f)
                lineToRelative(182.0f, 0.0f)
                lineToRelative(0.0f, 33.1f)
                close()
            }
        }
        .build()
        return _mixcloud!!
    }

private var _mixcloud: ImageVector? = null
