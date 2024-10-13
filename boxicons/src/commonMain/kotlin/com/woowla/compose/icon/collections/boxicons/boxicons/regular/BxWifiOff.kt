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

public val RegularGroup.BxWifiOff: ImageVector
    get() {
        if (_bxWifiOff != null) {
            return _bxWifiOff!!
        }
        _bxWifiOff = Builder(name = "BxWifiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.293f, 8.395f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.504f, -0.504f, 1.052f, -0.95f, 1.622f, -1.359f)
                lineTo(2.9f, 7.021f)
                curveToRelative(-0.56f, 0.422f, -1.104f, 0.87f, -1.607f, 1.374f)
                close()
                moveTo(6.474f, 5.06f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.012f, -5.012f)
                lineToRelative(0.976f, -0.975f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, false, -4.099f, -2.148f)
                lineTo(11.294f, 9.88f)
                curveToRelative(2.789f, -0.191f, 5.649f, 0.748f, 7.729f, 2.827f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(-2.898f, -2.899f, -7.061f, -3.936f, -10.888f, -3.158f)
                lineTo(8.024f, 6.61f)
                arcTo(13.366f, 13.366f, 0.0f, false, true, 12.0f, 6.0f)
                curveToRelative(3.537f, 0.0f, 6.837f, 1.353f, 9.293f, 3.809f)
                lineToRelative(1.414f, -1.414f)
                curveTo(19.874f, 5.561f, 16.071f, 4.0f, 12.0f, 4.0f)
                arcToRelative(15.198f, 15.198f, 0.0f, false, false, -5.526f, 1.06f)
                close()
                moveTo(3.563f, 11.293f)
                lineTo(4.977f, 12.707f)
                arcToRelative(9.563f, 9.563f, 0.0f, false, true, 2.058f, -1.551f)
                lineTo(5.576f, 9.697f)
                curveToRelative(-0.717f, 0.451f, -1.395f, 0.979f, -2.013f, 1.596f)
                close()
                moveTo(6.329f, 14.307f)
                lineTo(7.743f, 15.721f)
                curveToRelative(0.692f, -0.692f, 1.535f, -1.151f, 2.429f, -1.428f)
                lineToRelative(-1.557f, -1.557f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, false, -2.286f, 1.571f)
                close()
                moveTo(13.989f, 18.11f)
                lineTo(11.889f, 16.01f)
                arcToRelative(1.996f, 1.996f, 0.0f, true, false, 2.1f, 2.1f)
                close()
            }
        }
        .build()
        return _bxWifiOff!!
    }

private var _bxWifiOff: ImageVector? = null
