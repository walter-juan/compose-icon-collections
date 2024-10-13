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

public val RegularGroup.BxRupee: ImageVector
    get() {
        if (_bxRupee != null) {
            return _bxRupee!!
        }
        _bxRupee = Builder(name = "BxRupee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.302f, 0.0f, 2.401f, 0.838f, 2.815f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.315f)
                arcTo(2.994f, 2.994f, 0.0f, false, true, 9.5f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.414f)
                lineTo(11.586f, 20.0f)
                horizontalLineToRelative(2.828f)
                lineToRelative(-6.0f, -6.0f)
                horizontalLineTo(9.5f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 4.898f, -4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.602f)
                arcToRelative(4.933f, 4.933f, 0.0f, false, false, -0.924f, -2.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _bxRupee!!
    }

private var _bxRupee: ImageVector? = null
