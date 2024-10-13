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

public val SolidGroup.BxsLogOutCircle: ImageVector
    get() {
        if (_bxsLogOutCircle != null) {
            return _bxsLogOutCircle!!
        }
        _bxsLogOutCircle = Builder(name = "BxsLogOutCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, 4.037f, -9.0f, 9.0f)
                verticalLineToRelative(0.001f)
                lineToRelative(5.0f, -4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-5.0f, -4.0f)
                curveTo(3.001f, 16.964f, 7.037f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.037f, -9.0f, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _bxsLogOutCircle!!
    }

private var _bxsLogOutCircle: ImageVector? = null
