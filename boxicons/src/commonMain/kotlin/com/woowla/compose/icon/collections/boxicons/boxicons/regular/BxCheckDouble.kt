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

public val RegularGroup.BxCheckDouble: ImageVector
    get() {
        if (_bxCheckDouble != null) {
            return _bxCheckDouble!!
        }
        _bxCheckDouble = Builder(name = "BxCheckDouble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.394f, 13.742f)
                lineToRelative(4.743f, 3.62f)
                lineToRelative(7.616f, -8.704f)
                lineToRelative(-1.506f, -1.316f)
                lineToRelative(-6.384f, 7.296f)
                lineToRelative(-3.257f, -2.486f)
                close()
                moveTo(21.753f, 8.658f)
                lineTo(20.247f, 7.342f)
                lineTo(13.878f, 14.621f)
                lineTo(13.125f, 14.019f)
                lineTo(11.875f, 15.581f)
                lineTo(14.122f, 17.379f)
                close()
            }
        }
        .build()
        return _bxCheckDouble!!
    }

private var _bxCheckDouble: ImageVector? = null
