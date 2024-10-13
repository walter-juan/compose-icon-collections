package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlGooglePlus: ImageVector
    get() {
        if (_bxlGooglePlus != null) {
            return _bxlGooglePlus!!
        }
        _bxlGooglePlus = Builder(name = "BxlGooglePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.545f, 15.025f)
                verticalLineToRelative(-2.421f)
                horizontalLineToRelative(2.422f)
                verticalLineToRelative(-1.815f)
                horizontalLineToRelative(-2.422f)
                verticalLineTo(8.368f)
                horizontalLineTo(17.73f)
                verticalLineToRelative(2.421f)
                horizontalLineToRelative(-2.421f)
                verticalLineToRelative(1.815f)
                horizontalLineToRelative(2.421f)
                verticalLineToRelative(2.421f)
                close()
                moveTo(8.052f, 8.302f)
                curveToRelative(1.133f, 0.0f, 1.896f, 0.484f, 2.33f, 0.896f)
                lineToRelative(1.722f, -1.67f)
                curveToRelative(-1.048f, -0.98f, -2.415f, -1.58f, -4.052f, -1.58f)
                curveTo(4.714f, 5.947f, 2.0f, 8.659f, 2.0f, 12.0f)
                reflectiveCurveToRelative(2.714f, 6.053f, 6.052f, 6.053f)
                curveToRelative(3.493f, 0.0f, 5.812f, -2.457f, 5.812f, -5.913f)
                curveToRelative(0.0f, -0.503f, -0.064f, -0.86f, -0.153f, -1.24f)
                horizontalLineTo(8.049f)
                verticalLineToRelative(2.256f)
                horizontalLineToRelative(3.332f)
                curveToRelative(-0.158f, 0.951f, -1.011f, 2.556f, -3.329f, 2.556f)
                curveToRelative(-2.003f, 0.0f, -3.637f, -1.665f, -3.637f, -3.704f)
                curveToRelative(0.0f, -2.042f, 1.634f, -3.706f, 3.637f, -3.706f)
                close()
            }
        }
        .build()
        return _bxlGooglePlus!!
    }

private var _bxlGooglePlus: ImageVector? = null
