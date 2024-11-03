package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CcSquareFill: ImageVector
    get() {
        if (_ccSquareFill != null) {
            return _ccSquareFill!!
        }
        _ccSquareFill = Builder(name = "CcSquareFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(5.408f, 5.89f)
                curveToRelative(-0.83f, 0.0f, -1.318f, 0.64f, -1.318f, 1.753f)
                verticalLineToRelative(0.742f)
                curveToRelative(0.0f, 1.108f, 0.479f, 1.727f, 1.318f, 1.727f)
                curveToRelative(0.69f, 0.0f, 1.138f, -0.435f, 1.187f, -1.05f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.058f, 1.147f, -1.029f, 1.938f, -2.343f, 1.938f)
                curveToRelative(-1.612f, 0.0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveToRelative(0.0f, -1.7f, 0.914f, -2.75f, 2.518f, -2.75f)
                curveToRelative(1.319f, 0.0f, 2.29f, 0.812f, 2.343f, 1.999f)
                verticalLineToRelative(0.11f)
                lineTo(6.595f, 6.997f)
                curveToRelative(-0.049f, -0.638f, -0.506f, -1.108f, -1.187f, -1.108f)
                close()
                moveTo(10.812f, 5.89f)
                curveToRelative(-0.831f, 0.0f, -1.319f, 0.64f, -1.319f, 1.753f)
                verticalLineToRelative(0.742f)
                curveToRelative(0.0f, 1.108f, 0.48f, 1.727f, 1.319f, 1.727f)
                curveToRelative(0.69f, 0.0f, 1.138f, -0.435f, 1.186f, -1.05f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.057f, 1.147f, -1.028f, 1.938f, -2.342f, 1.938f)
                curveToRelative(-1.613f, 0.0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveToRelative(0.0f, -1.7f, 0.914f, -2.75f, 2.518f, -2.75f)
                curveToRelative(1.318f, 0.0f, 2.29f, 0.812f, 2.342f, 1.999f)
                verticalLineToRelative(0.11f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, -0.638f, -0.505f, -1.108f, -1.186f, -1.108f)
                close()
            }
        }
        .build()
        return _ccSquareFill!!
    }

private var _ccSquareFill: ImageVector? = null
