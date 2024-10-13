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

public val RegularGroup.BxWinkTongue: ImageVector
    get() {
        if (_bxWinkTongue != null) {
            return _bxWinkTongue!!
        }
        _bxWinkTongue = Builder(name = "BxWinkTongue", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 9.0f)
                curveToRelative(-2.0f, 0.0f, -2.5f, 2.0f, -2.5f, 2.0f)
                horizontalLineToRelative(5.0f)
                reflectiveCurveToRelative(-0.501f, -2.0f, -2.5f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(15.856f, 19.005f)
                curveToRelative(0.085f, -0.323f, 0.144f, -0.656f, 0.144f, -1.005f)
                verticalLineToRelative(-1.499f)
                curveTo(17.589f, 15.028f, 18.0f, 13.0f, 18.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                reflectiveCurveToRelative(0.412f, 2.028f, 2.0f, 3.501f)
                lineTo(8.0f, 18.0f)
                curveToRelative(0.0f, 0.349f, 0.059f, 0.682f, 0.144f, 1.005f)
                arcTo(8.005f, 8.005f, 0.0f, false, true, 4.0f, 12.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                arcToRelative(8.005f, 8.005f, 0.0f, false, true, -4.144f, 7.005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 9.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxWinkTongue!!
    }

private var _bxWinkTongue: ImageVector? = null
