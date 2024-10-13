package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsDollarCircle: ImageVector
    get() {
        if (_bxsDollarCircle != null) {
            return _bxsDollarCircle!!
        }
        _bxsDollarCircle = Builder(name = "BxsDollarCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 16.915f)
                lineTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.08f)
                curveToRelative(-2.339f, -0.367f, -3.0f, -2.002f, -3.0f, -2.92f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.011f, 0.143f, 0.159f, 1.0f, 2.0f, 1.0f)
                curveToRelative(1.38f, 0.0f, 2.0f, -0.585f, 2.0f, -1.0f)
                curveToRelative(0.0f, -0.324f, 0.0f, -1.0f, -2.0f, -1.0f)
                curveToRelative(-3.48f, 0.0f, -4.0f, -1.88f, -4.0f, -3.0f)
                curveToRelative(0.0f, -1.288f, 1.029f, -2.584f, 3.0f, -2.915f)
                lineTo(11.0f, 6.012f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.109f)
                curveToRelative(1.734f, 0.41f, 2.4f, 1.853f, 2.4f, 2.879f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-1.0f, 0.018f)
                curveTo(13.386f, 9.638f, 13.185f, 9.0f, 12.0f, 9.0f)
                curveToRelative(-1.299f, 0.0f, -2.0f, 0.516f, -2.0f, 1.0f)
                curveToRelative(0.0f, 0.374f, 0.0f, 1.0f, 2.0f, 1.0f)
                curveToRelative(3.48f, 0.0f, 4.0f, 1.88f, 4.0f, 3.0f)
                curveToRelative(0.0f, 1.288f, -1.029f, 2.584f, -3.0f, 2.915f)
                close()
            }
        }
        .build()
        return _bxsDollarCircle!!
    }

private var _bxsDollarCircle: ImageVector? = null
