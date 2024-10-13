package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxMedal: ImageVector
    get() {
        if (_bxMedal != null) {
            return _bxMedal!!
        }
        _bxMedal = Builder(name = "BxMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(11.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(5.518f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, true, 4.0f, -1.459f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.059f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, true, 4.0f, 1.459f)
                lineTo(17.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.019f, 15.811f)
                lineToRelative(-0.468f, 2.726f)
                lineTo(12.0f, 17.25f)
                lineToRelative(2.449f, 1.287f)
                lineToRelative(-0.468f, -2.726f)
                lineToRelative(1.982f, -1.932f)
                lineToRelative(-2.738f, -0.398f)
                lineTo(12.0f, 11.0f)
                lineToRelative(-1.225f, 2.481f)
                lineToRelative(-2.738f, 0.398f)
                close()
            }
        }
        .build()
        return _bxMedal!!
    }

private var _bxMedal: ImageVector? = null
