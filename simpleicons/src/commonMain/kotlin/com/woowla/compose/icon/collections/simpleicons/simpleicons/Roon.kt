package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Roon: ImageVector
    get() {
        if (_roon != null) {
            return _roon!!
        }
        _roon = Builder(name = "Roon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.29f, 9.198f)
                curveToRelative(0.138f, -0.024f, 0.234f, -0.171f, 0.234f, -0.321f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, false, -0.183f, -0.299f)
                reflectiveCurveToRelative(-0.088f, -0.06f, -0.577f, -0.06f)
                curveTo(1.059f, 8.519f, 0.0f, 9.598f, 0.0f, 11.337f)
                verticalLineToRelative(3.798f)
                arcToRelative(0.356f, 0.356f, 0.0f, false, false, 0.711f, 0.0f)
                verticalLineToRelative(-3.798f)
                curveToRelative(0.0f, -1.378f, 0.847f, -2.188f, 2.136f, -2.136f)
                curveToRelative(0.086f, 0.004f, 0.335f, 0.024f, 0.444f, -0.002f)
                close()
                moveTo(21.181f, 8.505f)
                curveToRelative(-1.641f, 0.0f, -2.832f, 1.191f, -2.832f, 2.832f)
                verticalLineToRelative(3.798f)
                arcToRelative(0.356f, 0.356f, 0.0f, true, false, 0.711f, 0.0f)
                verticalLineToRelative(-3.798f)
                curveToRelative(0.0f, -1.222f, 0.892f, -2.108f, 2.121f, -2.108f)
                curveToRelative(1.222f, 0.0f, 2.108f, 0.887f, 2.108f, 2.108f)
                verticalLineToRelative(3.798f)
                arcToRelative(0.355f, 0.355f, 0.0f, true, false, 0.711f, 0.0f)
                verticalLineToRelative(-3.798f)
                curveToRelative(0.0f, -1.641f, -1.186f, -2.832f, -2.819f, -2.832f)
                close()
                moveTo(14.283f, 8.505f)
                curveToRelative(-1.837f, 0.0f, -3.33f, 1.578f, -3.33f, 3.518f)
                curveToRelative(0.0f, 1.912f, 1.494f, 3.468f, 3.33f, 3.468f)
                curveToRelative(1.843f, 0.0f, 3.343f, -1.556f, 3.343f, -3.468f)
                curveToRelative(0.0f, -1.94f, -1.5f, -3.518f, -3.343f, -3.518f)
                close()
                moveTo(16.902f, 12.023f)
                curveToRelative(0.0f, 1.534f, -1.175f, 2.782f, -2.62f, 2.782f)
                curveToRelative(-1.444f, 0.0f, -2.62f, -1.248f, -2.62f, -2.782f)
                curveToRelative(0.0f, -1.561f, 1.175f, -2.832f, 2.62f, -2.832f)
                curveToRelative(1.444f, 0.0f, 2.62f, 1.27f, 2.62f, 2.832f)
                close()
                moveTo(6.873f, 8.505f)
                curveToRelative(-1.837f, 0.0f, -3.331f, 1.578f, -3.331f, 3.518f)
                curveToRelative(0.0f, 1.912f, 1.494f, 3.468f, 3.331f, 3.468f)
                curveToRelative(1.843f, 0.0f, 3.343f, -1.556f, 3.343f, -3.468f)
                curveToRelative(0.0f, -1.94f, -1.5f, -3.518f, -3.343f, -3.518f)
                close()
                moveTo(9.493f, 12.023f)
                curveToRelative(0.0f, 1.534f, -1.175f, 2.782f, -2.62f, 2.782f)
                curveToRelative(-1.444f, 0.0f, -2.62f, -1.248f, -2.62f, -2.782f)
                curveToRelative(0.0f, -1.561f, 1.175f, -2.832f, 2.62f, -2.832f)
                curveToRelative(1.444f, 0.0f, 2.62f, 1.27f, 2.62f, 2.832f)
                close()
            }
        }
        .build()
        return _roon!!
    }

private var _roon: ImageVector? = null
