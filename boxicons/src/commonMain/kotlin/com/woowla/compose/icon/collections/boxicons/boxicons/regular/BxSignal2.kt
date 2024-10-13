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

public val RegularGroup.BxSignal2: ImageVector
    get() {
        if (_bxSignal2 != null) {
            return _bxSignal2!!
        }
        _bxSignal2 = Builder(name = "BxSignal2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(7.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bxSignal2!!
    }

private var _bxSignal2: ImageVector? = null
