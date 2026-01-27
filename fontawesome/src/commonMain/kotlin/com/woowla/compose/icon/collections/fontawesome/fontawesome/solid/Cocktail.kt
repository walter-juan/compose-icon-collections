package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 80.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-18.0f, 0.0f, -34.6f, 6.0f, -48.0f, 16.0f)
                lineToRelative(-81.0f, 0.0f)
                curveToRelative(23.6f, -47.4f, 72.5f, -80.0f, 129.0f, -80.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                reflectiveCurveTo(575.5f, 224.0f, 496.0f, 224.0f)
                curveToRelative(-6.5f, 0.0f, -13.0f, -0.4f, -19.3f, -1.3f)
                lineToRelative(64.0f, -74.7f)
                curveToRelative(1.1f, -1.3f, 2.2f, -2.7f, 3.3f, -4.1f)
                curveToRelative(19.4f, -14.6f, 32.0f, -37.8f, 32.0f, -64.0f)
                close()
                moveTo(66.9f, 82.6f)
                curveTo(72.2f, 71.3f, 83.5f, 64.0f, 96.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(12.5f, 0.0f, 23.8f, 7.3f, 29.1f, 18.6f)
                reflectiveCurveToRelative(3.4f, 24.7f, -4.8f, 34.2f)
                lineToRelative(-184.3f, 215.0f)
                lineToRelative(0.0f, 116.2f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -116.2f)
                lineToRelative(-184.3f, -215.0f)
                curveToRelative(-8.1f, -9.5f, -10.0f, -22.8f, -4.8f, -34.2f)
                close()
                moveTo(165.6f, 128.0f)
                lineTo(288.0f, 270.8f)
                lineTo(410.4f, 128.0f)
                lineTo(165.6f, 128.0f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
