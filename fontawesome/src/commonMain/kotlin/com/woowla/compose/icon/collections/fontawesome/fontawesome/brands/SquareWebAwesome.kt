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

public val BrandsGroup.SquareWebAwesome: ImageVector
    get() {
        if (_squareWebAwesome != null) {
            return _squareWebAwesome!!
        }
        _squareWebAwesome = Builder(name = "SquareWebAwesome", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(235.0f, 177.6f)
                lineTo(288.0f, 224.0f)
                lineToRelative(52.2f, -10.4f)
                curveToRelative(-2.6f, -3.9f, -4.2f, -8.5f, -4.2f, -13.6f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.0f, -10.3f, 23.6f, -23.2f, 24.0f)
                lineTo(304.5f, 349.1f)
                curveToRelative(-5.2f, 11.5f, -16.6f, 18.9f, -29.2f, 18.9f)
                lineToRelative(-102.6f, 0.0f)
                curveToRelative(-12.6f, 0.0f, -24.0f, -7.4f, -29.2f, -18.9f)
                lineTo(87.2f, 224.0f)
                curveTo(74.3f, 223.6f, 64.0f, 213.0f, 64.0f, 200.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                curveToRelative(0.0f, 5.0f, -1.5f, 9.7f, -4.2f, 13.6f)
                lineTo(160.0f, 224.0f)
                lineToRelative(53.1f, -46.4f)
                curveToRelative(-8.9f, -4.1f, -15.0f, -13.1f, -15.0f, -23.6f)
                curveToRelative(0.0f, -14.4f, 11.6f, -26.0f, 26.0f, -26.0f)
                reflectiveCurveToRelative(26.0f, 11.6f, 26.0f, 26.0f)
                curveToRelative(0.0f, 10.5f, -6.2f, 19.5f, -15.1f, 23.6f)
                close()
            }
        }
        .build()
        return _squareWebAwesome!!
    }

private var _squareWebAwesome: ImageVector? = null
