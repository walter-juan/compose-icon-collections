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

public val RegularGroup.BxCake: ImageVector
    get() {
        if (_bxCake != null) {
            return _bxCake!!
        }
        _bxCake = Builder(name = "BxCake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.346f, 5.0f, 2.0f, 6.346f, 2.0f, 8.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineToRelative(0.001f, 3.12f)
                curveToRelative(-0.896f, 0.228f, -1.469f, 0.734f, -1.916f, 1.132f)
                curveToRelative(-0.507f, 0.45f, -0.842f, 0.748f, -1.588f, 0.748f)
                curveToRelative(-0.745f, 0.0f, -1.08f, -0.298f, -1.587f, -0.747f)
                curveToRelative(-0.595f, -0.529f, -1.409f, -1.253f, -2.915f, -1.253f)
                curveToRelative(-1.505f, 0.0f, -2.319f, 0.724f, -2.914f, 1.253f)
                curveToRelative(-0.507f, 0.45f, -0.841f, 0.747f, -1.586f, 0.747f)
                curveToRelative(-0.743f, 0.0f, -1.077f, -0.297f, -1.582f, -0.747f)
                curveToRelative(-0.447f, -0.398f, -1.018f, -0.905f, -1.913f, -1.133f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineToRelative(-4.714f)
                curveToRelative(0.191f, 0.123f, 0.374f, 0.274f, 0.583f, 0.461f)
                curveTo(5.178f, 14.276f, 5.991f, 15.0f, 7.495f, 15.0f)
                curveToRelative(1.505f, 0.0f, 2.319f, -0.724f, 2.914f, -1.253f)
                curveToRelative(0.507f, -0.45f, 0.841f, -0.747f, 1.586f, -0.747f)
                reflectiveCurveToRelative(1.08f, 0.298f, 1.587f, 0.747f)
                curveToRelative(0.595f, 0.529f, 1.409f, 1.253f, 2.915f, 1.253f)
                reflectiveCurveToRelative(2.321f, -0.724f, 2.916f, -1.253f)
                curveToRelative(0.211f, -0.188f, 0.395f, -0.34f, 0.588f, -0.464f)
                lineTo(20.002f, 18.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bxCake!!
    }

private var _bxCake: ImageVector? = null
