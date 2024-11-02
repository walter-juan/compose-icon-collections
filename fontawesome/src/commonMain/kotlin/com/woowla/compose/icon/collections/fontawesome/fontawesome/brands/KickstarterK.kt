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

public val BrandsGroup.KickstarterK: ImageVector
    get() {
        if (_kickstarterK != null) {
            return _kickstarterK!!
        }
        _kickstarterK = Builder(name = "KickstarterK", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(356.6f, 256.2f)
                lineToRelative(40.8f, -40.5f)
                curveToRelative(42.2f, -41.9f, 42.2f, -110.3f, 0.0f, -152.1f)
                reflectiveCurveToRelative(-111.0f, -41.9f, -153.2f, 0.0f)
                lineTo(229.3f, 78.4f)
                curveTo(209.6f, 50.3f, 177.1f, 32.0f, 140.2f, 32.0f)
                curveTo(80.5f, 32.0f, 32.0f, 80.2f, 32.0f, 139.5f)
                verticalLineTo(372.5f)
                curveTo(32.0f, 431.9f, 80.5f, 480.0f, 140.2f, 480.0f)
                curveToRelative(37.1f, 0.0f, 69.3f, -18.3f, 89.0f, -46.4f)
                lineToRelative(14.9f, 14.7f)
                curveToRelative(42.2f, 41.9f, 111.0f, 41.9f, 153.2f, 0.0f)
                reflectiveCurveToRelative(42.2f, -110.3f, 0.0f, -152.1f)
                lineToRelative(-40.8f, -40.0f)
                close()
            }
        }
        .build()
        return _kickstarterK!!
    }

private var _kickstarterK: ImageVector? = null
