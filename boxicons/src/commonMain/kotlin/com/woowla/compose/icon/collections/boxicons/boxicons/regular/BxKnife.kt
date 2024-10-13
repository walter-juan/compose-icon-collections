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

public val RegularGroup.BxKnife: ImageVector
    get() {
        if (_bxKnife != null) {
            return _bxKnife!!
        }
        _bxKnife = Builder(name = "BxKnife", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.66f, 3.6f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.24f, 0.0f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-7.07f, 7.07f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-6.36f, 6.36f)
                lineToRelative(1.41f, 1.42f)
                lineTo(19.66f, 6.43f)
                curveToRelative(1.1f, -1.1f, 1.1f, -1.73f, 0.71f, -2.12f)
                close()
            }
        }
        .build()
        return _bxKnife!!
    }

private var _bxKnife: ImageVector? = null
