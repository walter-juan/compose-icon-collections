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

public val RegularGroup.BxWind: ImageVector
    get() {
        if (_bxWind != null) {
            return _bxWind!!
        }
        _bxWind = Builder(name = "BxWind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.5f)
                curveTo(13.0f, 3.57f, 11.43f, 2.0f, 9.5f, 2.0f)
                curveTo(7.466f, 2.0f, 6.25f, 3.525f, 6.25f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.415f, 0.388f, -1.0f, 1.25f, -1.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(10.327f, 7.0f, 9.5f, 7.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.5f)
                curveTo(11.43f, 9.0f, 13.0f, 7.43f, 13.0f, 5.5f)
                close()
                moveTo(15.5f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.862f, 0.0f, -1.25f, -0.585f, -1.25f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.475f, 1.216f, 3.0f, 3.25f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(17.43f, 15.0f, 15.5f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _bxWind!!
    }

private var _bxWind: ImageVector? = null
