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

public val SolidGroup.BxsQuoteRight: ImageVector
    get() {
        if (_bxsQuoteRight != null) {
            return _bxsQuoteRight!!
        }
        _bxsQuoteRight = Builder(name = "BxsQuoteRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.309f, 17.708f)
                curveTo(22.196f, 15.66f, 22.006f, 13.03f, 22.0f, 13.0f)
                lineTo(22.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.078f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -0.429f, 1.396f)
                curveToRelative(-0.508f, 0.801f, -1.465f, 1.348f, -2.846f, 1.624f)
                lineToRelative(-0.803f, 0.16f)
                lineTo(13.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.783f, 0.0f, 4.906f, -0.771f, 6.309f, -2.292f)
                close()
                moveTo(9.302f, 17.708f)
                curveTo(11.19f, 15.66f, 10.999f, 13.03f, 10.993f, 13.0f)
                lineTo(10.993f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.078f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -0.429f, 1.396f)
                curveToRelative(-0.508f, 0.801f, -1.465f, 1.348f, -2.846f, 1.624f)
                lineToRelative(-0.803f, 0.16f)
                lineTo(1.993f, 20.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.783f, 0.0f, 4.906f, -0.771f, 6.309f, -2.292f)
                close()
            }
        }
        .build()
        return _bxsQuoteRight!!
    }

private var _bxsQuoteRight: ImageVector? = null
