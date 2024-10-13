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

public val SolidGroup.BxsHardHat: ImageVector
    get() {
        if (_bxsHardHat != null) {
            return _bxsHardHat!!
        }
        _bxsHardHat = Builder(name = "BxsHardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -7.4f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxsHardHat!!
    }

private var _bxsHardHat: ImageVector? = null
