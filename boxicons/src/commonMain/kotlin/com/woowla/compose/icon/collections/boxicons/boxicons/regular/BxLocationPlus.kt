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

public val RegularGroup.BxLocationPlus: ImageVector
    get() {
        if (_bxLocationPlus != null) {
            return _bxLocationPlus!!
        }
        _bxLocationPlus = Builder(name = "BxLocationPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.42f, 21.815f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, 1.16f, 0.0f)
                curveTo(12.884f, 21.598f, 20.029f, 16.44f, 20.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveTo(4.0f, 5.589f, 4.0f, 9.996f)
                curveToRelative(-0.029f, 6.444f, 7.116f, 11.602f, 7.42f, 11.819f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.004f)
                curveToRelative(0.021f, 4.438f, -4.388f, 8.423f, -6.0f, 9.731f)
                curveToRelative(-1.611f, -1.308f, -6.021f, -5.293f, -6.0f, -9.735f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxLocationPlus!!
    }

private var _bxLocationPlus: ImageVector? = null
