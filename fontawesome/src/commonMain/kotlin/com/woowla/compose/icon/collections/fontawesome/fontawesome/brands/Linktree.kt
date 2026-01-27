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

public val BrandsGroup.Linktree: ImageVector
    get() {
        if (_linktree != null) {
            return _linktree!!
        }
        _linktree = Builder(name = "Linktree", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 173.4f)
                lineToRelative(125.8f, 0.0f)
                lineToRelative(-89.4f, -85.4f)
                lineToRelative(49.5f, -51.0f)
                lineToRelative(85.2f, 87.8f)
                lineToRelative(0.0f, -124.8f)
                lineToRelative(73.9f, 0.0f)
                lineToRelative(0.0f, 124.8f)
                lineToRelative(85.2f, -87.6f)
                lineToRelative(49.4f, 50.8f)
                lineToRelative(-89.4f, 85.2f)
                lineToRelative(125.7f, 0.0f)
                lineToRelative(0.0f, 70.5f)
                lineToRelative(-126.4f, 0.0f)
                lineToRelative(90.0f, 87.6f)
                lineToRelative(-49.3f, 49.8f)
                lineToRelative(-122.2f, -123.0f)
                lineToRelative(-122.2f, 123.0f)
                lineToRelative(-49.5f, -49.6f)
                lineToRelative(90.0f, -87.6f)
                lineToRelative(-126.4f, 0.0f)
                lineToRelative(0.0f, -70.5f)
                close()
                moveTo(202.9f, 344.8f)
                lineToRelative(73.9f, 0.0f)
                lineToRelative(0.0f, 167.2f)
                lineToRelative(-73.9f, 0.0f)
                lineToRelative(0.0f, -167.2f)
                close()
            }
        }
        .build()
        return _linktree!!
    }

private var _linktree: ImageVector? = null
