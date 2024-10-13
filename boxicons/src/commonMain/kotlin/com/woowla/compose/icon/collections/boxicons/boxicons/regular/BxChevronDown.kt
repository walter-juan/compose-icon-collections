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

public val RegularGroup.BxChevronDown: ImageVector
    get() {
        if (_bxChevronDown != null) {
            return _bxChevronDown!!
        }
        _bxChevronDown = Builder(name = "BxChevronDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.293f, 9.293f)
                lineTo(12.0f, 13.586f)
                lineTo(7.707f, 9.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(12.0f, 16.414f)
                lineToRelative(5.707f, -5.707f)
                close()
            }
        }
        .build()
        return _bxChevronDown!!
    }

private var _bxChevronDown: ImageVector? = null
