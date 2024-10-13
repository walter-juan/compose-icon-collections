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

public val SolidGroup.BxsVial: ImageVector
    get() {
        if (_bxsVial != null) {
            return _bxsVial!!
        }
        _bxsVial = Builder(name = "BxsVial", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, 3.535f, -1.465f)
                lineToRelative(9.193f, -9.193f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-8.485f, -8.486f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-9.193f, 9.193f)
                curveTo(2.521f, 14.408f, 2.0f, 15.664f, 2.0f, 17.0f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.465f, 3.535f)
                arcTo(4.965f, 4.965f, 0.0f, false, false, 7.0f, 22.0f)
                close()
                moveTo(18.314f, 9.928f)
                lineTo(15.242f, 13.0f)
                horizontalLineTo(6.758f)
                lineToRelative(7.314f, -7.314f)
                lineToRelative(4.242f, 4.242f)
                close()
            }
        }
        .build()
        return _bxsVial!!
    }

private var _bxsVial: ImageVector? = null
