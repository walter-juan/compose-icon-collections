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

public val LogosGroup.BxlMediumOld: ImageVector
    get() {
        if (_bxlMediumOld != null) {
            return _bxlMediumOld!!
        }
        _bxlMediumOld = Builder(name = "BxlMediumOld", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.957f, 6.73f)
                arcToRelative(0.073f, 0.073f, 0.0f, false, false, -0.019f, -0.097f)
                curveToRelative(-0.004f, -0.004f, -0.008f, -0.008f, -0.012f, -0.01f)
                lineToRelative(-0.006f, -0.002f)
                lineToRelative(-6.033f, -3.018f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, false, -0.292f, -0.067f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, false, -0.586f, 0.317f)
                lineToRelative(-3.474f, 5.646f)
                lineToRelative(4.359f, 7.083f)
                lineToRelative(6.063f, -9.852f)
                close()
                moveTo(20.893f, 20.273f)
                curveToRelative(0.611f, 0.306f, 1.107f, 0.092f, 1.107f, -0.478f)
                lineTo(22.0f, 8.483f)
                lineToRelative(-5.809f, 9.439f)
                lineToRelative(4.702f, 2.351f)
                close()
                moveTo(9.622f, 8.213f)
                verticalLineToRelative(6.426f)
                lineToRelative(5.711f, 2.855f)
                close()
                moveTo(2.554f, 17.771f)
                lineTo(7.744f, 20.366f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, false, 0.374f, 0.098f)
                curveToRelative(0.323f, 0.0f, 0.549f, -0.25f, 0.549f, -0.669f)
                lineTo(8.667f, 6.701f)
                arcToRelative(0.067f, 0.067f, 0.0f, false, false, -0.035f, -0.059f)
                lineTo(2.739f, 3.697f)
                arcToRelative(0.669f, 0.669f, 0.0f, false, false, -0.3f, -0.079f)
                curveToRelative(-0.258f, 0.0f, -0.439f, 0.199f, -0.439f, 0.534f)
                verticalLineToRelative(12.723f)
                curveToRelative(0.0f, 0.341f, 0.25f, 0.744f, 0.554f, 0.896f)
                close()
            }
        }
        .build()
        return _bxlMediumOld!!
    }

private var _bxlMediumOld: ImageVector? = null
