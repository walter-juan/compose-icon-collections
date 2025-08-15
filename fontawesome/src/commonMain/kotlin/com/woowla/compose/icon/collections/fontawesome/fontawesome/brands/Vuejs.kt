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

public val BrandsGroup.Vuejs: ImageVector
    get() {
        if (_vuejs != null) {
            return _vuejs!!
        }
        _vuejs = Builder(name = "Vuejs", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(356.9f, 64.3f)
                lineToRelative(-76.9f, 0.0f)
                lineToRelative(-56.0f, 88.6f)
                lineToRelative(-48.0f, -88.6f)
                lineToRelative(-176.0f, 0.0f)
                lineToRelative(224.0f, 383.7f)
                lineToRelative(224.0f, -383.7f)
                lineToRelative(-91.1f, 0.0f)
                close()
                moveTo(55.7f, 96.3f)
                lineToRelative(53.8f, 0.0f)
                lineToRelative(114.5f, 198.2f)
                lineToRelative(114.4f, -198.2f)
                lineToRelative(53.8f, 0.0f)
                lineToRelative(-168.2f, 288.2f)
                lineToRelative(-168.3f, -288.2f)
                close()
            }
        }
        .build()
        return _vuejs!!
    }

private var _vuejs: ImageVector? = null
