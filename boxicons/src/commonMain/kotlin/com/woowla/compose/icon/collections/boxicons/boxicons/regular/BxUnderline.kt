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

public val RegularGroup.BxUnderline: ImageVector
    get() {
        if (_bxUnderline != null) {
            return _bxUnderline!!
        }
        _bxUnderline = Builder(name = "BxUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(6.0f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bxUnderline!!
    }

private var _bxUnderline: ImageVector? = null
