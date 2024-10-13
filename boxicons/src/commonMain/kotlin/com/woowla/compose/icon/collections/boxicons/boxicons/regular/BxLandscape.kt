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

public val RegularGroup.BxLandscape: ImageVector
    get() {
        if (_bxLandscape != null) {
            return _bxLandscape!!
        }
        _bxLandscape = Builder(name = "BxLandscape", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.864f, -1.504f)
                lineToRelative(-7.0f, -12.0f)
                curveToRelative(-0.359f, -0.615f, -1.369f, -0.613f, -1.729f, 0.0f)
                lineTo(9.866f, 12.1f)
                lineToRelative(-1.02f, -1.632f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 8.0f, 10.0f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.847f, 0.47f)
                lineToRelative(-5.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 20.0f)
                close()
                moveTo(14.0f, 8.985f)
                lineTo(19.259f, 18.0f)
                horizontalLineToRelative(-5.704f)
                lineToRelative(-2.486f, -3.987f)
                lineTo(14.0f, 8.985f)
                close()
                moveTo(8.001f, 12.885f)
                lineTo(11.197f, 18.0f)
                lineTo(4.805f, 18.0f)
                lineToRelative(3.196f, -5.115f)
                close()
                moveTo(6.0f, 8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveTo(7.654f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveTo(3.0f, 3.346f, 3.0f, 5.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxLandscape!!
    }

private var _bxLandscape: ImageVector? = null
