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

public val BrandsGroup.Qq: ImageVector
    get() {
        if (_qq != null) {
            return _qq!!
        }
        _qq = Builder(name = "Qq", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.1f, 420.4f)
                curveToRelative(-11.5f, 1.4f, -44.9f, -52.7f, -44.9f, -52.7f)
                curveToRelative(0.0f, 31.3f, -16.1f, 72.2f, -51.0f, 101.8f)
                curveToRelative(16.8f, 5.2f, 54.8f, 19.2f, 45.8f, 34.4f)
                curveToRelative(-7.3f, 12.3f, -125.5f, 7.9f, -159.6f, 4.0f)
                curveToRelative(-34.1f, 3.8f, -152.3f, 8.3f, -159.6f, -4.0f)
                curveToRelative(-9.0f, -15.2f, 28.9f, -29.2f, 45.8f, -34.4f)
                curveToRelative(-34.9f, -29.5f, -51.1f, -70.4f, -51.1f, -101.8f)
                curveToRelative(0.0f, 0.0f, -33.3f, 54.1f, -44.9f, 52.7f)
                curveToRelative(-5.4f, -0.6f, -12.4f, -29.6f, 9.3f, -99.7f)
                curveToRelative(10.3f, -33.0f, 22.0f, -60.5f, 40.1f, -105.8f)
                curveToRelative(-3.1f, -116.9f, 45.2f, -215.0f, 160.3f, -215.0f)
                curveToRelative(113.7f, 0.0f, 163.2f, 96.1f, 160.3f, 215.0f)
                curveToRelative(18.1f, 45.2f, 29.9f, 72.9f, 40.1f, 105.8f)
                curveToRelative(21.8f, 70.1f, 14.7f, 99.1f, 9.3f, 99.7f)
                close()
            }
        }
        .build()
        return _qq!!
    }

private var _qq: ImageVector? = null
