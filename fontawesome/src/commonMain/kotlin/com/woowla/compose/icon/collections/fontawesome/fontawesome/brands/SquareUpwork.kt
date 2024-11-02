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

public val BrandsGroup.SquareUpwork: ImageVector
    get() {
        if (_squareUpwork != null) {
            return _squareUpwork!!
        }
        _squareUpwork = Builder(name = "SquareUpwork", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 32.0f)
                lineToRelative(336.0f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                lineToRelative(0.0f, 336.0f)
                curveToRelative(0.0f, 30.9f, -25.1f, 56.0f, -56.0f, 56.0f)
                lineTo(56.0f, 480.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                lineTo(0.0f, 88.0f)
                curveTo(0.0f, 57.1f, 25.1f, 32.0f, 56.0f, 32.0f)
                close()
                moveTo(270.9f, 274.2f)
                curveToRelative(6.6f, -52.9f, 25.9f, -69.5f, 51.4f, -69.5f)
                curveToRelative(25.3f, 0.0f, 44.9f, 20.2f, 44.9f, 49.7f)
                reflectiveCurveToRelative(-19.7f, 49.7f, -44.9f, 49.7f)
                curveToRelative(-27.9f, 0.0f, -46.3f, -21.5f, -51.4f, -29.9f)
                close()
                moveTo(244.2f, 232.4f)
                curveToRelative(-8.2f, -15.5f, -14.3f, -36.3f, -19.2f, -55.6f)
                lineToRelative(-29.7f, 0.0f)
                lineToRelative(-33.2f, 0.0f)
                lineToRelative(0.0f, 78.1f)
                curveToRelative(0.0f, 28.4f, -12.9f, 49.4f, -38.2f, 49.4f)
                reflectiveCurveToRelative(-39.8f, -20.9f, -39.8f, -49.3f)
                lineToRelative(0.3f, -78.1f)
                lineToRelative(-36.2f, 0.0f)
                lineToRelative(0.0f, 78.1f)
                curveToRelative(0.0f, 22.8f, 7.4f, 43.5f, 20.9f, 58.2f)
                curveToRelative(13.9f, 15.2f, 32.8f, 23.2f, 54.8f, 23.2f)
                curveToRelative(43.7f, 0.0f, 74.2f, -33.5f, 74.2f, -81.5f)
                lineToRelative(0.0f, -52.5f)
                curveToRelative(4.6f, 17.3f, 15.4f, 50.5f, 36.2f, 79.7f)
                lineTo(215.0f, 392.6f)
                lineToRelative(36.8f, 0.0f)
                lineToRelative(12.8f, -78.4f)
                curveToRelative(4.2f, 3.5f, 8.7f, 6.6f, 13.4f, 9.4f)
                curveToRelative(12.3f, 7.8f, 26.4f, 12.2f, 40.9f, 12.6f)
                lineToRelative(0.1f, 0.0f)
                curveToRelative(0.5f, 0.0f, 1.1f, 0.0f, 1.6f, 0.0f)
                curveToRelative(0.6f, 0.0f, 1.1f, 0.0f, 1.7f, 0.0f)
                curveToRelative(45.1f, 0.0f, 80.9f, -34.9f, 80.9f, -81.9f)
                reflectiveCurveToRelative(-35.9f, -82.2f, -80.9f, -82.2f)
                curveToRelative(-45.4f, 0.0f, -70.9f, 29.7f, -78.1f, 60.1f)
                close()
            }
        }
        .build()
        return _squareUpwork!!
    }

private var _squareUpwork: ImageVector? = null
