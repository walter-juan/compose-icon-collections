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

public val RegularGroup.BxCollapse: ImageVector
    get() {
        if (_bxCollapse != null) {
            return _bxCollapse!!
        }
        _bxCollapse = Builder(name = "BxCollapse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.121f, 6.465f)
                lineTo(14.0f, 4.344f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(5.656f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(3.172f, -3.172f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(4.707f, 3.293f)
                lineTo(3.293f, 4.707f)
                lineToRelative(3.172f, 3.172f)
                lineTo(4.344f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.344f)
                lineTo(7.879f, 6.465f)
                close()
                moveTo(19.656f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(5.656f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.172f, 3.172f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.172f, -3.172f)
                close()
                moveTo(6.465f, 16.121f)
                lineToRelative(-3.172f, 3.172f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.172f, -3.172f)
                lineTo(10.0f, 19.656f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.344f)
                close()
            }
        }
        .build()
        return _bxCollapse!!
    }

private var _bxCollapse: ImageVector? = null
