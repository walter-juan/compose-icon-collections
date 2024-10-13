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

public val SolidGroup.BxsChevronUp: ImageVector
    get() {
        if (_bxsChevronUp != null) {
            return _bxsChevronUp!!
        }
        _bxsChevronUp = Builder(name = "BxsChevronUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.879f)
                lineToRelative(-7.061f, 7.06f)
                lineToRelative(2.122f, 2.122f)
                lineTo(12.0f, 11.121f)
                lineToRelative(4.939f, 4.94f)
                lineToRelative(2.122f, -2.122f)
                close()
            }
        }
        .build()
        return _bxsChevronUp!!
    }

private var _bxsChevronUp: ImageVector? = null
