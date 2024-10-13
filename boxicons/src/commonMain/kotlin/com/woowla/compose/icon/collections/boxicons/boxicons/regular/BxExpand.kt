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

public val RegularGroup.BxExpand: ImageVector
    get() {
        if (_bxExpand != null) {
            return _bxExpand!!
        }
        _bxExpand = Builder(name = "BxExpand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 15.344f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.172f, -3.172f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.172f, 3.172f)
                lineTo(15.344f, 21.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(3.0f, 8.656f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.172f, 3.172f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.172f, -3.172f)
                lineTo(8.656f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineToRelative(-5.656f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-3.172f, 3.172f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.172f, -3.172f)
                lineTo(21.0f, 8.656f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(5.656f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(3.172f, -3.172f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.172f, 3.172f)
                lineTo(3.0f, 15.344f)
                close()
            }
        }
        .build()
        return _bxExpand!!
    }

private var _bxExpand: ImageVector? = null
