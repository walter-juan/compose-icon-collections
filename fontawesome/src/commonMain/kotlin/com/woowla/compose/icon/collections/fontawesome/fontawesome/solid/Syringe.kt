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

public val SolidGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.5f, -17.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(15.0f, 15.0f)
                lineToRelative(-46.1f, 46.1f)
                lineToRelative(-63.0f, -63.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(7.0f, 7.0f)
                lineToRelative(-78.1f, 78.1f)
                lineToRelative(41.0f, 41.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-41.0f, -41.0f)
                lineToRelative(-46.1f, 46.1f)
                lineToRelative(41.0f, 41.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-41.0f, -41.0f)
                lineToRelative(-37.7f, 37.7f)
                curveToRelative(-10.5f, 10.5f, -16.4f, 24.7f, -16.4f, 39.6f)
                lineToRelative(0.0f, 88.8f)
                lineToRelative(-57.0f, 57.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(57.0f, -57.0f)
                lineToRelative(88.8f, 0.0f)
                curveToRelative(14.9f, 0.0f, 29.1f, -5.9f, 39.6f, -16.4f)
                lineToRelative(229.7f, -229.7f)
                lineToRelative(7.0f, 7.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-63.0f, -63.0f)
                lineToRelative(46.1f, -46.1f)
                lineToRelative(15.0f, 15.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
