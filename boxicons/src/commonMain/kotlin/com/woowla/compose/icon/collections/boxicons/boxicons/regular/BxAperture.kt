package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxAperture: ImageVector
    get() {
        if (_bxAperture != null) {
            return _bxAperture!!
        }
        _bxAperture = Builder(name = "BxAperture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.579f, 2.0f, 2.0f, 6.579f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.579f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.579f, 10.0f, -10.0f)
                reflectiveCurveTo(17.421f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.113f, 15.0f)
                lineTo(9.986f, 15.0f)
                lineToRelative(-1.723f, -3.094f)
                lineTo(10.202f, 9.0f)
                horizontalLineToRelative(3.736f)
                lineToRelative(1.871f, 3.062f)
                lineTo(14.113f, 15.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -0.953f, 0.186f, -1.87f, 0.508f, -2.727f)
                lineTo(7.696f, 15.0f)
                lineTo(4.61f, 15.0f)
                arcTo(7.757f, 7.757f, 0.0f, false, true, 4.0f, 12.0f)
                close()
                moveTo(16.283f, 9.0f)
                horizontalLineToRelative(3.106f)
                arcTo(7.74f, 7.74f, 0.0f, false, true, 20.0f, 12.0f)
                curveToRelative(0.0f, 0.844f, -0.143f, 1.66f, -0.397f, 2.432f)
                lineTo(16.283f, 9.0f)
                close()
                moveTo(18.188f, 7.0f)
                horizontalLineToRelative(-6.653f)
                lineToRelative(1.905f, -2.857f)
                curveToRelative(1.886f, 0.359f, 3.562f, 1.403f, 4.748f, 2.857f)
                close()
                moveTo(11.093f, 4.059f)
                lineTo(9.132f, 7.0f)
                lineTo(9.0f, 7.0f)
                verticalLineToRelative(0.197f)
                lineTo(7.17f, 9.942f)
                lineTo(5.65f, 7.214f)
                curveToRelative(1.3f, -1.703f, 3.249f, -2.895f, 5.443f, -3.155f)
                close()
                moveTo(5.812f, 17.0f)
                horizontalLineToRelative(7.147f)
                lineToRelative(-1.709f, 2.961f)
                curveTo(9.084f, 19.748f, 7.141f, 18.63f, 5.812f, 17.0f)
                close()
                moveTo(13.64f, 19.82f)
                lineTo(16.997f, 14.005f)
                lineTo(18.541f, 16.531f)
                curveToRelative(-1.154f, 1.642f, -2.901f, 2.854f, -4.901f, 3.289f)
                close()
            }
        }
        .build()
        return _bxAperture!!
    }

private var _bxAperture: ImageVector? = null
