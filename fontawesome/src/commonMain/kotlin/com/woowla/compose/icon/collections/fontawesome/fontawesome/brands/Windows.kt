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

public val BrandsGroup.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 93.7f)
                lineToRelative(183.6f, -25.3f)
                lineToRelative(0.0f, 177.4f)
                lineToRelative(-183.6f, 0.0f)
                lineToRelative(0.0f, -152.1f)
                close()
                moveTo(0.0f, 418.3f)
                lineToRelative(183.6f, 25.3f)
                lineToRelative(0.0f, -175.2f)
                lineToRelative(-183.6f, 0.0f)
                lineToRelative(0.0f, 149.9f)
                close()
                moveTo(203.8f, 446.3f)
                lineToRelative(244.2f, 33.7f)
                lineToRelative(0.0f, -211.6f)
                lineToRelative(-244.2f, 0.0f)
                lineToRelative(0.0f, 177.9f)
                close()
                moveTo(203.8f, 65.7f)
                lineToRelative(0.0f, 180.1f)
                lineToRelative(244.2f, 0.0f)
                lineToRelative(0.0f, -213.8f)
                lineToRelative(-244.2f, 33.7f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
