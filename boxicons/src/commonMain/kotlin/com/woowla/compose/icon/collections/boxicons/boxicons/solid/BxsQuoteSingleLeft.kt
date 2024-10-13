package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsQuoteSingleLeft: ImageVector
    get() {
        if (_bxsQuoteSingleLeft != null) {
            return _bxsQuoteSingleLeft!!
        }
        _bxsQuoteSingleLeft = Builder(name = "BxsQuoteSingleLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.203f, 6.98f)
                lineToRelative(0.804f, -0.161f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.784f, 0.0f, -4.906f, 0.771f, -6.309f, 2.292f)
                curveTo(6.81f, 8.34f, 7.0f, 10.97f, 7.006f, 11.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-4.079f)
                curveToRelative(0.022f, -0.402f, 0.123f, -0.912f, 0.429f, -1.396f)
                curveToRelative(0.509f, -0.801f, 1.466f, -1.347f, 2.847f, -1.624f)
                close()
            }
        }
        .build()
        return _bxsQuoteSingleLeft!!
    }

private var _bxsQuoteSingleLeft: ImageVector? = null
