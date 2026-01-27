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

public val BrandsGroup.Sourcetree: ImageVector
    get() {
        if (_sourcetree != null) {
            return _sourcetree!!
        }
        _sourcetree = Builder(name = "Sourcetree", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(427.4f, 203.0f)
                curveToRelative(0.0f, -112.1f, -90.9f, -203.0f, -203.0f, -203.0f)
                curveToRelative(-112.1f, -0.2f, -203.0f, 90.6f, -203.2f, 202.6f)
                curveToRelative(-0.1f, 43.0f, 13.5f, 84.8f, 38.7f, 119.6f)
                reflectiveCurveToRelative(60.9f, 60.6f, 101.8f, 73.8f)
                lineToRelative(0.0f, 101.7f)
                curveToRelative(0.0f, 3.8f, 1.5f, 7.4f, 4.2f, 10.1f)
                reflectiveCurveToRelative(6.3f, 4.2f, 10.1f, 4.2f)
                lineToRelative(96.4f, 0.0f)
                curveToRelative(3.8f, 0.0f, 7.4f, -1.5f, 10.1f, -4.2f)
                reflectiveCurveToRelative(4.2f, -6.3f, 4.2f, -10.1f)
                lineToRelative(0.0f, -101.6f)
                curveToRelative(40.8f, -13.2f, 76.5f, -39.0f, 101.7f, -73.7f)
                reflectiveCurveToRelative(38.9f, -76.5f, 39.0f, -119.4f)
                close()
                moveTo(155.8f, 203.0f)
                curveToRelative(0.0f, -90.8f, 137.3f, -90.8f, 137.3f, 0.0f)
                curveToRelative(-0.1f, 89.9f, -137.3f, 91.0f, -137.3f, 0.0f)
                close()
            }
        }
        .build()
        return _sourcetree!!
    }

private var _sourcetree: ImageVector? = null
