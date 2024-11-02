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
                moveTo(212.98f, 346.57f)
                horizontalLineTo(179.79f)
                verticalLineTo(195.11f)
                lineTo(185.97f, 173.47f)
                horizontalLineTo(175.26f)
                lineTo(137.13f, 346.57f)
                horizontalLineTo(76.11f)
                lineTo(37.73f, 173.47f)
                horizontalLineTo(27.28f)
                lineTo(33.19f, 195.11f)
                verticalLineTo(346.57f)
                horizontalLineTo(0.0f)
                verticalLineTo(165.0f)
                horizontalLineTo(65.65f)
                lineTo(102.25f, 338.1f)
                horizontalLineTo(110.75f)
                lineTo(147.33f, 165.0f)
                horizontalLineTo(212.98f)
                lineTo(212.98f, 346.57f)
                close()
                moveTo(544.46f, 283.59f)
                lineTo(458.43f, 345.65f)
                verticalLineTo(307.53f)
                lineTo(531.33f, 255.78f)
                lineTo(458.43f, 204.02f)
                verticalLineTo(165.9f)
                lineTo(544.46f, 228.23f)
                horizontalLineTo(553.72f)
                lineTo(640.0f, 165.9f)
                verticalLineTo(204.02f)
                lineTo(566.87f, 255.78f)
                lineTo(640.0f, 307.55f)
                verticalLineTo(345.65f)
                lineTo(553.72f, 283.59f)
                horizontalLineTo(544.46f)
                close()
                moveTo(430.16f, 272.31f)
                horizontalLineTo(248.11f)
                verticalLineTo(239.26f)
                horizontalLineTo(430.16f)
                verticalLineTo(272.31f)
                close()
            }
        }
        .build()
        return _mixcloud!!
    }

private var _mixcloud: ImageVector? = null
