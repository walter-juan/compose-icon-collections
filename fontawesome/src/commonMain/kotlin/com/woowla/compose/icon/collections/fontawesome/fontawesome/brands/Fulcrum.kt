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

public val BrandsGroup.Fulcrum: ImageVector
    get() {
        if (_fulcrum != null) {
            return _fulcrum!!
        }
        _fulcrum = Builder(name = "Fulcrum", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.8f, 164.1f)
                lineTo(28.4f, 207.7f)
                lineTo(-7.0f, 164.1f)
                lineTo(28.4f, 120.6f)
                lineTo(63.8f, 164.1f)
                close()
                moveTo(112.2f, 0.0f)
                lineToRelative(-20.5f, 198.2f)
                lineToRelative(-51.0f, 57.8f)
                lineToRelative(51.0f, 57.8f)
                lineToRelative(20.5f, 198.2f)
                lineToRelative(0.0f, -211.1f)
                lineToRelative(-41.1f, -44.9f)
                lineToRelative(41.1f, -44.9f)
                lineToRelative(0.0f, -211.1f)
                close()
                moveTo(191.9f, 164.1f)
                lineToRelative(35.4f, 43.6f)
                lineToRelative(35.4f, -43.6f)
                lineToRelative(-35.4f, -43.5f)
                lineToRelative(-35.4f, 43.5f)
                close()
                moveTo(143.4f, 211.1f)
                lineToRelative(41.1f, 44.9f)
                lineToRelative(-41.1f, 44.9f)
                lineToRelative(0.0f, 211.1f)
                lineToRelative(20.6f, -198.2f)
                lineToRelative(51.0f, -57.8f)
                lineToRelative(-51.0f, -57.8f)
                lineToRelative(-20.6f, -198.2f)
                lineToRelative(0.0f, 211.1f)
                close()
            }
        }
        .build()
        return _fulcrum!!
    }

private var _fulcrum: ImageVector? = null
