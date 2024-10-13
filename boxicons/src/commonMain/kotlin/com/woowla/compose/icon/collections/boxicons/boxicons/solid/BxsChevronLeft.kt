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

public val SolidGroup.BxsChevronLeft: ImageVector
    get() {
        if (_bxsChevronLeft != null) {
            return _bxsChevronLeft!!
        }
        _bxsChevronLeft = Builder(name = "BxsChevronLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.939f, 4.939f)
                lineTo(6.879f, 12.0f)
                lineToRelative(7.06f, 7.061f)
                lineToRelative(2.122f, -2.122f)
                lineTo(11.121f, 12.0f)
                lineToRelative(4.94f, -4.939f)
                close()
            }
        }
        .build()
        return _bxsChevronLeft!!
    }

private var _bxsChevronLeft: ImageVector? = null
