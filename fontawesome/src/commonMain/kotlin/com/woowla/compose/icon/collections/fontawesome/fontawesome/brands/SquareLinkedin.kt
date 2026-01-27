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

public val BrandsGroup.SquareLinkedin: ImageVector
    get() {
        if (_squareLinkedin != null) {
            return _squareLinkedin!!
        }
        _squareLinkedin = Builder(name = "SquareLinkedin", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
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
                moveTo(69.0f, 202.2f)
                lineToRelative(66.5f, 0.0f)
                lineToRelative(0.0f, 213.8f)
                lineToRelative(-66.5f, 0.0f)
                lineToRelative(0.0f, -213.8f)
                close()
                moveTo(140.7f, 134.5f)
                arcToRelative(38.5f, 38.5f, 0.0f, true, true, -77.0f, 0.0f)
                arcToRelative(38.5f, 38.5f, 0.0f, true, true, 77.0f, 0.0f)
                close()
                moveTo(317.9f, 416.0f)
                lineToRelative(0.0f, -104.0f)
                curveToRelative(0.0f, -24.8f, -0.5f, -56.7f, -34.5f, -56.7f)
                curveToRelative(-34.6f, 0.0f, -39.9f, 27.0f, -39.9f, 54.9f)
                lineToRelative(0.0f, 105.8f)
                lineToRelative(-66.4f, 0.0f)
                lineToRelative(0.0f, -213.8f)
                lineToRelative(63.7f, 0.0f)
                lineToRelative(0.0f, 29.2f)
                lineToRelative(0.9f, 0.0f)
                curveToRelative(8.9f, -16.8f, 30.6f, -34.5f, 62.9f, -34.5f)
                curveToRelative(67.2f, 0.0f, 79.7f, 44.3f, 79.7f, 101.9f)
                lineToRelative(0.0f, 117.2f)
                lineToRelative(-66.4f, 0.0f)
                close()
            }
        }
        .build()
        return _squareLinkedin!!
    }

private var _squareLinkedin: ImageVector? = null
