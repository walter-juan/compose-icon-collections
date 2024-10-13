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

public val RegularGroup.BxMobileVibration: ImageVector
    get() {
        if (_bxMobileVibration != null) {
            return _bxMobileVibration!!
        }
        _bxMobileVibration = Builder(name = "BxMobileVibration", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.535f, 2.808f)
                curveToRelative(-0.756f, -0.756f, -2.072f, -0.756f, -2.828f, 0.0f)
                lineToRelative(-9.899f, 9.899f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, false, 0.0f, 2.828f)
                lineToRelative(5.657f, 5.657f)
                curveToRelative(0.378f, 0.378f, 0.88f, 0.586f, 1.414f, 0.586f)
                reflectiveCurveToRelative(1.036f, -0.208f, 1.414f, -0.586f)
                lineToRelative(9.899f, -9.899f)
                curveToRelative(0.378f, -0.378f, 0.586f, -0.88f, 0.586f, -1.414f)
                reflectiveCurveToRelative(-0.208f, -1.036f, -0.586f, -1.414f)
                lineToRelative(-5.657f, -5.657f)
                close()
                moveTo(9.879f, 19.778f)
                verticalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-5.657f, -5.657f)
                lineToRelative(9.899f, -9.899f)
                lineToRelative(5.657f, 5.657f)
                lineToRelative(-9.899f, 9.899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.707f, 21.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(1.414f, 1.415f)
                close()
                moveTo(8.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-1.414f, -1.415f)
                close()
            }
        }
        .build()
        return _bxMobileVibration!!
    }

private var _bxMobileVibration: ImageVector? = null
