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

public val BrandsGroup.Discourse: ImageVector
    get() {
        if (_discourse != null) {
            return _discourse!!
        }
        _discourse = Builder(name = "Discourse", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 32.0f)
                curveTo(103.3f, 32.0f, 0.0f, 130.5f, 0.0f, 252.1f)
                curveTo(0.0f, 256.0f, 0.1f, 480.0f, 0.1f, 480.0f)
                lineToRelative(225.8f, -0.2f)
                curveTo(348.6f, 479.8f, 448.0f, 377.5f, 448.0f, 255.9f)
                reflectiveCurveTo(348.6f, 32.0f, 225.9f, 32.0f)
                close()
                moveTo(224.0f, 384.0f)
                curveToRelative(-19.4f, 0.0f, -37.9f, -4.3f, -54.4f, -12.1f)
                lineTo(88.5f, 392.0f)
                lineTo(111.4f, 317.0f)
                curveToRelative(-9.8f, -18.1f, -15.4f, -38.9f, -15.4f, -61.0f)
                curveToRelative(0.0f, -70.7f, 57.3f, -128.0f, 128.0f, -128.0f)
                reflectiveCurveToRelative(128.0f, 57.3f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-57.3f, 128.0f, -128.0f, 128.0f)
                close()
            }
        }
        .build()
        return _discourse!!
    }

private var _discourse: ImageVector? = null
