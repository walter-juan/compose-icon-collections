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

public val SolidGroup.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 32.0f)
                curveToRelative(0.0f, -9.6f, -4.3f, -18.7f, -11.7f, -24.7f)
                reflectiveCurveTo(483.1f, -1.3f, 473.7f, 0.6f)
                lineToRelative(-160.0f, 32.0f)
                curveTo(301.5f, 35.1f, 292.0f, 44.3f, 289.0f, 56.0f)
                lineToRelative(-65.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(160.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 28.4f)
                curveToRelative(-55.3f, 12.3f, -101.3f, 49.5f, -125.5f, 99.1f)
                curveToRelative(-5.8f, 11.9f, -0.9f, 26.3f, 11.1f, 32.1f)
                reflectiveCurveToRelative(26.3f, 0.9f, 32.1f, -11.1f)
                curveTo(62.0f, 146.9f, 91.8f, 121.1f, 128.0f, 110.0f)
                lineToRelative(0.0f, 28.8f)
                curveToRelative(-37.8f, 18.0f, -64.0f, 56.5f, -64.0f, 101.2f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(224.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -44.7f, -26.2f, -83.2f, -64.0f, -101.2f)
                lineToRelative(0.0f, -34.8f)
                lineToRelative(65.0f, 0.0f)
                curveToRelative(3.0f, 11.7f, 12.5f, 20.9f, 24.7f, 23.4f)
                lineToRelative(160.0f, 32.0f)
                curveToRelative(9.4f, 1.9f, 19.1f, -0.6f, 26.6f, -6.6f)
                reflectiveCurveTo(512.0f, 137.6f, 512.0f, 128.0f)
                lineToRelative(0.0f, -96.0f)
                close()
                moveTo(288.0f, 448.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-224.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
