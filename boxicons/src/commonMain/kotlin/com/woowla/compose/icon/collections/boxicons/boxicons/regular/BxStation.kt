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

public val RegularGroup.BxStation: ImageVector
    get() {
        if (_bxStation != null) {
            return _bxStation!!
        }
        _bxStation = Builder(name = "BxStation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.758f, 16.243f)
                lineToRelative(1.414f, -1.415f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, -1.173f, -2.831f)
                curveToRelative(0.0f, -1.068f, 0.417f, -2.071f, 1.173f, -2.825f)
                lineTo(7.758f, 7.756f)
                arcToRelative(5.957f, 5.957f, 0.0f, false, false, -1.76f, 4.24f)
                curveToRelative(0.0f, 1.604f, 0.625f, 3.112f, 1.76f, 4.247f)
                close()
                moveTo(16.242f, 16.243f)
                arcTo(5.96f, 5.96f, 0.0f, false, false, 18.0f, 12.0f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, -1.758f, -4.243f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(15.584f, 9.927f, 16.0f, 10.932f, 16.0f, 12.0f)
                reflectiveCurveToRelative(-0.416f, 2.073f, -1.172f, 2.829f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.344f, 17.657f)
                arcToRelative(7.953f, 7.953f, 0.0f, false, true, -2.345f, -5.659f)
                curveToRelative(0.0f, -2.137f, 0.833f, -4.145f, 2.345f, -5.654f)
                lineTo(4.93f, 4.929f)
                curveToRelative(-1.89f, 1.886f, -2.931f, 4.397f, -2.931f, 7.069f)
                reflectiveCurveToRelative(1.041f, 5.183f, 2.931f, 7.073f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(17.657f, 6.343f)
                arcTo(7.948f, 7.948f, 0.0f, false, true, 20.0f, 12.0f)
                arcToRelative(7.948f, 7.948f, 0.0f, false, true, -2.343f, 5.657f)
                lineToRelative(1.414f, 1.414f)
                arcTo(9.932f, 9.932f, 0.0f, false, false, 22.0f, 12.0f)
                arcToRelative(9.934f, 9.934f, 0.0f, false, false, -2.929f, -7.071f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _bxStation!!
    }

private var _bxStation: ImageVector? = null
