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

public val RegularGroup.BxTrip: ImageVector
    get() {
        if (_bxTrip != null) {
            return _bxTrip!!
        }
        _bxTrip = Builder(name = "BxTrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.844f, 20.0f)
                lineTo(6.5f, 20.0f)
                curveTo(5.121f, 20.0f, 4.0f, 18.879f, 4.0f, 17.5f)
                reflectiveCurveTo(5.121f, 15.0f, 6.5f, 15.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(15.43f, 8.0f, 13.5f, 8.0f)
                lineTo(8.639f, 8.0f)
                arcToRelative(9.812f, 9.812f, 0.0f, false, true, -1.354f, 2.0f)
                lineTo(13.5f, 10.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveTo(4.019f, 13.0f, 2.0f, 15.019f, 2.0f, 17.5f)
                reflectiveCurveTo(4.019f, 22.0f, 6.5f, 22.0f)
                horizontalLineToRelative(9.593f)
                arcToRelative(10.415f, 10.415f, 0.0f, false, true, -1.249f, -2.0f)
                close()
                moveTo(5.0f, 2.0f)
                curveTo(3.346f, 2.0f, 2.0f, 3.346f, 2.0f, 5.0f)
                curveToRelative(0.0f, 3.188f, 3.0f, 5.0f, 3.0f, 5.0f)
                reflectiveCurveToRelative(3.0f, -1.813f, 3.0f, -5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 3.188f, 3.0f, 5.0f, 3.0f, 5.0f)
                reflectiveCurveToRelative(3.0f, -1.813f, 3.0f, -5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 18.5f)
                close()
            }
        }
        .build()
        return _bxTrip!!
    }

private var _bxTrip: ImageVector? = null
