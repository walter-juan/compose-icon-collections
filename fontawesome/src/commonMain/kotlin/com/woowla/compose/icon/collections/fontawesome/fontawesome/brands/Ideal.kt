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

public val BrandsGroup.Ideal: ImageVector
    get() {
        if (_ideal != null) {
            return _ideal!!
        }
        _ideal = Builder(name = "Ideal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.8f, 165.5f)
                arcToRelative(49.1f, 49.1f, 0.0f, true, false, 0.0f, 98.1f)
                arcToRelative(49.1f, 49.1f, 0.0f, true, false, 0.0f, -98.1f)
                close()
                moveTo(54.3f, 425.8f)
                lineToRelative(78.9f, 0.0f)
                lineToRelative(0.0f, -140.5f)
                lineToRelative(-78.9f, 0.0f)
                lineToRelative(0.0f, 140.5f)
                close()
                moveTo(205.8f, 214.2f)
                curveToRelative(0.0f, -20.0f, -10.0f, -22.5f, -18.7f, -22.5f)
                lineToRelative(-14.0f, 0.0f)
                lineToRelative(0.0f, 45.8f)
                lineToRelative(14.0f, 0.0f)
                curveToRelative(9.7f, 0.0f, 18.7f, -2.8f, 18.7f, -23.3f)
                close()
                moveTo(407.5f, 260.2f)
                lineToRelative(0.0f, -91.3f)
                lineToRelative(22.8f, 0.0f)
                lineToRelative(0.0f, 68.6f)
                lineToRelative(33.7f, 0.0f)
                curveTo(454.6f, 113.1f, 356.8f, 86.2f, 267.8f, 86.2f)
                lineToRelative(-94.8f, 0.0f)
                lineToRelative(0.0f, 82.8f)
                lineToRelative(14.0f, 0.0f)
                curveToRelative(25.6f, 0.0f, 41.5f, 17.4f, 41.5f, 45.3f)
                curveToRelative(0.0f, 28.8f, -15.5f, 46.0f, -41.5f, 46.0f)
                lineToRelative(-14.0f, 0.0f)
                lineToRelative(0.0f, 165.6f)
                lineToRelative(94.8f, 0.0f)
                curveToRelative(144.6f, 0.0f, 194.9f, -67.2f, 196.7f, -165.6f)
                lineToRelative(-57.1f, 0.0f)
                close()
                moveTo(297.7f, 260.2f)
                lineToRelative(-56.2f, 0.0f)
                lineToRelative(0.0f, -91.2f)
                lineToRelative(54.4f, 0.0f)
                lineToRelative(0.0f, 22.7f)
                lineToRelative(-31.7f, 0.0f)
                lineToRelative(0.0f, 10.6f)
                lineToRelative(30.0f, 0.0f)
                lineToRelative(0.0f, 22.7f)
                lineToRelative(-30.0f, 0.0f)
                lineToRelative(0.0f, 12.5f)
                lineToRelative(33.5f, 0.0f)
                lineToRelative(0.0f, 22.7f)
                close()
                moveTo(372.4f, 260.2f)
                lineToRelative(-5.2f, -17.7f)
                lineToRelative(-29.7f, 0.0f)
                lineToRelative(-5.2f, 17.7f)
                lineToRelative(-23.7f, 0.0f)
                lineToRelative(27.5f, -91.3f)
                lineToRelative(32.3f, 0.0f)
                lineToRelative(27.5f, 91.3f)
                lineToRelative(-23.7f, 0.0f)
                close()
                moveTo(267.8f, 32.0f)
                lineTo(0.1f, 32.0f)
                lineTo(0.1f, 480.0f)
                lineTo(267.8f, 480.0f)
                curveToRelative(161.8f, 0.0f, 251.0f, -79.7f, 251.0f, -224.5f)
                curveToRelative(0.0f, -83.5f, -32.6f, -223.5f, -251.0f, -223.5f)
                close()
                moveTo(267.8f, 458.9f)
                lineToRelative(-246.6f, 0.0f)
                lineToRelative(0.0f, -405.9f)
                lineToRelative(246.6f, 0.0f)
                curveToRelative(142.1f, 0.0f, 229.9f, 64.6f, 229.9f, 202.4f)
                curveToRelative(0.0f, 134.1f, -81.0f, 203.4f, -229.9f, 203.4f)
                close()
                moveTo(351.7f, 194.0f)
                lineToRelative(-7.5f, 25.8f)
                lineToRelative(16.4f, 0.0f)
                lineToRelative(-7.5f, -25.8f)
                lineToRelative(-1.4f, 0.0f)
                close()
            }
        }
        .build()
        return _ideal!!
    }

private var _ideal: ImageVector? = null
