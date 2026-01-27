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

public val BrandsGroup.Mintbit: ImageVector
    get() {
        if (_mintbit != null) {
            return _mintbit!!
        }
        _mintbit = Builder(name = "Mintbit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.2f, 512.0f)
                lineToRelative(0.0f, -73.1f)
                lineToRelative(292.5f, 0.0f)
                lineToRelative(0.0f, -73.2f)
                lineToRelative(73.2f, 0.0f)
                lineToRelative(0.0f, -146.3f)
                lineToRelative(73.1f, 0.0f)
                lineToRelative(0.0f, -219.4f)
                lineToRelative(-219.4f, 0.0f)
                lineToRelative(0.0f, 73.1f)
                lineToRelative(-146.3f, 0.0f)
                lineToRelative(0.0f, 73.2f)
                lineToRelative(-73.1f, 0.0f)
                lineToRelative(0.0f, 292.6f)
                lineToRelative(-73.2f, 0.0f)
                lineToRelative(0.0f, 73.1f)
                lineToRelative(73.2f, 0.0f)
                close()
                moveTo(146.3f, 292.6f)
                lineToRelative(73.2f, 0.0f)
                lineToRelative(0.0f, 73.1f)
                lineToRelative(-73.2f, 0.0f)
                lineToRelative(0.0f, -73.1f)
                close()
                moveTo(219.5f, 219.5f)
                lineToRelative(73.1f, 0.0f)
                lineToRelative(0.0f, 73.1f)
                lineToRelative(-73.2f, 0.0f)
                lineToRelative(0.0f, -73.2f)
                lineToRelative(0.1f, 0.1f)
                close()
                moveTo(292.6f, 219.5f)
                lineToRelative(0.0f, -73.2f)
                lineToRelative(73.2f, 0.0f)
                lineToRelative(0.0f, 73.1f)
                lineToRelative(-73.2f, 0.0f)
                lineToRelative(0.0f, 0.1f)
                close()
                moveTo(365.7f, 73.1f)
                lineToRelative(73.2f, 0.0f)
                lineToRelative(0.0f, 73.2f)
                lineToRelative(-73.2f, 0.0f)
                lineToRelative(0.0f, -73.2f)
                close()
            }
        }
        .build()
        return _mintbit!!
    }

private var _mintbit: ImageVector? = null
