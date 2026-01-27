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

public val BrandsGroup.Autoprefixer: ImageVector
    get() {
        if (_autoprefixer != null) {
            return _autoprefixer!!
        }
        _autoprefixer = Builder(name = "Autoprefixer", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.4f, 16.0f)
                lineToRelative(-161.0f, 480.0f)
                lineToRelative(77.5f, 0.0f)
                lineToRelative(25.4f, -81.4f)
                lineToRelative(119.5f, 0.0f)
                lineToRelative(25.2f, 81.4f)
                lineToRelative(77.5f, 0.0f)
                lineToRelative(-164.1f, -480.0f)
                close()
                moveTo(278.1f, 357.9f)
                lineToRelative(41.2f, -130.4f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(40.9f, 130.4f)
                lineToRelative(-83.6f, 0.0f)
                close()
                moveTo(640.0f, 405.0f)
                lineTo(630.0f, 373.6f)
                lineTo(462.1f, 358.0f)
                lineTo(481.5f, 414.5f)
                lineTo(640.0f, 405.0f)
                close()
                moveTo(177.9f, 358.0f)
                lineTo(10.0f, 373.7f)
                lineTo(0.0f, 405.0f)
                lineTo(158.5f, 414.4f)
                lineTo(177.9f, 358.0f)
                close()
            }
        }
        .build()
        return _autoprefixer!!
    }

private var _autoprefixer: ImageVector? = null
