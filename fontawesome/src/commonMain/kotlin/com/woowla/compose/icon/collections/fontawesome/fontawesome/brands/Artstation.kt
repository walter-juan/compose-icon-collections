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

public val BrandsGroup.Artstation: ImageVector
    get() {
        if (_artstation != null) {
            return _artstation!!
        }
        _artstation = Builder(name = "Artstation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 377.4f)
                lineToRelative(43.0f, 74.3f)
                curveToRelative(4.3f, 8.5f, 10.8f, 15.7f, 18.9f, 20.7f)
                reflectiveCurveToRelative(17.4f, 7.6f, 27.0f, 7.6f)
                lineToRelative(285.4f, 0.0f)
                lineToRelative(-59.2f, -102.6f)
                lineToRelative(-315.1f, 0.0f)
                close()
                moveTo(501.9f, 350.0f)
                lineTo(335.7f, 59.3f)
                curveToRelative(-4.4f, -8.2f, -10.9f, -15.1f, -18.9f, -20.0f)
                reflectiveCurveTo(299.7f, 32.0f, 290.4f, 32.0f)
                lineToRelative(-88.4f, 0.0f)
                lineToRelative(257.3f, 447.6f)
                lineToRelative(40.7f, -70.5f)
                curveToRelative(1.9f, -3.2f, 21.0f, -29.7f, 2.0f, -59.1f)
                close()
                moveTo(275.2f, 304.5f)
                lineToRelative(-115.5f, -200.0f)
                lineToRelative(-115.5f, 200.0f)
                lineToRelative(231.0f, 0.0f)
                close()
            }
        }
        .build()
        return _artstation!!
    }

private var _artstation: ImageVector? = null
