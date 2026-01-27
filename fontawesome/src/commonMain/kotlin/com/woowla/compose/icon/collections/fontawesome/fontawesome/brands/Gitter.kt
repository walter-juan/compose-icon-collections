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

public val BrandsGroup.Gitter: ImageVector
    get() {
        if (_gitter != null) {
            return _gitter!!
        }
        _gitter = Builder(name = "Gitter", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.4f, 322.5f)
                lineToRelative(-50.4f, 0.0f)
                lineToRelative(0.0f, -322.5f)
                lineToRelative(50.4f, 0.0f)
                lineToRelative(0.0f, 322.5f)
                close()
                moveTo(166.9f, 76.1f)
                lineToRelative(-50.4f, 0.0f)
                lineToRelative(0.0f, 435.9f)
                lineToRelative(50.4f, 0.0f)
                lineToRelative(0.0f, -435.9f)
                close()
                moveTo(267.5f, 76.1f)
                lineToRelative(-50.4f, 0.0f)
                lineToRelative(0.0f, 435.9f)
                lineToRelative(50.4f, 0.0f)
                lineToRelative(0.0f, -435.9f)
                close()
                moveTo(368.0f, 76.0f)
                lineToRelative(-50.4f, 0.0f)
                lineToRelative(0.0f, 247.0f)
                lineToRelative(50.4f, 0.0f)
                lineToRelative(0.0f, -247.0f)
                close()
            }
        }
        .build()
        return _gitter!!
    }

private var _gitter: ImageVector? = null
