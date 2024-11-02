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

public val BrandsGroup.SquareFontAwesomeStroke: ImageVector
    get() {
        if (_squareFontAwesomeStroke != null) {
            return _squareFontAwesomeStroke!!
        }
        _squareFontAwesomeStroke = Builder(name = "SquareFontAwesomeStroke", defaultWidth =
                448.0.dp, defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(46.3f, 64.0f, 32.0f, 78.3f, 32.0f, 96.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(154.0f, 154.0f)
                curveToRelative(0.0f, 9.3f, -4.8f, 17.4f, -12.1f, 22.0f)
                lineToRelative(188.9f, 0.0f)
                curveToRelative(7.3f, 0.0f, 13.2f, 5.9f, 13.2f, 13.2f)
                curveToRelative(0.0f, 1.8f, -0.4f, 3.7f, -1.1f, 5.4f)
                lineTo(312.0f, 264.0f)
                lineToRelative(30.9f, 69.4f)
                curveToRelative(0.8f, 1.7f, 1.1f, 3.5f, 1.1f, 5.4f)
                curveToRelative(0.0f, 7.3f, -5.9f, 13.2f, -13.2f, 13.2f)
                lineTo(144.0f, 352.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(0.0f, -1.5f)
                curveToRelative(-6.1f, -4.8f, -10.0f, -12.2f, -10.0f, -20.5f)
                curveToRelative(0.0f, -14.4f, 11.6f, -26.0f, 26.0f, -26.0f)
                reflectiveCurveToRelative(26.0f, 11.6f, 26.0f, 26.0f)
                close()
            }
        }
        .build()
        return _squareFontAwesomeStroke!!
    }

private var _squareFontAwesomeStroke: ImageVector? = null
