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

public val BrandsGroup.SquareBluesky: ImageVector
    get() {
        if (_squareBluesky != null) {
            return _squareBluesky!!
        }
        _squareBluesky = Builder(name = "SquareBluesky", defaultWidth = 448.0.dp, defaultHeight =
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
                moveTo(224.0f, 247.4f)
                curveToRelative(14.5f, -30.0f, 54.0f, -85.8f, 90.7f, -113.3f)
                curveToRelative(26.5f, -19.9f, 69.3f, -35.2f, 69.3f, 13.7f)
                curveToRelative(0.0f, 9.8f, -5.6f, 82.1f, -8.9f, 93.8f)
                curveToRelative(-11.4f, 40.8f, -53.0f, 51.2f, -90.0f, 44.9f)
                curveToRelative(64.7f, 11.0f, 81.2f, 47.5f, 45.6f, 84.0f)
                curveToRelative(-67.5f, 69.3f, -97.0f, -17.4f, -104.6f, -39.6f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-0.3f, -0.9f)
                curveToRelative(-0.9f, -2.6f, -1.4f, -4.1f, -1.8f, -4.1f)
                reflectiveCurveToRelative(-0.9f, 1.5f, -1.8f, 4.1f)
                curveToRelative(-0.1f, 0.3f, -0.2f, 0.6f, -0.3f, 0.9f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-7.6f, 22.2f, -37.1f, 108.8f, -104.6f, 39.6f)
                curveToRelative(-35.5f, -36.5f, -19.1f, -73.0f, 45.6f, -84.0f)
                curveToRelative(-37.0f, 6.3f, -78.6f, -4.1f, -90.0f, -44.9f)
                curveToRelative(-3.3f, -11.7f, -8.9f, -84.0f, -8.9f, -93.8f)
                curveToRelative(0.0f, -48.9f, 42.9f, -33.5f, 69.3f, -13.7f)
                curveToRelative(36.7f, 27.5f, 76.2f, 83.4f, 90.7f, 113.3f)
                close()
            }
        }
        .build()
        return _squareBluesky!!
    }

private var _squareBluesky: ImageVector? = null
