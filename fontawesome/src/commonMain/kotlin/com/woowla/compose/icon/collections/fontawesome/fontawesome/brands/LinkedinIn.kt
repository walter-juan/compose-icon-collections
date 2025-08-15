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

public val BrandsGroup.LinkedinIn: ImageVector
    get() {
        if (_linkedinIn != null) {
            return _linkedinIn!!
        }
        _linkedinIn = Builder(name = "LinkedinIn", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.3f, 448.0f)
                lineToRelative(-92.9f, 0.0f)
                lineToRelative(0.0f, -299.1f)
                lineToRelative(92.9f, 0.0f)
                lineToRelative(0.0f, 299.1f)
                close()
                moveTo(53.8f, 108.1f)
                curveTo(24.1f, 108.1f, 0.0f, 83.5f, 0.0f, 53.8f)
                curveTo(0.0f, 39.5f, 5.7f, 25.9f, 15.8f, 15.8f)
                reflectiveCurveToRelative(23.8f, -15.8f, 38.0f, -15.8f)
                reflectiveCurveToRelative(27.9f, 5.7f, 38.0f, 15.8f)
                reflectiveCurveToRelative(15.8f, 23.8f, 15.8f, 38.0f)
                curveToRelative(0.0f, 29.7f, -24.1f, 54.3f, -53.8f, 54.3f)
                close()
                moveTo(447.9f, 448.0f)
                lineToRelative(-92.7f, 0.0f)
                lineToRelative(0.0f, -145.6f)
                curveToRelative(0.0f, -34.7f, -0.7f, -79.2f, -48.3f, -79.2f)
                curveToRelative(-48.3f, 0.0f, -55.7f, 37.7f, -55.7f, 76.7f)
                lineToRelative(0.0f, 148.1f)
                lineToRelative(-92.8f, 0.0f)
                lineToRelative(0.0f, -299.1f)
                lineToRelative(89.1f, 0.0f)
                lineToRelative(0.0f, 40.8f)
                lineToRelative(1.3f, 0.0f)
                curveToRelative(12.4f, -23.5f, 42.7f, -48.3f, 87.9f, -48.3f)
                curveToRelative(94.0f, 0.0f, 111.3f, 61.9f, 111.3f, 142.3f)
                lineToRelative(0.0f, 164.3f)
                lineToRelative(-0.1f, 0.0f)
                close()
            }
        }
        .build()
        return _linkedinIn!!
    }

private var _linkedinIn: ImageVector? = null
