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

public val BrandsGroup.Mizuni: ImageVector
    get() {
        if (_mizuni != null) {
            return _mizuni!!
        }
        _mizuni = Builder(name = "Mizuni", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(176.0f, 359.9f)
                curveToRelative(-31.4f, 10.6f, -58.8f, 27.3f, -80.0f, 48.2f)
                lineTo(96.0f, 136.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                lineToRelative(0.0f, 223.9f)
                close()
                moveTo(296.0f, 350.0f)
                curveToRelative(-12.9f, -2.0f, -26.2f, -3.1f, -39.8f, -3.1f)
                curveToRelative(-13.8f, 0.0f, -27.2f, 1.1f, -40.2f, 3.1f)
                lineToRelative(0.0f, -214.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                lineToRelative(0.0f, 214.0f)
                close()
                moveTo(416.0f, 407.7f)
                curveToRelative(-21.2f, -20.8f, -48.6f, -37.4f, -80.0f, -48.0f)
                lineTo(336.0f, 136.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                lineToRelative(0.0f, 271.7f)
                close()
            }
        }
        .build()
        return _mizuni!!
    }

private var _mizuni: ImageVector? = null
