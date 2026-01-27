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

public val BrandsGroup.Sith: ImageVector
    get() {
        if (_sith != null) {
            return _sith!!
        }
        _sith = Builder(name = "Sith", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineToRelative(69.7f, 118.8f)
                lineToRelative(-58.9f, -11.5f)
                lineToRelative(69.8f, 91.0f)
                curveToRelative(-3.0f, 17.0f, -3.0f, 34.4f, 0.0f, 51.4f)
                lineToRelative(-69.8f, 91.0f)
                lineToRelative(58.9f, -11.5f)
                lineToRelative(-69.7f, 118.8f)
                lineToRelative(118.8f, -69.7f)
                lineToRelative(-11.5f, 58.9f)
                lineToRelative(91.0f, -69.8f)
                curveToRelative(17.0f, 3.0f, 34.5f, 3.0f, 51.5f, 0.0f)
                lineToRelative(91.0f, 69.8f)
                lineToRelative(-11.5f, -58.9f)
                lineToRelative(118.7f, 69.7f)
                lineToRelative(-69.7f, -118.8f)
                lineToRelative(58.9f, 11.5f)
                lineToRelative(-69.8f, -91.0f)
                curveToRelative(3.0f, -17.0f, 3.0f, -34.4f, 0.0f, -51.4f)
                lineToRelative(69.8f, -91.0f)
                lineToRelative(-58.9f, 11.5f)
                lineToRelative(69.7f, -118.8f)
                lineToRelative(-118.7f, 69.7f)
                lineToRelative(11.5f, -58.9f)
                lineToRelative(-91.1f, 69.9f)
                curveToRelative(-8.5f, -1.5f, -17.1f, -2.3f, -25.7f, -2.3f)
                reflectiveCurveToRelative(-17.2f, 0.8f, -25.7f, 2.3f)
                lineTo(107.2f, 42.8f)
                lineTo(118.8f, 101.7f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(224.0f, 380.2f)
                arcToRelative(124.2f, 124.2f, 0.0f, true, true, 0.0f, -248.4f)
                arcToRelative(124.2f, 124.2f, 0.0f, true, true, 0.0f, 248.4f)
                close()
                moveTo(224.0f, 168.4f)
                arcToRelative(87.6f, 87.6f, 0.0f, true, false, 0.0f, 175.1f)
                arcToRelative(87.6f, 87.6f, 0.0f, true, false, 0.0f, -175.1f)
                close()
            }
        }
        .build()
        return _sith!!
    }

private var _sith: ImageVector? = null
