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

public val RegularGroup.BxSkipPrevious: ImageVector
    get() {
        if (_bxSkipPrevious != null) {
            return _bxSkipPrevious!!
        }
        _bxSkipPrevious = Builder(name = "BxSkipPrevious", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 7.0f)
                lineToRelative(-7.0f, 5.0f)
                lineToRelative(7.0f, 5.0f)
                close()
                moveTo(9.0f, 12.0f)
                lineTo(9.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxSkipPrevious!!
    }

private var _bxSkipPrevious: ImageVector? = null
