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

public val RegularGroup.BxListMinus: ImageVector
    get() {
        if (_bxListMinus != null) {
            return _bxListMinus!!
        }
        _bxListMinus = Builder(name = "BxListMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.063f, 15.0f)
                lineTo(13.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bxListMinus!!
    }

private var _bxListMinus: ImageVector? = null
